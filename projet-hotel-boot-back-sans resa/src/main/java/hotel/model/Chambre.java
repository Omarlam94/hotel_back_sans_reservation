package hotel.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
//TO-DO ajouté un booléen disponibilité -- date de résa ?

@Entity
@Table (name = "room")
public class Chambre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne (cascade = CascadeType.REMOVE)
	//@OneToOne(orphanRemoval = false, cascade = CascadeType.REFRESH)
	private Passager passager;
	
	@Enumerated(EnumType.STRING) //ça sert à quoi ?
	@Column(name="typeChambre",columnDefinition = "ENUM('chambresimple','suite','suitepresidentielle')")
	private TypeLogement type;
	

	
	public Chambre() {}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public TypeLogement getType() {
		return type;
	}



	public void setType(TypeLogement type) {
		this.type = type;
	}



	public Passager getPassager() {
		return passager;
	}



	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	
	


}
