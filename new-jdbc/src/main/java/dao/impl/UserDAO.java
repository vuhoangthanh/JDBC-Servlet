package dao.impl;

import java.util.List;

import dao.IUserDAO;
import mapper.UserMapper;
import modle.UserModle;

public class UserDAO  extends AbstractDAO<UserModle> implements IUserDAO{

	@Override
	public UserModle findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder ("select * from user as u ");
		sql.append("inner join role as r on r.id=u.roleid ");
		sql.append(" where username = ? and password = ? and status = ?");
		List<UserModle> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return users.isEmpty() ? null : users.get(0);
	}
}
