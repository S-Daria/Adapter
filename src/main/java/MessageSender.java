import java.time.LocalDateTime;
import java.time.Duration;

public class MessageSender{
    public boolean send(String text, User user, String country){
        Duration duration = Duration.between(user.getUserLastActiveTime(), LocalDateTime.now());
        if (duration.getSeconds()/360 > 1) {
            if (user.getUserCountry().equals(country)) {
                System.out.println("Message sent");
                return true;
            }
            System.out.println("User country does not match the sending country");
            return false;
        } else {
            System.out.println("User was not active in the past hour");
            return false;
        }
    }
}
