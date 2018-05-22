package com.lianzi.seafish.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.math.BigDecimal;
import javax.xml.soap.Text;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;
import org.jeecgframework.poi.excel.annotation.Excel;

/**   
 * @Title: Entity
 * @Description: 注册的用户
 * @author onlineGenerator
 * @date 2017-03-03 17:13:25
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_customer", schema = "")
@SuppressWarnings("serial")
public class CustomerEntity implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**创建人名称*/
	private java.lang.String createName;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新人名称*/
	private java.lang.String updateName;
	/**更新日期*/
	private java.util.Date updateDate;
	/**名字*/
	@Excel(name="名字")
	private java.lang.String firstName;
	/**姓氏*/
	@Excel(name="姓氏")
	private java.lang.String lastName;
	/**邮箱地址*/
	@Excel(name="邮箱地址")
	private java.lang.String email;
	/**密码*/
	@Excel(name="密码")
	private java.lang.String passwd;
	/**图像名*/
	@Excel(name="图像名")
	private java.lang.String icon;
	/**性别*/
	@Excel(name="性别")
	private java.lang.Integer gender;
	/**出生日期*/
	@Excel(name="出生日期")
	private java.lang.String birth;
	/**所处城市*/
	@Excel(name="所处城市")
	private java.lang.String city;
	/**经验值*/
	@Excel(name="经验值")
	private java.lang.Integer experience;
	/**积分*/
	@Excel(name="积分")
	private java.lang.Integer points;
	/**等级*/
	@Excel(name="等级")
	private java.lang.String ranking;
	/**累计飞行总里程数*/
	@Excel(name="累计飞行总里程数")
	private java.lang.Double totalDistance;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  主键
	 */
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  主键
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人名称
	 */
	@Column(name ="CREATE_NAME",nullable=true,length=50)
	public java.lang.String getCreateName(){
		return this.createName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人名称
	 */
	public void setCreateName(java.lang.String createName){
		this.createName = createName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建日期
	 */
	@Column(name ="CREATE_DATE",nullable=true,length=20)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建日期
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人名称
	 */
	@Column(name ="UPDATE_NAME",nullable=true,length=50)
	public java.lang.String getUpdateName(){
		return this.updateName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人名称
	 */
	public void setUpdateName(java.lang.String updateName){
		this.updateName = updateName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新日期
	 */
	@Column(name ="UPDATE_DATE",nullable=true,length=20)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新日期
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  名字
	 */
	@Column(name ="FIRST_NAME",nullable=false,length=20)
	public java.lang.String getFirstName(){
		return this.firstName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  名字
	 */
	public void setFirstName(java.lang.String firstName){
		this.firstName = firstName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  姓氏
	 */
	@Column(name ="LAST_NAME",nullable=false,length=20)
	public java.lang.String getLastName(){
		return this.lastName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  姓氏
	 */
	public void setLastName(java.lang.String lastName){
		this.lastName = lastName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  邮箱地址
	 */
	@Column(name ="EMAIL",nullable=false,length=60)
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  邮箱地址
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  密码
	 */
	@Column(name ="PASSWD",nullable=false,length=100)
	public java.lang.String getPasswd(){
		return this.passwd;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  密码
	 */
	public void setPasswd(java.lang.String passwd){
		this.passwd = passwd;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  图像名
	 */
	@Column(name ="ICON",nullable=true,length=250)
	public java.lang.String getIcon(){
		return this.icon;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  图像名
	 */
	public void setIcon(java.lang.String icon){
		this.icon = icon;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  性别
	 */
	@Column(name ="GENDER",nullable=false,length=32)
	public java.lang.Integer getGender(){
		return this.gender;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  性别
	 */
	public void setGender(java.lang.Integer gender){
		this.gender = gender;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出生日期
	 */
	@Column(name ="BIRTH",nullable=true,length=100)
	public java.lang.String getBirth(){
		return this.birth;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出生日期
	 */
	public void setBirth(java.lang.String birth){
		this.birth = birth;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所处城市
	 */
	@Column(name ="CITY",nullable=true,length=250)
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所处城市
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  经验值
	 */
	@Column(name ="EXPERIENCE",nullable=true,length=32)
	public java.lang.Integer getExperience(){
		return this.experience;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  经验值
	 */
	public void setExperience(java.lang.Integer experience){
		this.experience = experience;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  积分
	 */
	@Column(name ="POINTS",nullable=true,length=32)
	public java.lang.Integer getPoints(){
		return this.points;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  积分
	 */
	public void setPoints(java.lang.Integer points){
		this.points = points;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  等级
	 */
	@Column(name ="RANKING",nullable=true,length=100)
	public java.lang.String getRanking(){
		return this.ranking;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  等级
	 */
	public void setRanking(java.lang.String ranking){
		this.ranking = ranking;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  累计飞行总里程数
	 */
	@Column(name ="TOTAL_DISTANCE",nullable=true,length=32)
	public java.lang.Double getTotalDistance(){
		return this.totalDistance;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  累计飞行总里程数
	 */
	public void setTotalDistance(java.lang.Double totalDistance){
		this.totalDistance = totalDistance;
	}
}
