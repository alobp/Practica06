package edu.uacm.dao;

import edu.uacm.domain.Vehiculo;

/*
 * 1.- creamos los paquetes dao
 * 2.- creamos la interface de la clase que necesitamos
 */

public interface VehiculoDao {
	
	Vehiculo obtenerVehiculoPorId(Integer id);

}
