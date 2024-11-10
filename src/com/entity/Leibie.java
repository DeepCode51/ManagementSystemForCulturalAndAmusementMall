package com.entity;

public class Leibie {
    private Integer id;
	private String wenwanleibie;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getWenwanleibie() {
        return wenwanleibie;
    }
    public void setWenwanleibie(String wenwanleibie) {
        this.wenwanleibie = wenwanleibie == null ? null : wenwanleibie.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
