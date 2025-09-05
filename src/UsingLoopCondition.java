import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UsingLoopCondition {
    public static void main(String[] args) {
        List<Integer>list =new ArrayList<>();
        long StartingTime;
        long EndingTime;

        for(int i =0;i<100000;i++){
            list.add(i);
            StartingTime = Calendar.getInstance().getTimeInMillis();
            for(int as :list){
                int a =i;
            }
        }
    }
}
