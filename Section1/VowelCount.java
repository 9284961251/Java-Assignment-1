package Section1;
public class VowelCount {
    public static void main(String[] args) {
        String s = "i am arya";
        int count = 0;

        s = s.toLowerCase();

        for (char c : s.toCharArray()) {
            if (c == 'a' ||  c == 'e' || c == 'i' || c == 'o' || c == 'u') 
            {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
