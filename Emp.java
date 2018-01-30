import java.io.*;
class Emp{
Emp(int id)
{
this.id=id;
}
void swap(Emp e1,Emp e2)
{
Emp temp=new Emp()
temp=e1;
e1=e2;
e2=temp;
System.out.println("Emp1 id:"+e1.id,"Emp2 id:"+e2.id);
}

public static void(String arg[])
{
Emp e1=new Emp(10);
Emp e2=new Emp(21);
System.out.println("emp

