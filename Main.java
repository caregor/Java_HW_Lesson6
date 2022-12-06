import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static Integer TOTAL = 1000;
    public static void main(String[] args) {

        System.out.println(getPercentUniqueValues(initArray()));
    }
    public static Integer[] initArray(){
        Integer[] resultArray = new Integer[TOTAL];
        Random rnd = new Random();
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = rnd.nextInt(25);
        }
        return resultArray;
    }
    public static double getPercentUniqueValues(Integer[] array){
        Set<Integer> unicValue = new HashSet<>(Arrays.asList(array));
        Double res;
        res = (double) (unicValue.size() * 100 / TOTAL);
        return res;
    }
}
