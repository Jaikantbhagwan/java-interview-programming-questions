public class Shadowing1
{
    int x = 10;
 
    void methodOne(int x)
    {
        //local x shadows or hides global x
 
        System.out.println(x);   //output : 20
    }
 
    public static void main(String[] args)
    {
        Shadowing1 shadow = new Shadowing1();
        shadow.methodOne(20);
    }
}