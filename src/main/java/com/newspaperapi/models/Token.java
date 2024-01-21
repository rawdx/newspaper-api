package com.newspaperapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tokens")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_token", nullable = false)
    private Long idToken;
    
    @Column(name = "value", nullable = false, unique = true)
    private String value;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
    @Column(name = "expiry_date", nullable = false)
    private long expiryDate;

    
	public Token() {
		super();
	}


	public Long getIdToken() {
		return idToken;
	}


	public void setIdToken(Long idToken) {
		this.idToken = idToken;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(long expiryDate) {
		this.expiryDate = expiryDate;
	}
    
}
