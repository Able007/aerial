package com.lianzi.seafish.service.impl;
import java.io.Serializable;
import java.util.UUID;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lianzi.seafish.entity.FishDatabaseEntity;
import com.lianzi.seafish.service.FishDatabaseServiceI;

@Service("fishDatabaseService")
@Transactional
public class FishDatabaseServiceImpl extends CommonServiceImpl implements FishDatabaseServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((FishDatabaseEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((FishDatabaseEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((FishDatabaseEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(FishDatabaseEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(FishDatabaseEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(FishDatabaseEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,FishDatabaseEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{name}",String.valueOf(t.getName()));
 		sql  = sql.replace("#{threat_level}",String.valueOf(t.getThreatLevel()));
 		sql  = sql.replace("#{english_name}",String.valueOf(t.getEnglishName()));
 		sql  = sql.replace("#{latin_name}",String.valueOf(t.getLatinName()));
 		sql  = sql.replace("#{kingdom}",String.valueOf(t.getKingdom()));
 		sql  = sql.replace("#{phylum}",String.valueOf(t.getPhylum()));
 		sql  = sql.replace("#{sub_phylum}",String.valueOf(t.getSubPhylum()));
 		sql  = sql.replace("#{fish_class}",String.valueOf(t.getFishClass()));
 		sql  = sql.replace("#{sub_class}",String.valueOf(t.getSubClass()));
 		sql  = sql.replace("#{orders}",String.valueOf(t.getOrders()));
 		sql  = sql.replace("#{sub_orders}",String.valueOf(t.getSubOrders()));
 		sql  = sql.replace("#{family}",String.valueOf(t.getFamily()));
 		sql  = sql.replace("#{genus}",String.valueOf(t.getGenus()));
 		sql  = sql.replace("#{species}",String.valueOf(t.getSpecies()));
 		sql  = sql.replace("#{namer}",String.valueOf(t.getNamer()));
 		sql  = sql.replace("#{characteristics}",String.valueOf(t.getCharacteristics()));
 		sql  = sql.replace("#{distribution_area}",String.valueOf(t.getDistributionArea()));
 		sql  = sql.replace("#{pic}",String.valueOf(t.getPic()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}