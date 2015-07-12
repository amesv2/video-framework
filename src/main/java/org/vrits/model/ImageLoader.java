package org.vrits.model;

import java.io.InputStream;

/**
 * @author BOLLAPUH
 *
 */
public class ImageLoader {

	private Long imageId;
	private String imageName;
	private InputStream imageStream;

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public InputStream getImageStream() {
		return imageStream;
	}

	public void setImageStream(InputStream imageStream) {
		this.imageStream = imageStream;
	}

}
