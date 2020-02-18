/**
 * @Company:中享思途   
 * @Title:JobTaskImpl2.java 
 * @Author:Administrator   
 * @Date:2020年2月5日 上午10:39:39     
 */ 
package com.situ.task1.service.impl;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.situ.task1.service.JobTask;

/** 
 * @ClassName:JobTaskImpl2 
 * @Description:(这里用一句话描述这个类的作用)  
 */
@Service
@EnableScheduling
public class JobTaskImpl2 implements JobTask{

	/** 
	 * @Title: autoJob 
	 * @Description:(这里用一句话描述这个方法的作用)  
	 */  
	@Override
	@Scheduled(cron ="0 44 10 * * ?")
	public void autoJob() {
		System.out.println("这是由任务调度自动调用的" + new Date().toLocaleString());
		
	}

}
