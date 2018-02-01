package com.kaushik.spring.springProject.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Required;

public class AccountDaoImpl implements AccountDao {

	private DataSource dataSource;

	@Required
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(Account account) {
		// Declare resource
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			// Get connection
			con = dataSource.getConnection();

			// Prepare Query
			String query = "INSERT into account VALUES(?,?,?,?)";

			// Create JDBC statement
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, account.getAccno());
			pstmt.setString(2, account.getAccName());
			pstmt.setString(3, account.getAccType());
			pstmt.setDouble(4, account.getBal());

			// Execute Statement
			pstmt.execute();
		} catch (Exception e) { // Handle Exception
			e.printStackTrace();
		} finally { // Clean up resources to avoid memory leaks problems
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Account get(int accno) {
		// Declare Resources
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Account avo = null;

		try {
			// Get Connection
			con = dataSource.getConnection();

			// Prepare Query
			String query = "SELECT * FROM account where ACC_NO=" + accno;

			// Create Statement Object
			stmt = con.createStatement();

			// Execeute Query
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				avo = new Account();
				avo.setAccno(rs.getInt(1));
				avo.setAccName(rs.getString(2));
				avo.setAccType(rs.getString(3));
				avo.setBal(rs.getDouble(4));
			}
		} catch (Exception e) { // Handle Exception
			e.printStackTrace();
		} finally { // Clean up resources to avoid memory leaks
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return avo;
	}
	
	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int accno) {
		// TODO Auto-generated method stub

	}

}
