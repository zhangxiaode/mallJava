package com.zxd.mall.service;

import com.zxd.mall.bean.WxUser;
import com.zxd.mall.mapper.WxUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserService {
    @Autowired
    private WxUserMapper mapper;

    public void addUser(WxUser user) {
        mapper.insert(user);
    }

    public void updateUser(WxUser user) {
        mapper.update(user);
    }

    public WxUser findUser(String openid) {
        return mapper.find(openid);
    }

    public void deleteUser(String openid){
        mapper.delete(openid);
    }

}
