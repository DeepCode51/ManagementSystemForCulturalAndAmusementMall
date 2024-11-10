package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.XinpingouwucheMapper;
import com.entity.Xinpingouwuche;
import com.server.XinpingouwucheServer;
@Service
public class XinpingouwucheServerImpi implements XinpingouwucheServer {
   @Resource
   private XinpingouwucheMapper gdao;
	@Override
	public int add(Xinpingouwuche po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Xinpingouwuche po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Xinpingouwuche> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Xinpingouwuche> getsyxinpingouwuche1(Map<String, Object> map) {
		return gdao.getsyxinpingouwuche1(map);
	}
	public List<Xinpingouwuche> getsyxinpingouwuche2(Map<String, Object> map) {
		return gdao.getsyxinpingouwuche2(map);
	}
	public List<Xinpingouwuche> getsyxinpingouwuche3(Map<String, Object> map) {
		return gdao.getsyxinpingouwuche3(map);
	}
	
	@Override
	public Xinpingouwuche quchongXinpingouwuche(Map<String, Object> account) {
		return gdao.quchongXinpingouwuche(account);
	}

	@Override
	public List<Xinpingouwuche> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Xinpingouwuche> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Xinpingouwuche getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

