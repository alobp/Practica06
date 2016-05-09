package edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="accesorio")
public class Accesorio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;// la referencia del nomre tiene que seer la misma al que tiene en la tabla
	
	@NotNull
	private String nombre;// la referencia del nomre tiene que seer la misma al que tiene en la tabla
	
	@ManyToOne// para crear la relacion de M:1
	@JoinColumn(name="vehiculo_id")// para crear la relacion de M:1
	private Vehiculo vehiculo;

	
	
	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
	
	
}
