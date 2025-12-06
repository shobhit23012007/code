

import java.util.*;//T.C.=O(2^n)
public class GenarateParanthesis {
    public static void generate(int n, int l, int r, String s, List<String> ans) {
        // Correct Base Case: Stop when the string has n pairs (length 2*n) or r==n
        // if (s.length() == 2 * n) {//or
        if (r==n) {
            ans.add(s);
            return;
        }
        // Rule 1: Only add a left parenthesis if we haven't used all 'n' of them.
        if (l < n) {
            generate(n, l + 1, r, s + "(", ans);
        }
        // Rule 2: Only add a right parenthesis if it won't break the structure
        // (i.e., there are more open left parentheses than right ones).
        if (r < l) {
            generate(n, l, r + 1, s + ")", ans);
        }
    //public List<String> generateParenthesis(int n) { //(leetcode ka solution)
    //     List<String> ans=new ArrayList<>();
    //     generate(n,0,0,"",ans);
    //     System.out.println(ans);
    //     return ans;
    // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of pairs (n): ");
        int n = sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        generate(n, 0, 0, "", ans);
        System.out.println(ans);
    }
}