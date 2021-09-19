import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class LoginTests {
    

    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User("Ryan Lucan", "september 14 1993", UserType.ADMIN);
        users[1] = new User("iLovePizzas", "90Days8xXyoutube", UserType.REGULAR);
        Login loginTest = new Login(users);
        System.out.println(loginTest.getUsers()[0].getUsername());
    }


    @Test
    public void testConstructor() {
        User[] users = new User[1];
        users[0] = new User("Ryan Lucan", "september 14 1993", UserType.ADMIN);

        Login loginTest = new Login(users);
        User[] loginUsers = loginTest.getUsers();

        assertEquals("Ryan Lucan", loginUsers[0].getUsername());
        assertEquals("september 14 1993", loginUsers[0].getPassword());
        assertEquals(UserType.ADMIN, loginUsers[0].getUserType());
    }

    @Test
    public void testValidate() {
        User[] users = new User[2];
        users[0] = new User("Ryan Lucan", "september 14 1993", UserType.ADMIN);
        users[1] = new User("xQcFan1338", "fork55spoons", UserType.REGULAR);

        Login loginTest = new Login(users);
        loginTest.validate("Ryan Lucan", "september 14 1993", true);
        
        assertEquals(true, loginTest.validate("Ryan Lucan", "september 14 1993", true)); //test right user and pass, admin (valid)
        assertEquals(true, loginTest.validate("Ryan Lucan", "september 14 1993", false)); //test right user and pass adminornot (valid)

        assertEquals(false, loginTest.validate("Ryan Lucan", "idk", false)); //test wrong pass (invalid)
        assertEquals(false, loginTest.validate("xQcFan1337", "fork55spoons", false)); //test wrong username (invalid)
        assertEquals(false, loginTest.validate("randomuser", "nopassword", false)); //test wrong username AND pass (invalid)

        assertEquals(true, loginTest.validate("xQcFan1338", "fork55spoons", false)); //test right user and pass, not admin (valid)
        assertEquals(false, loginTest.validate("xQcFan1338", "fork55spoons", true)); //test right user and pass, admin (invalid)
    }
}
