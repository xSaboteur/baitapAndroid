package entitys;
// default package
// Generated Aug 9, 2019 8:28:56 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CtHoadon generated by hbm2java
 */
@Entity
@Table(name = "CT_HOADON", schema = "dbo", catalog = "DOANPTUD")
public class CtHoadon implements java.io.Serializable {

	private CtHoadonId id;
	private Hoadon hoadon;
	private Linhkien linhkien;
	private Double giamgia;

	public CtHoadon() {
	}

	public CtHoadon(CtHoadonId id, Hoadon hoadon, Linhkien linhkien) {
		this.id = id;
		this.hoadon = hoadon;
		this.linhkien = linhkien;
	}

	public CtHoadon(CtHoadonId id, Hoadon hoadon, Linhkien linhkien, Double giamgia) {
		this.id = id;
		this.hoadon = hoadon;
		this.linhkien = linhkien;
		this.giamgia = giamgia;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idhoadon", column = @Column(name = "IDHOADON", nullable = false)),
			@AttributeOverride(name = "idlinhkien", column = @Column(name = "IDLINHKIEN", nullable = false)) })
	public CtHoadonId getId() {
		return this.id;
	}

	public void setId(CtHoadonId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDHOADON", nullable = false, insertable = false, updatable = false)
	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDLINHKIEN", nullable = false, insertable = false, updatable = false)
	public Linhkien getLinhkien() {
		return this.linhkien;
	}

	public void setLinhkien(Linhkien linhkien) {
		this.linhkien = linhkien;
	}

	@Column(name = "GIAMGIA", precision = 53, scale = 0)
	public Double getGiamgia() {
		return this.giamgia;
	}

	public void setGiamgia(Double giamgia) {
		this.giamgia = giamgia;
	}

}
