/** 
 * <pre>项目名称:ssm-mongodb 
 * 文件名称:TreeBean.java 
 * 包名:com.jk.zzy.pojo 
 * 创建日期:2020年9月24日上午11:44:03 
 * Copyright (c) 2020, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>项目名称：ssm-mongodb    
 * 类名称：TreeBean    
 * 类描述：    
 * 创建人：张智阳
 * 创建时间：2020年9月24日 上午11:44:03    
 * 修改人：张智阳
 * 修改时间：2020年9月24日 上午11:44:03    
 * 修改备注：       
 * @version </pre>    
 */
public class TreeBean implements Serializable{


	private static final long serialVersionUID = -9141323089536577306L;
	private Integer id;
	private String text;
	private String url;
	private Integer pid;
	private List<TreeBean> nodes;
	private Boolean selectable;//是否打开选项卡页面 ：true打开  false不打开
	private String qx;
	//@Field(value="c_name")//映射
	//@DateTimeFormat(pattern=("yyyy-MM-dd"))//处理时间
	//@Transient//业务字段

	public List<TreeBean> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeBean> nodes) {
		this.nodes = nodes;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	public String getQx() {
		return qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	
	
}
