import java.lang.io.*;
class emp{
int id1,id2;
emp(int id1,int id2){
this.id1=id1;
this.id2=id2;
}
void swap(emp e1)
{
int t=e1.id1;
e1.id1=e1.id2;
e1.id2=t;
}
}
class swap{
public static void main(String arg[])
{
emp e1=new emp(10,20);
System.out.println("before swapping of the 2 employee is:"+e1.id1+"employee2" +e1.id2);
e1.swap(e1);
System.out.println("after swapping of the 2employee is:"+e1.id1+"employee2"+e1.id2);
}
}


