package com.flight.china.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TbUser {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userCode;

    private String userPhone;

    private String userEmail;

    private String userAdress;

    private String userSex;
    
    private Integer startWith;
    
    private Integer rows;
    
    private String remarks;
    
    private String oldP;
    
    private String newP;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress == null ? null : userAdress.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Integer getStartWith() {
		return startWith;
	}

	public void setStartWith(Integer startWith) {
		this.startWith = startWith;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getOldP() {
		return oldP;
	}

	public void setOldP(String oldP) {
		this.oldP = oldP;
	}

	public String getNewP() {
		return newP;
	}

	public void setNewP(String newP) {
		this.newP = newP;
	}
    
    
}