package com.controller;

import com.entity.Cuxiaogouwuche;
import com.server.CuxiaogouwucheServer;
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
public class CuxiaogouwucheController {
	@Resource
	private CuxiaogouwucheServer cuxiaogouwucheService;



	@RequestMapping("addCuxiaogouwuche.do")
	public String addCuxiaogouwuche(HttpServletRequest request,Cuxiaogouwuche cuxiaogouwuche,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		cuxiaogouwuche.setAddtime(time.toString().substring(0, 19));
		cuxiaogouwucheService.add(cuxiaogouwuche);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "cuxiaogouwucheList.do");

		return "redirect:postback.jsp";
		//return "redirect:cuxiaogouwucheList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateCuxiaogouwuche.do")
	public String doUpdateCuxiaogouwuche(int id,ModelMap map,Cuxiaogouwuche cuxiaogouwuche){
		cuxiaogouwuche=cuxiaogouwucheService.getById(id);
		map.put("cuxiaogouwuche", cuxiaogouwuche);
		return "cuxiaogouwuche_updt";
	}





//	后台详细
	@RequestMapping("cuxiaogouwucheDetail.do")
	public String cuxiaogouwucheDetail(int id,ModelMap map,Cuxiaogouwuche cuxiaogouwuche){
		cuxiaogouwuche=cuxiaogouwucheService.getById(id);
		map.put("cuxiaogouwuche", cuxiaogouwuche);
		return "cuxiaogouwuche_detail";
	}
//	前台详细
	@RequestMapping("cxgwcDetail.do")
	public String cxgwcDetail(int id,ModelMap map,Cuxiaogouwuche cuxiaogouwuche){
		cuxiaogouwuche=cuxiaogouwucheService.getById(id);
		map.put("cuxiaogouwuche", cuxiaogouwuche);
		return "cuxiaogouwuchedetail";
	}
//
	@RequestMapping("updateCuxiaogouwuche.do")
	public String updateCuxiaogouwuche(int id,ModelMap map,Cuxiaogouwuche cuxiaogouwuche,HttpServletRequest request,HttpSession session){
		cuxiaogouwucheService.update(cuxiaogouwuche);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:cuxiaogouwucheList.do";
	}

//	分页查询
	@RequestMapping("cuxiaogouwucheList.do")
	public String cuxiaogouwucheList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaogouwuche cuxiaogouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String yuanjiage, String cuxiaozhekou, String cuxiaojiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
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
		if(yuanjiage==null||yuanjiage.equals("")){pmap.put("yuanjiage", null);}else{pmap.put("yuanjiage", yuanjiage);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage==null||cuxiaojiage.equals("")){pmap.put("cuxiaojiage", null);}else{pmap.put("cuxiaojiage", cuxiaojiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=cuxiaogouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaogouwuche> list=cuxiaogouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaogouwuche_list";
	}



	@RequestMapping("cuxiaogouwucheList2.do")
	public String cuxiaogouwucheList2(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaogouwuche cuxiaogouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String yuanjiage, String cuxiaozhekou, String cuxiaojiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh,HttpServletRequest request){
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
		if(yuanjiage==null||yuanjiage.equals("")){pmap.put("yuanjiage", null);}else{pmap.put("yuanjiage", yuanjiage);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage==null||cuxiaojiage.equals("")){pmap.put("cuxiaojiage", null);}else{pmap.put("cuxiaojiage", cuxiaojiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}


		int total=cuxiaogouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaogouwuche> list=cuxiaogouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaogouwuche_list2";
	}


	@RequestMapping("cxgwcList.do")
	public String cxgwcList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaogouwuche cuxiaogouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String yuanjiage, String cuxiaozhekou, String cuxiaojiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
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
		if(yuanjiage==null||yuanjiage.equals("")){pmap.put("yuanjiage", null);}else{pmap.put("yuanjiage", yuanjiage);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage==null||cuxiaojiage.equals("")){pmap.put("cuxiaojiage", null);}else{pmap.put("cuxiaojiage", cuxiaojiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=cuxiaogouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaogouwuche> list=cuxiaogouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaogouwuchelist";
	}
	@RequestMapping("cxgwcListtp.do")
	public String cxgwcListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaogouwuche cuxiaogouwuche, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String yuanjiage, String cuxiaozhekou, String cuxiaojiage, String goumaishuliang1,String goumaishuliang2, String yingfujine, String maijiazhanghao, String maijiaxingming, String maijiadianhua, String shouhuodizhi, String issh){
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
		if(yuanjiage==null||yuanjiage.equals("")){pmap.put("yuanjiage", null);}else{pmap.put("yuanjiage", yuanjiage);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage==null||cuxiaojiage.equals("")){pmap.put("cuxiaojiage", null);}else{pmap.put("cuxiaojiage", cuxiaojiage);}
		if(goumaishuliang1==null||goumaishuliang1.equals("")){pmap.put("goumaishuliang1", null);}else{pmap.put("goumaishuliang1", goumaishuliang1);}
		if(goumaishuliang2==null||goumaishuliang2.equals("")){pmap.put("goumaishuliang2", null);}else{pmap.put("goumaishuliang2", goumaishuliang2);}
		if(yingfujine==null||yingfujine.equals("")){pmap.put("yingfujine", null);}else{pmap.put("yingfujine", yingfujine);}
		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=cuxiaogouwucheService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaogouwuche> list=cuxiaogouwucheService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaogouwuchelisttp";
	}

	@RequestMapping("deleteCuxiaogouwuche.do")
	public String deleteCuxiaogouwuche(int id,HttpServletRequest request){
		cuxiaogouwucheService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:cuxiaogouwucheList.do";
	}


}
