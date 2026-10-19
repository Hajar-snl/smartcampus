public class LoginService {
    public boolean login(String user, String pwd) {
        return user != null && !user.isEmpty()
            && pwd != null && !pwd.isEmpty();
    }
}
