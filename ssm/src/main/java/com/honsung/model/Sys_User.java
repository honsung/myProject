package com.honsung.model;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Sys_User implements Serializable{


	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 3213261213330834521L;
	/**
	 * 主键
	 */
	private String id;
	/**
	 * 公司主键
	 */
	private String company_id;
	/**
	 * 部门主键
	 */
	private String office_id;
	/**
	 * 登录账号
	 */
	private String login_name;
	/**
	 * 登录密码
	 */
	private String password;

	private String no;
	private String name;
	private String email;
	private String phone;
	private String mobile;
	private String user_type;
	private String photo;
	private String login_ip;
	private String login_date;
	private String login_flag;
	private String create_by;
	private String create_date;
	private String update_by;
	private String update_date;
	private String remarks;
	private String del_flag;

	/**
	 * 无参构造方法
	 * @return
	 */
	public Sys_User(){}
	/**
	 * 有参构造方法
	 * @return
	 */
	public Sys_User(String id, String company_id, String office_id, String login_name, String password, String no,
			String name, String email, String phone, String mobile, String user_type, String photo, String login_ip,
			String login_date, String login_flag, String create_by, String create_date, String update_by,
			String update_date, String remarks, String del_flag) {
		super();
		this.id = id;
		this.company_id = company_id;
		this.office_id = office_id;
		this.login_name = login_name;
		this.password = password;
		this.no = no;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
		this.user_type = user_type;
		this.photo = photo;
		this.login_ip = login_ip;
		this.login_date = login_date;
		this.login_flag = login_flag;
		this.create_by = create_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
		this.remarks = remarks;
		this.del_flag = del_flag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getOffice_id() {
		return office_id;
	}
	public void setOffice_id(String office_id) {
		this.office_id = office_id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}
	public String getLogin_date() {
		return login_date;
	}
	public void setLogin_date(String login_date) {
		this.login_date = login_date;
	}
	public String getLogin_flag() {
		return login_flag;
	}
	public void setLogin_flag(String login_flag) {
		this.login_flag = login_flag;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_by() {
		return update_by;
	}
	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	@Override  
	public String toString() {  
		ToStringBuilder builder = new ToStringBuilder(this);  
		Field[] fields = this.getClass().getDeclaredFields();  
		try {  
			for (Field f : fields) {  
				f.setAccessible(true);  
				builder.append(f.getName(), f.get(this)).append("\n");  
			}  
		} catch (Exception e) {  
			builder.append("构建ToString遇到错误");  
		}  
		return builder.toString();  
	}  

	public int hashCode(){  
		return this.name.hashCode()*this.id.hashCode();  
	}  

	public boolean equals(Object obj){  
		if(this == obj){  
			return true;  
		}  
		if(!(obj instanceof Sys_User)){  
			return false;  
		}  
		Sys_User user = (Sys_User) obj;  
		if(this.name.equals(user.name)&&this.id == user.id){  
			return true;  
		}else{  
			return false;  
		}  
	}  
}
