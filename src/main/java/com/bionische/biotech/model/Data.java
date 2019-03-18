
package com.bionische.biotech.model;


public class Data {

    private String type;
    private String fromFcm;
    private int fromDeviceType;
    private int toDeviceType;
    private int id;

     

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromDeviceType() {
		return fromDeviceType;
	}

	public void setFromDeviceType(int fromDeviceType) {
		this.fromDeviceType = fromDeviceType;
	}

	public int getToDeviceType() {
		return toDeviceType;
	}

	public void setToDeviceType(int toDeviceType) {
		this.toDeviceType = toDeviceType;
	}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	public String getFromFcm() {
		return fromFcm;
	}

	public void setFromFcm(String fromFcm) {
		this.fromFcm = fromFcm;
	}

	@Override
	public String toString() {
		return "Data [type=" + type + ", fromFcm=" + fromFcm + ", fromDeviceType=" + fromDeviceType + ", toDeviceType="
				+ toDeviceType + ", id=" + id + "]";
	}

	 

}
