public class LoginService {
    public boolean login(String username, String pwd) {
        return username != null && !username.isEmpty()
            && pwd != null && !pwd.isEmpty();
    }
}
