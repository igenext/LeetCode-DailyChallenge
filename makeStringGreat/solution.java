import java.util.*;


class solution{

    static boolean checkGood(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))==32) return false;
        }
        return true;
    }

    static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i=0;i<sb.length()-1;i++){
            if(Math.abs(sb.charAt(i)-sb.charAt(i+1))==32) {
                sb.delete(i, i+2);
            }
        }
        if(!checkGood(sb.toString())) return makeGood(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "s";
        System.out.println(makeGood(s));
    }
}