package user;

import org.apache.ibatis.session.SqlSession;

import domain.User;


public class GetUserAction {

	public static void main(String[] args) throws Exception {
		
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		User user=new User();
		user.setUserId("test01");
		user.setUserName("Å×½ºÆ®");
		user.setPassword("1111");
			
		System.out.println(":: 2. getUser(SELECT)  ? ");
		System.out.println(":: "+sqlSession.selectOne("UserMapper.getUser",user.getUserId()) );
		System.out.println("\n");
	}

}
