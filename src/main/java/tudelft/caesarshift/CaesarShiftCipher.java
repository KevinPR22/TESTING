package tudelft.caesarshift;

public class CaesarShiftCipher {
    public String caesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26;
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);

            if (currentChar == ' ') {
                sb.append(currentChar);
            } else if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            } else {
                char shiftedChar = (char) (currentChar + shift);

               //Limite
                if (shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26);
                } else if (shiftedChar < 'a') {
                    shiftedChar = (char) (shiftedChar + 26);
                }

                sb.append(shiftedChar);
            }
        }
        return sb.toString();
    }
}
