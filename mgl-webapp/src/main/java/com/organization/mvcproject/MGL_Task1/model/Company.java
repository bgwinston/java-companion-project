
package com.organization.mvcproject.MGL_Task1.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


public class Company {

	private Long id;
	private String name;
	//TODO 1.0 this List doesn't need to be initialized at declaration. ---why-defaults to null
	private List<Game> gamesMade = new ArrayList<Game>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Game> getGamesMade() {
		return gamesMade;
	}

	public void setGamesMade(List<Game> gamesMade) {
		this.gamesMade = gamesMade;
	}
}