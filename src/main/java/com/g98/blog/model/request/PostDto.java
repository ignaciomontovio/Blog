package com.g98.blog.model.request;

public class PostDto {

	private String title;
	private String content;
	private String image;
	private Long idUser;
	private Long idCategory;
	
	
	
	public PostDto(String title, String content, String image,  Long idUser, Long idCategory) {
		super();
		this.title = title;
		this.content = content;
		this.image = image;
		this.idUser = idUser;
		this.idCategory = idCategory;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	
	
	
}
