import java.util.HashMap;

class PhoneNumberConverter {
    public static void main(String args[]) {
        String str = "nine six triple one nine four eight six one";
        String[] splitArr = str.split(" ");

        // Mapping words to digits
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        // Mapping repetition words to their counts
        HashMap<String, Integer> repeat = new HashMap<>();
        repeat.put("double", 2);
        repeat.put("triple", 3);

        // StringBuilder to construct the numeric phone number
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < splitArr.length; i++) {    
            if (repeat.containsKey(splitArr[i])) {
                // Repeat the next number accordingly
                int repeatCount = repeat.get(splitArr[i]);
                if (i + 1 < splitArr.length && map.containsKey(splitArr[i + 1])) {
                    for (int j = 0; j < repeatCount; j++) {
                        num.append(map.get(splitArr[i + 1]));
                    }
                    i += 1; // Skip the next word since it's already processed
                }
            } else if (map.containsKey(splitArr[i])) {
                num.append(map.get(splitArr[i]));
            }
        }

        // Output the final phone number
        System.out.println("Phone number: " + num);
    }
}
