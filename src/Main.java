import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        // Задание 2
        Set<Integer> numbers = new HashSet<>(nums);
        for (Integer num : numbers) {
            if (num % 2 != 1) {
                System.out.println(num);
            }
        }

        // Задание 3
        List<String> words = new ArrayList<>(List.of("one", "two", "two", "three", "four", "four"));

        Set<String> says = new HashSet<>(words);
        System.out.println(says);

        // Задание 4
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        Set<String> unique = new HashSet<>(strings);
        for (String key : unique) {
            int count = Collections.frequency(strings, key);
            System.out.println(key + ": " + count);
        }
    }
}