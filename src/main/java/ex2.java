import java.util.*;

public class ex2 {

    private ArrayList<String> inputList = new ArrayList<String>(Arrays.asList());


    public ex2(ArrayList<String> inputList){
        this.inputList = inputList;
    }

    private boolean isAnagram(String word1, String word2){
        char[] word1_array = word1.toCharArray();
        Arrays.sort(word1_array);
        String sortedWord1 = new String(word1_array);

        char[] word2_array = word2.toCharArray();
        Arrays.sort(word2_array);
        String sortedWord2 = new String(word2_array);

        return sortedWord1.equals(sortedWord2);
    }

    public void find_anagrams(){
        //For each word in inputlist, check if anagram and print
        for(String word : inputList){

            for(String word2 : inputList){
                if(word.equals(word2)){
                    continue;
                }
                if(isAnagram(word, word2)){
                    System.out.println(word + " " + word2);
                }
            }
        }
    }

}
