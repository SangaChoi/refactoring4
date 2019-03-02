package user;

import org.apache.ibatis.session.SqlSession;

import domain.User;


public class UpdateUserAction {

	public static void main(String[] args) throws Exception {
		
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		User user=new User();
		user.setUserId("test01");
		
		user.setUserName("온달");
		user.setPhone("010-1111-2222");
		user.setAddr("서울시");
		user.setEmail("abc@naver.com");
		
		System.out.println(":: 3. update(UPDATE)  ? ");
		System.out.println(":: "+ sqlSession.update("UserMapper.updateUser",user));
		System.out.println("\n");
	}

}
