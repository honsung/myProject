package com.honsung.test;
/*package com.honsung.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.honsung.dao.DeptMapper;
import com.honsung.model.Dept;

*//**
 * 推荐使用Spring的测试
 * @author Administrator
 *
 *//*
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-context.xml"})
public class MapperTest extends AbstractJUnit4SpringContextTests {
	
	@Autowired
	DeptMapper deptMapper;

	@Test
	public void testCRUD(){
		*//**
		 * 常规测试
		 *//*
		//1.创建IOC容器
		ApplicationContext ioc = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");
		//2.从容器中取出Mapper
		DeptMapper bean = ioc.getBean(DeptMapper.class);
		List<Dept> list = bean.selectByExample(null);
		System.out.println(list.size());
		*//**
		 * Spring的测试
		 *//*
		System.out.println(deptMapper);
		List<Dept> list = deptMapper.selectByExample(null);
		System.out.println(list.size());
	}
}
*/