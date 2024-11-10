package com.controller;

import com.entity.Cuxiaowenwan;
import com.entity.Xinpinwenwan;
import com.entity.Xinwentongzhi;
import com.entity.Yonghuzhuce;
import com.server.CuxiaowenwanServer;
import com.server.XinpinwenwanServer;
import com.server.XinwentongzhiServer;
import com.server.YonghuzhuceServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class IndexController {


	@Resource
	private XinwentongzhiServer xinwentongzhiService;
	@Resource
	private YonghuzhuceServer yonghuzhuceServer;
	@Resource
private CuxiaowenwanServer cuxiaowenwanServer;
@Resource
private XinpinwenwanServer xinpinwenwanServer;




//	首页显示内容
	@RequestMapping("index.do")
	public String showIndex(ModelMap map){

		List<Xinwentongzhi> syxinwentongzhi1=xinwentongzhiService.getsyxinwentongzhi1(null);
		List<Xinwentongzhi> syxinwentongzhi2=xinwentongzhiService.getsyxinwentongzhi2(null);
		List<Xinwentongzhi> syxinwentongzhi3=xinwentongzhiService.getsyxinwentongzhi3(null);

		List<Yonghuzhuce> syyonghuzhuce1=yonghuzhuceServer.getsyyonghuzhuce1(null);
		List<Cuxiaowenwan> sycuxiaowenwan=cuxiaowenwanServer.getsycuxiaowenwan1(null);
List<Xinpinwenwan> syxinpinwenwan=xinpinwenwanServer.getsyxinpinwenwan1(null);


	    map.put("syxinwentongzhi1", syxinwentongzhi1);
	    map.put("syxinwentongzhi2", syxinwentongzhi2);
	    map.put("syxinwentongzhi3", syxinwentongzhi3);
	    map.put("syyonghuzhuce1", syyonghuzhuce1);
	    map.put("sycuxiaowenwan", sycuxiaowenwan);
map.put("syxinpinwenwan", syxinpinwenwan);


		return "default";
	}




}
