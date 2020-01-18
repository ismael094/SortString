import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderString_ {
    @Test
    public void order_an_empty_string_should_return_empty() {
        assertThat(sort("")).isEqualTo("");
    }

    @Test
    public void order_a_word_string_should_return_the_same() {
        assertThat(sort("Th1s")).isEqualTo("Th1s");
    }

    @Test
    public void order_two_word_string_should_return_the_words_sorted() {
        assertThat(sort("sec2ond Th1s")).isEqualTo("Th1s sec2ond");
    }

    private String sort(String phrase) {
        String[] words = phrase.split(" ");
        int[] positions = getPositions(words);
        String res = "";
        for (int i = 0 ;i<words.length;i++) {
            res += words[positions[i]]+" ";
        }
        return res.trim();
    }

    private int[] getPositions(String[] words) {
        int[] positions = new int[words.length];
        for (int i = 0; i<words.length;i++) {
            positions[i] = getNumOfWord(words[i]);
        }

        return positions;
    }

    private int getNumOfWord(String word) {
        for (int i = 1; i<=9; i++)
            if (word.contains(i+""))
                return i-1;
        return 0;

    }
}
