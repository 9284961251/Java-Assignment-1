package Section1;
public class ReverseString {
    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Arya").reverse();
        System.out.println(sb);
        System.out.println(reverse("hello"));
    }    
}
