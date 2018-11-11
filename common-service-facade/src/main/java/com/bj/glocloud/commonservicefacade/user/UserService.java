package com.bj.glocloud.commonservicefacade.user;

import com.bj.glocloud.entity.user.*;
import com.bj.glocloud.req.BatchReq;
import com.bj.glocloud.req.user.*;

import java.util.List;

/**
 * @author Xionge
 * @date 2018/11/10
 * @description User Service
 */
public interface UserService {

    public UserEntity login(LoginReq loginReq);

    public List<UserEntity> findUsers(UserQueryReq userQueryReq);

    UserEntity register(RegisterReq registerReq);

    void batchUpdateUserState(BatchReq<UserStateReq> userStateReqs);

    void createAdminUser(AdminCreateReq adminCreateReq);

    List<RoleEntity> findRoles();

    void deleteRole(String roleId);

    void updateMenuOfRole(RoleMenuReq roleMenuReq);

    void updatePermissionOfRole(RolePermissionReq rolePermissionReq);

    List<PermissionEntity> findPermissions();

    List<MenuEntity> findMenus();

    List<AddressEntity> findAddresss(String userId);

    String createAddress(AddressCreateReq addressCreateReq, String userId);

    void deleteAddress(String addressId, String userId);

    void modifyAddress(AddressUpdateReq addressUpdateReq, String userId);
}
