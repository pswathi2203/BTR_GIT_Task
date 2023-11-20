class Factorial
{
    static int Fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println("main method started");
       // System.out.println(Fact(6));
        int res=Fact(6);
        System.out.println("Factorial is"+ res);
        System.out.println("main method ended");
    }
}