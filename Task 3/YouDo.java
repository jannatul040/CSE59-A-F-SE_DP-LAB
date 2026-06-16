public class Main {

    public static void main(String[] args) {

        User user = new User("john_doe", "john@example.com");

        if (EmailValidator.isValid(user.getEmail())) {
            UserRepository userRepository = new UserRepository();
            userRepository.save(user);
        }
    }
}

// User class - responsible only for user data
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

// EmailValidator class - responsible only for validation
class EmailValidator {

    public static boolean isValid(String email) {
        if (email != null && email.contains("@")) {
            return true;
        }

        System.out.println("Invalid email format.");
        return false;
    }
}

// UserRepository class - responsible only for database operations
class UserRepository {

    public void save(User user) {
        System.out.println("Connecting to database...");
        System.out.println("Saving user " + user.getUsername() + " to the users table.");
    }
}
