import java.util.Scanner;
class max$min {
    public static void main(String args[])
    {
        int a,b,c,max,min;
System.out.println("entre the numbers");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
max=a>b?(a>c?a:c):(b>c?b:c);
min=(a<b && a<c)?a:(b<c)?b:c;
System.out.println("maximum is "+max+" minimum is "+min);
sc.close();
    }
}
