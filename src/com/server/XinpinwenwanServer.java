package com.server;

import java.util.List;

import java.util.Map;

import com.entity.Xinpinwenwan;

public interface XinpinwenwanServer {

  public int add(Xinpinwenwan po);

  public int update(Xinpinwenwan po);
  
  
  
  public int delete(int id);

  public List<Xinpinwenwan> getAll(Map<String,Object> map);
  public List<Xinpinwenwan> getsyxinpinwenwan1(Map<String,Object> map);
  public List<Xinpinwenwan> getsyxinpinwenwan2(Map<String,Object> map);
  public List<Xinpinwenwan> getsyxinpinwenwan3(Map<String,Object> map);
  public Xinpinwenwan quchongXinpinwenwan(Map<String, Object> acount);

  public Xinpinwenwan getById( int id);

  public List<Xinpinwenwan> getByPage(Map<String, Object> map);

  public int getCount(Map<String,Object> map);

  public List<Xinpinwenwan> select(Map<String, Object> map);
}
//	所有List
