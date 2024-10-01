import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Task> taskMap = new HashMap<>();
        Map<Integer, Subtask> subtaskMap = new HashMap<>();
        Map<Integer, Epic> epicMap = new HashMap<>();

        Task task1 = new Task("Переезд", "Собрать вещи для переезда", 1, "Выполняется");
        Subtask subtask1 = new Subtask("Переезд", "Собрать вещи для переезда", 1, "Выполняется");
        Epic epic = new Epic("Переезд", "Собрать вещи для переезда", 1, "Выполняется");

        while (true) {
            System.out.println("""
                    1. Создание списка задач.
                    2. Удаление всех задач.
                    3. Получение по идентификатору.
                    4. Создание
                    5. Обновление
                    6. Удаление по идентификатору
                    0. Выход
                    """);


            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Выход...");
                    return;
                case 1:



            }

        }
    }
}