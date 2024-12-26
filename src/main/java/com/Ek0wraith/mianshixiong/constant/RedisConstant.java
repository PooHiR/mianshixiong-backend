package com.Ek0wraith.mianshixiong.constant;

/**
 * ClassName: RedisConstant
 * Package: com.Ek0wraith.mianshixiong.constant
 * Description：Redis 常量
 *
 * @Author Ek0wraith
 * @Create 2024/12/25 17:47
 * @Version 1.0
 */
public interface RedisConstant {
    /**
     * 用户签到记录的 Redis key 前端
     **/
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";

    /**
     * 获取用户签到记录的 Redis Key
     * @Param: year 年份
     * @Param: userId 用户 id
     * @Return: 拼接好的 Redis Key
     **/
    static String getUserSignInRedisKey(int year, long userId){
        return String.format("%s:%s:%s", USER_SIGN_IN_REDIS_KEY_PREFIX, year, userId);
    }

}
