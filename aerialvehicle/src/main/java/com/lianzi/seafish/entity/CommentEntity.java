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
 * @Description: 对鱼获的评论
 * @author onlineGenerator
 * @date 2017-03-03 17:50:27
 * @version V1.0   
 *
 */
@Entity
@Table(name = "tbl_comment", schema = "")
@SuppressWarnings("serial")
public class CommentEntity implements java.io.Serializable {
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
	/**评论的内容*/
	@Excel(name="评论的内容")
	private java.lang.String content;
	/**评论时间*/
	@Excel(name="评论时间",format = "yyyy-MM-dd")
	private java.util.Date commentTime;
	/**相关鱼获的id*/
	@Excel(name="相关鱼获的id")
	private java.lang.String catchesId;
	/**评论人id*/
	@Excel(name="评论人id")
	private java.lang.String customerId;
	
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
	 *@return: java.lang.String  评论的内容
	 */
	@Column(name ="CONTENT",nullable=false,length=32)
	public java.lang.String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  评论的内容
	 */
	public void setContent(java.lang.String content){
		this.content = content;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  评论时间
	 */
	@Column(name ="COMMENT_TIME",nullable=true,length=32)
	public java.util.Date getCommentTime(){
		return this.commentTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  评论时间
	 */
	public void setCommentTime(java.util.Date commentTime){
		this.commentTime = commentTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  相关鱼获的id
	 */
	@Column(name ="CATCHES_ID",nullable=true,length=36)
	public java.lang.String getCatchesId(){
		return this.catchesId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  相关鱼获的id
	 */
	public void setCatchesId(java.lang.String catchesId){
		this.catchesId = catchesId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  评论人id
	 */
	@Column(name ="CUSTOMER_ID",nullable=true,length=36)
	public java.lang.String getCustomerId(){
		return this.customerId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  评论人id
	 */
	public void setCustomerId(java.lang.String customerId){
		this.customerId = customerId;
	}
}
