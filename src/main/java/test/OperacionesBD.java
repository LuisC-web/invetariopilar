package test;
import beans.Perfume;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD{
    public static void main(String[] args) {
    actualizarPerfume(1,"Floral");
    listarPerfume();  
  
  }
    
  public static void actualizarPerfume(int id,String fragancia){
  DBConnection con=new DBConnection();
  String sql="UPDATE perfume SET fragancia='"+fragancia+"'WHERE id="+id;
      try {
        Statement st=con.getConnection().createStatement();
        st.executeUpdate(sql);
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
      finally{
         con.desconectar();
      }
  }
public static void listarPerfume(){
    DBConnection con=new DBConnection();
    String sql="SELECT*FROM perfume";
    try {
        Statement st=con.getConnection().createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
          int id=rs.getInt("id");
          String nombre_perfume= rs.getString("nombre_perfume");
          String fragancia= rs.getString("fragancia");
          String marca= rs.getString("marca");
          String genero= rs.getString("genero");
          int cantidad= rs.getInt("cantidad");
        
          Perfume perfumes= new Perfume(id, nombre_perfume, fragancia, marca, genero, cantidad);
          System.out.println(perfumes.toString());
        }
      } catch (Exception ex) {
         System.out.println(ex.getMessage());
      }
      finally{
         con.desconectar();
      }
  }

}

