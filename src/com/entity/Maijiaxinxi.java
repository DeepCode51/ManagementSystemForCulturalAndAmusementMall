package com.entity;

public class Maijiaxinxi {
    private Integer id;
	private String maijiazhanghao;
	private String mima;
	private String touxiang;
	private String maijiaxingming;
	private String xingbie;
	private String maijiadianhua;
	private String shouhuodizhi;
	
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getMaijiazhanghao() {
        return maijiazhanghao;
    }
    public void setMaijiazhanghao(String maijiazhanghao) {
        this.maijiazhanghao = maijiazhanghao == null ? null : maijiazhanghao.trim();
    }
	public String getMima() {
        return mima;
    }
    public void setMima(String mima) {
        this.mima = mima == null ? null : mima.trim();
    }
	public String getTouxiang() {
        return touxiang;
    }
    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang == null ? null : touxiang.trim();
    }
	public String getMaijiaxingming() {
        return maijiaxingming;
    }
    public void setMaijiaxingming(String maijiaxingming) {
        this.maijiaxingming = maijiaxingming == null ? null : maijiaxingming.trim();
    }
	public String getXingbie() {
        return xingbie;
    }
    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }
	public String getMaijiadianhua() {
        return maijiadianhua;
    }
    public void setMaijiadianhua(String maijiadianhua) {
        this.maijiadianhua = maijiadianhua == null ? null : maijiadianhua.trim();
    }
	public String getShouhuodizhi() {
        return shouhuodizhi;
    }
    public void setShouhuodizhi(String shouhuodizhi) {
        this.shouhuodizhi = shouhuodizhi == null ? null : shouhuodizhi.trim();
    }
	
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息
