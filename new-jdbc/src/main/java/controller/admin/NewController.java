package controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.SystemConstant;
import modle.NewsModle;
import paging.PageRequest;
import paging.Pageble;
import service.ICategoryService;
import service.INewService;
import sort.Sorter;
import utils.FormUtil;


@WebServlet (urlPatterns = {"/admin-new"})
public class NewController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	@Inject 
	private INewService newService;

	@Inject
	private ICategoryService categoryService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsModle modle = FormUtil.toModle(NewsModle.class, request);
		String view = "";
		if(modle.getType().equals(SystemConstant.LIST)){
			Pageble pageble = new PageRequest(modle.getPage(), modle.getMaxPageItem(), new Sorter(modle.getSortName(),  modle.getSortBy()));
			modle.setListResult(newService.findAll(pageble));
			modle.setTotalItem(newService.getTotalItem());
			modle.setTotalPage((int) Math.ceil((double) modle.getTotalItem() / modle.getMaxPageItem()));

			view = "views/admin/new/list.jsp";

		}else if (modle.getType().equals(SystemConstant.EDIT)){
			if(modle.getId() != null){
				modle = newService.findOne(modle.getId());
			}else{

			}

			request.setAttribute("categories", categoryService.findAll());
			view = "views/admin/new/edit.jsp";
		}
		if(request.getParameter("message") != null){
			String messageResponse = "";
			String alert = "";
			String message = request.getParameter("message");
			if(message.equals("INSERT_SUCCESS")){
				messageResponse = "INSERT_SUCESS";
				alert = "success";
			}else if(message.equals("UPDATE_SUCCESS")){
				messageResponse = "UPDATE_SUCESS";
				alert = "success";
			}else if(message.equals("DELETE_SUCCESS")){
				messageResponse = "DELETE_SUCESS";
				alert = "success";
			}else if(message.equals("ERROR_SYSTEM")){
				messageResponse = "ERROR_SYSTEM";
				alert = "danger";
			}
			request.setAttribute("message",messageResponse);
			request.setAttribute("alert",alert);
		}
		request.setAttribute(SystemConstant.MODLE , modle);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
