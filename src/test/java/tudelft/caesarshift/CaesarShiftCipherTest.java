package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message={0}, shift={1} → expected={2}")
    @CsvSource({"'abc', 3, 'def'", "'xyz', 3, 'abc'", "'abc', -3, 'xyz'", "'hello world', 5, 'mjqqt btwqi'", "'hello world', -5, " +
            "'czggj rjmgy'", "'abcd!efg', 2, 'invalid'", "'test', 26, 'test'", "'test', -26, 'test'", "'a', 1, 'b'", "'z', 1, 'a'"})
    public void testCaesarShiftCipher(String message, int shift, String expected) {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}
