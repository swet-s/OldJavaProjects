import java.util.*;
/*printing cricket card /*/
class CCC 
{
static int k=0;
static int sum1=0,sum0=0;static float rrtt=0;
public static void match(int o,double sec,String t1,String t2)
{
try
{
Random r=new Random();
int ctr=0,rctr=0,wctr=0;
toss.toss(t1,t2);
int t=0;float rtt=0,rt=0;
for(t=0;t<2;t++)
{
char ch=' ';String wo="";
if (t==1) 
ctr=rctr;rctr=0;wctr=0;
int octr=0,bctr=0,rrctr=0;
if(toss.inn==1)
System.out.println("\n"+t1);
else 
System.out.println("\n"+t2);
for(bctr=1;bctr<=o*6;bctr++)
{
for(double time=0;time<=250000000*sec;time++);
rrctr++;int sc=0;octr=bctr/6;System.out.print("\t"+octr+"."+bctr%6+"---");
/*probablity starts here*/
float p=r.nextFloat();float a=Math.round(0+100*p);
if(a==90||a==91||a==52||a==72||a==53||a==74||a==75||a==76||a==77||a==78||a==79||a==80||a==55||a==2||a==3||a==4||a==5||a==6||a==7||a==8||a==9||a==10||a==11||a==12||a==13||a==14||a==15||a==16||a==17||a==18||a==19||a==20)
sc=1;
else if (a==81||a==82||a==83||a==84||a==86||a==87||a==88||a==89||a==21||a==22||a==23||a==24||a==25||a==26||a==27||a==28||a==29||a==30||a==31||a==32||a==33||a==34||a==35||a==36||a==37||a==38||a==39||a==40)
sc=0;
else if (a==97||a==93||a==98||a==99||a==63||a==54||a==65||a==66||a==67||a==68||a==69||a==70||a==71||a==33||a==34||a==35||a==36||a==37||a==38||a==39||a==40)
sc=2;
else if (a==94||a==95||a==57||a==60||a==61||a==62||a==41||a==42||a==43||a==44||a==45||a==46)
sc=4;
else if (a==47||a==48||a==85||a==49)
sc=6;
else if (a==96||a==50)
sc=3;
else if (a==1||a==92||a==73||a==64)
sc=7;
else if (a==51||a==56||a==100)
{sc=8;rrctr--;}
else if (a==59)
{sc=9;rrctr--;}
else if (a==58)
{sc=5;rrctr--;}
//calculation
if (sc==5)
{rctr+=5;bctr--;System.out.print("wd(4),");}
else if (sc==8)
{rctr+=1;bctr--;System.out.print("wd,");}
else if (sc==7)
{wctr++;System.out.print("W,");
if (wctr==10) 
break;
}
else if (sc==9)
{rctr+=1;bctr--;System.out.print("NB,");}
else
{System.out.print(sc+",");rctr+=sc;}
if (t==1&&rctr>ctr)
break;
}
if(toss.inn==1)
{
System.out.print("\n   "+t1);
toss.inn=2;
}
else 
{
System.out.print("\n   "+t2);
toss.inn=1;
}
float rr=((float)rctr/rrctr)*6;float rrr=rr*100;float rn=Math.round(rrr);rt=rn/100;
if (t==0)  
rtt=rt;System.out.println(":-"+rctr+"-"+wctr+"          Run rate:-"+rt);
if (t==0)
sum0=rctr;
else
sum1=rctr;
for(double time=0;time<=500000000*sec;time++);
}
if(sum0>sum1&&toss.inn==2)
System.out.println("\tTeam "+t2+" Won by "+(ctr-rctr)+" Runs");
else if(sum0<sum1&&toss.inn==2)
System.out.println("\tTeam "+t1+" Won by "+(10-wctr)+" Wickects");
else if(sum0>sum1&&toss.inn==1)
System.out.println("\tTeam "+t1+" Won by  "+(ctr-rctr)+" Runs");
else if(sum0<sum1&&toss.inn==1)
System.out.println("\tTeam "+t2+" Won by "+(10-wctr)+" Wickects");
else
System.out.println("\tMatch Tied");
rrtt=(rtt-rt)*100;float rnt=Math.round(rrtt);rrtt=rnt/100;System.out.println(" RunRate Differance ~ "+Math.abs(rrtt));
}
catch (StringIndexOutOfBoundsException e)
{
k++;
System.out.print("Please! Press Again");
match(o,sec,t1,t2);
}
}
public static int inn()
{
return toss.inn ;
}
public static int s1()
{
return sum0 ;
}
public static int s2()
{
return sum1 ;
}
public static float nrr()
{
return Math.abs(rrtt) ;
}
}
