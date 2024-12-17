package com.Ek0wraith.mianshixiong.esdao;

import com.Ek0wraith.mianshixiong.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}