package com.lianzi.seafish.service.impl;
import java.io.Serializable;
import java.util.UUID;

import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lianzi.seafish.entity.FishCatchesEntity;
import com.lianzi.seafish.service.FishCatchesServiceI;

@Service("fishCatchesService")
@Transactional
public class FishCatchesServiceImpl extends CommonServiceImpl implements FishCatchesServiceI {

	
 	public <T> void delete(T entity) {
 		super.delete(entity);
 		//执行删除操作配置的sql增强
		this.doDelSql((FishCatchesEntity)entity);
 	}
 	
 	public <T> Serializable save(T entity) {
 		Serializable t = super.save(entity);
 		//执行新增操作配置的sql增强
 		this.doAddSql((FishCatchesEntity)entity);
 		return t;
 	}
 	
 	public <T> void saveOrUpdate(T entity) {
 		super.saveOrUpdate(entity);
 		//执行更新操作配置的sql增强
 		this.doUpdateSql((FishCatchesEntity)entity);
 	}
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(FishCatchesEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(FishCatchesEntity t){
	 	return true;
 	}
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(FishCatchesEntity t){
	 	return true;
 	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @return
	 */
 	public String replaceVal(String sql,FishCatchesEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{create_name}",String.valueOf(t.getCreateName()));
 		sql  = sql.replace("#{create_date}",String.valueOf(t.getCreateDate()));
 		sql  = sql.replace("#{update_name}",String.valueOf(t.getUpdateName()));
 		sql  = sql.replace("#{update_date}",String.valueOf(t.getUpdateDate()));
 		sql  = sql.replace("#{fish_id}",String.valueOf(t.getFishId()));
 		sql  = sql.replace("#{fish_length}",String.valueOf(t.getFishLength()));
 		sql  = sql.replace("#{catch_time}",String.valueOf(t.getCatchTime()));
 		sql  = sql.replace("#{is_leaderboard}",String.valueOf(t.getIsLeaderboard()));
 		sql  = sql.replace("#{catch_location}",String.valueOf(t.getCatchLocation()));
 		sql  = sql.replace("#{detail_location}",String.valueOf(t.getDetailLocation()));
 		sql  = sql.replace("#{is_release}",String.valueOf(t.getIsRelease()));
 		sql  = sql.replace("#{catch_spot_id}",String.valueOf(t.getCatchSpotId()));
 		sql  = sql.replace("#{method_id}",String.valueOf(t.getMethodId()));
 		sql  = sql.replace("#{rig_id}",String.valueOf(t.getRigId()));
 		sql  = sql.replace("#{bait_id}",String.valueOf(t.getBaitId()));
 		sql  = sql.replace("#{rod_id}",String.valueOf(t.getRodId()));
 		sql  = sql.replace("#{drone_id}",String.valueOf(t.getDroneId()));
 		sql  = sql.replace("#{lure_id}",String.valueOf(t.getLureId()));
 		sql  = sql.replace("#{emotion}",String.valueOf(t.getEmotion()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
}