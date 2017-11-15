public class WrapperClasses11
{
    static void overloadedMethod(Number N)
    {
        System.out.println("Number Class Type");
    }
 
    static void overloadedMethod(Double D)
    {
        System.out.println("Double Wrapper Class Type");
    }
 
    static void overloadedMethod(Long L)
    {
        System.out.println("Long Wrapper Class Type");
    }
 
    public static void main(String[] args)
    {
        int i = 21;
 
        overloadedMethod(i);
    }
}