package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Cuxiaogouwuche;

public interface CuxiaogouwucheServer {

  public int add(Cuxiaogouwuche po);

  public int update(Cuxiaogouwuche po);
  
  
  
  public int delete(int id);

  public List<Cuxiaogouwuche> getAll(Map<String,Object> map);
  public List<Cuxiaogouwuche> getsycuxiaogouwuche1(Map<String,Object> map);
  public List<Cuxiaogouwuche> getsycuxiaogouwuche2(Map<String,Object> map);
  public List<Cuxiaogouwuche> getsycuxiaogouwuche3(Map<String,Object> map);
  public Cuxiaogouwuche quchongCuxiaogouwuche(Map<String, Object> acount);

  public Cuxiaogouwuche getById( int id);

  public List<Cuxiaogouwuche> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Cuxiaogouwuche> select(Map<String, Object> map);
}
//	所有List
