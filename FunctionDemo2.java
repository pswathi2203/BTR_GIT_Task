class FunctionDemo2
{
    // addition of two int numbers
    static void add(){
        int x=10;
        int y=20;
        int sum=x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+sum);
    }
    public static void main(String[] args){
        System.out.println("main method started");
        add();
        System.out.println("main method ended");
    }
}