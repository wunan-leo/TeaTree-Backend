package cn.edu.tongji.teatreebackend.service;

import cn.edu.tongji.teatreebackend.Dtos.SearchConditionsDto;
import cn.edu.tongji.teatreebackend.entity.TeaDistributionEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public interface ArticleService {

    TeaDistributionEntity getArticleInTeaDistribution(int id);

    HashMap<String, String> getArticlePreviewInTeaDistribution(int id);

    int createArticleInTeaDistribution(HashMap<String,String> param);

    boolean increaseArticleClickNumInDistribution(int id);

    Map<String,Object> getArticleListInDistribution(SearchConditionsDto searchConditionsDto);

    HashMap<String,Object> getArticleGroupsByArticleType(int articleType);

    HashMap<String, Object> getHomepageArticles(int articleType);

    List<HashMap> getHomepageTopArticles();

    String addHomepageTopArticle(int articleId);

    Boolean deleteHomepageTopArticle(int articleId);

    Boolean changeArticleTopStatus(int id);

    Boolean deleteArticleById(int id);
}
