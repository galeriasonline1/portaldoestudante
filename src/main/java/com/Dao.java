package com;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class Dao {

	public Connection getConexao() {

		Connection connection = null;
		String username = "gxyoqcgjbejumo";
		String password = "be0b1f0c5a5dfe66bdab28843c517eb255d3d20ae6623f48e5b7273d6483569f";
		String database = "de6b1fjrq12eq2";
		String add = "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
					"jdbc:postgresql://ec2-23-21-220-23.compute-1.amazonaws.com:5432/" + database + add, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;
	}

}
