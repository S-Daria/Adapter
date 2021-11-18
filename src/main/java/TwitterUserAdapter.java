import java.time.LocalDateTime;

public class TwitterUserAdapter implements User{
    public TwitterUser user;

    public TwitterUserAdapter(TwitterUser user){
        this.user = user;
    }
    public String getUserEmail(){
        return this.user.getUserMail();
    }

    public String getUserCountry(){
        return this.user.getCountry();
    }

    public LocalDateTime getUserLastActiveTime(){
        return this.user.getLastActiveTime();
    }
}
