package rc.noteit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Training {
	
	@Id @GeneratedValue
	private Long id;
	private String title;
	private String description;
	private String type;
	private String img;
	private String detail;
	
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Training(String title, String description, String type,String img, String detail) {
		super();
		this.title = title;
		this.description = description;
		this.type = type;
		this.img=img;
		this.detail = detail;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	

	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
	

}
