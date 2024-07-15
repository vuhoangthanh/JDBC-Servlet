package service;

import modle.UserModle;

public interface IUserService {
	UserModle findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
