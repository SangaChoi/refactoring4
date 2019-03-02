package user;

import org.apache.ibatis.session.SqlSession;

import domain.User;

public class DeleteUserAction {

	public static void main(String[] args) throws Exception {
		SqlSession sqlSession = SqlSessionFactoryBean.getSqlSession();
		
		User user=new User();
		user.setUserId("test01");
			
		System.out.println(":: 5. Use10.removeUser (DELETE)  ? ");
		System.out.println(":: "+sqlSession.delete("UserMapper.removeUser",user.getUserId()) );

	}

}
