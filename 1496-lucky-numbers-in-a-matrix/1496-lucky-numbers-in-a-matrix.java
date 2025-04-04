class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        int index = 0;
        int maximum = 0;
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    maximum = j;
                }
            }
            System.out.println(maximum);
            l.add(min);
            System.out.println(l);

      }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            if(l.get(i)>max){
                max = l.get(i);

            }
        }
            int q = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]==max){
                   q = j;}
            }
        }
        System.out.println("index "+q);
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][q]>maxValue){
                maxValue=matrix[i][q];
            }
        }
        System.out.println("after"+maxValue);

          if(max!=maxValue){
              return l1;
          }else{
              l1.add(maxValue);
              return l1;
          }
    }
}