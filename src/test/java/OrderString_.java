import org.junit.Test;

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

    @Test
    public void order_six_word_string_should_return_the_words_sorted() {
        assertThat(sort("4of Fo1r pe6ople g3ood th5e the2")).isEqualTo("Fo1r the2 g3ood 4of th5e pe6ople");
    }

    private String sort(String phrase) {
        return phraseBuilder(phrase.split(" "), getPositionOfWordsSorted(phrase.split(" ")));
    }

    private String phraseBuilder(String[] words, int[] positions) {
        String res = "";
        for (int position : positions) {
            res += words[position]+" ";
        }
        return res.trim();
    }

    private int[] getPositionOfWordsSorted(String[] words) {
        int[] positions = new int[words.length];
        for (int i = 0; i<words.length;i++) {
            positions[i] = getNumberInWord(words[i]);
        }
        return positions;
    }

    private int getNumberInWord(String word) {
        for (int i = 1; i<=9; i++)
            if (word.contains(i+""))
                return i-1;
        return 0;

    }
}
