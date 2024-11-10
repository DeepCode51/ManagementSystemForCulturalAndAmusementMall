package com.entity;

public class Xinpinwenwan {
    private Integer id;
	private String wenwanbianhao;
	private String wenwanmingcheng;
	private String wenwanleibie;
	private String wenwantupian;
	private String kucun;
	private String wenwanjiage;
	private String wenwanjianjie;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getWenwanbianhao() {
        return wenwanbianhao;
    }
    public void setWenwanbianhao(String wenwanbianhao) {
        this.wenwanbianhao = wenwanbianhao == null ? null : wenwanbianhao.trim();
    }
	public String getWenwanmingcheng() {
        return wenwanmingcheng;
    }
    public void setWenwanmingcheng(String wenwanmingcheng) {
        this.wenwanmingcheng = wenwanmingcheng == null ? null : wenwanmingcheng.trim();
    }
	public String getWenwanleibie() {
        return wenwanleibie;
    }
    public void setWenwanleibie(String wenwanleibie) {
        this.wenwanleibie = wenwanleibie == null ? null : wenwanleibie.trim();
    }
	public String getWenwantupian() {
        return wenwantupian;
    }
    public void setWenwantupian(String wenwantupian) {
        this.wenwantupian = wenwantupian == null ? null : wenwantupian.trim();
    }
	public String getKucun() {
        return kucun;
    }
    public void setKucun(String kucun) {
        this.kucun = kucun == null ? null : kucun.trim();
    }
	public String getWenwanjiage() {
        return wenwanjiage;
    }
    public void setWenwanjiage(String wenwanjiage) {
        this.wenwanjiage = wenwanjiage == null ? null : wenwanjiage.trim();
    }
	public String getWenwanjianjie() {
        return wenwanjianjie;
    }
    public void setWenwanjianjie(String wenwanjianjie) {
        this.wenwanjianjie = wenwanjianjie == null ? null : wenwanjianjie.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
