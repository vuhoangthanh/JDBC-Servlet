package controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import modle.NewsModle;
import modle.UserModle;
import service.INewService;
import utils.HttpUtil;
import utils.SessionUtil;

@WebServlet (urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet{

	@Inject
	private INewService newService;
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ObjectMapper mapper = new ObjectMapper();
		//server return data veef deer client hiur - setup type 
		response.setContentType("application/json");
		NewsModle newModle = HttpUtil.of(request.getReader()).toModle(NewsModle.class);
		newModle.setCreatedBy(((UserModle) SessionUtil.getInstance().getValue(request, "USERMODLE")).getUserName());
		newModle = newService.save(newModle);
		mapper.writeValue(response.getOutputStream(), newModle);
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("application/json");
		NewsModle updateNew = HttpUtil.of(request.getReader()).toModle(NewsModle.class);
		updateNew.setModifiedBy(((UserModle) SessionUtil.getInstance().getValue(request, "USERMODLE")).getUserName());
		updateNew = newService.update(updateNew);
		mapper.writeValue(response.getOutputStream(), updateNew);
	}
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ObjectMapper mapper = new ObjectMapper();
		response.setContentType("aplication/json");
		NewsModle newModle = HttpUtil.of(request.getReader()).toModle(NewsModle.class);
		newService.delete(newModle.getIds());
		mapper.writeValue(response.getOutputStream(), "{}");
	}
	
}
