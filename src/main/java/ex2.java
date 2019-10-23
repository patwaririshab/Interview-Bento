import java.util.*;

public class ex2 {

    private ArrayList<String> inputList = new ArrayList<String>(Arrays.asList());
    private ArrayList<anagramList> outputList = new ArrayList<>();


    public ex2(ArrayList<String> inputList){
        this.inputList = inputList;
    }

    public void find_anagrams(){
        //For each word in inputlist, check for all anagrams and add them to outputlist by length
        for(String word : inputList){
            char[] inWord = word.toCharArray();
            Arrays.sort(inWord);
            String sortedInWord = new String(inWord);

            //Check whether the a anagram list with length same as word exists, if so, add word to that list
            boolean haveLengthList = false;
            for(anagramList aL : outputList){
                if(aL.getLength() == sortedInWord.length()){
                    aL.addAnagram(word);
                    haveLengthList = true;
                }
            }
            if (haveLengthList == false){
                ArrayList<String> anagrams = new ArrayList<>();
                outputList.add(new anagramList(word, anagrams));
            }

            for(String word2 : inputList){
                if(word.equals(word2)){
                    continue;
                }
                if(word.length() == word2.length()){
                    char[] outWord = word2.toCharArray();
                    Arrays.sort(outWord);
                    if(sortedInWord.equals(outWord)){
                        for(anagramList aL : outputList){
                            if(aL.getLength() == sortedInWord.length()){
                                aL.addAnagram(word2);
                            }
                        }
                    }
                }
            }
        }
        for(anagramList aL : outputList){
            System.out.println("Length: " + aL.getLength() + " Anagram List: " + aL.getAnagrams());
        }
    }

}
