import java.util.ArrayList;
import java.util.Arrays;

public class main {



    public static void main(String[] args) {

        ArrayList<String> inputList = new ArrayList<String>(Arrays.asList("vase", "bat", "gods", "latte", "name",
                "apres", "spit", "joke", "ham", "dog", "act", "tale", "parse", "pits", "asper", "tab", "table", "mane",
                "late", "god", "cat", "table", "save", "spare"));

        ex2 secondExercise = new ex2(inputList);

        System.out.println(secondExercise.find_anagrams());
    }

}
