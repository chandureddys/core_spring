package com.core.spring.spring_core;

public class Pupil {
	
	private Scores score;

	public Scores getScore() {
		return score;
	}

	public void setScore(Scores score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Pupil [score=" + score + "]";
	}
	
	

}
