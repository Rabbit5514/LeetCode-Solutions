class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed.length != 1) {
                    if (flowerbed[i] == 0) {
                        if (flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                        }
                    }
                }
                else {
                    if (flowerbed[i] == 0) {
                        return true;
                    }
                }
            }

            else if (i == flowerbed.length - 1){
                if (flowerbed[i] == 0) {
                    if (flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                    }
                }
            }
            
            else if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        if (count >= n) {
            return true;
        }
        return false;
    }
}
