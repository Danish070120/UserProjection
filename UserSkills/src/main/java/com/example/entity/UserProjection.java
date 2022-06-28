package com.example.entity;

import org.springframework.beans.factory.annotation.Value;

public interface UserProjection {
	
	@Value("#{target.firstname + ' ' + target.lastname}")
	String getFullname();
	String getEmail();

}
