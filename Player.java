import java.util.*;

public class Player {
    public static void main(String[] args) {

        //вводим значения и ключи
        Map<String, Integer> hashMap = new TreeMap<>();
        hashMap.put("David", 77);
        hashMap.put("Kriss", 25);
        hashMap.put("Andy", 100);
        hashMap.put("Mary", 62);

        //сортировка по убыванию
        List<Map.Entry<String, Integer>> entries = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int v1 = e1.getValue();
                int v2 = e2.getValue();
                return (v1 < v2) ? 1 : (v1 == v2) ? 0 : -1;
            }
        });

        //вывод отсортированных значений
        System.out.println("sorted map:");
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getValue());
        }
        System.out.println("-------------------------------------------");

        //вывод отсортированных значений и ключей
        System.out.println("sorted map with key:");
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println("key: " + e.getKey() + ". value: " + e.getValue());
        }
        System.out.println("-------------------------------------------");

        //вывод топ-3 игроков
        System.out.println("top-3:");
        int i = 0;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            while (i < 3) {
                Map.Entry entry = (Map.Entry) it.next();
                System.out.println(entry.getKey());
                i++;
            }
            break;
        }
        System.out.println("-------------------------------------------");
    }


}


