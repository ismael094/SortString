import java.util.Arrays;

public class Order {
    public static String sort(String phrase) {
        return phraseBuilder(phrase.split(" "), getPositionOfWordsSorted(phrase.split(" ")));
    }

    private static String phraseBuilder(String[] words, int[] positions) {
        String[] res = words.clone();
        for (int i = 0; i < words.length;i++) {
            res[positions[i]] = words[i];
        }
        return getString(res);
    }
    private static String getString(String[] phrase) {
        String res = "";
        for (String word : phrase)
            res+=word+" ";
        return res.trim();

    }

    private static int[] getPositionOfWordsSorted(String[] words) {
        int[] positions = new int[words.length];
        for (int i = 0; i<words.length;i++) {
            positions[i] = getNumberInWord(words[i]);
        }
        return positions;
    }

    private static int getNumberInWord(String word) {
        for (int i = 1; i<=9; i++)
            if (word.contains(i+""))
                return i-1;
        return 0;
    }
}
