package edu.nustti.mapper;

import edu.nustti.entity.Admin;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/17  20:57
 */
public class AdminMapperImpl2 extends SqlSessionDaoSupport implements AdminMapper {

    @Override
    public List<Admin> findAll() {
        return getSqlSession().getMapper(AdminMapper.class).findAll();
    }
}
