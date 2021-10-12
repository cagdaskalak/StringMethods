public class StringMethods {
    public static void main(String[] args) throws Exception {
        // String = a reference data type that can store one or more characters
        //          reference data types have acces to useful methods.

    String name = "Cagdas";

   // boolean result = name.equals("Cagdas"); //name.equalsIgnoreCase("cagdas"); yazarsan büyük küçük harfi önemsemez ve true olur.
   // int result = name.length(); // Değerin uzunluğunu verir.
   // char result = name.charAt(0); // Girdiğin rakamın hangi harfe denk geldiğini gösterir.
   // int result = name.indexOf("a"); // Girdiğin değerin hangi rakamda olduğunu söyler.
   //boolean result = name.isEmpty(); // Değerin içinin boş veya dolu olduğunu true veya false ile belirtir.
   //String result = name.toUpperCase(); // Değeri büyük harflere çevirir.
   //String result = name.toLowerCase(); // Değeri küçük harflere çevirir.
   //String result = name.trim(); // Değerin içinde boşluklar varsa kaldırır.
   String result = name.replace('a', 'e');

    System.out.println(result);
        

    }
}
