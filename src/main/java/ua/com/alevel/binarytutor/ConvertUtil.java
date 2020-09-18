package ua.com.alevel.binarytutor;

public class ConvertUtil {

    public static String convertStringToBinary(String text) {
        byte[] bytes = text.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary.toString();
    }

    public static String convertNumberToBinary(Number value, Class<? extends Number> number) {

        if (number.isAssignableFrom(Byte.class)) {
            return String.format("%8s", Integer.toBinaryString(value.byteValue() & 0xFF)).replace(' ', '0');
        }

        if (number.isAssignableFrom(Short.class)) {
            return String.format("%16s", Integer.toBinaryString(value.shortValue() & 0xFFFF)).replace(' ', '0');
        }
        if (number.isAssignableFrom(Integer.class)) {
            return String.format("%32s", Integer.toBinaryString(value.intValue())).replace(' ', '0');
        }
        if (number.isAssignableFrom(Long.class)) {
            return String.format("%64s", Long.toBinaryString(value.longValue())).replace(' ', '0');
        }

        return "0";
    }

    public static Number convertBinaryToNumber(String value, Class<? extends Number> number) {

        if (number.isAssignableFrom(Byte.class)) {
            return Byte.parseByte(value, 2);
        }

        if (number.isAssignableFrom(Short.class)) {
            return Short.parseShort(value, 2);
        }
        if (number.isAssignableFrom(Integer.class)) {
            return Integer.parseInt(value, 2);
        }
        if (number.isAssignableFrom(Long.class)) {
            return Long.parseLong(value, 2);
        }

        return 0;
    }
}
