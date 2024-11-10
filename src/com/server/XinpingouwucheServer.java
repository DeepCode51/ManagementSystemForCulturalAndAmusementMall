package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Xinpingouwuche;

public interface XinpingouwucheServer {

  public int add(Xinpingouwuche po);

  public int update(Xinpingouwuche po);
  
  
  
  public int delete(int id);

  public List<Xinpingouwuche> getAll(Map<String,Object> map);
  public List<Xinpingouwuche> getsyxinpingouwuche1(Map<String,Object> map);
  public List<Xinpingouwuche> getsyxinpingouwuche2(Map<String,Object> map);
  public List<Xinpingouwuche> getsyxinpingouwuche3(Map<String,Object> map);
  public Xinpingouwuche quchongXinpingouwuche(Map<String, Object> acount);

  public Xinpingouwuche getById( int id);

  public List<Xinpingouwuche> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Xinpingouwuche> select(Map<String, Object> map);
}
//	所有List
