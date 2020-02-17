package com.example.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer stuId;
	private String stuName;
	private String stuAdd;

	public Student(Integer stuId, String stuName, String stuAdd) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAdd = stuAdd;
	}

	public Student() {
		super();
	}

	public Student(Integer stuId) {
		super();
		this.stuId = stuId;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAdd() {
		return stuAdd;
	}

	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAdd=" + stuAdd + "]";
	}

}
