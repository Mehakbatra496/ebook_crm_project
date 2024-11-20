package com.example2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;


@Entity						//JPA entity class, it maps to the database table
@Table(name="register")		// table name = register

public class Employee	
{	
	@Id					//id field is the primary key
	@GeneratedValue(strategy=GenerationType.AUTO)	// automatically generate primary key value
		
	private int id;	
	// auto increment primary key

	@NotNull @NotEmpty
	private String name;	// employee other informations
	
	@Email
	private String email;
	
	private String phone;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
