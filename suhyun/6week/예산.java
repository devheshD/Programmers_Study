import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;

        for (int amount : d) {
            if (budget >= amount) {
                budget -= amount;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
