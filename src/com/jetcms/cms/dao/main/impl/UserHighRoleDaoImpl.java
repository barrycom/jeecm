package com.jetcms.cms.dao.main.impl;

import com.jetcms.cms.dao.main.ContentTypeDao;
import com.jetcms.cms.dao.main.UserHighRoleDao;
import com.jetcms.cms.entity.main.ContentRecord;
import com.jetcms.cms.entity.main.ContentType;
import com.jetcms.cms.entity.main.UserHighRole;
import com.jetcms.common.hibernate4.Finder;
import com.jetcms.common.hibernate4.HibernateBaseDao;
import com.jetcms.core.entity.CmsRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017-9-28.
 */
@Repository
public class UserHighRoleDaoImpl extends HibernateBaseDao<UserHighRole, Integer> implements UserHighRoleDao {
    @Override
    protected Class<UserHighRole> getEntityClass() {
        return UserHighRole.class;
    }

    public UserHighRole save(UserHighRole bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    public UserHighRole findById(Integer id) {
get(id);
        UserHighRole entity = get(id);
            return entity;

    }

    @Override
    public List<UserHighRole> getListByHighRole(Integer highRole) {
        String hql=" select bean from UserHighRole bean where bean.highRole=:highRole";
        Finder f=Finder.create(hql).setParam("highRole", highRole);
        f.setCacheable(true);
        List<UserHighRole>list=find(f);
        return list;
    }


}
