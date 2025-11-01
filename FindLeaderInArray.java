
import java.util.*;

class FindLeaderInArray{
    static ArrayList<Integer> leaders(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders: " + leaders(arr));
    }
}
