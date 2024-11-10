package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.CuxiaogouwucheMapper;
import com.entity.Cuxiaogouwuche;
import com.server.CuxiaogouwucheServer;
@Service
public class CuxiaogouwucheServerImpi implements CuxiaogouwucheServer {
   @Resource
   private CuxiaogouwucheMapper gdao;
	@Override
	public int add(Cuxiaogouwuche po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Cuxiaogouwuche po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Cuxiaogouwuche> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Cuxiaogouwuche> getsycuxiaogouwuche1(Map<String, Object> map) {
		return gdao.getsycuxiaogouwuche1(map);
	}
	public List<Cuxiaogouwuche> getsycuxiaogouwuche2(Map<String, Object> map) {
		return gdao.getsycuxiaogouwuche2(map);
	}
	public List<Cuxiaogouwuche> getsycuxiaogouwuche3(Map<String, Object> map) {
		return gdao.getsycuxiaogouwuche3(map);
	}
	
	@Override
	public Cuxiaogouwuche quchongCuxiaogouwuche(Map<String, Object> account) {
		return gdao.quchongCuxiaogouwuche(account);
	}

	@Override
	public List<Cuxiaogouwuche> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Cuxiaogouwuche> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Cuxiaogouwuche getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

