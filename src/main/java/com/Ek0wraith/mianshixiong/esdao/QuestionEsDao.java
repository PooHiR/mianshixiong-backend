package com.Ek0wraith.mianshixiong.esdao;

import com.Ek0wraith.mianshixiong.model.dto.post.PostEsDTO;
import com.Ek0wraith.mianshixiong.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 /**
 *  题目 Es 操作
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 * @Author Ek0wraith
 * @Create 2024/12/29 11:39
 * @Version 1.0
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {
    List<QuestionEsDTO> findByUserId(Long userId);
}
