class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWhoHaveGreatestNum = new ArrayList<>();

        int max = 0;
        for (int x : candies){
            if (x > max) {
                max = x;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                kidsWhoHaveGreatestNum.add(true);
            }
            else {
                kidsWhoHaveGreatestNum.add(false);
            }
        }
        return kidsWhoHaveGreatestNum;
    }
}
