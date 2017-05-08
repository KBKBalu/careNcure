package com.app;

public class PatientSearch {
    private String pName;
    private int pId;
    private String  Gender;
    private String Gurdain;
    private long phNo;
    PatientSearch (String pName, int pId,String Gender, String Gurdain,long phNo)
    {
        this.pName= pName;
        this.pId=pId;
        this.Gender= Gender;
        this.Gurdain=Gurdain;
        this.phNo=phNo;
    }
    

    public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getGurdain() {
		return Gurdain;
	}


	public void setGurdain(String gurdain) {
		Gurdain = gurdain;
	}


	public long getPhNo() {
		return phNo;
	}


	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}


	public String toString()
    {
        return (pName+""+pId+""+Gender +" "+ Gurdain +""+phNo);
    }
}
