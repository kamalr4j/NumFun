import java.util.*;
class calc
{
    public String getans(String exp)
    {
        String ch="",num="";
        ArrayList<String> e=new ArrayList<String>();
        num+=exp.charAt(0);
        int i;
        for(i=1;i<exp.length();i++)
        {
            ch=ch+exp.charAt(i);
            if(!(ch.equals("+"))&&!(ch.equals("-"))&&!(ch.equals("/"))&&!(ch.equals("*"))&&!(ch.equals("^")))
            {
                num+=ch;
                ch="";
            }
            else
            {
                e.add(num);
                e.add(ch);
                ch="";
                num="";
            }
        }
        e.add(num);
        String sans,sy;
        double n1,n2,ans;
        int j;
        for(j=0;j<e.size();j++)
        {
            sy=e.get(j);
            if(sy.equals("^"))
            {
                n1=Double.parseDouble(e.get(j-1));
                n2=Double.parseDouble(e.get(j+1));
                ans=Math.pow(n1,n2);
                sans=Double.toString(ans);
                e.set(j,sans);
                e.remove(j-1);
                e.remove(j);
                j=0;
            }
        }
        for(j=0;j<e.size();j++)
        {
            sy=e.get(j);
            if(sy.equals("/"))
            {
                n1=Double.parseDouble(e.get(j-1));
                n2=Double.parseDouble(e.get(j+1));
                ans=n1/n2;
                sans=Double.toString(ans);
                e.set(j,sans);
                e.remove(j-1);
                e.remove(j);
                j=0;
            }
        }
        for(j=0;j<e.size();j++)
        {
            sy=e.get(j);
            if(sy.equals("*"))
            {
                n1=Double.parseDouble(e.get(j-1));
                n2=Double.parseDouble(e.get(j+1));
                ans=n1*n2;
                sans=Double.toString(ans);
                e.set(j,sans);
                e.remove(j-1);
                e.remove(j);
                j=0;
            }
        }
        for(j=0;j<e.size();j++)
        {
            sy=e.get(j);
            if(sy.equals("+"))
            {
                n1=Double.parseDouble(e.get(j-1));
                n2=Double.parseDouble(e.get(j+1));
                ans=n1+n2;
                sans=Double.toString(ans);
                e.set(j,sans);
                e.remove(j-1);
                e.remove(j);
                j=0;
            }
        }
        for(j=0;j<e.size();j++)
        {
            sy=e.get(j);
            if(sy.equals("-"))
            {
                n1=Double.parseDouble(e.get(j-1));
                n2=Double.parseDouble(e.get(j+1));
                ans=n1-n2;
                sans=Double.toString(ans);
                e.set(j,sans);
                e.remove(j-1);
                e.remove(j);
                j=0;
            }
        }
        int Fans=(int)(Double.parseDouble(e.get(0)));
        return(Integer.toString(Fans));
    }
}