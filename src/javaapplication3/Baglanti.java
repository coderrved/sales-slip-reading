/*
package javaapplication3;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication3.JavaApplication3.tessOpenCv;

public class Baglanti {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    
    public void urunleriEkle(ArrayList<String> arrayList){
        
        String sorgu = "Insert Into urun(isletmeadi,tarih,fisno,urunler,saat,kdv,toplam) VALUES(?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, arrayList.get(0));
            preparedStatement.setString(2, arrayList.get(1));
            preparedStatement.setString(3, arrayList.get(2));
            preparedStatement.setString(4, arrayList.get(3));
            preparedStatement.setString(5, arrayList.get(4));
            preparedStatement.setString(6, arrayList.get(5));
            preparedStatement.setString(7, arrayList.get(6));
            
            preparedStatement.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Urunler> urunleriGetir(){
        
        ArrayList<Urunler> cikti = new ArrayList<Urunler>();
        
        try {
            statement = (Statement) con.createStatement();
            
            String sorgu = "Select * From urun";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String isletmeAdi = rs.getString("isletmeadi");
                String tarih = rs.getString("tarih");
                String fisNo = rs.getString("fisno");
                String urunler = rs.getString("urunler");
                String saat = rs.getString("saat");
                String kdv = rs.getString("kdv");
                String toplam = rs.getString("toplam");
                
                cikti.add(new Urunler(id,isletmeAdi,tarih,fisNo,urunler,saat,kdv,toplam));
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("HATA");
            return null;
        }
        
    }
    
    
    public Baglanti(){
        
       
        
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + 
				"/" + Veritabani.dbAdi + "?useUnicode=true&characterEncoding=utf8";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");		
		}
		catch(ClassNotFoundException ex){
			System.out.println("Driver Bulunamadi..");
		}
		
		try{
			
			con=(Connection) DriverManager.getConnection(url, Veritabani.kullaniciAdi, Veritabani.parola);
			System.out.println("Baglanti gerceklesti..");
			
		}catch(SQLException ex){
			System.out.println("Baglanti Basarisiz..");
		}
        
    }
    
}
*/