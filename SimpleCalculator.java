//Menu driven program on simple claculator
import java.util.Scanner;
public class SimpleCalculator {

    public int add(int a, int b) {

        int sum = a + b;
        return sum;
    }

    public int sub(int a,int b) {
        int minus = 0;
        if (a > b)
            minus = a - b;
        else if (a < b)
            minus = b - a;
        return minus;
    }

    public int multiply(int a,int b){

        int mul=1;
        mul=a*b;
        return mul;

    }

    public int division(int a, int b){

        int div=a/b;
        return div;
    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        int ch=1;

        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();

        SimpleCalculator B= new SimpleCalculator();
        do {
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Substraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice) {

                case 1:
                    int result = B.add(a, b);
                    System.out.println("The result of Sum is:" + result);
                    break;

                case 2:
                    result = B.sub(a, b);
                    System.out.println("The result of substraction is:" + result);
                    break;

                case 3:
                    result = B.multiply(a, b);
                    System.out.println("The result of the Multiplication:" + result);
                    break;

                case 4:
                    result = B.division(a, b);
                    System.out.println("The result of Division:" + result);
                    break;

                default:
                    System.out.println("Invalid Entry");
                    break;
            }

                System.out.println("Do you want to continue? Then press 1 else 0");
                ch = sc.nextInt();
            }while(ch!=0);




            }
        }





