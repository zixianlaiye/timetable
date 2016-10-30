package timetable;



/**
 * Created by Administrator on 2016/10/28.
 */



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.SelectKey;

import java.util.ArrayList;

@Mapper
public interface CourseDao {

    //为课表中添加课程
    @Insert("insert into course(cname,teacher_name,classroom,test_time,sid) values(#{cname},#{teacher_name},#{classroom}, #{test_time},#{sid}")
    void Add_course();


    //通过cid查询某节课的全部数据
    @Select("select * from course where cid=#{cid}")
    Course Get_course_by_cid(@Param("cid") int cid);


    //由用户sid查询整个课程表的考试时间
    @Select("select * from course where sid=#{sid}")
    ArrayList<Course> Get_all_course(@Param("sid") int sid);

    //用户更新自己的课程表
    @Update("update course set cname=#{cname},teacher_name=@{teacher_name},classroom=#{classroon},test_time=#{test_time} where cid=#{cid} ")
    boolean  Update_course(@Param("cname") String cname, @Param("teacher_name") String teacher_name,@Param("classroom") String classroom,@Param("test_time") String test_time);

    //用户删除自己的已有课程
    @Delete("delete from course where cid=#{cid}")
    boolean Delete_course(@Param("cid") int cid);





}
