package dao.impl;

import java.util.List;

import dao.ICategoryDAO;
import mapper.CategoryMapper;
import mapper.NewMapper;
import modle.CategoryModle;
import modle.NewsModle;

public class CategoryDAO extends AbstractDAO<CategoryModle> implements ICategoryDAO{	
	
	@Override
	public List<CategoryModle> findAll() {		
		String sql = "select * from category";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModle findOne(Long id) {
		String sql = "select * from category where id = ?";
		List<CategoryModle> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);

	}

	@Override
	public CategoryModle findOneByCode(String code) {
		String sql = "select * from category where code = ?";
		List<CategoryModle> category = query(sql, new CategoryMapper(), code);
		return category.isEmpty() ? null : category.get(0);

	}
}
