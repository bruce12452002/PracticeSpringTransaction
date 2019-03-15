package dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class XxxDaoImpl implements XxxDao {
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int update1() {
		return jt.update("INSERT INTO SALGRADE VALUES('6','5001','6000') ");
	}

	@Override
	public int update2() {
		return jt.update("INSERT INTO SALGRADE VALUES('6','5001','6000') ");

	}

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String USERNAME = "ooo";
	private static final String PASSWORD = "ooo";

	public static void main(String[] args) {
		String sql = "SELECT * FROM DEPT WHERE DEPTNO < ?";
		List<Map<String, Object>> rtn = getJT().queryForList(sql, 50);

		for (Map<String, Object> map : rtn) {
			System.out.println(map.get("DEPTNO"));
			System.out.println(map.get("DNAME"));
			System.out.println(map.get("LOC") + "\n");
		}
	}

	private static JdbcTemplate getJT() {
		DriverManagerDataSource ds = new DriverManagerDataSource(URL, USERNAME, PASSWORD);
		ds.setDriverClassName(DRIVER);
		return new JdbcTemplate(ds);
	}
}
