import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.



public class zad1 {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> pBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean book = true;
        while(book){
            System.out.println();
            System.out.println("Выберите действие: \n 1 - Добавить новую запись в телефонную книгу, \n" +
                 "2 - Показать все записи \n" + 
                 "3 - Выйти из телефонной книги ");
                 String opr = scanner.nextLine();
                 switch(opr){
                    case "1":
                    AddCont(pBook, scanner);
                    break;
                    case "2":
                    printAllBook(pBook);
                    break;
                    case "3":
                    book = false;
                    break;

                 }
        }


    }
    public static void AddCont(Map<String,ArrayList<String>> map, Scanner scanner) {
        System.out.println();
        ArrayList<String> p_number = new ArrayList<>();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.println("Введите номер телефона: ");
        String number = scanner.nextLine();
        if(!map.containsKey(name)){
            map.put(name, p_number);
        }
        map.get(name).add(number);
    }


    public static void printAllBook(Map<String,ArrayList<String>> book) {
        System.out.println();
        for(String name : book.keySet()){
            System.out.printf("Имя: " + name + "\n");
            ArrayList<String> numbers = book.get(name);
            for (String number : numbers){
                System.out.printf("Номер телефона: " + number + "\n");
            }
            System.out.println();
        }
    }
}