package com.app.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long imageId;

	@Column(name = "image")
	private Blob image;

	@Column(name = "imageDes")
	private String imageDes;

	public Image() {
	}

	public long getImageId() {
		return imageId;
	}

	public void setImageId(long imageId) {
		this.imageId = imageId;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getImageDes() {
		return imageDes;
	}

	public void setImageDes(String imageDes) {
		this.imageDes = imageDes;
	}

	
}
