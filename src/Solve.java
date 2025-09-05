import java.util.Stack;

public class Solve {
    public int trap(int[] height) {
        int leftmax =height[0];
        Stack<Integer>rightmax =new Stack<>();

        rightmax.push(height[height.length-1]);
        for(int i =height.length-2;i>=2;i--){
            int temp =Math.max(rightmax.peek(),height[i]);
            rightmax.push(temp);
        }
        int totalWater = 0;
        for(int i =1;i<height.length-1;i++){
            int minimum=Math.min(rightmax.peek(),leftmax);
            int temp =minimum-height[i];
            totalWater += Math.max(0,temp);
            rightmax.pop();
            leftmax=Math.max(leftmax,height[i]);

        }
        return  totalWater;

    }

    public static void main(String[] args) {
        int []height={0,1,0,2,1,0,1,3,2,1,2,1};
        Solve solve = new Solve();
        System.out.println(solve.trap(height));
    }
}
