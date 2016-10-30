package timetable;


/**
 * Created by Administrator on 2016/10/27.
 */
//数据库创建
//用户表
//    create table user(sid int not null auto_increment primary key,
//            name varchar(20) not null,
//            password varchar(50) not null)
//engine=Innodb default charset=utf8;



    //课程信息表
//    create table CourseDao(cid int  auto_increment primary key,
//            cname varchar(20) not null comment'课程名称',
//            teacher_name varchar(20) not null comment'教师姓名',
//            classroom varchar(30) not null comment'上课教室',
//            test_time varchar(20) not null  comment'考试时间'
//            )
//engine=Innodb default charset=utf8;

    //时刻安排表
//    create table time(tid int auto_increment primary key,
//            sid int(3) not null,
//            cid int(3),
//            date int(1) not null default '0' comment'表示周一至周天,数字1-7',
//            location int(2)  not null default '0' comment '表示位于一天中的第几节课，范围为1-12')
//        engine=Innodb default charset=utf8;



import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

import java.util.ArrayList;

@Mapper
//通过用户名查询用户信息，做登录判断
public interface UserDao {
    @Select("select * from user where name=#{name}")
    User findByName(@Param("name") String name);






}
