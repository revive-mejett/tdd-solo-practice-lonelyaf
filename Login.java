public class Login {

    private User[] users;



    public Login(User[] users) {
        this.users = users;
    }


    public boolean validate(String username, String password, boolean admin) {


        for (int i = 0; i < this.users.length; i++) {

            if (!admin) { //if admin is false, then only user credentials must match regarless of user type
                if (this.users[i].getUsername().equals(username) && this.users[i].getPassword().equals(password)) {
                    return true;
                }
            }
            if (admin) { //if admin is true, then users must be an admin as well as match credentials
                if(this.users[i].getUserType() == UserType.ADMIN && this.users[i].getUsername().equals(username) && this.users[i].getPassword().equals(password)) {
                    return true;
                }
            }
            
        }
        return false;
    }


    //get method
    public User[] getUsers() {
        return this.users;
    }


}