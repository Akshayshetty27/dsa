import java.util.HashMap;

class Eleven {
    public static void main(String args[]) {
        int arr[] = {3, 7,7, 9,9,10,11, 10, 11};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear once
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
