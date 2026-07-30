class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String st : strs) {

            int[] freq = new int[26];

            // Count frequency of each character
            for (int i = 0; i < st.length(); i++) {
                char ch = st.charAt(i);
                freq[ch - 'a']++;
            }

            // Build a unique key
            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append('#');
                key.append(count);
            }

            String strKey = key.toString();

            map.putIfAbsent(strKey, new ArrayList<>());
            map.get(strKey).add(st);
        }

        return new ArrayList<>(map.values());
    }
}