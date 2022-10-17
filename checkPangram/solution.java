import java.util.*;

class solution{

    static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            hs.add(sentence.charAt(i));
        }
        return hs.size()==26;
    }


    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
}