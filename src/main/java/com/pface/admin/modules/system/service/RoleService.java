package com.pface.admin.modules.system.service;

import com.pface.admin.modules.base.service.IService;
import com.pface.admin.modules.system.po.Role;

import java.util.Set;

public interface RoleService extends IService<Role> {

    /**
     * 根据角色编号得到角色标识符列表
     * @param roleIds
     * @return
     */
    Set<String> queryRoles(Long... roleIds);

    /**
     * 根据角色编号得到权限字符串列表
     * @param roleIds
     * @return
     */
    Set<String> queryPermissions(Long[] roleIds);
}
