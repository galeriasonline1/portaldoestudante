package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends Dao {

	public void insert(User t) {
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConexao();
			stat = conn.createStatement();
			stat.executeUpdate("INSERT INTO users" + " VALUES ('" + t.getLogin() + "', '" + t.getPassword() + "');");
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

	}

	public List<User> list() {
		List<User> list = new ArrayList<User>();
		Connection conn = null;
		Statement stat = null;
		try {
			conn = getConexao();
			stat = conn.createStatement();
			ResultSet rs = stat.executeQuery("SELECT * FROM users");
			while (rs.next()) {
				User test = new User();
				test.setLogin(rs.getString("login"));
				test.setPassword(rs.getString("password"));
				list.add(test);
			}
			stat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
