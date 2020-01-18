import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderString_ {
    @Test
    public void order_an_empty_string_should_return_empty() {
        assertThat(Order.sort("")).isEqualTo("");
    }

    @Test
    public void order_a_word_string_should_return_the_same() {
        assertThat(Order.sort("Th1s")).isEqualTo("Th1s");
    }

    @Test
    public void order_two_word_string_should_return_the_words_sorted() {
        assertThat(Order.sort("sec2ond Th1s")).isEqualTo("Th1s sec2ond");
    }

    @Test
    public void order_six_word_string_should_return_the_words_sorted() {
         assertThat(Order.sort("4of Fo1r pe6ople g3ood th5e the2")).isEqualTo("Fo1r the2 g3ood 4of th5e pe6ople");
    }

}
