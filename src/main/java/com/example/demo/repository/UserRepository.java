package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by barath on 08/06/18.
 */
public interface UserRepository extends JpaRepository<User,String>{

    /** SELECT *  FROM USER WHERER USER_NAME='barath' **/

    User findByUserName(String userName);


}
