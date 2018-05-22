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
 * @Description: 无人机
 * @author onlineGenerator
 * @date 2017-03-03 17:13:41
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_drone", schema = "")
@SuppressWarnings("serial")
public class DroneEntity implements java.io.Serializable {
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
	/**无人机名称*/
	@Excel(name="无人机名称")
	private java.lang.String name;
	/**无人机型号型号*/
	@Excel(name="无人机型号型号")
	private java.lang.String model;
	/**无人机型号类型*/
	@Excel(name="无人机型号类型")
	private java.lang.String droneType;
	/**价格*/
	@Excel(name="价格")
	private java.lang.Double price;
	/**简介*/
	@Excel(name="简介")
	private java.lang.String brief;
	/**功能说明*/
	@Excel(name="功能说明")
	private java.lang.String detail;
	/**图片*/
	@Excel(name="图片")
	private java.lang.String pic;
	
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
	 *@return: java.lang.String  无人机名称
	 */
	@Column(name ="NAME",nullable=true,length=60)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  无人机名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  无人机型号型号
	 */
	@Column(name ="MODEL",nullable=true,length=60)
	public java.lang.String getModel(){
		return this.model;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  无人机型号型号
	 */
	public void setModel(java.lang.String model){
		this.model = model;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  无人机型号类型
	 */
	@Column(name ="DRONE_TYPE",nullable=true,length=60)
	public java.lang.String getDroneType(){
		return this.droneType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  无人机型号类型
	 */
	public void setDroneType(java.lang.String droneType){
		this.droneType = droneType;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  价格
	 */
	@Column(name ="PRICE",nullable=true,length=32)
	public java.lang.Double getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  价格
	 */
	public void setPrice(java.lang.Double price){
		this.price = price;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  简介
	 */
	@Column(name ="BRIEF",nullable=true,length=32)
	public java.lang.String getBrief(){
		return this.brief;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  简介
	 */
	public void setBrief(java.lang.String brief){
		this.brief = brief;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  功能说明
	 */
	@Column(name ="DETAIL",nullable=true,length=32)
	public java.lang.String getDetail(){
		return this.detail;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  功能说明
	 */
	public void setDetail(java.lang.String detail){
		this.detail = detail;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  图片
	 */
	@Column(name ="PIC",nullable=true,length=32)
	public java.lang.String getPic(){
		return this.pic;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  图片
	 */
	public void setPic(java.lang.String pic){
		this.pic = pic;
	}
}
