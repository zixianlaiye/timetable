package timetable;

/**
 * Created by Administrator on 2016/10/29.
 */


import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;



import java.util.ArrayList;

@Mapper

//@Insert("insert into time(sid,date,location,cid,cname,teacher_name,classroom,test_time,status)

public interface TimeTableDao {

    //初始化一周84节课
    @Insert("insert into time(sid,date,location) values(#{sid},#{date},#{location})")
    void Add_timetable(@Param("sid")int sid,@Param("date") int date,@Param("location") int location);

    //查询一周的课表 课程为空的怎么办233
    @Select("select * from time where sid=#{sid}")
    ArrayList<TimeTable> Get_timetable(@Param("sid") int sid);

    //对课表内容进行增加
    @Update("update time cid=#{cid},cname=#{cname},teacher_name=#{teacher_name},classroom=#{classroom},test_time=#{test_time},status=1 where date=#{date} and location>=#{begin} and location<=#{end} and sid=#{sid}; ")
     boolean Add_course(@Param("sid")int sid,@Param("date") int date,@Param("cid") int cid,@Param("cname") String cname,@Param("teacher_name") String teacher_name,@Param("classroom") String  classroom,@Param("test_time") String test_time,@Param("begin") int begin,@Param("end") int end);


    //对课表内容进行去除

    @Update("update time set status=0 where date=#{date} and location>=#{begin} and location<=#{end} and ")
    boolean Delete_course(@Param("sid")int sid,@Param("date") int date,@Param("begin") int begin,@Param("end") int end);

    //查询一周的课程
    @Select("select * from time where sid=#{sid}  order by tid")
    ArrayList<TimeTable> Get_table(@Param("sid") int sid);






}
