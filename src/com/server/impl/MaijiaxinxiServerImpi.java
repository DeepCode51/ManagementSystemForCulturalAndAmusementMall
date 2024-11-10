package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.MaijiaxinxiMapper;
import com.entity.Maijiaxinxi;
import com.server.MaijiaxinxiServer;
@Service
public class MaijiaxinxiServerImpi implements MaijiaxinxiServer {
   @Resource
   private MaijiaxinxiMapper gdao;
	@Override
	public int add(Maijiaxinxi po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Maijiaxinxi po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Maijiaxinxi> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Maijiaxinxi> getsymaijiaxinxi1(Map<String, Object> map) {
		return gdao.getsymaijiaxinxi1(map);
	}
	public List<Maijiaxinxi> getsymaijiaxinxi2(Map<String, Object> map) {
		return gdao.getsymaijiaxinxi2(map);
	}
	public List<Maijiaxinxi> getsymaijiaxinxi3(Map<String, Object> map) {
		return gdao.getsymaijiaxinxi3(map);
	}
	
	@Override
	public Maijiaxinxi quchongMaijiaxinxi(Map<String, Object> account) {
		return gdao.quchongMaijiaxinxi(account);
	}

	@Override
	public List<Maijiaxinxi> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Maijiaxinxi> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Maijiaxinxi getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

