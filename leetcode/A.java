class A {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0) return "";

        int min = strs[0].length();
        for (int i = 1; i < n; i++) {
            min = Math.min(min, strs[i].length());
        }

        String s = "";

        for (int i = 0; i < min; i++) {
            char ch = strs[0].charAt(i);
            for (int k = 1; k < strs.length; k++) {
                if (strs[k].charAt(i) != ch) {
                    return s;
                }
            }
            s = s + ch;
        }

        return s;
    }

    public static void main(String args[]) {
        String s[] = {
            "Hello",
            "Hell",
            "Helium",
            "Help"
        };

        System.out.println("Longest Common Prefix: " + longestCommonPrefix(s));
    }
}
