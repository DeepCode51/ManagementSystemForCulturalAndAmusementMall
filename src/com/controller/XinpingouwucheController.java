package com.controller;

import com.entity.Xinpingouwuche;
import com.server.XinpingouwucheServer;
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
public class XinpingouwucheController {
	@Resource
	private XinpingouwucheServer xinpingouwucheService;



	@RequestMapping("addXinpingouwuche.do")
	public String addXinpingouwuche(HttpServletRequest request,Xinpingouwuche xinpingouwuche,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		xinpingouwuche.setAddtime(time.toString().substring(0, 19));
		xinpingouwucheService.add(xinpingouwuche);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "xinpingouwucheList.do");

		return "redirect:postback.jsp";
		//return "redirect:xinpingouwucheList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateXinpingouwuche.do")
	public String doUpdateXinpingouwuche(int id,ModelMap map,Xinpingouwuche xinpingouwuche){
		xinpingouwuche=xinpingouwucheService.getById(id);
		map.put("xinpingouwuche", xinpingouwuche);
		return "xinpingouwuche_updt";
	}





//	后台详细
	@RequestMapping("xinpingouwucheDetail.do")
	public String xinpingouwucheDetail(int id,ModelMap map,Xinpingouwuche xinpingouwuche){
		xinpingouwuche=xinpingouwucheService.getById(id);
		map.put("xinpingouwuche", xinpingouwuche);
		return "xinpingouwuche_detail";
	}
//	前台详细
	@RequestMapping("xpgwcDetail.do")
	public String xpgwcDetail(int id,ModelMap map,Xinpingouwuche xinpingouwuche){
		xinpingouwuche=xinpingouwucheService.getById(id);
		map.put("xinpingouwuche", xinpingouwuche);
		return "xinpingouwuchedetail";
	}
//
	@RequestMapping("updateXinpingouwuche.do")
	public String updateXinpingouwuche(int id,ModelMap map,Xinpingouwuche xinpingouwuche,HttpServletRequest request,HttpSession session){
		xinpingouwucheService.update(xinpingouwuche);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:xinpingouwucheList.do";
	}

//	分页查询
	@RequestMapping("xinpingouwucheList.do")
	public String xinpingouwucheList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpingouwuche xinpingouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwanjiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwanjiage==null||wenwanjiage.equals("")){pmap.put("wenwanjiage", null);}else{pmap.put("wenwanjiage", wenwanjiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=xinpingouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpingouwuche> list=xinpingouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpingouwuche_list";
	}



	@RequestMapping("xinpingouwucheList2.do")
	public String xinpingouwucheList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpingouwuche xinpingouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwanjiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh,HttpServletRequest request){
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

		pmap.put("maijiazhanghao", (String)request.getSession().getAttribute("username"));
		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwanjiage==null||wenwanjiage.equals("")){pmap.put("wenwanjiage", null);}else{pmap.put("wenwanjiage", wenwanjiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}


		int total=xinpingouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpingouwuche> list=xinpingouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpingouwuche_list2";
	}


	@RequestMapping("xpgwcList.do")
	public String xpgwcList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpingouwuche xinpingouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwanjiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwanjiage==null||wenwanjiage.equals("")){pmap.put("wenwanjiage", null);}else{pmap.put("wenwanjiage", wenwanjiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=xinpingouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpingouwuche> list=xinpingouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpingouwuchelist";
	}
	@RequestMapping("xpgwcListtp.do")
	public String xpgwcListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpingouwuche xinpingouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwanjiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwanjiage==null||wenwanjiage.equals("")){pmap.put("wenwanjiage", null);}else{pmap.put("wenwanjiage", wenwanjiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=xinpingouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpingouwuche> list=xinpingouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpingouwuchelisttp";
	}

	@RequestMapping("deleteXinpingouwuche.do")
	public String deleteXinpingouwuche(int id,HttpServletRequest request){
		xinpingouwucheService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:xinpingouwucheList.do";
	}


}
