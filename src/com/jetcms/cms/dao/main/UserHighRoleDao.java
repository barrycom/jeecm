package com.jetcms.cms.dao.main;

import com.jetcms.cms.entity.main.ContentRecord;
import com.jetcms.cms.entity.main.ContentType;
import com.jetcms.cms.entity.main.UserHighRole;
import com.jetcms.common.hibernate4.Updater;

import java.util.List;

/**
 * Created by Administrator on 2017-9-28.
 */
public interface UserHighRoleDao {

    public UserHighRole save(UserHighRole bean);
    public UserHighRole updateByUpdater(Updater<UserHighRole> updater);
    public UserHighRole findById(Integer id);
    public List<UserHighRole> getListByHighRole(Integer highRole);

}
