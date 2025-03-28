package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "str={0} → expected={1}")
    @CsvSource({"'xxggxx', true", "'xxgxx', false", "'xxggyygxx', false", "'gg', true", "'g', false", "'gggg', true", "'', true"
    })
    public void testGHappy(String str, boolean expected) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }
}
