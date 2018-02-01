package com.kaushik.spring.springProject.springJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired(required=true)
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(final Employee e) {
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				String query = "INSERT INTO employee VALUES(?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setInt(1, e.getEno());
				pstmt.setString(2, e.getEname());
				pstmt.setString(3, e.getDesig());
				pstmt.setDouble(4, e.getSal());
				
				return pstmt;
			}
		});
		
		//or
		/*String query = "INSERT INTO employee VALUES(?,?,?,?)";
		Object[] data = {e.getEno(),e.getEname(),e.getDesig(),e.getSal()};
		jdbcTemplate.update(query,data);*/
	}
	
	@Override
	public Employee get(int eno) {
		
		String query = "SELECT * FROM EMPLOYEE WHERE ENO=?";
		//Employee emp = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(),eno);
		return null;
	}

	@Override
	public void update(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int eno) {
		// TODO Auto-generated method stub
		
	}
}
