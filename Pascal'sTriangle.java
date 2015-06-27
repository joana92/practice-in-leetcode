import java.util.*;

public class Pascal'sTriangle {
    public List<List<Integer>> generate(int numRows) {
        int n;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> inner0 = new ArrayList<Integer>();
      //  List<Integer> inner1= new ArrayList<Integer>();
        inner0.add(1);
        n=numRows;
        if (numRows<=0) return list;
        if(numRows==1) {
            list.add(inner0);
            return list;
        }
        list.add(inner0);
        n=n-1;
        while(n>0){
            List<Integer> inner00=new ArrayList<Integer>(inner0);
        	List<Integer> inner1= new ArrayList<Integer>();
        //	inner1.clear();
                       inner1.add(1);
            for(int i=1;i<inner00.size();i++){
                inner1.add(inner00.get(i-1)+inner00.get(i));
            }
            inner1.add(1);
            n--;
            list.add(inner1);
            inner0=inner1;
        }
        return list;
        
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	for (List<Integer> a : s.generate(3)) {
    		System.out.println(a);
    	}
    }
}
