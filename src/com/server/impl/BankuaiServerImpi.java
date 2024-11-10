package com.server.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.BankuaiMapper;
import com.entity.Bankuai;
import com.server.BankuaiServer;
@Service
public class BankuaiServerImpi implements BankuaiServer {
   @Resource
   private BankuaiMapper gdao;
	@Override
	public int add(Bankuai po) {
		return gdao.insert(po);
	}

	@Override
	public int update(Bankuai po) {
		return gdao.updateByPrimaryKeySelective(po);
	}

	
	
	@Override
	public int delete(int id) {
		return gdao.deleteByPrimaryKey(id);
	}

	@Override
	public List<Bankuai> getAll(Map<String, Object> map) {
		return gdao.getAll(map);
	}
	
	public List<Bankuai> getsybankuai1(Map<String, Object> map) {
		return gdao.getsybankuai1(map);
	}
	public List<Bankuai> getsybankuai2(Map<String, Object> map) {
		return gdao.getsybankuai2(map);
	}
	public List<Bankuai> getsybankuai3(Map<String, Object> map) {
		return gdao.getsybankuai3(map);
	}
	
	@Override
	public Bankuai quchongBankuai(Map<String, Object> account) {
		return gdao.quchongBankuai(account);
	}

	@Override
	public List<Bankuai> getByPage(Map<String, Object> map) {
		return gdao.getByPage(map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return gdao.getCount(map);
	}

	@Override
	public List<Bankuai> select(Map<String, Object> map) {
		return gdao.select(map);
	}

	@Override
	public Bankuai getById(int id) {
		return gdao.selectByPrimaryKey(id);
	}

}

