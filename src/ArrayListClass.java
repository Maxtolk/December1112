import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayListClass {

    private List<String> mycollection;

    public ArrayListClass() {
        mycollection = new ArrayList<>();
    }
    public void nameRandomFile(int size, String filename) {
        try { File file = new File(filename);
            Scanner scanner = new Scanner(file);
            List<String> names = new ArrayList<>();
            while(scanner.hasNextLine()) {
                String name = scanner.nextLine();
                names.add(name);
        }
       scanner.close();
            Random random = new Random();
            for(int i = 0; i < size; i++) {
                int randomIndex = random.nextInt(names.size());
                mycollection.add(names.get(randomIndex));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File не найден. ");
        }
    }


    public void randomJack() {
        if(!mycollection.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(mycollection.size());
            mycollection.set(randomIndex, "Jack");
        }
    }

    public void fivePercent() {
        if(!mycollection.isEmpty()) {
            int size = mycollection.size();
            int firstIndex = (int) Math.floor(size*0.05);
            int lastIndex = (int) Math.ceil(size* 0.95);

            String firstElement = mycollection.get(firstIndex);
            String lastElement = mycollection.get(lastIndex);
        }
    }

    public void persentFiveFirstLast(){
        if(!mycollection.isEmpty()) {
            int size = mycollection.size();
            int count = (int) Math.ceil(size*0.05);

            for(int i =0; i < count; i++) {
                mycollection.remove(0);
                mycollection.remove(mycollection.size() - 1);
            }
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
