public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(17, 9, 18, 8, 9);
        Triangle triangleB = new Triangle(5, 3.897, 10, 20,18);

        //".findArea()" function in the Triangle class relies on the attribute values given triangle
        //public double findArea() { - instance method
        //Instance method also called as non-static method since you need an instance to use them
        double tringanleAArea = triangleA.findArea();
        System.out.println(tringanleAArea);

        //pow() is a static/class method
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        //Both "sideLenThree and base" are INSTANCE VARIABLE printing
        System.out.println(triangleA.sideLenThree);
        System.out.println(triangleB.base);

        // Math.pow() operators are static
        //STATIC VARIABLE
        System.out.println(Triangle.numOfSides);
    }
}
