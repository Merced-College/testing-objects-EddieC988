//Eduardo
//6/8/26
//Object testing class for my Dog and Book objects

public class ObjectTester {


    public static void main (String[] args){

        // A1: Create a Dog with no constructors defined.
        Dog dog1 = new Dog();

        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(dog1);

        //test of data variables as public
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.getName());   // expected: null
        System.out.println("age = " + d1.getAge());     // expected: 0
        System.out.println("breed = " + d1.getBreed()); // expected: null

        //test the constructors for the default and non-default
        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        //Step 10
        System.out.println("\nMutating public fields directly:");
        d3.setAge(5);//d3.age = 5;      // direct write
        d3.setName("Max");//d3.name = "Max"; // direct write
        System.out.println("After mutation, d3 = " + d3); // uses toString()

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

    // Making a default book object
        Book b1 = new Book();
        System.out.println("\nDefaults for b1 fields (before any assignment):");
        System.out.println("title = "  + b1.getTitle());   // expected: Unknown Title
        System.out.println("pages = "  + b1.getPages());   // expected: 0
        System.out.println("inPrint = "+ b1.isInPrint());  // expected: false

        // Constructors
        Book b2 = new Book();
        System.out.println("\nb2 after default constructor:");
        System.out.println("title = " + b2.getTitle() + ", pages = " + b2.getPages() + ", inPrint = " + b2.isInPrint());

        Book b3 = new Book("The Great Gatsby", 180, true);
        System.out.println("\nb3 after parameterized constructor:");
        System.out.println("title = " + b3.getTitle() + ", pages = " + b3.getPages() + ", inPrint = " + b3.isInPrint());

        // toString
        System.out.println("\nPrinting Book objects after overriding toString():");
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        // Setters / getters
        System.out.println("\nMutating via setters after making fields private:");
        b3.setTitle("1984");
        b3.setPages(328);
        b3.setInPrint(false);
        System.out.println("b3 title via getter = " + b3.getTitle());
        System.out.println("b3 now = " + b3);

    }//end main

}//end class