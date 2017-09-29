package com.jetcms.cms.manager.main.impl;

import com.jetcms.cms.dao.main.ContentTypeDao;
import com.jetcms.cms.dao.main.UserHighRoleDao;

import com.jetcms.cms.entity.main.ContentType;
import com.jetcms.cms.entity.main.UserHighRole;
import com.jetcms.cms.manager.main.ContentTypeMng;
import com.jetcms.cms.manager.main.UserHighRoleMng;
import com.jetcms.common.hibernate4.Updater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017-9-28.
 */
@Service
@Transactional
public class UserHighRoleMngImpl implements UserHighRoleMng {
    private UserHighRoleDao dao;
    public UserHighRole save(UserHighRole bean) {
        dao.save(bean);
        return bean;
    }
    public UserHighRole update(UserHighRole bean) {
        Updater<UserHighRole> updater = new Updater<UserHighRole>(bean);
        UserHighRole entity = dao.updateByUpdater(updater);
        return entity;
    }

    @Transactional(readOnly = true)
    public UserHighRole findById(Integer id) {
        UserHighRole entity = dao.findById(id);
        return entity;
    }

    @Override
    public List<UserHighRole> getListByHighRole(Integer highRole) {
        return dao.getListByHighRole(highRole);
    }

    @Autowired
    public void setDao(UserHighRoleDao dao) {
        this.dao = dao;
    }
}
