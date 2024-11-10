package com.controller;

import com.entity.Maijiaxinxi;
import com.server.MaijiaxinxiServer;
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
public class MaijiaxinxiController {
	@Resource
	private MaijiaxinxiServer maijiaxinxiService;



	@RequestMapping("addMaijiaxinxi.do")
	public String addMaijiaxinxi(HttpServletRequest request,Maijiaxinxi maijiaxinxi,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		maijiaxinxi.setAddtime(time.toString().substring(0, 19));
		maijiaxinxiService.add(maijiaxinxi);
		db dbo = new db();

		//kuabiaogaizhi
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "maijiaxinxiList.do");

		return "redirect:postback.jsp";
		//return "redirect:maijiaxinxiList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateMaijiaxinxi.do")
	public String doUpdateMaijiaxinxi(int id,ModelMap map,Maijiaxinxi maijiaxinxi){
		maijiaxinxi=maijiaxinxiService.getById(id);
		map.put("maijiaxinxi", maijiaxinxi);
		return "maijiaxinxi_updt";
	}

	@RequestMapping("doUpdateMaijiaxinxi2.do")
	public String doUpdateMaijiaxinxi2(ModelMap map,Maijiaxinxi maijiaxinxi,HttpServletRequest request){
		maijiaxinxi=maijiaxinxiService.getById(Integer.parseInt((String)request.getSession().getAttribute("uid")));
		map.put("maijiaxinxi", maijiaxinxi);
		return "maijiaxinxi_updt2";
	}

@RequestMapping("updateMaijiaxinxi2.do")
	public String updateMaijiaxinxi2(int id,ModelMap map,Maijiaxinxi maijiaxinxi){
		maijiaxinxiService.update(maijiaxinxi);
		return "redirect:doUpdateMaijiaxinxi2.do";
	}



//	后台详细
	@RequestMapping("maijiaxinxiDetail.do")
	public String maijiaxinxiDetail(int id,ModelMap map,Maijiaxinxi maijiaxinxi){
		maijiaxinxi=maijiaxinxiService.getById(id);
		map.put("maijiaxinxi", maijiaxinxi);
		return "maijiaxinxi_detail";
	}
//	前台详细
	@RequestMapping("mjxxDetail.do")
	public String mjxxDetail(int id,ModelMap map,Maijiaxinxi maijiaxinxi){
		maijiaxinxi=maijiaxinxiService.getById(id);
		map.put("maijiaxinxi", maijiaxinxi);
		return "maijiaxinxidetail";
	}
//
	@RequestMapping("updateMaijiaxinxi.do")
	public String updateMaijiaxinxi(int id,ModelMap map,Maijiaxinxi maijiaxinxi,HttpServletRequest request,HttpSession session){
		maijiaxinxiService.update(maijiaxinxi);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:maijiaxinxiList.do";
	}

//	分页查询
	@RequestMapping("maijiaxinxiList.do")
	public String maijiaxinxiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Maijiaxinxi maijiaxinxi, String maijiazhanghao, String mima, String touxiang, String maijiaxingming, String xingbie, String maijiadianhua, String shouhuodizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(mima==null||mima.equals("")){pmap.put("mima", null);}else{pmap.put("mima", mima);}
		if(touxiang==null||touxiang.equals("")){pmap.put("touxiang", null);}else{pmap.put("touxiang", touxiang);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(xingbie==null||xingbie.equals("")){pmap.put("xingbie", null);}else{pmap.put("xingbie", xingbie);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=maijiaxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Maijiaxinxi> list=maijiaxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "maijiaxinxi_list";
	}





	@RequestMapping("mjxxList.do")
	public String mjxxList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Maijiaxinxi maijiaxinxi, String maijiazhanghao, String mima, String touxiang, String maijiaxingming, String xingbie, String maijiadianhua, String shouhuodizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(mima==null||mima.equals("")){pmap.put("mima", null);}else{pmap.put("mima", mima);}
		if(touxiang==null||touxiang.equals("")){pmap.put("touxiang", null);}else{pmap.put("touxiang", touxiang);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(xingbie==null||xingbie.equals("")){pmap.put("xingbie", null);}else{pmap.put("xingbie", xingbie);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=maijiaxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Maijiaxinxi> list=maijiaxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "maijiaxinxilist";
	}
	@RequestMapping("mjxxListtp.do")
	public String mjxxListtp(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Maijiaxinxi maijiaxinxi, String maijiazhanghao, String mima, String touxiang, String maijiaxingming, String xingbie, String maijiadianhua, String shouhuodizhi){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 8);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 8);


		if(maijiazhanghao==null||maijiazhanghao.equals("")){pmap.put("maijiazhanghao", null);}else{pmap.put("maijiazhanghao", maijiazhanghao);}
		if(mima==null||mima.equals("")){pmap.put("mima", null);}else{pmap.put("mima", mima);}
		if(touxiang==null||touxiang.equals("")){pmap.put("touxiang", null);}else{pmap.put("touxiang", touxiang);}
		if(maijiaxingming==null||maijiaxingming.equals("")){pmap.put("maijiaxingming", null);}else{pmap.put("maijiaxingming", maijiaxingming);}
		if(xingbie==null||xingbie.equals("")){pmap.put("xingbie", null);}else{pmap.put("xingbie", xingbie);}
		if(maijiadianhua==null||maijiadianhua.equals("")){pmap.put("maijiadianhua", null);}else{pmap.put("maijiadianhua", maijiadianhua);}
		if(shouhuodizhi==null||shouhuodizhi.equals("")){pmap.put("shouhuodizhi", null);}else{pmap.put("shouhuodizhi", shouhuodizhi);}

		int total=maijiaxinxiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Maijiaxinxi> list=maijiaxinxiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "maijiaxinxilisttp";
	}

	@RequestMapping("deleteMaijiaxinxi.do")
	public String deleteMaijiaxinxi(int id,HttpServletRequest request){
		maijiaxinxiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:maijiaxinxiList.do";
	}

	@RequestMapping("quchongMaijiaxinxi.do")
	public void quchongMaijiaxinxi(Maijiaxinxi maijiaxinxi,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("maijiazhanghao", maijiaxinxi.getMaijiazhanghao());
		   System.out.println("maijiazhanghao==="+maijiaxinxi.getMaijiazhanghao());
		   System.out.println("maijiazhanghao222==="+maijiaxinxiService.quchongMaijiaxinxi(map));
		   JSONObject obj=new JSONObject();
		   if(maijiaxinxiService.quchongMaijiaxinxi(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "买家账号可以用！");

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
