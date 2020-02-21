public class Test {
    public static void main(String[] args) {
        //CharSequence cs = new AsciiCharSequence(new byte[]{32, 32, 32});
        CharSequence cs = new AsciiCharSequence(new byte[]{88,89,90});
        System.out.println(cs.charAt(0));
        System.out.println(cs.length());
        System.out.println(cs);
        System.out.println(cs.subSequence(1, 2));
    }
}