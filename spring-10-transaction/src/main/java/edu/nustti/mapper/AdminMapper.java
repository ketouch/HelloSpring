package edu.nustti.mapper;

import edu.nustti.entity.Admin;

import java.util.List;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/17  13:57
 */
public interface AdminMapper {
    List<Admin> findAll();

    void addAdmin(Admin admin);

    void deleteAdmin(Admin admin);

    void updateAdmin(Admin admin);

    Admin findAdmin(Admin admin);
}
