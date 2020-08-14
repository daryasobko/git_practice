package User;


public class User {
    private final String firstName;
    private final String lastName;
    private final int workPhone;
    private final int mobilePhone;
    private final String email;
    private final String password;

    User(String firstName, String lastName, int workPhone, int mobilePhone, String email,
         String password){
        this.firstName= firstName;
        this.lastName= lastName;
        this.workPhone= workPhone;
        this.mobilePhone= mobilePhone;
        this.email= email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWorkPhone() {
        return workPhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String validationAll() {
        if (firstName.isEmpty()) {
            return "Enter your first name";
        }
        if (lastName.isEmpty()) {
            return "Enter your last name";
        }
        if (workPhone < 1) {
            return "Enter your work phone";
        }
        if (mobilePhone < 1) {
            return "Enter your mobile phone";
        }
        if (email.isEmpty()) {
            return "Enter your email";
        }
        if (password.isEmpty()) {
            return "Enter your password";
        }
        else {
            return "Successful registration";
        }
    }


    public String emailValidation (){
        if (email.contains("@")) {
            return "Valid email";
        }
        else {
            return "Add @ in your email";
        }
    }

    public String passValidation() {
        int length;
        length = password.length();
        if (length < 8 || length > 16) {
            return "Password should be min 8 max 16 symbols";
        }
        else {
            return "Valid password";
        }
    }

    /*Check*/
        public static void main(String[] args){

        User Test = new User("Test", "Test", 1, 1,
                "user@mail.ua", "12345678");
        System.out.println (Test.validationAll());
        System.out.println (Test.emailValidation());
        System.out.println(Test.passValidation());
    }

}