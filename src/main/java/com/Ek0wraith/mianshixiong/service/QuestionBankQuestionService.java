package com.Ek0wraith.mianshixiong.service;

import com.Ek0wraith.mianshixiong.model.entity.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.Ek0wraith.mianshixiong.model.dto.questionBankQuestion.QuestionBankQuestionQueryRequest;
import com.Ek0wraith.mianshixiong.model.entity.QuestionBankQuestion;
import com.Ek0wraith.mianshixiong.model.vo.QuestionBankQuestionVO;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 题库题目关联服务
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 */
public interface QuestionBankQuestionService extends IService<QuestionBankQuestion> {

    /**
     * 校验数据
     *
     * @param questionBankQuestion
     * @param add 对创建的数据进行校验
     */
    void validQuestionBankQuestion(QuestionBankQuestion questionBankQuestion, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionBankQuestionQueryRequest
     * @return
     */
    QueryWrapper<QuestionBankQuestion> getQueryWrapper(QuestionBankQuestionQueryRequest questionBankQuestionQueryRequest);
    
    /**
     * 获取题库题目关联封装
     *
     * @param questionBankQuestion
     * @param request
     * @return
     */
    QuestionBankQuestionVO getQuestionBankQuestionVO(QuestionBankQuestion questionBankQuestion, HttpServletRequest request);

    /**
     * 分页获取题库题目关联封装
     *
     * @param questionBankQuestionPage
     * @param request
     * @return
     */
    Page<QuestionBankQuestionVO> getQuestionBankQuestionVOPage(Page<QuestionBankQuestion> questionBankQuestionPage, HttpServletRequest request);

    /**
     * @description: 批量添加题目到题库
     * @author: Ek0wraith
     * @date: 2025/1/15 16:55
     * @param: questionList
     * @param: questionBankId
     * @param: loginUser
     **/
    
    void batchAddQuestionToBank(List<Long> questionIdList, long questionBankId, User loginUser);


    /**
     * @description: 批量移除题库中的题目
     * @author: Ek0wraith
     * @date: 2025/1/15 16:55
     * @param: questionList
     * @param: questionBankId
     * @param: loginUser
     **/

    void batchRemoveQuestionToBank(List<Long> questionIdList, long questionBankId);


    /**
     * @description: 批量添加题目到题库(事务，仅供内部调用)
     * @author: Ek0wraith
     * @date: 2025/1/17 15:25
     * @param: questionBankQuestions
     **/
    @Transactional(rollbackFor = Exception.class)
    void batchAddQuestionsToBankInner(List<QuestionBankQuestion> questionBankQuestions);





}
