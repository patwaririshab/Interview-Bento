import java.util.ArrayList;

public class anagramList {
    private int length;
    private ArrayList<String> anagrams;

    public anagramList(String word, ArrayList<String> anagrams){
        length = word.length();
        this.anagrams = anagrams;
        this.anagrams.add(word);
    }

    public int getLength(){
        return length;
    }

    public void addAnagram(String word){
        anagrams.add(word);
    }

    public ArrayList<String> getAnagrams(){
        return anagrams;
    }
}
