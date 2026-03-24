package programscollection;

public class reversesentence {

    public static  void main(String[] args){

        String original_sentence =  "This is my world" ;
        String reverse_sentence  = " ";

        String[]words =  original_sentence.split(" ");

        for(int i = words.length-1 ; i >=0 ; i--){

            reverse_sentence = reverse_sentence + " " + words[i];


        }

        System.out.println(reverse_sentence.toString());

    }

}
