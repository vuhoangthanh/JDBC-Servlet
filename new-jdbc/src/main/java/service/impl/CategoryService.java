package service.impl;

import java.util.List;

import javax.inject.Inject;

import dao.ICategoryDAO;
import dao.impl.CategoryDAO;
import modle.CategoryModle;
import service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDAO;
	
	@Override
	public List<CategoryModle> findAll() {
		return categoryDAO.findAll();
	}

}
