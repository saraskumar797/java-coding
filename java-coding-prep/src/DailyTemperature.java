import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static void main(String[] args){
        int []arr = {73,74,75,71,69,72,76,73};
        dailytemperature(arr);
    }

    private static void dailytemperature(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){

            while(!stack.empty() && arr[stack.peek()] < arr[i]){
                Integer pop = stack.pop();
                res[pop] = i-pop;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(res));
    }

}
