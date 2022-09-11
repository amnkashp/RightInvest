package com.rightInvesting.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="blog")
public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long blogid;
	private String blogtittle;
	private String blogpara1;
	private String blogpara2;
	private String blogpara3;
	

}
