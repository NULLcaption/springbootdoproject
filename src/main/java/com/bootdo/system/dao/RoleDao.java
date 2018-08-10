package com.bootdo.system.dao;

import com.bootdo.system.domain.RoleDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
* @Description:    角色
* @Author:         Cheney Master
* @CreateDate:     2018/8/10 15:05
* @Version:        1.0
*/

@Mapper
public interface RoleDao {

	RoleDO get(Long roleId);
	
	List<RoleDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(RoleDO role);
	
	int update(RoleDO role);
	
	int remove(Long roleId);
	
	int batchRemove(Long[] roleIds);

	String getRoleNameByUserId(Long userId);
}
