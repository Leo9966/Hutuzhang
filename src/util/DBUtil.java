package util;
/**
 * ���ݿ⹤����
 * 1���ṩһ����ȡ���ݿ����ӵķ���
 * 2)�ر����ӵĲ�����DAO��ʵ��
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String driver = "com.mysql.jdbc.Driver";
//	private static final String url = "jdbc:mysql://127.0.0.1:3306/hutubill?useSSL=false&characterEncoding=utf-8";
	static String setSSL = "false";
	static String ip = "127.0.0.1";
	static int port = 3306;
	static String database = "hutubill";
	static String encoding = "UTF-8";
	static String loginName = "lcc";
	static String password = "lcc123456";
	
	/**
	 * �ھ�̬������м������� 
	 */
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}
	}
	
	
	/**
	 * ����һ������ �����Ӵ���ʧ���򷵻�һ����ֵ
	 * @return
	 */
	public static Connection getConnection(){
			try {
				String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&useSSL=%s", ip, port, database, encoding,setSSL);
				return DriverManager.getConnection(url, loginName, password);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
	}
	
	
	

}
