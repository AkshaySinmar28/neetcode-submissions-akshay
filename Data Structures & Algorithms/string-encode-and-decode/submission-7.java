class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s).append("#!#");
        }
        System.out.print(sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) {
       List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            
            // Check if the current StringBuilder ends with our delimiter "#!#"
            if (sb.length() >= 3 && sb.substring(sb.length() - 3).equals("#!#")) {
                // Extract the word excluding the 3-character delimiter
                result.add(sb.substring(0, sb.length() - 3));
                // Clear the StringBuilder for the next word
                sb.setLength(0);
            }
        }
        return result;
    }
}
