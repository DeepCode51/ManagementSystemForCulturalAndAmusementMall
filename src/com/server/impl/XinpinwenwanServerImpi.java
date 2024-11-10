package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.XinpinwenwanMapper;
import com.entity.Xinpinwenwan;
import com.server.XinpinwenwanServer;
@Service
public class XinpinwenwanServerImpi implements XinpinwenwanServer {
   @Resource
   private XinpinwenwanMapper gdao;
	@Override
	public int add(Xinpinwenwan po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Xinpinwenwan po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Xinpinwenwan> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Xinpinwenwan> getsyxinpinwenwan1(Map<String, Object> map) {
		return gdao.getsyxinpinwenwan1(map);
	}
	public List<Xinpinwenwan> getsyxinpinwenwan2(Map<String, Object> map) {
		return gdao.getsyxinpinwenwan2(map);
	}
	public List<Xinpinwenwan> getsyxinpinwenwan3(Map<String, Object> map) {
		return gdao.getsyxinpinwenwan3(map);
	}
	
	@Override
	public Xinpinwenwan quchongXinpinwenwan(Map<String, Object> account) {
		return gdao.quchongXinpinwenwan(account);
	}

	@Override
	public List<Xinpinwenwan> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Xinpinwenwan> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Xinpinwenwan getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

