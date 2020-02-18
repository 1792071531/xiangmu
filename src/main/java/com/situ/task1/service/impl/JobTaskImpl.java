package com.situ.task1.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.situ.task1.service.JobTask;

@Service
public class JobTaskImpl implements JobTask {
	public JobTaskImpl() {
		System.out.println("JobTaskImpl 的构造函数！！");
	}
	//此方法准备让任务调度自动的调用
	@Override
	public void autoJob() {
		//书写相关的逻辑数据
		System.out.println("这是由任务调度自动调用的" + new Date().toLocaleString());
	}

}
