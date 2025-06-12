class Swap{
public static void main(String[] args)
{
int a=2,b=3;
System.out.println("Before :"+a);
System.out.println("Before :"+b);
int temp=a;
a=b;
b=temp;
System.out.println("After :"+a);
System.out.println("After :"+b);
}
}
class S2{
public static void main(String[] args)
{
int a=2,b=3;
System.out.println("Before :"+a);
System.out.println("Before :"+b);
a=a^b;
b=a^b;
a=a^b;
System.out.println("After :"+a);
System.out.println("After :"+b);
}
}
class S3{
public static void main(String[] args)
{
int a=2,b=3;
System.out.println("Before :"+a);
System.out.println("Before :"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After :"+a);
System.out.println("After :"+b);
}
}

