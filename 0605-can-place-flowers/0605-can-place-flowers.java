class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
      if(flowerbed.length==1){
            if(flowerbed[0]==0){
                return true;
            }
        }
        if(flowerbed[0]==0&&flowerbed[1]==0 && n==1){
            flowerbed[0] = 1;
            return true;
        }
        int t=n;
        for(int i=0;i<n;i++) {
            for (int j = 1; j < flowerbed.length - 1; j++) {
                 if(flowerbed[0]==0&&flowerbed[1]==0 ){
                     t--;
            flowerbed[0] = 1;
           
        }
                if (flowerbed[j - 1] == 0 && flowerbed[j] == 0 && flowerbed[j + 1] == 0) {
                    t--;
                    flowerbed[j] = 1;
                    break;
                }
                if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
                    t--;
                    flowerbed[flowerbed.length - 1] = 1;
                    break;
                }
            }
            if(t==0){
                break;
            }
        }

        if(t==0){
            return true;
        }
        return false;

    }
}