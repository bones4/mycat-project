package com.didispace.web;

import com.didispace.web.aspect.ServiceLog;
import com.didispace.web.jdbc.mapper.MycatPaperMapper;
import com.didispace.web.jdbc.mapper.MycatUserMapper;
import com.didispace.web.jdbc.mapper.MycatUserPaperMapper;
import com.didispace.web.jdbc.po.MycatPaper;
import com.didispace.web.jdbc.po.MycatUser;
import com.didispace.web.jdbc.po.MycatUserPaper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

//import com.didispace.web.jdbc.service.UserService;

/**
 * 创建一个RESTful API的实现代码    同SpringMVC一样  但是不需要像SpringMVC写太多配置   直接从Controller开始
 * @author Administrator
 *
 */
@RestController
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	//@Autowired
	//private UserService userService;
	@ServiceLog(operation = "启动类。。")
	@RequestMapping("/hello")
	public String index() {

		//return test1();
		return test2();
	}

	@Autowired
	MycatUserMapper userMapper;
	@Autowired
	MycatPaperMapper paperMapper;
	@Autowired
	MycatUserPaperMapper userPaperMapper;
	private String test2() {
		String result = null;
		/*
		http://127.0.0.1:8084/hello
		 * 1查询考试试卷，paper
		 * 2学生提交答案，user
		 * 3后台阅卷，paper
		 * 4更新考试成绩，user
		 *
		 *
		 * */
		//生成随机学生
		StringBuffer temp=new StringBuffer();
		temp.append("<br/>生成随机学生");
		Random random=new Random();
		int id= random.nextInt(100*10000);

		MycatUser mycatUser = userMapper.selectByNumber(id);
		temp.append(String.format("<br/>学生ID=%s,姓名=%s" ,mycatUser.getId(),mycatUser.getUserName()));
		temp.append("<br/>1、查询考试试卷");



		MycatPaper mycatPaper = paperMapper.selectByPrimaryKey((random.nextInt(2)+1));
		temp.append(String.format("<br/>试卷=%s,题目=%s" ,mycatPaper.getTitle(),mycatPaper.getAnswer()));
		String user_answer= String.valueOf(random.nextInt(4));
		temp.append("<br/>2、学生提交答案=").append(user_answer);
		temp.append("<br/>3、后台阅卷,");
		MycatUserPaper mycatUserPaper=new MycatUserPaper();
		mycatUserPaper.setUserid(mycatUser.getId());
		mycatUserPaper.setPaperid(mycatPaper.getId());
		mycatUserPaper.setUserAnswer(user_answer);
		int Score=0;
		if(user_answer.equals(mycatPaper.getAnswer())){
			Score=100;
		}
		mycatUserPaper.setUserScore(Score);
		temp.append("学生得分").append(Score);
		temp.append("<br/>4、保存学生考试成绩");
		userPaperMapper.insert(mycatUserPaper);

        result=temp.toString();
		return result;
	}

//	private String test1() {
//		int id= new Random().nextInt(4000*10000);
//		long beginTime=System.currentTimeMillis();
//		User  user = userService.selectByPrimaryKey(id);
//		long time=System.currentTimeMillis()-beginTime;
//		return "id= "+user.getId()+" name="+user.getName()+",消耗查询时间："+time;
//
//	}



	
}
