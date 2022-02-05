package com.dock.test.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;


@Entity
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	private Integer logic;
	@NotEmpty(message="Campo obrigatório")	
	private String serial;
	@NotEmpty(message="Campo obrigatório")	
	private String model;
	@Min(0)
	private Integer sam;
	private String ptid;
	private Integer plat;
	@NotEmpty(message="Campo obrigatório")	
	private String version;
	private Integer mxr;
	private Integer mxf;
	private String pverfm;
	
	
	public Integer getMxf() {
		return mxf;
	}

	public void setMxf(Integer mxf) {
		this.mxf = mxf;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Integer getSam() {
		return sam;
	}

	public void setSam(Integer sam) {
		this.sam = sam;
	}

	public String getPtid() {
		return ptid;
	}

	public void setPtid(String ptid) {
		this.ptid = ptid;
	}

	public Terminal() {		
	}

	public Integer getPlat() {
		return plat;
	}

	public void setPlat(Integer plat) {
		this.plat = plat;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getMxr() {
		return mxr;
	}

	public void setMxr(Integer mxr) {
		this.mxr = mxr;
	}

	public String getPverfm() {
		return pverfm;
	}

	public void setPverfm(String pverfm) {
		this.pverfm = pverfm;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((logic == null) ? 0 : logic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Terminal other = (Terminal) obj;
		if (logic == null) {
			if (other.logic != null)
				return false;
		} else if (!logic.equals(other.logic))
			return false;
		return true;
	}
		

	public Terminal(String terminal) {
		String[] parts = terminal.split(";");
		
		for (int i = 0; i <= 9 ; i++) {
			switch (i) {
			case 0 :
				this.logic = Integer.parseInt(parts[i]);
				break;
			case 1 :
				this.serial = parts[i];
				break;
			case 2 :
				this.model = parts[i];
				break;
			case 3 :
				this.sam = Integer.parseInt(parts[i]);
				break;
			case 4 :
				this.ptid = parts[i];
				break;
			case 5 :
				this.plat = Integer.parseInt(parts[i]);
				break;
			case 6 :
				this.version = parts[i];
				break;
			case 7 :
				this.mxr = Integer.parseInt(parts[i]);
				break;
			case 8 :
				this.mxf = Integer.parseInt(parts[i]);
				break;
			case 9 :
				this.pverfm = parts[i];
				break;
			}						
		}
	}
	
	public Integer getLogic() {
		return logic;
	}
	public void setLogic(Integer logic) {
		this.logic = logic;
	}
}