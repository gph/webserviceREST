package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HighScore {
	private int id;
	private String name;
	private int score;
	
	public HighScore(int id, String name, int score){
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public HighScore(){}

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
