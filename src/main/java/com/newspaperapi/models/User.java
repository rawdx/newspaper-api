package com.newspaperapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "profile_picture")
	private byte[] profilePicture;

	@Column(name = "is_suscribed", nullable = false)
	private boolean isSuscribed;

	@Column(name = "is_writer", nullable = false)
	private boolean isWriter;

	@Column(name = "is_admin", nullable = false)
	private boolean isAdmin;

}
