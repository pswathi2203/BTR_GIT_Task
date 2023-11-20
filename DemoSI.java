class DemoSI
{
    // Calculating Simple Interest
    static float SI(float p, float t, float r){
        float SI=(p*t*r)/100;
        System.out.println("Simple Intertest is "+SI);
        return SI;
    }
    public static void main(String[] args){
        System.out.println("main method started");
        SI(14000,7,40);
        System.out.println("main method ended");
    }
}