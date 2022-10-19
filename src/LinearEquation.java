public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2,int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance(){
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }

    public double slope(){
        if (x2 - x1 == 0){
            return 999999999;
        }
        return roundedToHundredth((double)(y2-y1)/(x2-x1));
    }
    public double yIntercept(){
        return y1-slope()*x1;
    }

    public String equation(){
        int top = y2 - y1;
        int bottom = x2 - x1;
        if(top == 0){
            return "y = " + yIntercept();
        }else if(bottom ==0){
            return "x = " + x2;
        }
        return "y = " + top +"/"+bottom + "x + " + yIntercept();
    }

    public String coordinateForX(double xValue){
        double x = roundedToHundredth(xValue);
        double y = roundedToHundredth(slope()*xValue + yIntercept());
        return "(" + x + ", " + y + ")";
    }

    public double roundedToHundredth(double number){
        return (double)Math.round(number*100)/100;
    }

    public String lineInfo(){
        if (slope() == 999999999){
            return "The two points are: "+"("+x1+", "+y1+") and ("+x2+", "+y2+")\nThe equation of the line between these points is: "+equation()+"\nThe slope of this line is: undefined"+"\nThe y-intercept of the line is: none" + "\nThe distance between the two points is: "+distance();
        }
        return "The two points are: "+"("+x1+", "+y1+") and ("+x2+", "+y2+")\nThe equation of the line between these points is: "+equation()+"\nThe slope of this line is: "+slope()+"\nThe y-intercept of the line is: "+yIntercept()+"\nThe distance between the two points is: "+distance();
    }
}
