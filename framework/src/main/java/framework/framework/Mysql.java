package framework.framework;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Mysql {
	public static void main(String[] args) {
		Object[][]data= readDataFromDataBase("select * from emp");
		for(int rowCount=0;rowCount<data.length;rowCount++) {
			for(int columnCount=0;columnCount<data.length;columnCount++) {
				
						if(data[rowCount][columnCount]!=null) {
							System.out.print(data[rowCount][columnCount]+"\t");
				}else {
					break;
				}
			}
			System.out.println("");
				
			}
}

		public static Object[][] readDataFromDataBase(String string) {
		
			Object [][] data = new Object[20][20];
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con;
				try {
					con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
					Statement state = (Statement) con.createStatement();
					ResultSet rs = state.executeQuery("select *from emp");
					int rowCount=0;
					while (rs.next()) {
						int Count = rs.getMetaData().getColumnCount();
						for(int ColumnCount=0;ColumnCount<Count;ColumnCount++) {
							data[rowCount][ColumnCount]=rs.getString(ColumnCount+1);
						}	
						rowCount++;
					}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
				} catch (ClassNotFoundException e) {
		
				}
				return data;
			}

		private static int Count() {
			// TODO Auto-generated method stub
			return 0;
		}
}
		
			


	
		
	
