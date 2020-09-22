package cn.itrip.service;

import cn.itrip.beans.pojo.User;
import cn.itrip.common.Page;

public interface UserService {
    Page<User> getPagedUsers(int pageIndex,String userName);
}
