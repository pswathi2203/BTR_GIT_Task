class FunctionDemo4{
    static void sub(int x, int y){
        int sub=x-y;
        System.out.println("The subtraction of "+x+" and "+y+" is "+sub);
    }
    static void mul(int x, int y){
        int mul=x*y;
        System.out.println("The multiplication of "+x+" and "+y+" is "+mul);
    }
    static void div(int x, int y){
        int div=x/y;
        System.out.println("The division of "+x+" and "+y+" is "+div);
    }
    static void rem(int x, int y){
        int rem=x%y;
        System.out.println("The remainder of "+x+" and "+y+" is "+rem);
    }
    static void circle(double r){
        double A=Math.PI*r*r;
        System.out.println("The area of circle is "+A);
    }
    static void triangle(double base, double height){
        double A=0.5*base*height;
        System.out.println("The area of triangle is "+A);
    }
    static void rectangle(double length, double breadth){
        double A=length*breadth;
        System.out.println("The area of rectangle is "+A);
    }
    static void simple(float p, float t, float r){
        float SI=(p*t*r)/100;
        System.out.println("The simple interest is "+SI);
    }
    static void trapezoid(double base1, double base2, double height){
        double A=0.5*(base1+base2)*height;
        System.out.println("The area of trapezoid is "+A);
    }
    static void sphere(double r){
        double A=4*Math.PI*r*r;
        System.out.println("The area of sphere is "+A);
    }
    public static void main(String[] args){
        sub(20, 10);
        mul(30, 5);
        div(98, 2);
        rem(5, 2);
        circle(5);
        triangle(8, 12);
        rectangle(5, 8);
        simple(15000, 4, 35);
        trapezoid(20, 30, 15);
        sphere(6);
    }
}
