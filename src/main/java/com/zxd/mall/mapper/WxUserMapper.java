package com.zxd.mall.mapper;

import com.zxd.mall.bean.WxUser;

public interface WxUserMapper {

    public void insert(WxUser user);

    public void update(WxUser user);

    public void delete(String openid);

    public WxUser find(String openid);

}