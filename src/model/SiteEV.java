package model;

import java.io.Serializable;

public class SiteEV implements Serializable{

	// いいねの数
	private int like;

	// よくないねの数
	private int dislike;

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

}
