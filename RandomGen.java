class RandomGen
{
    int num1,num2,ans;
    byte op=(byte)(Math.random()*4+1);
    String s;
    public String getnum1()
    {
        num1=(int)(Math.random()*100)+1;
        return(Integer.toString(num1));
    }
    public String getnum2()
    {
        num2=(int)(Math.random()*100)+1;
        if(op>3)
        num2=(int)(Math.random()*5+1);
        return(Integer.toString(num2));
    }
    public String getop()
    {
        if(op==1)
        s="+";
        else if(op==2)
        s="-";
        else if(op==3)
        s="*";
        else
        s="^";
        return(s);
    }
    public String getans()
    {
        if(op==1)
        ans=num1+num2;
        else if(op==2)
        ans=num1-num2;
        else if(op==3)
        ans=num1*num2;
        else
        ans=(int)(Math.pow(num1,num2));
        return(Integer.toString(ans));
    }
}
