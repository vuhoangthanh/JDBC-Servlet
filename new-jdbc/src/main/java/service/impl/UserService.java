package service.impl;

import javax.inject.Inject;

import dao.IUserDAO;
import modle.UserModle;
import service.IUserService;

public class UserService implements IUserService{
	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModle findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}



}
