package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.TieziMapper;
import com.entity.Tiezi;
import com.server.TieziServer;
@Service
public class TieziServerImpi implements TieziServer {
   @Resource
   private TieziMapper gdao;
	@Override
	public int add(Tiezi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Tiezi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Tiezi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Tiezi> getsytiezi1(Map<String, Object> map) {
		return gdao.getsytiezi1(map);
	}
	public List<Tiezi> getsytiezi2(Map<String, Object> map) {
		return gdao.getsytiezi2(map);
	}
	public List<Tiezi> getsytiezi3(Map<String, Object> map) {
		return gdao.getsytiezi3(map);
	}
	
	@Override
	public Tiezi quchongTiezi(Map<String, Object> account) {
		return gdao.quchongTiezi(account);
	}

	@Override
	public List<Tiezi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Tiezi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Tiezi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

