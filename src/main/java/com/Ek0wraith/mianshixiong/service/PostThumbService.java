package com.Ek0wraith.mianshixiong.service;

import com.Ek0wraith.mianshixiong.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.Ek0wraith.mianshixiong.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
