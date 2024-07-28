class Answer {
   
        // Напишите свое решение ниже
    public  void printPrimeNums() {
        for (int n = 1; n <= 1000; n++) {
            if (isSimple(n)) {
                System.out.println(n);
            }
        }

    }
      
     public static boolean isSimple(int n) {
        if (n < 2) 
            return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
             return false;
            
        }
        return true;
    }
      
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}