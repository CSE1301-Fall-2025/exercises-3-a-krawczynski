package module07._1parts;

public class Person // creation of object/template of object, should be capitalized
{
     // instance variables 
     private String name; // important that it's private!!!
     private String email; // instance variables and methods are what we expect to find in our classes
     private String phoneNumber;
     
     // constructor: construct a Person copying in the data into the instance variables
     public Person(String initName, String initEmail, String initPhone)
     {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
     }
     
     // Print all the data for a person
     public void print()
     {
       System.out.println("Name: " + name);
       System.out.println("Email: " + email);
       System.out.println("Phone Number: " + phoneNumber);
     }
     
     // main method for testing
     public static void main(String[] args)
     {
        // call the constructor to create a new person
        Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
        // call p1's print method
        p1.print();
        Person p2 = new Person("Jean", "jean@gmail.com", "404 899-9955");
        p2.print();
        Person p3 = new Person("Alina", "peepee@gmail.com", "314 600-6039");
        p3.print();
     }
  }