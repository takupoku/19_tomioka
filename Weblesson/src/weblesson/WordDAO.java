package weblesson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class WordDAO{
	Connection con = null;
	PreparedStatement st = null;
	ResultSet rs = null;

	static String URL = "jdbc:mysql://localhost/test_db?useUnicode=true&characterEncoding=utf8";
	static String USER = "root";
	static String PW = "";

	public int registWords(Word wd){
		int result = 0;
		try{
			// DB接続の記述
			// ここに日本語と英単語を登録する文
			String SQL = "INSERT INTO dictionary VALUES(?, ?)";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);

			st = con.prepareStatement(SQL);
			st.setString(1, wd.getEnglish());
			st.setString(2, wd.getJapanese());
			st.executeUpdate();
			result++;

		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if( st != null){
				try{
					st.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if( con != null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	//select 件数だけ
	public int registWords(Word wd){
		int result = 0;
		try{	
				String SQL = "INSERT INTO dictionary VALUES(?, ?)";
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(URL, USER, PW);

				//DB接続
				if( con != null){
					System.out.println("登録済み";)
				}else{
					System.out.println("DB接続失敗\r\n---");
					return res;
				}
			
			
	public List<Word> getWords(){
		List<Word> words = new ArrayList<>();
		try{
			String SQL = "SELECT english, japanese FROM dictionary";
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);

			st = con.prepareStatement(SQL);
			rs = st.executeQuery();

			while(rs.next()){
				Word wd = new Word(rs.getString("english"), rs.getString("japanese"));
				words.add(wd);
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(st != null){
				try{
					st.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
			if(con != null){
				try{
					con.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
		return words;
	}
}
