package timetable;

/**
 * Created by Administrator on 2016/10/28.
 */
public class TimeTable {

    //做联合查询时返回的对象
    private int tid;
    private int sid;
    private int cid;
    private int  date;//代表星期，周一至周天
    private int location;//代表课的位置 1-12节课

    //course表中联合查询得到的结果

    private String cname;
    private String teacher_name;
    private String classroom;
    private String test_time;


    @Override
    public String toString() {
        return "TimeTable{" +
                "tid=" + tid +
                ", sid=" + sid +
                ", cid=" + cid +
                ", date=" + date +
                ", location=" + location +
                ", cname='" + cname + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", test_time='" + test_time + '\'' +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public int getSid() {
        return sid;
    }

    public int getCid() {
        return cid;
    }

    public int getDate() {
        return date;
    }

    public int getLocation() {
        return location;
    }

    public String getCname() {
        return cname;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getTest_time() {
        return test_time;
    }


    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setTest_time(String test_time) {
        this.test_time = test_time;
    }
}
