package dao;

import modle.UserModle;

public interface IUserDAO extends GenericDAO<UserModle> {
	UserModle findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
	
}
