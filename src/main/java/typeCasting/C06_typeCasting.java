package typeCasting;

public class C06_typeCasting {
    public static void main(String[] args) {
        //int string cevirir iken herhangi bir sorun olusmazken
        //tam tersi durumda sayi disinda karakter girilebilir bu noktada dikkatli olmamiz sart

        String sayi2="55";
        int sayi3=Integer.valueOf(sayi2);
        System.out.println(sayi3+10);//toplama islemi yaptigi icin int bir deger oldugun anladim


    int sayi1=50;
    String str= String.valueOf(sayi1);
        System.out.println(str+10);//concat yapmasindan String bir deger oldgunu anladim
    //String str1=(String) sayi1;
}
}