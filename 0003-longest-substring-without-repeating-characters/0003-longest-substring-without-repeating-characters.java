class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int n=s.length();
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(!hs.contains(ch)){
                hs.add(ch);
            }else{
                while(hs.contains(ch)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(ch);
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}