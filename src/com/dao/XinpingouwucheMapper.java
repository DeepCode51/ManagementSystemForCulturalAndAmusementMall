package com.dao;

import java.util.List;
import java.util.Map;

import com.entity.Xinpingouwuche;

public interface XinpingouwucheMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xinpingouwuche record);

    int insertSelective(Xinpingouwuche record);

    Xinpingouwuche selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xinpingouwuche record);
	
    int updateByPrimaryKey(Xinpingouwuche record);
	public Xinpingouwuche quchongXinpingouwuche(Map<String, Object> maijiazhanghao);
	public List<Xinpingouwuche> getAll(Map<String, Object> map);
	public List<Xinpingouwuche> getsyxinpingouwuche1(Map<String, Object> map);
	public List<Xinpingouwuche> getsyxinpingouwuche3(Map<String, Object> map);
	public List<Xinpingouwuche> getsyxinpingouwuche2(Map<String, Object> map);
	public int getCount(Map<String, Object> po);
	public List<Xinpingouwuche> getByPage(Map<String, Object> map);
	public List<Xinpingouwuche> select(Map<String, Object> map);
//	所有List
}

