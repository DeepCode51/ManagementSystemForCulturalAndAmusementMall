package com.controller;

import com.entity.Leibie;
import com.server.LeibieServer;
import com.util.PageBean;
import com.util.db;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class LeibieController {
	@Resource
	private LeibieServer leibieService;



	@RequestMapping("addLeibie.do")
	public String addLeibie(HttpServletRequest request,Leibie leibie,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		leibie.setAddtime(time.toString().substring(0, 19));
		leibieService.add(leibie);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "leibieList.do");

		return "redirect:postback.jsp";
		//return "redirect:leibieList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateLeibie.do")
	public String doUpdateLeibie(int id,ModelMap map,Leibie leibie){
		leibie=leibieService.getById(id);
		map.put("leibie", leibie);
		return "leibie_updt";
	}





//	后台详细
	@RequestMapping("leibieDetail.do")
	public String leibieDetail(int id,ModelMap map,Leibie leibie){
		leibie=leibieService.getById(id);
		map.put("leibie", leibie);
		return "leibie_detail";
	}
//	前台详细
	@RequestMapping("lbDetail.do")
	public String lbDetail(int id,ModelMap map,Leibie leibie){
		leibie=leibieService.getById(id);
		map.put("leibie", leibie);
		return "leibiedetail";
	}
//
	@RequestMapping("updateLeibie.do")
	public String updateLeibie(int id,ModelMap map,Leibie leibie,HttpServletRequest request,HttpSession session){
		leibieService.update(leibie);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:leibieList.do";
	}

//	分页查询
	@RequestMapping("leibieList.do")
	public String leibieList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Leibie leibie, String wenwanleibie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}

		int total=leibieService.getCount(pmap);
		pageBean.setTotal(total);
		List<Leibie> list=leibieService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "leibie_list";
	}





	@RequestMapping("lbList.do")
	public String lbList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Leibie leibie, String wenwanleibie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}

		int total=leibieService.getCount(pmap);
		pageBean.setTotal(total);
		List<Leibie> list=leibieService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "leibielist";
	}
	@RequestMapping("lbListtp.do")
	public String lbListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Leibie leibie, String wenwanleibie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}

		int total=leibieService.getCount(pmap);
		pageBean.setTotal(total);
		List<Leibie> list=leibieService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "leibielisttp";
	}

	@RequestMapping("deleteLeibie.do")
	public String deleteLeibie(int id,HttpServletRequest request){
		leibieService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:leibieList.do";
	}


}
