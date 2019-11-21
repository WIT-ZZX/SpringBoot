package com.zzx.dao;


import com.zzx.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/11/21.
 */
public interface UserRespository extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
