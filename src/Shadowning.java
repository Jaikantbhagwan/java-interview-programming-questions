class OuterClass
{
    int x = 10;
 
    static int y = 20;
 
    class InnerClass
    {
        int x = 30;
 
        static final int y = 40;
 
        void methodOfInnerClass()
        {
            System.out.println(x);  //output : 30
 
            System.out.println(y);  //output : 40
 
            //accessing non-static hidden outer class variable in inner class
 
            System.out.println(OuterClass.this.x);  //Output : 10
 
            //accessing static hidden outer class variable in inner class
 
            System.out.println(OuterClass.this.y);   //Output : 20
 
            //OR
 
            System.out.println(OuterClass.y);  //Output : 20
 
        }
    }
}
 
public class Shadowning
{
 
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();
 
        OuterClass.InnerClass inner = outer.new InnerClass();
 
        inner.methodOfInnerClass();
 
    }
}