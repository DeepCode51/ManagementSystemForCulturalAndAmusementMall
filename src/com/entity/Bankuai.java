package com.entity;

public class Bankuai {
    private Integer id;
	private String bianhao;
	private String mingcheng;
	private String jianjie;
	private String banzhu;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getBianhao() {
        return bianhao;
    }
    public void setBianhao(String bianhao) {
        this.bianhao = bianhao == null ? null : bianhao.trim();
    }
	public String getMingcheng() {
        return mingcheng;
    }
    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng == null ? null : mingcheng.trim();
    }
	public String getJianjie() {
        return jianjie;
    }
    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }
	public String getBanzhu() {
        return banzhu;
    }
    public void setBanzhu(String banzhu) {
        this.banzhu = banzhu == null ? null : banzhu.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
