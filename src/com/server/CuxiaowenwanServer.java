package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Cuxiaowenwan;

public interface CuxiaowenwanServer {

  public int add(Cuxiaowenwan po);

  public int update(Cuxiaowenwan po);
  
  
  
  public int delete(int id);

  public List<Cuxiaowenwan> getAll(Map<String,Object> map);
  public List<Cuxiaowenwan> getsycuxiaowenwan1(Map<String,Object> map);
  public List<Cuxiaowenwan> getsycuxiaowenwan2(Map<String,Object> map);
  public List<Cuxiaowenwan> getsycuxiaowenwan3(Map<String,Object> map);
  public Cuxiaowenwan quchongCuxiaowenwan(Map<String, Object> acount);

  public Cuxiaowenwan getById( int id);

  public List<Cuxiaowenwan> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Cuxiaowenwan> select(Map<String, Object> map);
}
//	所有List
