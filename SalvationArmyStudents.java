package EncapsulaationExample;

public class SalvationArmyStudents {
	private int SalSdtId;
	private String SalSdtName;
	private String SalSdtMusicClassName;

	public static void main(String[] args) {
	SalvationArmyStudents SAS=new SalvationArmyStudents();
	SAS.setSalSdtId(100);
	SAS.setSalSdtName("Aksheta");
	SAS.setSalSdtMusicClassName("Guitar");
	System.out.println("Salvation Army Student Name is: "+SAS.getSalSdtName());
	System.out.println("Salvation Army Student ID is: "+SAS.getSalSdtId());
	System.out.println("Salvation Army Student Name is: "+SAS.getSalSdtMusicClassName());
	}

	public int getSalSdtId() {
		return SalSdtId;
	}

	public void setSalSdtId(int salSdtId) {
		this.SalSdtId = salSdtId;
	}

	public String getSalSdtName() {
		return SalSdtName;
	}

	public void setSalSdtName(String salSdtName) {
		this.SalSdtName = salSdtName;
	}

	public String getSalSdtMusicClassName() {
		return SalSdtMusicClassName;
	}

	public void setSalSdtMusicClassName(String salSdtMusicClassName) {
		this.SalSdtMusicClassName = salSdtMusicClassName;
	}
	
	

}
