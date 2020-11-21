import java.util.*;

class AsciiCharSequence implements java.lang.CharSequence {

    private final byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes.clone();
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException(index);
        }
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end < 0 || end > length() || start > end) {
            throw new IndexOutOfBoundsException();
        }
        return new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append((char) b);
        }
        return sb.toString();
    }

//    public static void main(String[] args) {
//        byte[] bytes = {97, 98, 99, 100, 101, 102};  // a, b, c, d, e, f
//        AsciiCharSequence seq = new AsciiCharSequence(bytes);
//        System.out.println(seq.charAt(2));  // 'c'
//        seq = (AsciiCharSequence) seq.subSequence(2, 4);  // "cd"
//        System.out.println(seq);
//    }
}
