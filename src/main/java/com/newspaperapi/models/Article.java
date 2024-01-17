package com.newspaperapi.models;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_article", nullable = false)
	private long idArticle;

	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar date;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "subtitle", nullable = false)
	private String subtitle;

	@Column(name = "content", columnDefinition = "TEXT", nullable = false)
	private String content;
	
	@Column(name = "priority_score", nullable = false)
	private int priorityScore;

	@ManyToOne()
	@JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_article_category"))
	private Category category;
	
	@ManyToOne()
	@JoinColumn(name = "writer_id", foreignKey = @ForeignKey(name = "fk_article_writer"))
	private User user;

}
