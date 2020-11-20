package edu.nustti.mapper;

import edu.nustti.entity.Admin;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/19  17:48
 */
public class AdminMapperImpl extends SqlSessionDaoSupport implements AdminMapper {
    @Override
    public List<Admin> findAll() {
        return getSqlSession().getMapper(AdminMapper.class).findAll();
    }

    @Override
    public void addAdmin(Admin admin) {
        getSqlSession().getMapper(AdminMapper.class).addAdmin(admin);
        deleteAdmin(admin);
    }

    @Override
    public void deleteAdmin(Admin admin) {
        getSqlSession().getMapper(AdminMapper.class).deleteAdmin(admin);
    }

    @Override
    public void updateAdmin(Admin admin) {
        getSqlSession().getMapper(AdminMapper.class).updateAdmin(admin);
    }

    @Override
    public Admin findAdmin(Admin admin) {
        return getSqlSession().getMapper(AdminMapper.class).findAdmin(admin);
    }
}
