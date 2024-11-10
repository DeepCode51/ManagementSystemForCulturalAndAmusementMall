package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Bankuai;

public interface BankuaiMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bankuai record);

    int insertSelective(Bankuai record);

    Bankuai selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bankuai record);
	
    int updateByPrimaryKey(Bankuai record);
	public Bankuai quchongBankuai(Map<String, Object> bianhao);
	public List<Bankuai> getAll(Map<String, Object> map);
	public List<Bankuai> getsybankuai1(Map<String, Object> map);
	public List<Bankuai> getsybankuai3(Map<String, Object> map);
	public List<Bankuai> getsybankuai2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Bankuai> getByPage(Map<String, Object> map);
	public List<Bankuai> select(Map<String, Object> map);
//	所有List
}

