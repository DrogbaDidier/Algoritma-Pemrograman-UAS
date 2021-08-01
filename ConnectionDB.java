import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
private static Connection mysqlkonek;

    public static void main(String[] args) throws SQLException {
        koneksiDB();
    }
    public static Connection koneksiDB() throws SQLException {
        if(mysqlkonek == null){
            try{
                String DB = "JDBC:MYSQL://localhost:3306/badabes";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlkonek=(Connection)DriverManager.getConnection(DB,user,pass);
//                JOptionPane.showMessageDialog(null,"koneksi berhasil");
                
            }catch (Exception e){
            JOptionPane.showMessageDialog(null,"gagal koneksi");
            }
        }
        return mysqlkonek;
    }
}
