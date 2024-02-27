public class Domino {
    private int top;
    private int bottom;

    public Domino()
    {
        top = 0;
        bottom = 0;
    }
    public Domino(int top, int bottom)
    {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop(){return this.top;}
    public int getBottom(){return this.bottom;}

    public void setTop(int top)
    {
        this.top = top;
    }
    public void setBottom(int bottom)
    {
        this.bottom = bottom;
    }

    public String toString()
    {
        return top + "/" + bottom;
    }
    public void flip()
    {
        int tempTop = top;

        top = bottom;
        bottom = tempTop;
    }
    public void settle()
    {
        if(top > bottom)
        {
            flip();
        }
    }
    public int compareTo(Domino other)
    {
        settle();
        other.settle();

        if(this.top < other.top)
        {
            return -1;
        }
        if(this.top > other.top)
        {
            return 1;
        }
        if(this.top == other.top)
        {
            if(this.bottom < other.bottom)
            {
                return -1;
            }
            if(this.bottom > other.bottom)
            {
                return 1;
            }
            if(this.bottom == other.bottom)
            {
                return 0;
            }
        }
        return 0;
    }
    public int compareToWeight(Domino other)
    {
        int thisTotal = this.top + this.bottom;
        int otherTotal = other.top + other.bottom;

        if(thisTotal < otherTotal)
        {
            return -1;
        }
        if(thisTotal > otherTotal)
        {
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other)
    {
        if(this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom)
        {
            return true;
        }
        return false;
    }



}
