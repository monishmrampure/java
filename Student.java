import java.util.scanner;
class Student{
int id;
String name;
String branch;
String phone;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter nomber of student");
int n=sc.nextInt();
Student[]s=new Student(n);
for(int i=0;i<n;i++)
{
System.out.println("enter id:");
int id

