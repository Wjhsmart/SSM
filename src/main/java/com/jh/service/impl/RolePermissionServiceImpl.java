package com.jh.service.impl;

import com.jh.dao.RolePermissionDAO;
import com.jh.service.RolePermissionService;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.WildcardPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {
	
	@Resource
	private RolePermissionDAO rolePermissionDAO;
	
	@Override
	public Collection<Permission> queryAllPermissionByRoleName(String roleName) {
		List<String> p = rolePermissionDAO.queryAllPermissionByRoleName(roleName);
		List<Permission> permissions = new ArrayList<Permission>();
		for (String s : p) {
			Permission per = new WildcardPermission(s);
			permissions.add(per);
		}
		return permissions;
	}
	
}
