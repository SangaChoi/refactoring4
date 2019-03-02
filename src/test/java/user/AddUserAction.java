package user;

import org.apache.ibatis.session.SqlSession;

import domain.User;


public class AddUserAction {

	public static void main(String[] args) throws Exception {
		
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		User user=new User();
		user.setUserId("test01");
		user.setUserName("Å×½ºÆ®");
		user.setPassword("1111");
			
		System.out.println(":: 1. addUser(INSERT)  ? ");
		System.out.println(":: "+ sqlSession.insert("UserMapper.addUser",user));
		System.out.println("\n");
	}

}
