package service;

import java.util.List;

import modle.NewsModle;
import paging.Pageble;

public interface INewService {
	List<NewsModle> findByCategoryId(Long categoryId);
	NewsModle save(NewsModle newsModle);
	NewsModle update(NewsModle updateNew);
	void delete(long[] ids);
	List<NewsModle> findAll(Pageble pageble);
	int getTotalItem();
	NewsModle findOne(long id);
}
