package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Bankuai;

public interface BankuaiServer {

  public int add(Bankuai po);

  public int update(Bankuai po);
  
  
  
  public int delete(int id);

  public List<Bankuai> getAll(Map<String,Object> map);
  public List<Bankuai> getsybankuai1(Map<String,Object> map);
  public List<Bankuai> getsybankuai2(Map<String,Object> map);
  public List<Bankuai> getsybankuai3(Map<String,Object> map);
  public Bankuai quchongBankuai(Map<String, Object> acount);

  public Bankuai getById( int id);

  public List<Bankuai> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Bankuai> select(Map<String, Object> map);
}
//	所有List
