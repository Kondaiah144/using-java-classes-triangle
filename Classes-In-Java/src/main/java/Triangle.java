public class Triangle {

    static int numOfSides = 3;

    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //using constructors blueprint
public Triangle(double base, double height,
                double sideLenOne, double sideLenTwo,
                double sideLenThree ){
    this.base = base;
    this.height = height;
    this.sideLenOne = sideLenOne;
    this.sideLenTwo = sideLenTwo;
    this.sideLenThree = sideLenThree;
    }

    public double findArea() { //instance method
        return (this.base * this.height) / 2;
    }
}
