package com.interview.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@MappedSuperclass
public class AuditBaseEntity implements Serializable{

	private static final long serialVersionUID = 5662678914705409490L;
	

	@CreatedBy
	private String createUser;
	
	@LastModifiedBy
	private String updateUser;
	
	@CreatedDate
	private Date createDate;

	@LastModifiedDate
	private Date updateDate;

}
