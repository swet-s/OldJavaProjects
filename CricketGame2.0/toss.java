import java.util.*;
class Toss
{
    public static void main(String[]Args)
    {
    Random r=new Random();
    float p=r.nextFloat();
    float a=Math.round(0+100*p);
    String s="Heads",t="Tails",st;
    if (a%2==0)
    st=s;
    else
    st=t;
    System.out.print("\f"+st);
}
}
    