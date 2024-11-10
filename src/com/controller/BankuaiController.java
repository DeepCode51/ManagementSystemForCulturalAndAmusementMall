package com.controller;

import com.entity.Bankuai;
import com.server.BankuaiServer;
import com.util.PageBean;
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
public class BankuaiController {
	@Resource
	private BankuaiServer bankuaiService;



	@RequestMapping("addBankuai.do")
	public String addBankuai(HttpServletRequest request,Bankuai bankuai,HttpSession session) throws SQLException{
		Timestamp time=new Timestamp(System.currentTimeMillis());

		bankuai.setAddtime(time.toString().substring(0, 19));
		bankuaiService.add(bankuai);
		session.setAttribute("backxx", "添加成功");
		session.setAttribute("backurl", request.getHeader("Referer"));

		//session.setAttribute("backurl", "bankuaiList.do");

		return "redirect:postback.jsp";
		//return "redirect:bankuaiList.do";



	}

//	处理编辑
	@RequestMapping("doUpdateBankuai.do")
	public String doUpdateBankuai(int id,ModelMap map,Bankuai bankuai){
		bankuai=bankuaiService.getById(id);
		map.put("bankuai", bankuai);
		return "bankuai_updt";
	}





//	后台详细
	@RequestMapping("bankuaiDetail.do")
	public String bankuaiDetail(int id,ModelMap map,Bankuai bankuai){
		bankuai=bankuaiService.getById(id);
		map.put("bankuai", bankuai);
		return "bankuai_detail";
	}
//	前台详细
	@RequestMapping("bkDetail.do")
	public String bkDetail(int id,ModelMap map,Bankuai bankuai){
		bankuai=bankuaiService.getById(id);
		map.put("bankuai", bankuai);
		return "bankuaidetail";
	}
//
	@RequestMapping("updateBankuai.do")
	public String updateBankuai(int id,ModelMap map,Bankuai bankuai,HttpServletRequest request,HttpSession session){
		bankuaiService.update(bankuai);
		session.setAttribute("backxx", "修改成功");
		session.setAttribute("backurl", request.getHeader("Referer"));
		return "redirect:postback.jsp";
		//String url = request.getHeader("Referer");
		//return "redirect:"+url;
		//return "redirect:bankuaiList.do";
	}

//	分页查询
	@RequestMapping("bankuaiList.do")
	public String bankuaiList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Bankuai bankuai, String bianhao, String mingcheng, String jianjie, String banzhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}
		if(banzhu==null||banzhu.equals("")){pmap.put("banzhu", null);}else{pmap.put("banzhu", banzhu);}

		int total=bankuaiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Bankuai> list=bankuaiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "bankuai_list";
	}



	@RequestMapping("bkList.do")
	public String bkList(@RequestParam(value="page",required=false)String page,
			ModelMap map,HttpSession session,Bankuai bankuai, String bianhao, String mingcheng, String jianjie, String banzhu){
		if(page==null||page.equals("")){
			page="1";
		}
		PageBean pageBean=new PageBean(Integer.parseInt(page), 15);
		Map<String, Object> pmap=new HashMap<String,Object>();
		pmap.put("pageno", pageBean.getStart());
		pmap.put("pageSize", 15);


		if(bianhao==null||bianhao.equals("")){pmap.put("bianhao", null);}else{pmap.put("bianhao", bianhao);}
		if(mingcheng==null||mingcheng.equals("")){pmap.put("mingcheng", null);}else{pmap.put("mingcheng", mingcheng);}
		if(jianjie==null||jianjie.equals("")){pmap.put("jianjie", null);}else{pmap.put("jianjie", jianjie);}
		if(banzhu==null||banzhu.equals("")){pmap.put("banzhu", null);}else{pmap.put("banzhu", banzhu);}

		int total=bankuaiService.getCount(pmap);
		pageBean.setTotal(total);
		List<Bankuai> list=bankuaiService.getByPage(pmap);
		map.put("page", pageBean);
		map.put("list", list);
		session.setAttribute("p", 1);
		return "bankuailist";
	}

	@RequestMapping("deleteBankuai.do")
	public String deleteBankuai(int id,HttpServletRequest request){
		bankuaiService.delete(id);
		String url = request.getHeader("Referer");
		return "redirect:"+url;
		//return "redirect:bankuaiList.do";
	}

	@RequestMapping("quchongBankuai.do")
	public void quchongBankuai(Bankuai bankuai,HttpServletResponse response){
		   Map<String,Object> map=new HashMap<String,Object>();
		   map.put("bianhao", bankuai.getBianhao());
		   System.out.println("bianhao==="+bankuai.getBianhao());
		   System.out.println("bianhao222==="+bankuaiService.quchongBankuai(map));
		   JSONObject obj=new JSONObject();
		   if(bankuaiService.quchongBankuai(map)!=null){
				 obj.put("info", "ng");
			   }else{
				   obj.put("info", "编号可以用！");

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
