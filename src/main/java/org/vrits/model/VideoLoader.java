package org.vrits.model;

import java.io.InputStream;

/**
 * @author BOLLAPUH
 *
 */
public class VideoLoader {

	private Long videoId;
	private String videoName;
	private InputStream videoStream;

	public Long getVideoId() {
		return videoId;
	}

	public void setVideoId(Long videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public InputStream getVideoStream() {
		return videoStream;
	}

	public void setVideoStream(InputStream videoStream) {
		this.videoStream = videoStream;
	}

}
