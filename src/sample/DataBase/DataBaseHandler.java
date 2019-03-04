package sample.DataBase;

import javafx.scene.control.Label;
import sun.awt.SunHints;

import javax.swing.*;
import java.sql.*;
import java.util.TimeZone;

import static sample.DataBase.Configs.*;

public class DataBaseHandler {
    ResultSet rs;
    Connection dbConnection;
    private JEditorPane namePizza1;
    private JEditorPane namePizza2;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        //String connectionString = "jdbc:mysql://localhost/databasepizza=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=" + TimeZone.getDefault().getID();
       // Class.forName("com.mysql.cj.jdbc.Driver");
        //dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }

public  void extractGoods(String  idGoods, String  NamePizza,String  PricePizza,
                          String  DiametePizza,String NameDrink,String PriceDrink){

        String  insert = "Select *from GOODS_TABLE (Const.GOODS_ID,Const.GOODS_NamePizza,Const.GOODS_PricePizza,Const.GOODS_DiametePizza , Const.GOODS_NameDrink,Const.GOODS_PriceDrink ) VALUES(?,?,?,?,?,?)";
        // String  insert = "SELECT *FROM  GOODS_TABLE WHERE GOODS_ID = ?";


    try {
//
        PreparedStatement prSt = getDbConnection().prepareStatement(insert);

        prSt.setString(1, namePizza1.getText());
        //prSt.setString(2, namePizza2.getText());
        //rs = prSt.executeQuery();

       /// String add1 = rs.getString("NamePizza");
       // namePizza1.setText(add1);
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        }


   }
}


