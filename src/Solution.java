import java.lang.invoke.WrongMethodTypeException;
import java.util.*;

public class Solution {
    private static Set<Integer> whitelist = new TreeSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    public static int solution(List<Integer> a) throws Exception {
        if (a == null) throw new Exception("Lista uninitialized");
        if (a.isEmpty()) throw new Exception("Lista pusta");
        if (a.size() > 100000) throw new Exception("Rozmiar listy spoza zakresu");
        TreeSet<Integer> sorted = new TreeSet<>();
        sorted.addAll(a);

        int lowestElement = Collections.min(sorted);
        if (lowestElement > 1000000) throw new Exception("Element na liscie nie spelnia zalozen");
        if (lowestElement < 0) lowestElement = 0;

        for (int i = 0; i < a.size(); ++i) {
            if (!sorted.contains(++lowestElement)) return lowestElement;
        }


        return -1;
    }


    public static int solution(int[] a) throws Exception {
        if (a == null) throw new Exception("Tablica uninitialized");
        if (a.length == 0) throw new Exception("Tablica pusta");
        int sum = 0;
        for (int i = 1; i <= a.length; ++i) {
            int actualArgument = a[i - 1];
            if (!whitelist.contains(actualArgument)) throw new Exception("Element nie spenia zalozen");
            sum += actualArgument * Math.pow(10, i);
        }
        sum *= 17;

        int returnvalue = 0;
        int arr[] = Integer.toString(sum).chars().map(c -> c = Character.getNumericValue(c)).toArray();
        for (int i : arr) {
            returnvalue += i;
        }

        return returnvalue;
    }


}
