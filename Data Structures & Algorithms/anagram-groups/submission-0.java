class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groups = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            groups.computeIfAbsent(sorted,k -> new ArrayList<>()).add(s);
        }
    return new ArrayList<>(groups.values());
    }
}
