package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Maijiaxinxi;

public interface MaijiaxinxiServer {

  public int add(Maijiaxinxi po);

  public int update(Maijiaxinxi po);
  
  
  
  public int delete(int id);

  public List<Maijiaxinxi> getAll(Map<String,Object> map);
  public List<Maijiaxinxi> getsymaijiaxinxi1(Map<String,Object> map);
  public List<Maijiaxinxi> getsymaijiaxinxi2(Map<String,Object> map);
  public List<Maijiaxinxi> getsymaijiaxinxi3(Map<String,Object> map);
  public Maijiaxinxi quchongMaijiaxinxi(Map<String, Object> acount);

  public Maijiaxinxi getById( int id);

  public List<Maijiaxinxi> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Maijiaxinxi> select(Map<String, Object> map);
}
//	所有List
