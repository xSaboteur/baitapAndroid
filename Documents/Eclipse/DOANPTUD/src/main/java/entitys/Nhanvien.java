package entitys;
// default package
// Generated Aug 9, 2019 8:28:56 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name = "NHANVIEN", schema = "dbo", catalog = "DOANPTUD")
public class Nhanvien implements java.io.Serializable {

	private String id;
	private String ten;
	private String diachi;
	private String sdt;
	private Set<Donhang> donhangs = new HashSet<Donhang>(0);
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);

	public Nhanvien() {
	}

	public Nhanvien(String id) {
		this.id = id;
	}

	public Nhanvien(String id, String ten, String diachi, String sdt, Set<Donhang> donhangs, Set<Hoadon> hoadons) {
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.donhangs = donhangs;
		this.hoadons = hoadons;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TEN")
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Column(name = "DIACHI")
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Column(name = "SDT")
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Donhang> getDonhangs() {
		return this.donhangs;
	}

	public void setDonhangs(Set<Donhang> donhangs) {
		this.donhangs = donhangs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

}
