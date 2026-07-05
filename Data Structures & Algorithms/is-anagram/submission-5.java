class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> max = new ArrayList<>();
        List<Character> min = new ArrayList<>();
        if(s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            max.add(s.charAt(i));
        }
        Collections.sort(max);
        for (int i = 0; i < s.length(); i++) {
            min.add(t.charAt(i));
        }
        Collections.sort(min);
        
            if (max.equals(min)){
            return true;
            }   
    return false;
    }
    
 
}
