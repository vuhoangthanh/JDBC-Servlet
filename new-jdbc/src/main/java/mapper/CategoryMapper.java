package mapper;

import java.sql.ResultSet;

import modle.CategoryModle;

public class CategoryMapper implements RowMapper<CategoryModle>{

	@Override
	public CategoryModle mapRow(ResultSet resultSet) {
		try {
			CategoryModle category = new CategoryModle();
			
			category.setId(resultSet.getLong("id"));
			category.setCode(resultSet.getString("code"));
			category.setName(resultSet.getString("name"));
			return category;
		} catch (Exception e) {
			return null;
		}	
	}
}
