package Model;

public class User
{
    private String name;
    private String mobile;
    private String pass;
    private int userId;

    public User() {}

    public User(String name, String mobile, String pass, int userId) {
        this.name = name;
        this.mobile = mobile;
        this.pass = pass;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                ", pass='" + pass + '\'' +
                ", userId=" + userId +
                '}';
    }
}
