package com.entity;

public class Tiezi {
    private Integer id;
	private String bankuai;
	private String biaoti;
	private String leixing;
	private String neirong;
	private String fujian;
	private String faburen;
	private String fid;
	private String issh;
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getBankuai() {
        return bankuai;
    }
    public void setBankuai(String bankuai) {
        this.bankuai = bankuai == null ? null : bankuai.trim();
    }
	public String getBiaoti() {
        return biaoti;
    }
    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti == null ? null : biaoti.trim();
    }
	public String getLeixing() {
        return leixing;
    }
    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }
	public String getNeirong() {
        return neirong;
    }
    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }
	public String getFujian() {
        return fujian;
    }
    public void setFujian(String fujian) {
        this.fujian = fujian == null ? null : fujian.trim();
    }
	public String getFaburen() {
        return faburen;
    }
    public void setFaburen(String faburen) {
        this.faburen = faburen == null ? null : faburen.trim();
    }
	
	public String getIssh() {
        return issh;
    }
    public void setIssh(String issh) {
        this.issh = issh == null ? null : issh.trim();
    }
	
	public String getFid() {
        return fid;
    }
    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
