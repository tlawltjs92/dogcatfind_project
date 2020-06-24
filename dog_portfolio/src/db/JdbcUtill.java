package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtill {

	static Connection conn;

	public static Connection DB_Connection() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://db-46lnk.pub-cdb.ntruss.com:3306/dogfind_db?autoReconnect=true&serverTimezone=UTC","dogfind_dba","kevin1141@");
		return conn;
	}

	public static void Close_DB(Connection conn) throws SQLException {
		conn.close();
	}

}
