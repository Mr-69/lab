import java.util.Scanner;
class leap
{
    public static void main(String args[])
    {
        int year;
        Scanner scan =new Scanner(System.in);
        System.out.println("entre the year ");
        year=scan.nextInt();
        if(year%4==0 && year%100!=0)
        System.out.println("year "+year+" is leap year");
        else if(year %400 == 0)
        System.out.println("year "+year+" is leap year");
        else
    System.out.println("year is not leap year");
    scan.close();
    }
}