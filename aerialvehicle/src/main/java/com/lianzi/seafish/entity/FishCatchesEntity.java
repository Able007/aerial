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
 * @Description: 鱼获
 * @author onlineGenerator
 * @date 2017-03-03 17:39:59
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_catches", schema = "")
@SuppressWarnings("serial")
public class FishCatchesEntity implements java.io.Serializable {
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
	/**鱼类百科id*/
	@Excel(name="鱼类百科id")
	private java.lang.String fishId;
	/**鱼的长度*/
	@Excel(name="鱼的长度")
	private java.lang.Double fishLength;
	/**捕获时间*/
	@Excel(name="捕获时间",format = "yyyy-MM-dd")
	private java.util.Date catchTime;
	/**是否参加鱼获排行榜*/
	@Excel(name="是否参加鱼获排行榜")
	private java.lang.Integer isLeaderboard;
	/**捕获区域*/
	@Excel(name="捕获区域")
	private java.lang.String catchLocation;
	/**具体捕获地点*/
	@Excel(name="具体捕获地点")
	private java.lang.String detailLocation;
	/**释放鱼获*/
	@Excel(name="释放鱼获")
	private java.lang.Integer isRelease;
	/**关联的钓点*/
	@Excel(name="关联的钓点")
	private java.lang.String catchSpotId;
	/**使用的钓法*/
	@Excel(name="使用的钓法")
	private java.lang.String methodId;
	/**使用的线组*/
	@Excel(name="使用的线组")
	private java.lang.String rigId;
	/**使用的鱼饵*/
	@Excel(name="使用的鱼饵")
	private java.lang.String baitId;
	/**使用的鱼竿*/
	@Excel(name="使用的鱼竿")
	private java.lang.String rodId;
	/**使用的无人机型号*/
	@Excel(name="使用的无人机型号")
	private java.lang.String droneId;
	/**使用的诱饵*/
	@Excel(name="使用的诱饵")
	private java.lang.String lureId;
	/**我的心情*/
	@Excel(name="我的心情")
	private java.lang.String emotion;
	
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
	 *@return: java.lang.String  鱼类百科id
	 */
	@Column(name ="FISH_ID",nullable=false,length=36)
	public java.lang.String getFishId(){
		return this.fishId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  鱼类百科id
	 */
	public void setFishId(java.lang.String fishId){
		this.fishId = fishId;
	}
	/**
	 *方法: 取得java.lang.Double
	 *@return: java.lang.Double  鱼的长度
	 */
	@Column(name ="FISH_LENGTH",nullable=false,length=32)
	public java.lang.Double getFishLength(){
		return this.fishLength;
	}

	/**
	 *方法: 设置java.lang.Double
	 *@param: java.lang.Double  鱼的长度
	 */
	public void setFishLength(java.lang.Double fishLength){
		this.fishLength = fishLength;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  捕获时间
	 */
	@Column(name ="CATCH_TIME",nullable=false,length=32)
	public java.util.Date getCatchTime(){
		return this.catchTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  捕获时间
	 */
	public void setCatchTime(java.util.Date catchTime){
		this.catchTime = catchTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  是否参加鱼获排行榜
	 */
	@Column(name ="IS_LEADERBOARD",nullable=false,length=32)
	public java.lang.Integer getIsLeaderboard(){
		return this.isLeaderboard;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  是否参加鱼获排行榜
	 */
	public void setIsLeaderboard(java.lang.Integer isLeaderboard){
		this.isLeaderboard = isLeaderboard;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  捕获区域
	 */
	@Column(name ="CATCH_LOCATION",nullable=false,length=32)
	public java.lang.String getCatchLocation(){
		return this.catchLocation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  捕获区域
	 */
	public void setCatchLocation(java.lang.String catchLocation){
		this.catchLocation = catchLocation;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  具体捕获地点
	 */
	@Column(name ="DETAIL_LOCATION",nullable=true,length=32)
	public java.lang.String getDetailLocation(){
		return this.detailLocation;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  具体捕获地点
	 */
	public void setDetailLocation(java.lang.String detailLocation){
		this.detailLocation = detailLocation;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  释放鱼获
	 */
	@Column(name ="IS_RELEASE",nullable=false,length=32)
	public java.lang.Integer getIsRelease(){
		return this.isRelease;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  释放鱼获
	 */
	public void setIsRelease(java.lang.Integer isRelease){
		this.isRelease = isRelease;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  关联的钓点
	 */
	@Column(name ="CATCH_SPOT_ID",nullable=true,length=36)
	public java.lang.String getCatchSpotId(){
		return this.catchSpotId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  关联的钓点
	 */
	public void setCatchSpotId(java.lang.String catchSpotId){
		this.catchSpotId = catchSpotId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的钓法
	 */
	@Column(name ="METHOD_ID",nullable=true,length=36)
	public java.lang.String getMethodId(){
		return this.methodId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的钓法
	 */
	public void setMethodId(java.lang.String methodId){
		this.methodId = methodId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的线组
	 */
	@Column(name ="RIG_ID",nullable=true,length=36)
	public java.lang.String getRigId(){
		return this.rigId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的线组
	 */
	public void setRigId(java.lang.String rigId){
		this.rigId = rigId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的鱼饵
	 */
	@Column(name ="BAIT_ID",nullable=true,length=36)
	public java.lang.String getBaitId(){
		return this.baitId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的鱼饵
	 */
	public void setBaitId(java.lang.String baitId){
		this.baitId = baitId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的鱼竿
	 */
	@Column(name ="ROD_ID",nullable=true,length=36)
	public java.lang.String getRodId(){
		return this.rodId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的鱼竿
	 */
	public void setRodId(java.lang.String rodId){
		this.rodId = rodId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的无人机型号
	 */
	@Column(name ="DRONE_ID",nullable=true,length=36)
	public java.lang.String getDroneId(){
		return this.droneId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的无人机型号
	 */
	public void setDroneId(java.lang.String droneId){
		this.droneId = droneId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  使用的诱饵
	 */
	@Column(name ="LURE_ID",nullable=true,length=36)
	public java.lang.String getLureId(){
		return this.lureId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  使用的诱饵
	 */
	public void setLureId(java.lang.String lureId){
		this.lureId = lureId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  我的心情
	 */
	@Column(name ="EMOTION",nullable=true,length=32)
	public java.lang.String getEmotion(){
		return this.emotion;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  我的心情
	 */
	public void setEmotion(java.lang.String emotion){
		this.emotion = emotion;
	}
}
