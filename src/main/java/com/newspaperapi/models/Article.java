package com.newspaperapi.models;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column
}
