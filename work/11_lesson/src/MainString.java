
public class MainString {

    private char[] massive;
    private int length;

    public MainString() {
    }

    public MainString(String str) {
        this.massive = str.toCharArray();
        this.length = str.length();
    }

    public MainString(char symbol) {
        this.massive = new char[]{symbol};
    }

    public int getLength() {
        return length;
    }

    public void clear() {
        length = 0;
        massive = null;
    }

    public int valueOf(char symbol) {
        for (int i = 0; i < length; i++) {
                 if (massive[i] == symbol) {
                     return i;
                 }
        }
        return  -1;
    }
 }