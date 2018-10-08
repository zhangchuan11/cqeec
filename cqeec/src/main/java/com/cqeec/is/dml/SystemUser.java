package com.cqeec.is.dml;

import java.util.Date;

public class SystemUser {
	private String id;
	private String number;
	private String name;
	private String login_Name;
	private String password;
	private Boolean disabled;
	private String description;
	private String parent;
	private String creator;
	private Date createTime;
	private String creatorComment;
	private String lastEditor;
	private Date lastModifyTime;
	private String lastModifyComment;

	public SystemUser() {
	}

	public SystemUser(String id) {
		this.id = id;
	}

	public SystemUser(String id, String number, String name, String loginName, String password, Boolean disabled,
			String description, String parent, String creator, Date createTime, String creatorComment,
			String lastEditor, Date lastModifyTime, String lastModifyComment) {
		this.id = id;
		this.number = number;
		this.name = name;
		this.login_Name = loginName;
		this.password = password;
		this.disabled = disabled;
		this.description = description;
		this.parent = parent;
		this.creator = creator;
		this.createTime = createTime;
		this.creatorComment = creatorComment;
		this.lastEditor = lastEditor;
		this.lastModifyTime = lastModifyTime;
		this.lastModifyComment = lastModifyComment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public String getLoginName() {
	// return loginName;
	// }
	//
	// public void setLoginName(String loginName) {
	// this.loginName = loginName;
	// }

	public String getLogin_Name() {
		return login_Name;
	}

	public void setLogin_Name(String login_Name) {
		this.login_Name = login_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreatorComment() {
		return creatorComment;
	}

	public void setCreatorComment(String creatorComment) {
		this.creatorComment = creatorComment;
	}

	public String getLastEditor() {
		return lastEditor;
	}

	public void setLastEditor(String lastEditor) {
		this.lastEditor = lastEditor;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getLastModifyComment() {
		return lastModifyComment;
	}

	public void setLastModifyComment(String lastModifyComment) {
		this.lastModifyComment = lastModifyComment;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.id + "\t" + this.name + "\t" + this.getLogin_Name() + "\t"
				+ this.getPassword();
	}

}
