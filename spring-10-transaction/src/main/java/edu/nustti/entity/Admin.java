package edu.nustti.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LemonCCC
 * @description
 * @create 2020/11/17  11:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id;
    private String name;
    private String username;
    private String password;
}
