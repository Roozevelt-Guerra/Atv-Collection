import java.util.HashSet;
import java.util.TreeSet;

public class Q17 {
    public static void main(String[] args) {

        HashSet<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        nums.add(7);
        System.out.println(nums);

        TreeSet<Integer> nums2 = new TreeSet<>();
        nums2.add(5);
        nums2.add(2);
        nums2.add(9);
        nums2.add(3);
        nums2.add(7);

        System.out.println(nums2);

        System.out.println();

    }
}
