import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums2 = new ArrayList<>(List.of(100, 10, 40, 23, 30, 4, 4, 5, 5, 6));
        List<String> words = new ArrayList<>(List.of("cat", "dog", "cat", "cow", "owl", "owl", "cat"));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        task1(nums);
        System.out.println();
        task2(nums2);
        System.out.println();
        task3(words);
        System.out.println();
        task4(strings);
    }

    private static void task1(List<Integer> list) {
        System.out.println("Task1:");
        for (Integer i : list) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> list) {
        System.out.println("Task2:");
        Collections.sort(list);
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer i : list) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        System.out.println(set);
    }

    private static void task3(List<String> list) {
        System.out.println("Task3:");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    private static void task4(List<String> list) {
        System.out.println("Task4:");
        Map<String, Integer> map = new HashMap<>();

        for (String s : list) {
            if (map.containsKey(s)) {
                int count = map.get(s) + 1;
                map.put(s, count);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}