package arrayArrayList01;

public class C05_array {
    public static void main(String[] args) {
        /*
      6.Soru -Verilen String bir array'de en uzun ve en kisa String'leri yazdıran bir method
      */

        String []arr1={"Gülce","Mustafa","Niyazi","Meryem","Ömer"};

        enUzunVeEnKisa(arr1);
    }

    private static void enUzunVeEnKisa(String[] arr1) {
        String max=arr1[0];
        String min=arr1[0];
        for (String w:arr1
        ) {
            if (max.length()<w.length()){
                max=w;
            }
            if (min.length()>w.length()){
                min=w;
            }
        }
        System.out.println("en kisa string : "+min);
        System.out.println("en uzun string : "+max);

    }
}
