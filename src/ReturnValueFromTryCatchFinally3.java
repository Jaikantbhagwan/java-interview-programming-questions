public class ReturnValueFromTryCatchFinally3
{
    public static void main(String[] args)
    {
        try
        {
            return;
        }
        catch (Exception e)
        {
            return;
        }
        finally
        {
            return;
        }
 
       // System.out.println("Unreachable code");    //Compile Time Error : Unreachable Code
    }
}