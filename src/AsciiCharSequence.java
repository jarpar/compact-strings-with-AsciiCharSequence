public class AsciiCharSequence implements java.lang.CharSequence/* extends/implements */ {
    byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }


    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int i) {
        return ((char) bytes[i]);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(bytes, start, end));
    }

    //    @Override
//    public String toString() {
//        return java.util.Arrays.toString(bytes);
//    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (byte aByte : bytes) {
            s.append((char) aByte);
        }
        return s.toString();
    }
}