package challenges;

import java.util.*;

class Solution2 {

    /**
     * n = 2
     * serie: a * 2 exp 0 * b
     * @param argh
     */
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            Integer a = in.nextInt();
            Integer b = in.nextInt();
            Integer  n = in.nextInt();

            if(a != null && b != null && n != null) {
                StringBuilder stringBuilder = new StringBuilder();
                int result = a;
                for(int j=0; j<n; j++){
                    result += (int) (Math.pow(2, j) * b);
                    stringBuilder.append(result + " ");
                }
                System.out.println(stringBuilder.toString().trim());
            }

        }
        in.close();
    }
}