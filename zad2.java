import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.



public class zad2 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameMap = new HashMap<>();
        String names = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
                countNames(names, nameMap);
                sortedName(nameMap);
               
            
        
        
    }
  

    public static void countNames(String names,HashMap<String, Integer> nameMap) {  
        String[] listOfPersons = names.split(" ");
        for (int i = 0; i < listOfPersons.length; i += 2) {
            if (nameMap.containsKey(listOfPersons[i])) {
                nameMap.replace(listOfPersons[i], nameMap.get(listOfPersons[i]) + 1);
            } else {
                nameMap.put(listOfPersons[i], 1);
            }
        }
    }
    public static void sortedName(HashMap<String, Integer> nameMap) {
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
                String key = entry.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        for (Map.Entry<String,Integer> iterable_element : sortedNameMap.entrySet()) {
            System.out.println(iterable_element.getValue() + " - " + iterable_element.getKey());
        }
       
    }
    
}
