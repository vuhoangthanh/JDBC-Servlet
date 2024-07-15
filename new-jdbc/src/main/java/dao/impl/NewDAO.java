package dao.impl;

import java.util.List;

import dao.INewDAO;
import mapper.NewMapper;
import modle.NewsModle;
import org.apache.commons.lang.StringUtils;
import paging.Pageble;

public class NewDAO extends AbstractDAO<NewsModle> implements INewDAO{

	
	@Override
	public List<NewsModle> findByCategoryId(Long categoryId) {		
		String sql = "select * from news where categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewsModle newsModle) {
		StringBuilder sql = new StringBuilder("insert into news (title, content,");
		sql.append("thumbnail, shortdescription, categoryid, createddate, createdby)");
		sql.append(" values (?, ?, ?, ?, ?, ?, ?)");
		return insert(sql.toString(), newsModle.getTitle(), newsModle.getContent(), 
									  newsModle.getThumbnail(), newsModle.getShortDescription(), 
									  newsModle.getCategoryId(), newsModle.getCreatedDate(), newsModle.getCreatedBy());

	}

	@Override
	public void update(NewsModle updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append("shortdescription = ?, content = ?, categoryid = ?,");
		sql.append("createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
							   updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreatedDate(),
							   updateNew.getCreatedBy(), updateNew.getModifiedDate(), 
							   updateNew.getModifiedBy(), updateNew.getId());
	}

	

	@Override
	public NewsModle findOne(Long id) {
		String sql = "select * from news where id = ?";
		List<NewsModle> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void delete(long id) {
		String sql = "delete from news where id = ?";
		update(sql, id);
	}

	@Override
	public List<NewsModle> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("select * from news ");
		
		if(pageble.getSorter() != null && StringUtils.isNotBlank(pageble.getSorter().getSortName()) && StringUtils.isNotBlank(pageble.getSorter().getSortBy())) {
			sql.append(" order by "+pageble.getSorter().getSortName()+" "+ pageble.getSorter().getSortBy()+" ");
		}
		
		if(pageble.getOffset() != null && pageble.getLimit() != null) {
			sql.append(" limit "+pageble.getOffset()+", " +pageble.getLimit()+"");
			return query(sql.toString(), new NewMapper());
		}
		return query(sql.toString(), new NewMapper());
	}

	@Override
	public int getTotalItem() {
		String sql = "select count(*) from news";
		return count(sql);
	}
}


