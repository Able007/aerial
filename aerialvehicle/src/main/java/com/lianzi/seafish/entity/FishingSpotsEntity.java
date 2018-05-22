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
 * @Description: 鱼探
 * @author onlineGenerator
 * @date 2017-03-03 17:44:05
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_fishing_spots", schema = "")
@SuppressWarnings("serial")
public class FishingSpotsEntity implements java.io.Serializable {
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
	/**探鱼人id*/
	@Excel(name="探鱼人id")
	private java.lang.String customerId;
	/**经度*/
	@Excel(name="经度")
	private java.lang.String longitude;
	/**纬度*/
	@Excel(name="纬度")
	private java.lang.String latitude;
	/**探测时间*/
	@Excel(name="探测时间",format = "yyyy-MM-dd")
	private java.util.Date discoveryTime;
	/**使用的无人机id*/
	@Excel(name="使用的无人机id")
	private java.lang.String droneId;
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
	 *@return: java.lang.String  探鱼人id
	 */
	@Column(name ="CUSTOMER_ID",nullable=false,length=36)
	public java.lang.String getCustomerId(){
		return this.customerId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  探鱼人id
	 */
	public void setCustomerId(java.lang.String customerId){
		this.customerId = customerId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  经度
	 */
	@Column(name ="LONGITUDE",nullable=false,length=32)
	public java.lang.String getLongitude(){
		return this.longitude;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  经度
	 */
	public void setLongitude(java.lang.String longitude){
		this.longitude = longitude;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  纬度
	 */
	@Column(name ="LATITUDE",nullable=false,length=32)
	public java.lang.String getLatitude(){
		return this.latitude;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  纬度
	 */
	public void setLatitude(java.lang.String latitude){
		this.latitude = latitude;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  探测时间
	 */
	@Column(name ="DISCOVERY_TIME",nullable=true,length=36)
	public java.util.Date getDiscoveryTime(){
		return this.discoveryTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  探测时间
	 */
	public void setDiscoveryTime(java.util.Date discoveryTime){
		this.discoveryTime = discoveryTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的无人机id
	 */
	@Column(name ="DRONE_ID",nullable=true,length=36)
	public java.lang.String getDroneId(){
		return this.droneId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的无人机id
	 */
	public void setDroneId(java.lang.String droneId){
		this.droneId = droneId;
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
