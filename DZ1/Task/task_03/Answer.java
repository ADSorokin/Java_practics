class Calculator {
        public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    System.err.println("Делить на ноль нельзя.");

                    return 0;
                }
            default:
                System.err.println("Чтото пошло не так..");
                return 0;

        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 7;
            op = '+';
            b = 3;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }
       // Ниже добавить проверку оператора на корректность
       if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Некорректный оператор: '" + op + "'");
           return;
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}