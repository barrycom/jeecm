package com.jetcms.cms.manager.main;

import com.jetcms.cms.entity.main.ContentType;
import com.jetcms.cms.entity.main.UserHighRole;

import java.util.List;

/**
 * Created by Administrator on 2017-9-28.
 */
public interface UserHighRoleMng {
    public UserHighRole save(UserHighRole bean);

    public UserHighRole update(UserHighRole bean);

    public UserHighRole findById(Integer id);

    public List<UserHighRole> getListByHighRole(Integer  highRole);


}
