package dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int stdid;
private String stdname;
private int stdphno;
private String stddob;
private String gender;
private String stdstate;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public int getStdphno() {
	return stdphno;
}
public void setStdphno(int stdphno) {
	this.stdphno = stdphno;
}
public String getStddob() {
	return stddob;
}
public void setStddob(String stddob) {
	this.stddob = stddob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getStdstate() {
	return stdstate;
}
public void setStdstate(String stdstate) {
	this.stdstate = stdstate;
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdphno=" + stdphno + ", stddob=" + stddob
			+ ", gender=" + gender + ", stdstate=" + stdstate + "]";
}



}
