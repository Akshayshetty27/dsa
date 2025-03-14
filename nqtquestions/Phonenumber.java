import java.util.HashMap;

class Phonenumber {
    public static void main(String args[]) {
        String str = "nine six triple one  six  four eight six one";
        String[] splitArr = str.split(" ");
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
        StringBuilder num = new StringBuilder();

        for( int i=0 ; i < splitArr.length ;i++)
        {
            if(splitArr[i].equals("double"))
            {
                num.append(map.get(splitArr[i + 1]));
                num.append(map.get(splitArr[i + 1]));
                i++;
            }
            else if(splitArr[i].equals("triple"))
            {
              num.append(map.get(splitArr[i + 1]));
              num.append(map.get(splitArr[i + 1]));
              num.append(map.get(splitArr[i + 1]));  
              i++;
            }else if( map.containsKey(splitArr[i]))
            {
                num.append(map.get(splitArr[i]));
            }
        }   

        System.out.println("Phone number: " + num);
    }
}
