package com.rightInvesting.ip;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	public int userId;  //should be in long data type
	
	@Column(name="username")
	public String userName;
	
	@Column(name="userage")
	public String userAge;  //Should be in int data type
	
	@Column(name="usercity")
	public String userCity;
	
	@Column(name="userpincode")
	public int userPincode;
	
	@Column(name="userphone")
	public long userPhone;
	
	@Column(name="useremail")
	public String userEmail;
	
	@Column(name="usergender")
	public String userGender;
	
	@Column(name="userplantype")
	public String userPlantype;
	
	@Column(name="userdate")
	public Date userCreationDate; //Date
	
	@Column(name="usertime")
	public LocalTime userCreationTime;//time 
	
	@Column(name="userlastmodification")
	public LocalDateTime userLastModified; //time and date
	
	@Column(name="usertotalincome")
	public int userTotalIncome;
	
	@Column(name="userportfoliosize")
	public String userPortfolioSize;
	
	@Column(name="userleadstatus")
	public String userleadStatus;
	
	@Column(name="usernotes")
	public String userNotes; //modifiable
	
	//@Column(name="Source")
	// public String Source
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userCity=" + userCity
				+ ", userPincode=" + userPincode + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", userGender=" + userGender + ", userPlantype=" + userPlantype + ", userCreationDate="
				+ userCreationDate + ", userCreationTime=" + userCreationTime + ", userLastModified=" + userLastModified
				+ ", userTotalIncome=" + userTotalIncome + ", userPortfolioSize=" + userPortfolioSize
				+ ", userleadStatus=" + userleadStatus + ", userNotes=" + userNotes + "]";
	}

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param userId
	 * @param userName
	 * @param userAge
	 * @param userCity
	 * @param userPincode
	 * @param userPhone
	 * @param userEmail
	 * @param userGender
	 * @param userPlantype
	 * @param userCreationDate
	 * @param userCreationTime
	 * @param userLastModified
	 * @param userTotalIncome
	 * @param userPortfolioSize
	 * @param userleadStatus
	 * @param userNotes
	 */
	public User(int userId, String userName, String userAge, String userCity, int userPincode, long userPhone,
			String userEmail, String userGender, String userPlantype, Date userCreationDate, LocalTime userCreationTime,
			LocalDateTime userLastModified, int userTotalIncome, String userPortfolioSize, String userleadStatus,
			String userNotes) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userCity = userCity;
		this.userPincode = userPincode;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userGender = userGender;
		this.userPlantype = userPlantype;
		this.userCreationDate = userCreationDate;
		this.userCreationTime = userCreationTime;
		this.userLastModified = userLastModified;
		this.userTotalIncome = userTotalIncome;
		this.userPortfolioSize = userPortfolioSize;
		this.userleadStatus = userleadStatus;
		this.userNotes = userNotes;
	}

		

	
//end the page here
}
