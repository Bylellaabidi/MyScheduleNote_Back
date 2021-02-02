package rc.noteit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {
	
	
	@Id @GeneratedValue
	private Long id;
	private String title;
	private boolean allDay;
	private Date startDate;
	private Date endDate;
	
	
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Event(String title, boolean allDay, Date startDate, Date endDate) {
		super();
		this.title = title;
		this.allDay = allDay;
		this.startDate = startDate;
		this.endDate = endDate;
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
	public boolean isAllDay() {
		return allDay;
	}
	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	

}
