import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        System.out.println();

        task2(nums);
        System.out.println();
        List<String> words =new ArrayList<>(List.of("Новое","Таким", "образом","развитие", "социально-экономическое", "развитие","требует", "от", "нас", "анализа", "соответствующих", "условий", "активизации" ,"Дорогие", "друзья" ,"дальнейшее" ,"развитие"));
        task3(words);

        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        task4(strings);

    }

    public static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> sortedNums = new TreeSet<>(nums);
        for (int num : sortedNums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void task4(List<String> strings) {
        Map<String, Integer> duplicates = new HashMap<>();
        int i = 1;
        for (String string:strings) {
            if (duplicates.containsKey(string)) {
                duplicates.put(string, duplicates.get(string) + 1);

            } else {
                duplicates.put(string, i);
            }
        }
        System.out.println(duplicates);
    }


}