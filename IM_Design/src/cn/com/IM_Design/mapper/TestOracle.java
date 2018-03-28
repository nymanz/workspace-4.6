package cn.com.IM_Design.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.com.IM_Design.beans.User;

public class TestOracle {
	@Test
	public void test() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession =null;
		try{
			//2.获取sqlSession实例，能直接执行已经映射的SQL语句
			sqlSession= sqlSessionFactory.openSession();
			//需要两个参数，第一个参数是sql语句的唯一标识，
			//第二个参数是执行sql要用的参数
			User employee = sqlSession.selectOne("cn.com.IM_Design.mapper.selectEmp",21);
			System.out.println(employee);
		}catch(Exception e){
			
		}finally{
			sqlSession.close();
		}
		
	}
}
