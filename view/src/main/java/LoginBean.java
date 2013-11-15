import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.lang.String;


@ManagedBean(name = "login")
@SessionScoped
public class LoginBean implements Serializable
{


    private String username;
    private String password;

    //    @NotNull(message = "Please enter username")
    private String url;
    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
          /*
    public String doAction()
    {
        return "Main Page";
    }       */
}