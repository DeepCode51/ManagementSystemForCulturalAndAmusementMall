package com.controller;

import com.entity.Cuxiaowenwan;
import com.server.CuxiaowenwanServer;
import com.util.PageBean;
import com.util.db;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class CuxiaowenwanController {
	@Resource
	private CuxiaowenwanServer cuxiaowenwanService;



	@RequestMapping("addCuxiaowenwan.do")
	public String addCuxiaowenwan(HttpServletRequest request,Cuxiaowenwan cuxiaowenwan,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		cuxiaowenwan.setAddtime(time.toString().substring(0, 19));
		cuxiaowenwanService.add(cuxiaowenwan);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "cuxiaowenwanList.do");

		return "redirect:postback.jsp";
		//return "redirect:cuxiaowenwanList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateCuxiaowenwan.do")
	public String doUpdateCuxiaowenwan(int id,ModelMap map,Cuxiaowenwan cuxiaowenwan){
		cuxiaowenwan=cuxiaowenwanService.getById(id);
		map.put("cuxiaowenwan", cuxiaowenwan);
		return "cuxiaowenwan_updt";
	}





//	后台详细
	@RequestMapping("cuxiaowenwanDetail.do")
	public String cuxiaowenwanDetail(int id,ModelMap map,Cuxiaowenwan cuxiaowenwan){
		cuxiaowenwan=cuxiaowenwanService.getById(id);
		map.put("cuxiaowenwan", cuxiaowenwan);
		return "cuxiaowenwan_detail";
	}
//	前台详细
	@RequestMapping("cxwwDetail.do")
	public String cxwwDetail(int id,ModelMap map,Cuxiaowenwan cuxiaowenwan){
		cuxiaowenwan=cuxiaowenwanService.getById(id);
		map.put("cuxiaowenwan", cuxiaowenwan);
		return "cuxiaowenwandetail";
	}
//
	@RequestMapping("updateCuxiaowenwan.do")
	public String updateCuxiaowenwan(int id,ModelMap map,Cuxiaowenwan cuxiaowenwan,HttpServletRequest request,HttpSession session){
		cuxiaowenwanService.update(cuxiaowenwan);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:cuxiaowenwanList.do";
	}

//	分页查询
	@RequestMapping("cuxiaowenwanList.do")
	public String cuxiaowenwanList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaowenwan cuxiaowenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String yuanjiage1,String yuanjiage2, String cuxiaozhekou, String cuxiaojiage1,String cuxiaojiage2, String wenwanjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwantupian==null||wenwantupian.equals("")){pmap.put("wenwantupian", null);}else{pmap.put("wenwantupian", wenwantupian);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(yuanjiage1==null||yuanjiage1.equals("")){pmap.put("yuanjiage1", null);}else{pmap.put("yuanjiage1", yuanjiage1);}
		if(yuanjiage2==null||yuanjiage2.equals("")){pmap.put("yuanjiage2", null);}else{pmap.put("yuanjiage2", yuanjiage2);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage1==null||cuxiaojiage1.equals("")){pmap.put("cuxiaojiage1", null);}else{pmap.put("cuxiaojiage1", cuxiaojiage1);}
		if(cuxiaojiage2==null||cuxiaojiage2.equals("")){pmap.put("cuxiaojiage2", null);}else{pmap.put("cuxiaojiage2", cuxiaojiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=cuxiaowenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaowenwan> list=cuxiaowenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaowenwan_list";
	}





	@RequestMapping("cxwwList.do")
	public String cxwwList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaowenwan cuxiaowenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String yuanjiage1,String yuanjiage2, String cuxiaozhekou, String cuxiaojiage1,String cuxiaojiage2, String wenwanjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwantupian==null||wenwantupian.equals("")){pmap.put("wenwantupian", null);}else{pmap.put("wenwantupian", wenwantupian);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(yuanjiage1==null||yuanjiage1.equals("")){pmap.put("yuanjiage1", null);}else{pmap.put("yuanjiage1", yuanjiage1);}
		if(yuanjiage2==null||yuanjiage2.equals("")){pmap.put("yuanjiage2", null);}else{pmap.put("yuanjiage2", yuanjiage2);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage1==null||cuxiaojiage1.equals("")){pmap.put("cuxiaojiage1", null);}else{pmap.put("cuxiaojiage1", cuxiaojiage1);}
		if(cuxiaojiage2==null||cuxiaojiage2.equals("")){pmap.put("cuxiaojiage2", null);}else{pmap.put("cuxiaojiage2", cuxiaojiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=cuxiaowenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaowenwan> list=cuxiaowenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaowenwanlist";
	}
	@RequestMapping("cxwwListtp.do")
	public String cxwwListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Cuxiaowenwan cuxiaowenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String yuanjiage1,String yuanjiage2, String cuxiaozhekou, String cuxiaojiage1,String cuxiaojiage2, String wenwanjianjie){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(wenwanbianhao==null||wenwanbianhao.equals("")){pmap.put("wenwanbianhao", null);}else{pmap.put("wenwanbianhao", wenwanbianhao);}
		if(wenwanmingcheng==null||wenwanmingcheng.equals("")){pmap.put("wenwanmingcheng", null);}else{pmap.put("wenwanmingcheng", wenwanmingcheng);}
		if(wenwanleibie==null||wenwanleibie.equals("")){pmap.put("wenwanleibie", null);}else{pmap.put("wenwanleibie", wenwanleibie);}
		if(wenwantupian==null||wenwantupian.equals("")){pmap.put("wenwantupian", null);}else{pmap.put("wenwantupian", wenwantupian);}
		if(kucun1==null||kucun1.equals("")){pmap.put("kucun1", null);}else{pmap.put("kucun1", kucun1);}
		if(kucun2==null||kucun2.equals("")){pmap.put("kucun2", null);}else{pmap.put("kucun2", kucun2);}
		if(yuanjiage1==null||yuanjiage1.equals("")){pmap.put("yuanjiage1", null);}else{pmap.put("yuanjiage1", yuanjiage1);}
		if(yuanjiage2==null||yuanjiage2.equals("")){pmap.put("yuanjiage2", null);}else{pmap.put("yuanjiage2", yuanjiage2);}
		if(cuxiaozhekou==null||cuxiaozhekou.equals("")){pmap.put("cuxiaozhekou", null);}else{pmap.put("cuxiaozhekou", cuxiaozhekou);}
		if(cuxiaojiage1==null||cuxiaojiage1.equals("")){pmap.put("cuxiaojiage1", null);}else{pmap.put("cuxiaojiage1", cuxiaojiage1);}
		if(cuxiaojiage2==null||cuxiaojiage2.equals("")){pmap.put("cuxiaojiage2", null);}else{pmap.put("cuxiaojiage2", cuxiaojiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=cuxiaowenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Cuxiaowenwan> list=cuxiaowenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "cuxiaowenwanlisttp";
	}

	@RequestMapping("deleteCuxiaowenwan.do")
	public String deleteCuxiaowenwan(int id,HttpServletRequest request){
		cuxiaowenwanService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:cuxiaowenwanList.do";
	}

	@RequestMapping("quchongCuxiaowenwan.do")
	public void quchongCuxiaowenwan(Cuxiaowenwan cuxiaowenwan,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("wenwanbianhao", cuxiaowenwan.getWenwanbianhao());
		   System.out.println("wenwanbianhao==="+cuxiaowenwan.getWenwanbianhao());
		   System.out.println("wenwanbianhao222==="+cuxiaowenwanService.quchongCuxiaowenwan(map));
		   JSONObject obj=new JSONObject();
		   if(cuxiaowenwanService.quchongCuxiaowenwan(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "文玩编号可以用！");

			   }
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=null;
		   try {
			out=response.getWriter();
			out.print(obj);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			out.close();
		}
	}
}
