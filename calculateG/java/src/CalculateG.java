public class CalculateG {
    public static double multiplication(double value1, double value2) {
        return value1 * value2;
    }

    public static double square(double value1) {
        return value1 * value1;
    }

    public static double summation(double value1, double value2) {
        return value1 + value2;
    }

    public static void outline(String message, double result) {
        System.out.println(message + result);
    }

    public static void main(String[] args) {
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double num = 0.5;
        System.out.println("The object's position after " + fallingTime + "seconds is " + finalPosition + "m.");
        //Add formulas for position and velocity
        //x(t)=0.5*at^2+vit+xi
        finalPosition = (num * (gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition) / fallingTime;
        System.out.println("finalposition is:" + finalPosition);
        //v(t)=at+vi
        finalVelocity = gravity * fallingTime / fallingTime;
        //show results
        System.out.println("finalvelocity area:" + finalVelocity);
        double value1 = 55;
        double value2 = 20;
        double c = multiplication(value1, value2);
        outline("multiplication: ", c);
        double d = square(value1);
        outline("powering to square: ", d);
        double e = summation(value1, value2);
        outline("summation: ", e);


    }
}