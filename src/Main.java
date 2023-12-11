import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int runs = 5; // Количество запусков для вычисления среднего времени


        LinkedListClass listClass100 = new LinkedListClass();
       LinkedListClass listClass2000 = new LinkedListClass();
       LinkedListClass listClass5000 = new LinkedListClass();

        long sumLin100 = 0;
        long sumLin2000 = 0;
        long sumLin5000 = 0;
        ArrayListClass collection100 = new ArrayListClass();
        ArrayListClass collection2000 = new ArrayListClass();
        ArrayListClass collection5000 = new ArrayListClass();

        long sum100 = 0;
        long sum2000 = 0;
        long sum5000 = 0;

        StackClass stackClass100= new StackClass();
        StackClass stackClass2000= new StackClass();
        StackClass stackClass5000= new StackClass();

        long sumStack100 = 0;
        long sumStack2000 = 0;
        long sumStack5000 = 0;

        for(int i = 0; i < runs; i++){
            long startTimeLink100 = System.currentTimeMillis();
            listClass100.nameRandomFile(100, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            listClass100.randomElementWithJack();
            listClass100.fivePercent();
            listClass100.FirstLastPercent();
            listClass100.findAndPrintJackName();
            listClass100.removeJackName();
            long endTimeLink100 = System.currentTimeMillis();
            long executionTimeLink100 = endTimeLink100 - startTimeLink100;

            sumLin100 += executionTimeLink100;

            long startTimeLink2000 = System.currentTimeMillis();
            listClass2000.nameRandomFile(2000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            listClass2000.randomElementWithJack();
            listClass2000.fivePercent();
            listClass2000.FirstLastPercent();
            listClass2000.findAndPrintJackName();
            listClass2000.removeJackName();
            long endTimeLink2000 = System.currentTimeMillis();
            long executionTimeLink2000 = endTimeLink2000 - startTimeLink2000;

            sumLin2000 += executionTimeLink2000;

            long startTimeLink5000 = System.currentTimeMillis();
            listClass5000.nameRandomFile(5000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            listClass5000.randomElementWithJack();
            listClass5000.fivePercent();
            listClass5000.FirstLastPercent();
            listClass5000.findAndPrintJackName();
            listClass5000.removeJackName();
            long endTimeLink5000 = System.currentTimeMillis();
            long executionTimeLink5000 = endTimeLink5000 - startTimeLink5000;

            sumLin5000 += executionTimeLink5000;


            long startTime100 = System.currentTimeMillis();
            collection100.nameRandomFile(100, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            collection100.randomJack();
            collection100.fivePercent();
            collection100.persentFiveFirstLast();
            collection100.printJackName();
            collection100.removeJack();
            long endTime100 = System.currentTimeMillis();
            long executionTime100 = endTime100 - startTime100;

            sum100 += executionTime100;

            long startTime2000 = System.currentTimeMillis();
            collection2000.nameRandomFile(2000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            collection2000.randomJack();
            collection2000.fivePercent();
            collection2000.persentFiveFirstLast();
            collection2000.printJackName();
            collection2000.removeJack();
            long endTime2000 = System.currentTimeMillis();
            long executionTime2000 = endTime2000 - startTime2000;

            sum2000 += executionTime2000;

            long startTime5000 = System.currentTimeMillis();
            collection5000.nameRandomFile(5000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            collection5000.randomJack();
            collection5000.fivePercent();
            collection5000.persentFiveFirstLast();
            collection5000.printJackName();
            collection5000.removeJack();
            long endTime5000 = System.currentTimeMillis();
            long executionTime5000 = endTime5000 - startTime5000;

            sum5000 += executionTime5000;

            long startTimeStack100 = System.currentTimeMillis();
            stackClass100.nameRandomFile(100, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            stackClass100.randomJack();
            stackClass100.fivePercent();
            stackClass100.persentFiveFirstLast();
            stackClass100.printJackName();
            stackClass100.removeJack();
            long endTimeStack100 = System.currentTimeMillis();
            long executionTimeStack100 = endTimeStack100 - startTimeStack100;

            sumStack100 += executionTimeStack100;

            long startTimeStack2000 = System.currentTimeMillis();
            stackClass2000.nameRandomFile(2000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            stackClass2000.randomJack();
            stackClass2000.fivePercent();
            stackClass2000.persentFiveFirstLast();
            stackClass2000.printJackName();
            stackClass2000.removeJack();
            long endTimeStack2000 = System.currentTimeMillis();
            long executionTimeStack2000 = endTimeStack2000 - startTimeStack2000;

            sumStack2000 += executionTimeStack2000;

            long startTimeStack5000 = System.currentTimeMillis();
            stackClass5000.nameRandomFile(5000, "C:/Users/Professional/IdeaProjects/December0512/Name.txt");
            stackClass5000.randomJack();
            stackClass5000.fivePercent();
            stackClass5000.persentFiveFirstLast();
            stackClass5000.printJackName();
            stackClass5000.removeJack();
            long endTimeStack5000 = System.currentTimeMillis();
            long executionTimeStack5000 = endTimeStack5000 - startTimeStack5000;

            sumStack5000 += executionTimeStack5000;

        }

        double averageTimeLink100 = (double) sumLin100 / runs;
        double averageTimeLink2000 = (double) sumLin2000 / runs;
        double averageTimeLink5000 = (double) sumLin5000 / runs;

        double averageTime100 = (double) sum100 / runs;
        double averageTime2000 = (double) sum2000 / runs;
        double averageTime5000 = (double) sum5000 / runs;

        double averageTimeStack100 = (double) sumStack100 / runs;
        double averageTimeStack2000 = (double) sumStack2000 / runs;
        double averageTimeStack5000 = (double) sumStack5000 / runs;

        System.out.println("Результаты для 100 элементов: LinkedListClass");
        System.out.println("Среднее время выполнения: " + averageTimeLink100 + " мс");

        System.out.println("Результаты для 2000 элементов: LinkedListClass");
        System.out.println("Среднее время выполнения: " + averageTimeLink2000 + " мс");

        System.out.println("Результаты для 5000 элементов: LinkedListClass");
        System.out.println("Среднее время выполнения: " + averageTimeLink5000 + " мс");

        System.out.println("Результаты для 100 элементов: ArrayListClass");
        System.out.println("Среднее время выполнения: " + averageTime100 + " мс");

        System.out.println("Результаты для 2000 элементов: ArrayListClass");
        System.out.println("Среднее время выполнения: " + averageTime2000 + " мс");

        System.out.println("Результаты для 5000 элементов: ArrayListClass");
        System.out.println("Среднее время выполнения: " + averageTime5000 + " мс");

        System.out.println("Результаты для 100 элементов: Stack");
        System.out.println("Среднее время выполнения: " + averageTimeStack100 + " мс");

        System.out.println("Результаты для 2000 элементов: Stack");
        System.out.println("Среднее время выполнения: " + averageTimeStack2000 + " мс");

        System.out.println("Результаты для 5000 элементов: Stack");
        System.out.println("Среднее время выполнения: " + averageTimeStack5000 + " мс");

    }
}