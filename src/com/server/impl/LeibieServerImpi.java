package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.LeibieMapper;
import com.entity.Leibie;
import com.server.LeibieServer;
@Service
public class LeibieServerImpi implements LeibieServer {
   @Resource
   private LeibieMapper gdao;
	@Override
	public int add(Leibie po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Leibie po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Leibie> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Leibie> getsyleibie1(Map<String, Object> map) {
		return gdao.getsyleibie1(map);
	}
	public List<Leibie> getsyleibie2(Map<String, Object> map) {
		return gdao.getsyleibie2(map);
	}
	public List<Leibie> getsyleibie3(Map<String, Object> map) {
		return gdao.getsyleibie3(map);
	}
	
	@Override
	public Leibie quchongLeibie(Map<String, Object> account) {
		return gdao.quchongLeibie(account);
	}

	@Override
	public List<Leibie> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Leibie> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Leibie getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

