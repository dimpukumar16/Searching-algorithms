
public class Sequential {

    public static void ss(int[] n, int k) {
        for (int i = 1; i < n.length; i++) {
            if (i == k) {
                System.out.println("number found at th index of" + i);
            } else {
                i = i + 1;
            }
        }
        System.out.println("not found");

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 6;
        ss(nums, k);

    }
}
