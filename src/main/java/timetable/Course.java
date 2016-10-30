package timetable;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Course {

    private int cid;
    private int sid;
    private String cname;
    private String teacher_name;
    private String classroom;
    private String test_time;

    @Override
    public String toString() {
        return "CourseDao{" +
                "cid=" + cid +
                ", sid=" + sid +
                ", cname='" + cname + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", test_time='" + test_time + '\'' +
                '}';
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public int getCid() {
        return cid;
    }

    public int getSid() {
        return sid;
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
}
