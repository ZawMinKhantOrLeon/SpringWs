package com.hostmdy.di.repository.impl;

import org.springframework.stereotype.Repository;

import com.hostmdy.di.repository.GreetingRepository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishMessage() {
		// TODO Auto-generated method stub
		return "Hello Everyone";
	}

	@Override
	public String getSpanishMessage() {
		// TODO Auto-generated method stub
		return "Hello Everyone in Spanish";
	}

	@Override
	public String getGermanMessage() {
		// TODO Auto-generated method stub
		return "Hello Everyone in German";
	}

	@Override
	public String getFranceMessage() {
		// TODO Auto-generated method stub
		return "Hello Everyone in France";
	}

}
