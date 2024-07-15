package dao;

import java.util.List;

import modle.NewsModle;
import paging.Pageble;

public interface INewDAO extends GenericDAO<NewsModle> {
	NewsModle findOne(Long id);

	List<NewsModle> findByCategoryId(Long categoryId);

	Long save(NewsModle newsModle);

	void update(NewsModle updateNew);

	void delete(long id);

	List<NewsModle> findAll(Pageble pageble);

	int getTotalItem();

	
}
