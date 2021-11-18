import java.sql.Time;
import java.time.LocalDateTime;

public interface User {
    public String getUserEmail();
    public String getUserCountry();
    public LocalDateTime getUserLastActiveTime();
}
