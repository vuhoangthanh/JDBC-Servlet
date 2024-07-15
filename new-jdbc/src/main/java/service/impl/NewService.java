package service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import dao.ICategoryDAO;
import dao.INewDAO;
import modle.CategoryModle;
import modle.NewsModle;
import paging.Pageble;
import service.INewService;

public class NewService implements INewService{

	@Inject
	private INewDAO newDAO;

	@Inject
	private ICategoryDAO categoryDAO;
	@Override
	public List<NewsModle> findByCategoryId(Long categoryId) {	
		return newDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewsModle save(NewsModle newsModle) {
		newsModle.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModle category = categoryDAO.findOneByCode(newsModle.getCategoryCode());
		newsModle.setCategoryId(category.getId());
		Long newId = newDAO.save(newsModle);
		return newDAO.findOne(newId);
	}

	@Override
	public NewsModle update(NewsModle updateNew) {
		NewsModle oldNew = newDAO.findOne(updateNew.getId());
		updateNew.setCreatedDate(oldNew.getCreatedDate());
		updateNew.setCreatedBy(oldNew.getCreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		CategoryModle category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
		updateNew.setCategoryId(category.getId());
		newDAO.update(updateNew);
		return newDAO.findOne(updateNew.getId());
	}

	@Override
	public void delete(long[] ids) {
		for(long id : ids) {
			newDAO.delete(id);
		}
	}

	@Override
	public NewsModle findOne(long id) {
		NewsModle newsModle = newDAO.findOne(id);
		CategoryModle categoryModle = categoryDAO.findOne(newsModle.getCategoryId());
		newsModle.setCategoryCode(categoryModle.getCode());
		return newsModle;
	}

	@Override
	public List<NewsModle> findAll(Pageble pageble) {
		return newDAO.findAll(pageble);
	}

	@Override
	public int getTotalItem() {
		return newDAO.getTotalItem();
	}

	
}

