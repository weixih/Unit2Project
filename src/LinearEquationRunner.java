import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the linear equation calculator");

       // System.out.print("Enter coordinate 1: ");
        //String coord1 = scan.nextLine();
        //System.out.print("Enter coordinate 2: ");
        //String coord2 = scan.nextLine();

        //int x1 = Integer.parseInt(coord1.substring(1,2));
        //int y1 = Integer.parseInt(coord1.substring(4,5));
        //int x2 = Integer.parseInt(coord2.substring(1,2));
       // int y2 = Integer.parseInt(coord2.substring(4,5));


        int x1 = -1;
        int y1 = 5;
        int x2 = 3;
        int y2 = 10;
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());


    }
}
