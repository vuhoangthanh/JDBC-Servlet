package dao;

import java.util.List;

import modle.CategoryModle;


public interface ICategoryDAO extends GenericDAO<CategoryModle>{
	List<CategoryModle> findAll();
	CategoryModle findOne(Long id);
	CategoryModle findOneByCode(String code);
}
