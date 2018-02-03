package ServiceImpl;

import daoImpl.UserDaoImpl;
import entity.User;
import service.registUser;

public class UserServiceImpl implements registUser{

	@Override
	public void regist(User u) {
		//需要调用dao层里的方法
		UserDaoImpl daoImpl = new UserDaoImpl();
		daoImpl.insert(u);
		
	}

}
