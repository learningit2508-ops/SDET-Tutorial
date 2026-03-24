package programscollection;

public class reversewordsentence {

    public static void main(String[] args) {

        String original_sentence = "This is my world";
        String reverse_sentence = " ";

        String[] words = original_sentence.split(" ");

        for(int i = words.length-1; i >=0; i--){

            char[]arr = words[i].toCharArray();
            String reversed = "";
            for(int j = arr.length-1 ; j>=0 ; j--){

                reversed = reversed + arr[j] ;
            }



            reverse_sentence = reverse_sentence + reversed + " ";

        }

        System.out.println(reverse_sentence);

    }

}
