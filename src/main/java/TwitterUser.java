import java.time.LocalDateTime;

public class TwitterUser{
    public String email;
    public String country;
    public LocalDateTime time;

    public String getUserMail(){
        return this.email;
    }

    public String getCountry(){
        return this.country;
    }

    public LocalDateTime getLastActiveTime(){
        return this.time;
    }
}
