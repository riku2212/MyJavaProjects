import java.util.Scanner;
class Complex{

    double real;
    double imaginary;

    //default Constructor
    Complex(){
        real=0.0;
        imaginary=0.0;
    }

    //Parameterized Constructor
    Complex(double real,double imaginary){

        this.real=real;
        this.imaginary=imaginary;
    }

    //Getter and Setter
    public void setReal(double real){
        this.real=real;
    }
    public void setImaginary(double imaginary){
        this.imaginary=imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }

    //Operations

    public Complex AddComplex(Complex otherNumber){

        Complex sum=new Complex();
        sum.real =this.real+otherNumber.getReal();
        sum.imaginary=this.imaginary+otherNumber.getImaginary();
        return sum;
    }

    public Complex SubComplex(Complex otherNumber){

        Complex sum=new Complex();
        sum.real =this.real-otherNumber.getReal();
        sum.imaginary=this.imaginary-otherNumber.getImaginary();
        return sum;
    }

    public String toString(){

        String answer=String.valueOf(this.real)+" "+"+i"+String.valueOf(this.imaginary);
        return answer;
    }
}

public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        System.out.println("Enter the real part");
        double real=sc.nextDouble();
        System.out.println("Enter the imaginary part");
        double imaginary=sc.nextDouble();
        Complex c1=new Complex(real,imaginary);
        System.out.println("Enter the Second number");
        System.out.println("Enter the real part");
         real=sc.nextDouble();
        System.out.println("Enter the imaginary part");
         imaginary=sc.nextDouble();
        Complex c2=new Complex(real,imaginary);

        int ch=1;
        do{
            System.out.println("1. Sum");
            System.out.println("2.Difference");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice) {

                case 1:
                    Complex csum = c1.AddComplex(c2);
                    System.out.println("The sum is:" + csum.toString());
                    break;

                case 2:
                    Complex cdiff = c1.SubComplex(c2);
                    System.out.println("The Difference is:" + cdiff.toString());
                    break;
            }

                System.out.println("Do you wish to continue?");
                ch = sc.nextInt();
            }while(ch!=0);

            }
        }




