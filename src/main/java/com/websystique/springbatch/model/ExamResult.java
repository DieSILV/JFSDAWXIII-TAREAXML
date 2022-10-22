package com.websystique.springbatch.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExamResult")
public class ExamResult {
 
    private String studentName;
 
    private String dob;
 
    private double percentage;
 
    @XmlElement(name = "studentName")
    public String getStudentName() {
        return studentName;
    }
 
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
 
    @XmlElement(name = "dob")
    public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
    
    @XmlElement(name = "percentage")
    public double getPercentage() {
        return percentage;
    }
 
	public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
 
    @Override
    public String toString() {
        return "ExamResult [studentName=" + studentName + ", dob=" + dob
                + ", percentage=" + percentage + "]";
    }
}