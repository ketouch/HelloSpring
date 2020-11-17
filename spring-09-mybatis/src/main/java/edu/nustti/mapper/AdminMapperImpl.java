package edu.nustti.mapper;

import edu.nustti.entity.Admin;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/17  20:57
 */
public class AdminMapperImpl implements AdminMapper {
    @Autowired
    SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<Admin> findAll() {
        return sqlSession.getMapper(AdminMapper.class).findAll();
    }
}
