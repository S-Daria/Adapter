import java.time.LocalDateTime;

public class FacebookUser{
    public String email;
    public String country;
    public LocalDateTime time;

    public String getEmail(){
        return this.email;
    }

    public String getUserCountry(){
        return this.country;
    }

    public LocalDateTime getUserActiveTime(){
        return this.time;
    }
}
