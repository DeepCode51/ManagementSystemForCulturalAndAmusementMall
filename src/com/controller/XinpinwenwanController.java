package com.controller;

import com.entity.Xinpinwenwan;
import com.server.XinpinwenwanServer;
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
public class XinpinwenwanController {
	@Resource
	private XinpinwenwanServer xinpinwenwanService;



	@RequestMapping("addXinpinwenwan.do")
	public String addXinpinwenwan(HttpServletRequest request,Xinpinwenwan xinpinwenwan,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		xinpinwenwan.setAddtime(time.toString().substring(0, 19));
		xinpinwenwanService.add(xinpinwenwan);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "xinpinwenwanList.do");

		return "redirect:postback.jsp";
		//return "redirect:xinpinwenwanList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateXinpinwenwan.do")
	public String doUpdateXinpinwenwan(int id,ModelMap map,Xinpinwenwan xinpinwenwan){
		xinpinwenwan=xinpinwenwanService.getById(id);
		map.put("xinpinwenwan", xinpinwenwan);
		return "xinpinwenwan_updt";
	}





//	后台详细
	@RequestMapping("xinpinwenwanDetail.do")
	public String xinpinwenwanDetail(int id,ModelMap map,Xinpinwenwan xinpinwenwan){
		xinpinwenwan=xinpinwenwanService.getById(id);
		map.put("xinpinwenwan", xinpinwenwan);
		return "xinpinwenwan_detail";
	}
//	前台详细
	@RequestMapping("xpwwDetail.do")
	public String xpwwDetail(int id,ModelMap map,Xinpinwenwan xinpinwenwan){
		xinpinwenwan=xinpinwenwanService.getById(id);
		map.put("xinpinwenwan", xinpinwenwan);
		return "xinpinwenwandetail";
	}
//
	@RequestMapping("updateXinpinwenwan.do")
	public String updateXinpinwenwan(int id,ModelMap map,Xinpinwenwan xinpinwenwan,HttpServletRequest request,HttpSession session){
		xinpinwenwanService.update(xinpinwenwan);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:xinpinwenwanList.do";
	}

//	分页查询
	@RequestMapping("xinpinwenwanList.do")
	public String xinpinwenwanList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpinwenwan xinpinwenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String wenwanjiage1,String wenwanjiage2, String wenwanjianjie){
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
		if(wenwanjiage1==null||wenwanjiage1.equals("")){pmap.put("wenwanjiage1", null);}else{pmap.put("wenwanjiage1", wenwanjiage1);}
		if(wenwanjiage2==null||wenwanjiage2.equals("")){pmap.put("wenwanjiage2", null);}else{pmap.put("wenwanjiage2", wenwanjiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=xinpinwenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpinwenwan> list=xinpinwenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpinwenwan_list";
	}





	@RequestMapping("xpwwList.do")
	public String xpwwList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpinwenwan xinpinwenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String wenwanjiage1,String wenwanjiage2, String wenwanjianjie){
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
		if(wenwanjiage1==null||wenwanjiage1.equals("")){pmap.put("wenwanjiage1", null);}else{pmap.put("wenwanjiage1", wenwanjiage1);}
		if(wenwanjiage2==null||wenwanjiage2.equals("")){pmap.put("wenwanjiage2", null);}else{pmap.put("wenwanjiage2", wenwanjiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=xinpinwenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpinwenwan> list=xinpinwenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpinwenwanlist";
	}
	@RequestMapping("xpwwListtp.do")
	public String xpwwListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Xinpinwenwan xinpinwenwan, String wenwanbianhao, String wenwanmingcheng, String wenwanleibie, String wenwantupian, String kucun1,String kucun2, String wenwanjiage1,String wenwanjiage2, String wenwanjianjie){
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
		if(wenwanjiage1==null||wenwanjiage1.equals("")){pmap.put("wenwanjiage1", null);}else{pmap.put("wenwanjiage1", wenwanjiage1);}
		if(wenwanjiage2==null||wenwanjiage2.equals("")){pmap.put("wenwanjiage2", null);}else{pmap.put("wenwanjiage2", wenwanjiage2);}
		if(wenwanjianjie==null||wenwanjianjie.equals("")){pmap.put("wenwanjianjie", null);}else{pmap.put("wenwanjianjie", wenwanjianjie);}

		int total=xinpinwenwanService.getCount(pmap);
		pageBean.setTotal(total);
		List<Xinpinwenwan> list=xinpinwenwanService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "xinpinwenwanlisttp";
	}

	@RequestMapping("deleteXinpinwenwan.do")
	public String deleteXinpinwenwan(int id,HttpServletRequest request){
		xinpinwenwanService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:xinpinwenwanList.do";
	}

	@RequestMapping("quchongXinpinwenwan.do")
	public void quchongXinpinwenwan(Xinpinwenwan xinpinwenwan,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("wenwanbianhao", xinpinwenwan.getWenwanbianhao());
		   System.out.println("wenwanbianhao==="+xinpinwenwan.getWenwanbianhao());
		   System.out.println("wenwanbianhao222==="+xinpinwenwanService.quchongXinpinwenwan(map));
		   JSONObject obj=new JSONObject();
		   if(xinpinwenwanService.quchongXinpinwenwan(map)!=null){
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
