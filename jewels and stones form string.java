class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int a=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<stones.length();i++){
         if(hm.containsKey(stones.charAt(i))){
             hm.put(stones.charAt(i),hm.get(stones.charAt(i))+1);
         }
         else{
                hm.put(stones.charAt(i),1);
         }
        }
        for(int i=0;i<jewels.length();i++){
            if(hm.containsKey(jewels.charAt(i))){
               a+= hm.get(jewels.charAt(i));
            }
        }
        
        return a;
    }
}
