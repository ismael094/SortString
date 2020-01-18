import org.assertj.core.api.AbstractBigDecimalAssert;
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

    private String sort(String phrase) {
        return phrase;
    }
}
