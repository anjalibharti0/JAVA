package JAVA.WEEKLY ASSINGMENTS;

// createand initialize a String and determine the following. (Built in String methods may be used):
// a) the length of the string.
// b) the number of a’s in the string.
// c) convert all lowercase to uppercase and vice versa.
// AMITY UNIVERSITY JHARKHAND
d
// Abstract class
abstract class Figure {
    int dim1, dim2;

    // Constructor
    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    // Abstract method to calculate area
    abstract void area();
}

// Rectangle class
class Rectangle extends Figure {
    Rectangle(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

// Triangle class
class Triangle extends Figure {
    Triangle(int a, int b) {
        super(a, b);
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

// Square class (only one dimension needed)
class Square extends Figure {
    Square(int side) {
        super(side, side); // both dimensions same
    }

    void area() {
        System.out.println("Area of Square: " + (dim1 * dim2));
    }
}

// Main class
public class AreaCalculator {
    public static void main(String[] args) {
        // Dynamic binding using superclass reference
        Figure fig;

        fig = new Rectangle(10, 5);
        fig.area();  // Calls Rectangle's area

        fig = new Triangle(10, 5);
        fig.area();  // Calls Triangle's area

        fig = new Square(6);
        fig.area();  // Calls Square's area
    }
}
