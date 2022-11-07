import java.util.*;

class index{

    static int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        char c =' ';
        int max = Integer.parseInt(sb.toString());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='6') {
                sb.setCharAt(i, '9');
                c = '6';
            }
            else if(sb.charAt(i)=='9'){
                sb.setCharAt(i, '6');
                c='9';
            }
            max = Math.max(max, Integer.parseInt(sb.toString()));
            sb.setCharAt(i, c);
        }
        return max;
    }

    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }
}