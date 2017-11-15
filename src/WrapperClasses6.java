public class WrapperClasses6
{
    public static void main(String[] args)
    {
        Byte B = new Byte("55");
        byte b = B.byteValue();
        System.out.println(b);      //Output : 55
 
        Short S = new Short("23");
        b = S.byteValue();
        System.out.println(b);     //Output : 23
 
        Integer I = new Integer("56");
        b = I.byteValue();
        System.out.println(b);    //Output : 56
 
        Long L = new Long("125");
        b = L.byteValue();
        System.out.println(b);    //Output : 125
 
        Float F = new Float("23.56");
        b = F.byteValue();
        System.out.println(b);    //Output : 23    (Value is truncated)
 
        Double D = new Double("521.56");
        b = D.byteValue();
        System.out.println(b);   //Output : 9
    }
}