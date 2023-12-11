import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class StackClass {
    private Stack<String> stack;
    private Random random;
    public StackClass() {
        stack = new Stack<>();
        random = new Random();
    }
    public void nameRandomFile(int size, String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            List<String> names = new ArrayList<>();
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
            stack.addAll(names);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void randomJack() {
        int randomIndex = random.nextInt(stack.size());
        stack.set(randomIndex, "Jack");
    }

    public List<String> fivePercent() {
        int lastFivePercent = (int) (stack.size() * 0.05);
        List<String> firstFivePercent = new ArrayList<>(stack.subList(0, lastFivePercent));
        List<String> lastFivePercentList = new ArrayList<>(stack.subList(stack.size() - lastFivePercent, stack.size()));
        return firstFivePercent;
    }

    public void persentFiveFirstLast(){
        int lastFivePercent = (int) (stack.size() * 0.05);
        for (int i = 0; i < lastFivePercent; i++) {
            stack.remove(0);
        }
        for (int i = 0; i < lastFivePercent; i++) {
            stack.pop();
        }
    }


    public void printJackName() {
        if (stack.contains("Jack")) {
            System.out.println("Name Jack found");
        } else {
            System.out.println("Name Jack not found");
        }
    }
    public void removeJack() {
        stack.removeIf(name -> name.equals("Jack"));

    }

}
