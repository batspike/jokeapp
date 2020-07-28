package com.samcancode.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	private final ChuckNorrisQuotes otherChuckQuotes;
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes, ChuckNorrisQuotes otherChuckQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
		this.otherChuckQuotes = otherChuckQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

	@Override
	public String getOtherJoke() {
		return otherChuckQuotes.getRandomQuote();
	}

}
