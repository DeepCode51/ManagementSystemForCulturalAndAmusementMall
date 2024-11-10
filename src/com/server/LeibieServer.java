package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Leibie;

public interface LeibieServer {

  public int add(Leibie po);

  public int update(Leibie po);
  
  
  
  public int delete(int id);

  public List<Leibie> getAll(Map<String,Object> map);
  public List<Leibie> getsyleibie1(Map<String,Object> map);
  public List<Leibie> getsyleibie2(Map<String,Object> map);
  public List<Leibie> getsyleibie3(Map<String,Object> map);
  public Leibie quchongLeibie(Map<String, Object> acount);

  public Leibie getById( int id);

  public List<Leibie> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Leibie> select(Map<String, Object> map);
}
//	所有List
