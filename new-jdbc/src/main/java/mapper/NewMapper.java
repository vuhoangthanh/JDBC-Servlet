package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import modle.NewsModle;

public class NewMapper implements RowMapper<NewsModle>{

	@Override
	public NewsModle mapRow(ResultSet resultSet) {		
		try {
			NewsModle news = new NewsModle();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));	
			news.setContent(resultSet.getString("content"));
			news.setCategoryId(resultSet.getLong("categoryid"));
			news.setThumbnail(resultSet.getString("thumbnail"));
			news.setShortDescription(resultSet.getString("shortdescription"));
			news.setCreatedDate(resultSet.getTimestamp("createddate"));
			news.setCreatedBy(resultSet.getString("createdby"));
			if(resultSet.getTimestamp("modifieddate") != null) {
				news.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if(resultSet.getString("modifiedby") != null) {
				news.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return news;
		} catch (SQLException e) {
			return null;
		}
	}

}
