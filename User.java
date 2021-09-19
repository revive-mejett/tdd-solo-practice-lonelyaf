public class User {
    


    private String username;
    private String password;
    private UserType userType;


    //constructor
    public User (String username, String password, UserType userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;

    }

    //get methods
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public UserType getUserType() {
        return this.userType;
    }

}
