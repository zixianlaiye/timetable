package timetable;

/**
 * Created by Administrator on 2016/10/28.
 */
public class User
{
    private int sid;//学号
    private String name;//用户名
    private String password;//密码

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
