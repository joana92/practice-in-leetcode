//reference:http://codechen.blogspot.com/2015/06/leetcode-skyline-problem.html
public class TheSkylineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int []> heights= new ArrayList<>();
        List<int []> result=new ArrayList<>();
        int row=buildings.length;
       //convert raw buildings array to 2d array
        for(int i=0;i<row;i++){
            heights.add(new int []{buildings[i][0],-buildings[i][2]});
            heights.add(new int []{buildings[i][1],buildings[i][2]});
        }
        // sort the list
        Collections.sort(heights,new Comparator<int []>() {
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]==b[0])
                return (a[1]-b[1]);
                else
                return (a[0]-b[0]);
            }
        });
        // compare the height to get result
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(1000, Collections.reverseOrder());
         pq.offer(0);
         int pre=0;
         int s=heights.size();
         for(int i=0;i<s;i++){
             int h[]= heights.get(i);
             if(h[1]<0) pq.offer(-h[1]);
             if(h[1]>0) pq.remove(h[1]);
             int cur=pq.peek();
             if(cur!=pre){
                 result.add(new int[]{h[0],cur});
                 pre=cur;
             }
         }
         return result;
    }
}
