package com.controller;

import com.entity.Tiezi;
import com.server.TieziServer;
import com.util.PageBean;
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
public class TieziController {
	@Resource
	private TieziServer tieziService;



	@RequestMapping("addTiezi.do")
	public String addTiezi(HttpServletRequest request,Tiezi tiezi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		tiezi.setAddtime(time.toString().substring(0, 19));
		tieziService.add(tiezi);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "tieziList.do");

		return "redirect:postback.jsp";
		//return "redirect:tieziList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateTiezi.do")
	public String doUpdateTiezi(int id,ModelMap map,Tiezi tiezi){
		tiezi=tieziService.getById(id);
		map.put("tiezi", tiezi);
		return "tiezi_updt";
	}





//	后台详细
	@RequestMapping("tieziDetail.do")
	public String tieziDetail(int id,ModelMap map,Tiezi tiezi){
		tiezi=tieziService.getById(id);
		map.put("tiezi", tiezi);
		return "tiezi_detail";
	}
//	前台详细
	@RequestMapping("tzDetail.do")
	public String tzDetail(int id,ModelMap map,Tiezi tiezi){
		tiezi=tieziService.getById(id);
		map.put("tiezi", tiezi);
		return "tiezidetail";
	}
//
	@RequestMapping("updateTiezi.do")
	public String updateTiezi(int id,ModelMap map,Tiezi tiezi,HttpServletRequest request,HttpSession session){
		tieziService.update(tiezi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:tieziList.do";
	}

//	分页查询
	@RequestMapping("tieziList.do")
	public String tieziList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Tiezi tiezi, String bankuai, String biaoti, String leixing, String neirong, String fujian, String faburen){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(bankuai==null||bankuai.equals("")){pmap.put("bankuai", null);}else{pmap.put("bankuai", bankuai);}
		if(biaoti==null||biaoti.equals("")){pmap.put("biaoti", null);}else{pmap.put("biaoti", biaoti);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(neirong==null||neirong.equals("")){pmap.put("neirong", null);}else{pmap.put("neirong", neirong);}
		if(fujian==null||fujian.equals("")){pmap.put("fujian", null);}else{pmap.put("fujian", fujian);}
		if(faburen==null||faburen.equals("")){pmap.put("faburen", null);}else{pmap.put("faburen", faburen);}

		int total=tieziService.getCount(pmap);
		pageBean.setTotal(total);
		List<Tiezi> list=tieziService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "tiezi_list";
	}

	@RequestMapping("tieziList2.do")
	public String tieziList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Tiezi tiezi, String bankuai, String biaoti, String leixing, String neirong, String fujian, String faburen,HttpServletRequest request){
		/*if(session.getAttribute("user")==null){
			return "login";
		}*/
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);

		pmap.put("faburen", (String)request.getSession().getAttribute("username"));
		if(bankuai==null||bankuai.equals("")){pmap.put("bankuai", null);}else{pmap.put("bankuai", bankuai);}
		if(biaoti==null||biaoti.equals("")){pmap.put("biaoti", null);}else{pmap.put("biaoti", biaoti);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(neirong==null||neirong.equals("")){pmap.put("neirong", null);}else{pmap.put("neirong", neirong);}
		if(fujian==null||fujian.equals("")){pmap.put("fujian", null);}else{pmap.put("fujian", fujian);}


		int total=tieziService.getCount(pmap);
		pageBean.setTotal(total);
		List<Tiezi> list=tieziService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "tiezi_list2";
	}


	@RequestMapping("tzList.do")
	public String tzList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Tiezi tiezi, String bankuai, String biaoti, String leixing, String neirong, String fujian, String faburen){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(bankuai==null||bankuai.equals("")){pmap.put("bankuai", null);}else{pmap.put("bankuai", bankuai);}
		if(biaoti==null||biaoti.equals("")){pmap.put("biaoti", null);}else{pmap.put("biaoti", biaoti);}
		if(leixing==null||leixing.equals("")){pmap.put("leixing", null);}else{pmap.put("leixing", leixing);}
		if(neirong==null||neirong.equals("")){pmap.put("neirong", null);}else{pmap.put("neirong", neirong);}
		if(fujian==null||fujian.equals("")){pmap.put("fujian", null);}else{pmap.put("fujian", fujian);}
		if(faburen==null||faburen.equals("")){pmap.put("faburen", null);}else{pmap.put("faburen", faburen);}

		int total=tieziService.getCount(pmap);
		pageBean.setTotal(total);
		List<Tiezi> list=tieziService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "tiezilist";
	}

	@RequestMapping("deleteTiezi.do")
	public String deleteTiezi(int id,HttpServletRequest request){
		tieziService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:tieziList.do";
	}


}
