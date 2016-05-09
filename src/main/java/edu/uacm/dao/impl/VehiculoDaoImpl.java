package edu.uacm.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.uacm.dao.VehiculoDao;
import edu.uacm.domain.Vehiculo;

@Repository
public class VehiculoDaoImpl implements VehiculoDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Vehiculo obtenerVehiculoPorId(Integer id){
		String query="SELECT id, modelo FROM vehiculo WHERE id="+id;
		
		try{
			
			return jdbcTemplate.queryForObject(query, new RowMapper<Vehiculo>(){
				
				@Override
				public Vehiculo mapRow(ResultSet rs, int rowNum) throws SQLException {
					Vehiculo vehiculo = new Vehiculo();
					vehiculo.setId(rs.getLong(1));
					vehiculo.setModelo(rs.getString(2));
					return vehiculo;
				}
				
			});
			
		}catch(EmptyResultDataAccessException dateException){
			return null;
		}
	}
	
	

}
