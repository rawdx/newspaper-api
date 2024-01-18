package com.newspaperapi.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", nullable = false)
	private long idUser;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "credential", nullable = false)
	private String credential;

	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "phone_number", length = 15)
	private String phoneNumber;

	@Column(name = "profile_picture")
	private byte[] profilePicture;

	@Column(name = "is_suscribed", nullable = false)
	private boolean isSuscribed;

	@Column(name = "is_writer", nullable = false)
	private boolean isWriter;

	@Column(name = "is_admin", nullable = false)
	private boolean isAdmin;

	@OneToMany(mappedBy = "user")
	private List<Article> articles;

	
    public User() {
    }


	public long getIdUser() {
		return idUser;
	}


	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCredential() {
		return credential;
	}


	public void setCredential(String credential) {
		this.credential = credential;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public byte[] getProfilePicture() {
		return profilePicture;
	}


	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}


	public boolean isSuscribed() {
		return isSuscribed;
	}


	public void setSuscribed(boolean isSuscribed) {
		this.isSuscribed = isSuscribed;
	}


	public boolean isWriter() {
		return isWriter;
	}


	public void setWriter(boolean isWriter) {
		this.isWriter = isWriter;
	}


	public boolean isAdmin() {
		return isAdmin;
	}


	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}


	public List<Article> getArticles() {
		return articles;
	}


	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
    
}
