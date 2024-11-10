package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Xinpinwenwan;

public interface XinpinwenwanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xinpinwenwan record);

    int insertSelective(Xinpinwenwan record);

    Xinpinwenwan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xinpinwenwan record);
	
    int updateByPrimaryKey(Xinpinwenwan record);
	public Xinpinwenwan quchongXinpinwenwan(Map<String, Object> wenwanbianhao);
	public List<Xinpinwenwan> getAll(Map<String, Object> map);
	public List<Xinpinwenwan> getsyxinpinwenwan1(Map<String, Object> map);
	public List<Xinpinwenwan> getsyxinpinwenwan3(Map<String, Object> map);
	public List<Xinpinwenwan> getsyxinpinwenwan2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Xinpinwenwan> getByPage(Map<String, Object> map);
	public List<Xinpinwenwan> select(Map<String, Object> map);
//	所有List
}

