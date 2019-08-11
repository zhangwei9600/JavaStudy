package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/8/11.
 */
@Repository
public interface UserMapper {
    User Sel(int id);
}
