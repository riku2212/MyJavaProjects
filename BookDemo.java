import java.util.Scanner;

class Author{
    String firstName;
    String lastName;

    Author(){
        firstName="";
        lastName="";
    }

    Author(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
     public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String GetLastName(){
        return lastName;
    }

    public String toString(){
        String name="";
        name=firstName+" "+lastName;
        return name;

    }
}

class Book{

    Author name=new Author();
    String title;
    double price;
    Book(Author name, String title, double price){

        this.name=name;
        this.title=title;
        this.price=price;
    }

    public void setAuthorName(Author name){
        String firstName=name.getFirstName();
        String lastName=name.GetLastName();
    }

    public String getAuthorName(){
        String fullname=name.getFirstName()+" "+name.GetLastName();
        return fullname;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    public String toString(){
        String Details="Author's name:"+getAuthorName()+" "+"Book name:"+getTitle()+" "+"Price:"+getPrice();
        return Details;
    }

}

public class BookDemo{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.println("Enter the first name of author");
        String firstname=sc.nextLine();
        System.out.println("Enter the last name");
        String lastname=sc.nextLine();
        Author B=new Author(firstname,lastname);
        System.out.println("Enter the book name");
        String title=sc.nextLine();
        System.out.println("Enter the price");
        double price=sc.nextDouble();
        Book C=new Book(B,title,price);
        String result=C.toString();
        System.out.println(result);
    }
}

