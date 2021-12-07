import java.util.*;
class Tournament 
{
public static void tour(int o,double sec)
{
Scanner Input=new Scanner(System.in);
Random r=new Random();
for(int m=0;;m++)
{
System.out.print("\fEnter title for Tournament:-(e.g. IPL_2017)  ");
String tit=Input.next();
System.out.print("\fEnter no of teams for Tournament:-");
int nt=Input.nextInt();
String nta[]=new String [nt];
double rta[]=new double [nt];
int win[]=new int[nt];
int tie[]=new int[nt];
for(int n=0;n<nt;n++)
{
System.out.print("Enter team "+(n+1)+":- ");
nta[n]=Input.next();
}
for(int k=0;k<nt;k++) 
{
for(int l=0;l<k;l++)
{
Cricket.match(o,sec,nta[k],nta[l]); 
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2)
{rta[k]+=Cricket.nrr();rta[l]-=Cricket.nrr();win[k]++;}
else if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==1)
{rta[k]-=Cricket.nrr();rta[l]+=Cricket.nrr();win[l]++;}
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2)
{rta[k]-=Cricket.nrr();rta[l]+=Cricket.nrr();win[l]++;}
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==1)
{rta[k]+=Cricket.nrr();rta[l]-=Cricket.nrr();win[k]++;}
else {tie[k]++;tie[l]++;}
}
}
System.out.println("\nTeams\t\tMatch\tWin\tLoss\tTie\tPoints\t NRR  ");
int i=0,j=0,twin=0;String tnam=" ";int ttie=0;double tnrr=0;
for(i=0;i<nt-1;i++)
{
for(j=i+1;j<nt;j++)
{
if(((2*win[j])+tie[j])>((2*win[i])+tie[i])||(rta[j]>rta[i]&&((2*win[j])+tie[j])==((2*win[i])+tie[i])))
{
twin=win[i];tnam=nta[i];ttie=tie[i];tnrr=rta[i];
win[i]=win[j];nta[i]=nta[j];tie[i]=tie[j];rta[i]=rta[j];
win[j]=twin;nta[j]=tnam;tie[j]=ttie;rta[j]=tnrr;
}
}
}
for(i=0;i<nt;i++)
{
System.out.println(nta[i]+"\t\t"+(nt-1)+"\t"+win[i]+"\t"+((nt-1)-(win[i]+tie[i]))+"\t"+tie[i]+"\t"+((win[i]*2)+tie[i])+"\t "+(double)Math.round(rta[i]*100)/100);
}
if (nt<6)
{
System.out.println("\nFINAL:-");
Cricket.match(o,sec,nta[0],nta[1]);
String cha="";
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=nta[0];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=nta[1];
else {System.out.print("\nSuperOver:-");Cricket.match(1,sec,nta[0],nta[1]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=nta[0];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=nta[1];
}
System.out.println("\nCHAMPION  "+tit+" :-"+cha);
}
else if (nt<8)
{
String cha1="",cha2="";
System.out.println("\nSEMIFINAL 1:-");
Cricket.match(o,sec,nta[0],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha1=nta[0];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha1=nta[3];
else {System.out.print("SuperOver:-");Cricket.match(1,sec,nta[0],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha1=nta[0];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha1=nta[3];
else {System.out.print("PowerOver:-");Cricket.match(1,sec,nta[0],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha1=nta[0];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha1=nta[3];
}}
System.out.println("Finalist 1:-"+cha1);
System.out.println("\nSEMIFINAL 2:-");
Cricket.match(o,sec,nta[1],nta[2]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[1];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
else {System.out.print("SuperOver:-");Cricket.match(1,sec,nta[1],nta[2]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[1];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
else {System.out.print("PowerOver:-");Cricket.match(1,sec,nta[1],nta[2]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[1];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
}}
System.out.println("Finalist 2:-"+cha2);
System.out.println("\nFINAL:-");
Cricket.match(o,sec,cha1,cha2);
String cha="";
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=cha1;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=cha2;
else {System.out.print("SuperOver:-");Cricket.match(1,sec,cha1,cha2);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=cha1;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=cha2;
}
System.out.println("\nCHAMPION  "+tit+" :-"+cha);
}
else
{
String cha1="",cha2="",lo="",cha3="";
System.out.println("\nEliminator :-");
Cricket.match(o,sec,nta[0],nta[1]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) {cha1=nta[0];lo=nta[1];}
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) {cha1=nta[1];lo=nta[0];}
else {System.out.print("SuperOver:-");Cricket.match(1,sec,nta[0],nta[1]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) {cha1=nta[0];lo=nta[1];}
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) {cha1=nta[1];lo=nta[0];}
else {System.out.print("PowerOver:-");Cricket.match(1,sec,nta[0],nta[1]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) {cha1=nta[0];lo=nta[1];}
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) {cha1=nta[1];lo=nta[0];}
}}
System.out.println("Finalist 1:-"+cha1);
System.out.println("\nQualifier 1:-");
Cricket.match(o,sec,nta[2],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[3];
else {System.out.print("SuperOver:-");Cricket.match(1,sec,nta[2],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[3];
else {System.out.print("PowerOver:-");Cricket.match(1,sec,nta[2],nta[3]);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha2=nta[2];
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha2=nta[3];
}}
System.out.println("\nQualifier 2:-");
Cricket.match(o,sec,cha2,lo);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha3=cha2;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha3=lo;
else {System.out.print("SuperOver:-");Cricket.match(1,sec,cha2,lo);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha3=cha2;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha3=lo;
else {System.out.print("PowerOver:-");Cricket.match(1,sec,cha2,lo);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha3=cha2;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha3=lo;
}}
System.out.println("Finalist 2:-"+cha3);
System.out.println("\nFINALS:-");
Cricket.match(o,sec,cha1,cha3);
String cha="";
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=cha1;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=cha3;
else {System.out.print("SuperOver:-");Cricket.match(1,sec,cha1,cha3);
if(Cricket.s1()<Cricket.s2()&&Cricket.inn()==2||Cricket.s1()>Cricket.s2()&&Cricket.inn()==1) cha=cha1;
else if(Cricket.s1()>Cricket.s2()&&Cricket.inn()==2||Cricket.s1()<Cricket.s2()&&Cricket.inn()==1) cha=cha3;
}
System.out.println("\nCHAMPION  "+tit+" :-"+cha);
}
System.out.print("\nWant more,Enter Yes or No:-");String ma=Input.next();
if(ma.charAt(0)=='y'||ma.charAt(0)=='Y')
continue;
else  {System.out.print("Hope you enjoyed,Bye...               (Press 'X' button on the Top-right corner)");break;}
}
}
}