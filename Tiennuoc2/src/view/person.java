package view;

public class person {
	private String makh;
	private String hovaten;
	private String sdt;
	private String diachi;
	private String gioitinh;
	
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getHovaten() {
		return hovaten;
	}
	public void setHovaten(String hovaten) {
		this.hovaten = hovaten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public person() {
		super();
	}
	public person(String makh, String hovaten, String sdt, String diachi, String gioitinh) {
		super();
		this.makh = makh;
		this.hovaten = hovaten;
		this.sdt = sdt;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
	}
	
	

}
