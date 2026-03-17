package practicesetdsa.arrays;
import java.util.*;
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 1, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int count = 0;
        for (int i : map.values()) {
            if (i > 1) {
            	count++;
            }
        }
        System.out.println("Number of elements that are duplicated: " + count);
	}

}
