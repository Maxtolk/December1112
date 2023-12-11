import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayDequeClass {
    private  Deque<String> mycollection;

    public ArrayDequeClass() {
        mycollection = new ArrayDeque<>();
    }
    public void nameRandomFile(int size, String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                mycollection.add(name);
            }
            scanner.close();

            Random random = new Random();
            for (int i = 0; i < size; i++) {
                int randomIndex = random.nextInt(mycollection.size());
                this.mycollection.add(mycollection.getLast(randomIndex));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }


    public void randomJack() {
        Random random = new Random();
        int randomIndex = random.nextInt(mycollection.size());
        mycollection.remove(randomIndex);
        mycollection.add(randomIndex, "Jack");
    }

    public void fivePercent() {
        int size = mycollection.size();
        int firstIndex = (int) (size * 0.05);
        int lastIndex = (int) (size * 0.95);
        String first = "";
        String last = "";
        int i = 0;
        for (String element : mycollection) {
            if (i == firstIndex) {
                first = element;
            }
            if (i == lastIndex) {
                last = element;
            }
            i++;
        }
    }

    public void persentFiveFirstLast(){
        int size = mycollection.size();
        int firstIndex = (int) (size * 0.05);
        int lastIndex = (int) (size * 0.95);
        int i = 0;
        for (String element : mycollection) {
            if (i == firstIndex || i == lastIndex) {
                mycollection.remove(element);
            }
            i++;
        }
        }



    public boolean printJackName() {
        if (mycollection.contains("Jack")) {
            System.out.println("Имя Jack найдено в коллекции.");
            return true;
        } else {
            System.out.println("Имя Jack не найдено в коллекции.");
            return false;
        }
    }
    public void removeJack() {
        mycollection.removeIf(name -> name.equals("Jack"));
    }

}
