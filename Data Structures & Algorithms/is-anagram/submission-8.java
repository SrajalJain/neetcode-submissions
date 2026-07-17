class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        int n = s.length();
        int p = t.length();
        if(n != p ){
            return false;
        }
        for(int i = 0 ;i<n;i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0;i<p;i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
    return false;
    }
}
