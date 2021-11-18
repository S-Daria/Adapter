import java.time.LocalDateTime;

public class FacebookUserAdapter implements User{
    public FacebookUser user;

    public FacebookUserAdapter(FacebookUser user){
        this.user = user;
    }
    public String getUserEmail(){
        return this.user.getEmail();
    }

    public String getUserCountry(){
        return this.user.getUserCountry();
    }

    public LocalDateTime getUserLastActiveTime(){
        return this.user.getUserActiveTime();
    }
}
