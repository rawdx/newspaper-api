package com.newspaperapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.newspaperapi.models.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
