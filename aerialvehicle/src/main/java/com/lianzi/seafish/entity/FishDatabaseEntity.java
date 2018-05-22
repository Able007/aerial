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
 * @Description: 鱼类百科
 * @author onlineGenerator
 * @date 2017-03-03 19:01:33
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_fish_database", schema = "")
@SuppressWarnings("serial")
public class FishDatabaseEntity implements java.io.Serializable {
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
	/**鱼类名称*/
	@Excel(name="鱼类名称")
	private java.lang.String name;
	/**濒危等级*/
	@Excel(name="濒危等级")
	private java.lang.Integer threatLevel;
	/**英文名*/
	@Excel(name="英文名")
	private java.lang.String englishName;
	/**拉丁学名*/
	@Excel(name="拉丁学名")
	private java.lang.String latinName;
	/**所属界*/
	@Excel(name="所属界")
	private java.lang.String kingdom;
	/**所属门*/
	@Excel(name="所属门")
	private java.lang.String phylum;
	/**所属亚门*/
	@Excel(name="所属亚门")
	private java.lang.String subPhylum;
	/**所属纲*/
	@Excel(name="所属纲")
	private java.lang.String fishClass;
	/**所属亚纲*/
	@Excel(name="所属亚纲")
	private java.lang.String subClass;
	/**所属目*/
	@Excel(name="所属目")
	private java.lang.String orders;
	/**所属亚目*/
	@Excel(name="所属亚目")
	private java.lang.String subOrders;
	/**所属科*/
	@Excel(name="所属科")
	private java.lang.String family;
	/**所属的属*/
	@Excel(name="所属的属")
	private java.lang.String genus;
	/**所属种*/
	@Excel(name="所属种")
	private java.lang.String species;
	/**命名人*/
	@Excel(name="命名人")
	private java.lang.String namer;
	/**形态特征*/
	@Excel(name="形态特征")
	private java.lang.String characteristics;
	/**分布区域*/
	@Excel(name="分布区域")
	private java.lang.String distributionArea;
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
	 *@return: java.lang.String  鱼类名称
	 */
	@Column(name ="NAME",nullable=false,length=150)
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  鱼类名称
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  濒危等级
	 */
	@Column(name ="THREAT_LEVEL",nullable=true,length=32)
	public java.lang.Integer getThreatLevel(){
		return this.threatLevel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  濒危等级
	 */
	public void setThreatLevel(java.lang.Integer threatLevel){
		this.threatLevel = threatLevel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  英文名
	 */
	@Column(name ="ENGLISH_NAME",nullable=true,length=150)
	public java.lang.String getEnglishName(){
		return this.englishName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  英文名
	 */
	public void setEnglishName(java.lang.String englishName){
		this.englishName = englishName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  拉丁学名
	 */
	@Column(name ="LATIN_NAME",nullable=true,length=150)
	public java.lang.String getLatinName(){
		return this.latinName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  拉丁学名
	 */
	public void setLatinName(java.lang.String latinName){
		this.latinName = latinName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属界
	 */
	@Column(name ="KINGDOM",nullable=true,length=100)
	public java.lang.String getKingdom(){
		return this.kingdom;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属界
	 */
	public void setKingdom(java.lang.String kingdom){
		this.kingdom = kingdom;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属门
	 */
	@Column(name ="PHYLUM",nullable=true,length=100)
	public java.lang.String getPhylum(){
		return this.phylum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属门
	 */
	public void setPhylum(java.lang.String phylum){
		this.phylum = phylum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属亚门
	 */
	@Column(name ="SUB_PHYLUM",nullable=true,length=100)
	public java.lang.String getSubPhylum(){
		return this.subPhylum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属亚门
	 */
	public void setSubPhylum(java.lang.String subPhylum){
		this.subPhylum = subPhylum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属纲
	 */
	@Column(name ="FISH_CLASS",nullable=true,length=100)
	public java.lang.String getFishClass(){
		return this.fishClass;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属纲
	 */
	public void setFishClass(java.lang.String fishClass){
		this.fishClass = fishClass;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属亚纲
	 */
	@Column(name ="SUB_CLASS",nullable=true,length=100)
	public java.lang.String getSubClass(){
		return this.subClass;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属亚纲
	 */
	public void setSubClass(java.lang.String subClass){
		this.subClass = subClass;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属目
	 */
	@Column(name ="ORDERS",nullable=true,length=100)
	public java.lang.String getOrders(){
		return this.orders;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属目
	 */
	public void setOrders(java.lang.String orders){
		this.orders = orders;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属亚目
	 */
	@Column(name ="SUB_ORDERS",nullable=true,length=100)
	public java.lang.String getSubOrders(){
		return this.subOrders;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属亚目
	 */
	public void setSubOrders(java.lang.String subOrders){
		this.subOrders = subOrders;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属科
	 */
	@Column(name ="FAMILY",nullable=true,length=100)
	public java.lang.String getFamily(){
		return this.family;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属科
	 */
	public void setFamily(java.lang.String family){
		this.family = family;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属的属
	 */
	@Column(name ="GENUS",nullable=true,length=100)
	public java.lang.String getGenus(){
		return this.genus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属的属
	 */
	public void setGenus(java.lang.String genus){
		this.genus = genus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属种
	 */
	@Column(name ="SPECIES",nullable=true,length=100)
	public java.lang.String getSpecies(){
		return this.species;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属种
	 */
	public void setSpecies(java.lang.String species){
		this.species = species;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  命名人
	 */
	@Column(name ="NAMER",nullable=true,length=100)
	public java.lang.String getNamer(){
		return this.namer;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  命名人
	 */
	public void setNamer(java.lang.String namer){
		this.namer = namer;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  形态特征
	 */
	@Column(name ="CHARACTERISTICS",nullable=true,length=32)
	public java.lang.String getCharacteristics(){
		return this.characteristics;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  形态特征
	 */
	public void setCharacteristics(java.lang.String characteristics){
		this.characteristics = characteristics;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  分布区域
	 */
	@Column(name ="DISTRIBUTION_AREA",nullable=true,length=32)
	public java.lang.String getDistributionArea(){
		return this.distributionArea;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  分布区域
	 */
	public void setDistributionArea(java.lang.String distributionArea){
		this.distributionArea = distributionArea;
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
