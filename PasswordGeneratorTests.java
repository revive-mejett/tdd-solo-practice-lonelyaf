import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;




public class PasswordGeneratorTests {
    




   

    @Test
    public void testConstructor() {
        PasswordGenerator passwordGen = new PasswordGenerator(10);
        assertEquals(10, passwordGen.getLength());
    }

    @Test
    public void testStrongPassword() {
        PasswordGenerator passwordGen = new PasswordGenerator(8);
        String newPassword = passwordGen.generateStrongPassword();
        System.out.println(newPassword);
        assertEquals(16, newPassword.length());
    }


    @Test
    public void testWeakPassword() {
        PasswordGenerator passwordGen = new PasswordGenerator(9);
        String newPassword = passwordGen.generateWeakPassword();
        assertEquals(9, newPassword.length());
    }
    
}
