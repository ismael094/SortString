import org.assertj.core.api.AbstractBigDecimalAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderString_ {
    @Test
    public void order_an_empty_string_should_return_empty() {
        assertThat(sort("")).isEqualTo("");
    }

    private String sort(String phrase) {
        return "";
    }
}
