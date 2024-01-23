package model;

import java.util.Objects;

public class Khachhang {
	private int makh;
	private String hovaten;
	private String sdt;
	private String diachi;
	private String gioitinh;
	public Khachhang() {
		super();
	}
	public Khachhang(int makh, String hovaten, String sdt, String diachi, String gioitinh) {
		super();
		this.makh = makh;
		this.hovaten = hovaten;
		this.sdt = sdt;
		this.diachi = diachi;
		this.gioitinh = gioitinh;
	}
	public int getMakh() {
		return makh;
	}
	public void setMakh(int makh) {
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
	@Override
	public String toString() {
		return "Khachhang [makh=" + makh + ", hovaten=" + hovaten + ", sdt=" + sdt + ", diachi=" + diachi
				+ ", gioitinh=" + gioitinh + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(diachi, gioitinh, hovaten, makh, sdt);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Khachhang other = (Khachhang) obj;
		return Objects.equals(diachi, other.diachi) && Objects.equals(gioitinh, other.gioitinh)
				&& Objects.equals(hovaten, other.hovaten) && makh == other.makh && Objects.equals(sdt, other.sdt);
	}
	
	
	

}
