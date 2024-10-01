class myo_random [class Testing {
  public static void main(String [] args) {
    // place your code here!
    String name = "Yangchen"; 
    System.out.println("Hello " + name);
     System.out.println("The number of keys on a keyboard is");
  System.out.println(102);
  System.out.println("The value of pi is");
  System.out.println("double pi");
  double circ;
  double rad = 0.5;
  System.out.println("The circumference of a circle of radius 1.5 is");
  double pi = 3.14;
    System.out.println("Welcome to Sanjay's Koala Party!");
System.out.print("It's possible Sanjay can distribute " + 12);
System.out.println(" cookies for each bowl.");
System.out.print("Sanjay has "+ 6 + " for " + 144 + " cookies.");
System.out.println("The number of cookies per bowl is");
System.out.println ("The numbers of cookies per bowl is: " + (144/6));
          System.out.println(7 * 4);
        int amount = 7 * 4;
        System.out.println(amount);
        System.out.println("Two dozen is 24");
        System.out.print("Twenty-eight is: " + amount);
     int amount = 8;
amount = amount + 1;
System.out.println(amount);
int a = 8;
int b = 3;
System.out.println(a*b);
System.out.println(a/b);
double a2 = 8.0;
System.out.println(a2/b);

    System.out.print("I was born in ");
int year = 2009;
System.out.print(year);
System.out.println(".");
System.out.print("I am ");
int age = 14;
System.out.print(age);
System.out.println(" years old.");
System.out.println(age*2 + 5);
System.out.println((age*2 + 5)*50 + 14);
System.out.println((((age*2 + 5)*50 + 14) - 250)/100);
    // your code ends here!









    


    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/* 
Student: Yangchen 875487
Date: Sept 30, 2024
Course: ICD 2O0
Assignment: Assignment1, Java and Math Formulas
Description: A simple code that will solve for the area of a rectangle, the area of a circle, the volume of a cylinder, the surface area of a cylinder, and the period of time it takes (in seconds) for a pendulum to make one back-and-forth swing.
Variable Dictionary: 
- length (int) = The length of a rectangle to find the area of the rectangle
- width (int) = The width of a rectangle to find the width of the rectangle
- radius (int) = The radius of a circle to find the area of the circle
- radius3 (int) = The radius of a cylinder to find the volume of the cylinder
- height (int) = The height of a cylinder to find the volume of the cylinder
- radius4 (int) = The radius of a cylinder to find the surface area of the cylinder
- height4 (int) = The height of a cylinder to find the surface area of the cylinder
- length5 (int) = The length of a pendulum to find the period of the time it takes for it to make one back-and-forth swing in seconds
- double gravity (double int) = The acceleration of gravity to find the period of the time it takes for a pendulum to make one back-and-forth swing in seconds

*/

package assignment1; // States the file name
import java.util.Scanner; // Library of java language
import java.lang.Math; // Library of java math
/**
 *
 * @author 875487
 */
public class Assignment1 { 

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Hello user!"); // Greeting
        System.out.println("First, we will find the area of a rectangle."); // Finding the area of a rectangle
        Scanner sc = new Scanner(System.in); // Opens the code that allows the user to engage
        System.out.println("Input the length of the rectangle: "); // Location where the user inputs their value
         int length = 0; // declaration of length
        int width = 0; // declaration of width
        length = sc.nextInt(); // Allows the user to input the value of length
        System.out.println("Input the width of the rectangle: "); // Location where the user inputs their value
        width = sc.nextInt(); // Allows the user to input the value of width
        System.out.printf("The area is: %d x %d = %d", length, width, length * width); // Calculates the value of area of the rectangle
      
        
        System.out.println(" Next, let's calculate the area of a circle"); // Informs the user that they're calculating the area of a circle
        System.out.println("Input the radius of the circle: "); // The user inputs the radius to find their area here
        int radius = 0; // declaration of radius
        radius = sc.nextInt(); // Allows the user to input their radius
        System.out.printf("The area is: %d x %f x %d = %f", radius, Math.PI, radius, radius * Math.PI * radius); // Calculates the value of the area of a circle
        
        System.out.println(" Now, lets find the volume of a cylinder."); // Informs the user that they're finding the volume of a cylinder
        System.out.println("Input the radius of the cylinder: "); // Tells the user to input their radius
        int radius3 = 0; // declaration of radius
        radius3 = sc.nextInt(); // allows the user to input their radius
        System.out.println("Input the height of the cylinder: "); // tells the user to input the height of their cylinder
        int height = 0; // declaration of height
        height = sc.nextInt(); // allows the user to input their height
        System.out.printf("The area is: %d x %d x %f x %d = %f", radius3, radius3, Math.PI, height, radius3 * height * Math.PI * height); // calculates the area of the cylinder
     
        
        System.out.println(" Let's find the surface area of a cylinder!"); // Informs the user they're calculating the s.a of the cylinder
        System.out.println("Input the radius of the cylinder: "); // tells the user that they first need to input their radius
        int radius4 = 0; // declaration of radius
        radius4 = sc.nextInt(); // allows the user to input their radius
        System.out.println("Input the height of the cylinder: "); // tells the user to input their height
        int height4 = 0; // declaration of height
        height4 = sc.nextInt(); // allows the user to input their height
        System.out.printf("The surface area is: %d x %f x %d x %d + %d x %f x %d x %d = %f", 2, Math.PI, radius4, height4, 2, Math.PI, radius4, radius4, 2 * Math.PI * radius4 * height4 + 2 * Math.PI * radius4 * radius4); // calculates the s.a of the cylinder
        
        System.out.println(" Finally, let's find the period of the time it takes for a pendulum to make one back-and-forth swing in seconds."); // Informs the user that they're calculating to find the period of time (in seconds) that it takes for a pendulum to swing back and forth once
        System.out.println("Input the length of the pendulum in meters: "); // tells the user to input the length of their pendulum
        int length5 = 0; // declaration of length
        length5 = sc.nextInt(); // allows the user to input their length
        double gravity = 9.8; // declaration that the acceleration of gravity is 9.8
        System.out.printf("The time in seconds that it takes for the pendulum to swing is: %d x %f / %d / %f = %f", 2, Math.PI, length5, gravity, 2 * Math.PI * Math.sqrt(length5 / gravity)); // calculates the number of seconds it takes for the pendulum to swing back and forth once
        sc.close(); // closes the scanner
    }
    
}

 
    
}

  }
}
]
