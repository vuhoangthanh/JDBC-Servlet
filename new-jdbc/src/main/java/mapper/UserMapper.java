package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import modle.NewsModle;
import modle.RoleModle;
import modle.UserModle;

public class UserMapper implements RowMapper<UserModle>{

	@Override
	public UserModle mapRow(ResultSet resultSet) {		
		try {
			UserModle user = new UserModle();
			user.setId(resultSet.getLong("id"));
			user.setUserName(resultSet.getString("username"));	
			user.setPassword(resultSet.getString("password"));
			user.setFullName(resultSet.getString("fullname"));
			user.setStatus(resultSet.getInt("status"));
			try {
				RoleModle role = new RoleModle();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				user.setRole(role);
			}catch (Exception e){
				System.out.print(e.getMessage());
			}
			return user;
		} catch (SQLException e) {
			return null;
		}
	}

}
