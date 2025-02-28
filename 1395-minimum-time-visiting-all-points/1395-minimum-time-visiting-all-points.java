class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        for(int i=1;i< points.length;i++){
            int row = Math.abs(points[i][0]-points[i-1][0]);
            int col = Math.abs(points[i][1]-points[i-1][1]);
            time += Math.max(row,col);
        }
        return time;
    }
}