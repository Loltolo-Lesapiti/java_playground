public class SqueakyClean {
    public static void main (String [] args){
        String my_word="my   Id";
        System.out.println(clean(my_word));

    }
    public static String clean(String word){
        return word.replace(" ","_");
    }
    
}
