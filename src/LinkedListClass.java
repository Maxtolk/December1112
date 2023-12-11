import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class LinkedListClass {

    private List<String> mycollection;

    public LinkedListClass() {
        mycollection = new LinkedList<>();
    }

    public void nameRandomFile(int size, String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            List<String> names = new LinkedList<>();
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                names.add(name);
            }
            scanner.close();

            Random random = new Random();
            for (int i = 0; i < size; i++) {
                int randomIndex = random.nextInt(names.size());
                mycollection.add(names.get(randomIndex));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
    public void randomElementWithJack() {
        if(!mycollection.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(mycollection.size());
            mycollection.set(randomIndex, "Jack");
        }
    }
    public void fivePercent() {
        if(!mycollection.isEmpty()) {
            int size = mycollection.size();
            int firstIndex = (int) Math.floor(size * 0.05);
            int lastIndex = (int) Math.floor(size * 0.95);

            String firstElement = mycollection.get(firstIndex);
            String lastElement = mycollection.get(lastIndex);
        }
    }

    public void FirstLastPercent() {
        if(!mycollection.isEmpty()) {
            int size = mycollection.size();
            int count = (int) Math.ceil(size * 0.05);
            for (int i = 0; i < count; i++) {
                mycollection.remove(0);
                mycollection.remove(mycollection.size() - 1);
            }
        }
    }

    public boolean findAndPrintJackName() {
        if (mycollection.contains("Jack")) {
            System.out.println("Имя Jack найдено в коллекции.");
            return true;
        } else {
            System.out.println("Имя Jack не найдено в коллекции.");
            return false;
        }
    }
    public void removeJackName() {
        mycollection.remove("Jack");
    }

}






























  // public LinkedList<String> generateRandomNamesCollection(int size){
  //     LinkedList<String> linkedList = new LinkedList<>();
  //     for(int i = 0; i<size; i++) {
  //         linkedList.add(generateRandomName());
  //     }
  //     return linkedList;
  // }
  // public LinkedList<String> randomJack() {
  //     String newName = "Jack";
  //     int randomIndex1 = generateRandomIndex(linkedList.size());
  //     linkedList.set(randomIndex1, newName);
  //     return
  // }
  // public void last5Percent(LinkedList<String> names ) {
  //     int firstIndex = 0;
  //     int lastIndex = (int) (names.size() * 0.05);
  //     LinkedList<String> first5 = (LinkedList<String>) names.subList(firstIndex, lastIndex);
  //     firstIndex = names.size() - lastIndex;
  //     LinkedList<String> last5 = (LinkedList<String>) names.subList(firstIndex,lastIndex);

  //     System.out.println("Первые 5% элементов:");
  //     System.out.println(first5);
  //     System.out.println("Последние 5% элементов:");
  //     System.out.println(last5);
  //     names.removeAll(first5);
  //     names.removeAll(last5);

  //     System.out.println("Коллекция после удаления первых и последних 5% элементов:");
  //     System.out.println(names);
  // }

  // public void WhereJack(LinkedList<String> names){
  //     System.out.println("Имя Jack найдено в коллекции: " + names.contains("Jack"));
  // }
  // public   void deleteJack(LinkedList<String> names){
  //     names.remove("Jack");
  //     System.out.println("Коллекция после удаления имени Jack:");
  //     System.out.println(names);






