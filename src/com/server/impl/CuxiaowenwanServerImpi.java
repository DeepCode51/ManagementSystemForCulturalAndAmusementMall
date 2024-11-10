package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CuxiaowenwanMapper;
import com.entity.Cuxiaowenwan;
import com.server.CuxiaowenwanServer;
@Service
public class CuxiaowenwanServerImpi implements CuxiaowenwanServer {
   @Resource
   private CuxiaowenwanMapper gdao;
	@Override
	public int add(Cuxiaowenwan po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Cuxiaowenwan po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Cuxiaowenwan> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Cuxiaowenwan> getsycuxiaowenwan1(Map<String, Object> map) {
		return gdao.getsycuxiaowenwan1(map);
	}
	public List<Cuxiaowenwan> getsycuxiaowenwan2(Map<String, Object> map) {
		return gdao.getsycuxiaowenwan2(map);
	}
	public List<Cuxiaowenwan> getsycuxiaowenwan3(Map<String, Object> map) {
		return gdao.getsycuxiaowenwan3(map);
	}
	
	@Override
	public Cuxiaowenwan quchongCuxiaowenwan(Map<String, Object> account) {
		return gdao.quchongCuxiaowenwan(account);
	}

	@Override
	public List<Cuxiaowenwan> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Cuxiaowenwan> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Cuxiaowenwan getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

