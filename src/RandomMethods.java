import java.util.Random;

public class RandomMethods {
    public String generateRandomName(){
        String[] names = {"Eve", "Frank", "Grace", "Henry", "Bob", "Max", "Lia",
        "Robert", "Alex", "Nina","Jo","Alisa"};
        Random random = new Random();
        int ind = random.nextInt(names.length);
        return names[ind];
    }

    public int generateRandomIndex(int s) {
        Random random= new Random();
        return random.nextInt(s);
    }
}
