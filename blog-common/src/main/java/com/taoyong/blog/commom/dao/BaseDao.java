package com.taoyong.blog.commom.dao;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by taoyong on 15/12/13.
 */
public abstract class BaseDao{
    public JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
