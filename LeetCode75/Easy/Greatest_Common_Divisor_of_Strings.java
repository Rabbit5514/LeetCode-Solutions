class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        
        int s = str1.length();
        int t = str2.length();
        int temp;
        while (t != 0){
            temp = t;
            t = s % t;
            s = temp;
        }

        return str1.substring(0, s);  
    }
}
