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
 * Nhacungcap generated by hbm2java
 */
@Entity
@Table(name = "NHACUNGCAP", schema = "dbo", catalog = "DOANPTUD")
public class Nhacungcap implements java.io.Serializable {

	private String id;
	private String ten;
	private String diachi;
	private String sdt;
	private String email;
	private Set<Linhkien> linhkiens = new HashSet<Linhkien>(0);

	public Nhacungcap() {
	}

	public Nhacungcap(String id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public Nhacungcap(String id, String ten, String diachi, String sdt, String email, Set<Linhkien> linhkiens) {
		this.id = id;
		this.ten = ten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.email = email;
		this.linhkiens = linhkiens;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "TEN", nullable = false)
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

	@Column(name = "SDT", length = 20)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "EMAIL")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhacungcap")
	public Set<Linhkien> getLinhkiens() {
		return this.linhkiens;
	}

	public void setLinhkiens(Set<Linhkien> linhkiens) {
		this.linhkiens = linhkiens;
	}

}
