import java.util.LinkedList;

class LLTasks {

    public static void revertLL(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        int left = 0;
        int right = ll.size() - 1;

        while (left < right) {

            Object temp = ll.get(left);
            ll.set(left, ll.get(right));
            ll.set(right, temp);
            left++;
            right--;
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.revertLL(ll);
        System.out.println(ll);
    }
}
