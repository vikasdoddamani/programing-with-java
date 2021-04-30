//(co-of https://github.com/vikasdoddamani/programing-with-java)
// java program to check what ever vowel or not


class vowel
{
 public static void main(String[] args) {

        char ch = 'i';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}