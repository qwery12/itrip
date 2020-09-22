package cn.itrip.dao;

import cn.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * 用户的数据访问接口
 */
public interface UserMapper {
    /**
     * 根据参数分页查询用户
     * @param params
     * @return
     */
    List<User> getUsersByParams(Map<String,Object>params);
    int getUsersCountByParams(Map<String,Object>params);
}
