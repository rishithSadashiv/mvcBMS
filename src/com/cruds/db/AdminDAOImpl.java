package com.cruds.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AdminDAOImpl implements AdminDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addBook()
	{
		
		return false;
	}
}
