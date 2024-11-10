package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Tiezi;

public interface TieziServer {

  public int add(Tiezi po);

  public int update(Tiezi po);
  
  
  
  public int delete(int id);

  public List<Tiezi> getAll(Map<String,Object> map);
  public List<Tiezi> getsytiezi1(Map<String,Object> map);
  public List<Tiezi> getsytiezi2(Map<String,Object> map);
  public List<Tiezi> getsytiezi3(Map<String,Object> map);
  public Tiezi quchongTiezi(Map<String, Object> acount);

  public Tiezi getById( int id);

  public List<Tiezi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Tiezi> select(Map<String, Object> map);
}
//	所有List
