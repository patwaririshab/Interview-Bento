import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {

    private ArrayList<String> inputList = new ArrayList<String>(Arrays.asList());
    private ArrayList<String> outputList;

    public ex2(){
    }

    public ex2(ArrayList<String> inputList){
        this.inputList = inputList;
    }

    public void find_anagrams(){
        for (String word : inputList){
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            outputList.add(new String(tempArray));
            System.out.println(tempArray);
        }
    }


    public void find_anagrams(ArrayList<String> inputList){
        for (String word : inputList){
            char tempArray[] = word.toCharArray();
            Arrays.sort(tempArray);
            outputList.add(new String(tempArray));
            System.out.println(tempArray);
            System.out.println("working");
        }
    }



}
