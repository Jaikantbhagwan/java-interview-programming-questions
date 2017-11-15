public class Shadowing2
{
    static int x = 10;
 
    int y = 20;
 
    void methodOne(int x, int y)
    {
        //accessing hidden static variable using class name
 
        System.out.println(Shadowing2.x);   //output : 10
 
        //accessing hidden non-static variable using this keyword.
 
        System.out.println(this.y);    //output : 20
    }
 
    public static void main(String[] args)
    {
        Shadowing2 shadow = new Shadowing2();
        shadow.methodOne(30, 40);
    }
}