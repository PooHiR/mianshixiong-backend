package com.Ek0wraith.mianshixiong.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.Ek0wraith.mianshixiong.model.entity.Post;
import com.Ek0wraith.mianshixiong.model.entity.PostFavour;
import org.apache.ibatis.annotations.Param;

/**
 * 帖子收藏数据库操作
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 */
public interface PostFavourMapper extends BaseMapper<PostFavour> {

    /**
     * 分页查询收藏帖子列表
     *
     * @param page
     * @param queryWrapper
     * @param favourUserId
     * @return
     */
    Page<Post> listFavourPostByPage(IPage<Post> page, @Param(Constants.WRAPPER) Wrapper<Post> queryWrapper,
            long favourUserId);

}




