package PostfixtoPrefixConversion;

public class Main {
    public static void main(String[] args) {
        String s = "AB+CD-*";
        Solution0 f = new Solution0();
        System.out.println(f.postToPre(s));
    }
}
