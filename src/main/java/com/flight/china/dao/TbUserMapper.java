package com.flight.china.dao;

import com.flight.china.bean.TbUser;
import com.flight.china.bean.TbUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Mapper
public interface TbUserMapper {
    int countByExample(TbUser tbUser);

    int deleteUser(TbUser tbUser);

    int deleteByPrimaryKey(Integer id);

    int insertUser(TbUser tbUser);

    int insertSelective(TbUser tbUser);

    List<TbUser> selectByExample(TbUser tbUser);

    TbUser selectByPrimaryKey(Integer id);

    int updateById(TbUser tbUser1);

    int updateByPrimaryKeySelective(TbUser tbUser);

    int updateByPrimaryKey(TbUser tbUser);
    
    int getCount(TbUser tbUser);
    
    List<TbUser> getAllUserMessage(TbUser tbUser);
    
    int updatePassword(TbUser tbUser);
    
    List<TbUser> getUserLike(TbUser tbUser);
}