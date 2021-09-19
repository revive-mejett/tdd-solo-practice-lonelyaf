import java.util.Random;


public class PasswordGenerator {
    

    private int length;
    private Random rng;       //random number generator

    public PasswordGenerator(int length) {
        this.length = length;
        this.rng = new Random();
    }

    public int getLength() {
        return this.length;
    }

    public String generateWeakPassword() {

        String weakChars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder generatedPass = new StringBuilder();

        //make a string; loop until length, each time add a random letter from the list of weak chars
        for (int i = 0; i < this.length; i++) {
            int randomPos = rng.nextInt(weakChars.length()); 
            generatedPass.append(weakChars.charAt(randomPos)); // get letter at random position of string
        }

        return generatedPass.toString();
    }

    public String generateStrongPassword() {

        String strongChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder generatedPass = new StringBuilder();
        
        //strong passwords will have twice the length
        for (int i = 0; i < this.length*2; i++) {
            int randomPos = rng.nextInt(strongChars.length()); 
            generatedPass.append(strongChars.charAt(randomPos)); // get letter at random position of string
        }

        return generatedPass.toString();
    }



}
