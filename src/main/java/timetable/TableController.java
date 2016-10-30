package timetable;



/**
 * Created by Administrator on 2016/10/29.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TableController {


    @Autowired
    TimeTableDao timeMapper;
    @Autowired
    CourseDao courseMapper;


    //初始化一周82节课
    @RequestMapping(value = "/init")
    public int init(){


        int [] a=new int [7];
        int [] b=new int [12];
        for(int i=0;i<7;i++)
        {
            a[i]=i+1;
        }

        for(int i=0;i<12;i++)
        {
            b[i]=i+1;
        }

        int sid=1;
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<12;j++)
            {
                timeMapper.Add_timetable(sid,a[i],b[j]);
            }
        }
        return 1;

    }

    @RequestMapping(value = "/add_course")
    public boolean add_course(@RequestParam(value="sid")int sid,@RequestParam(value="cid")int cid,@RequestParam(value="date")int date,@RequestParam(value="begin")int begin,@RequestParam(value="end")int end)
    {
        //从数据库中调取该cid对应的信息
        Course course=courseMapper.Get_course_by_cid(cid);

        String cname=course.getCname();
        String teacher_name=course.getTeacher_name();
        String classroom=course.getClassroom();
        String test_time=course.getTest_time();

       boolean status= timeMapper.Add_course(sid,date,cid,cname,teacher_name,classroom,test_time,begin,end);

        return status; //用boolean值表示是否执行成功
    }


    @RequestMapping(value = "/delete_course")
    public boolean delete_course(@RequestParam(value="sid")int sid,@RequestParam(value="date")int date,@RequestParam(value="begin")int begin,@RequestParam(value="end")int end){
        boolean status=timeMapper.Delete_course(sid,date,begin,end);
        return status;



    }




    @RequestMapping(value = "/qu")
    public String show(){
    return "23333";
    }


}
