package sample.DataBase;

import sun.awt.SunHints;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString,dbUser,dbPass);
        return dbConnection;
    }

public  void extractGoods(String  idGoods, String  NamePizza,String  PricePizza,
                          String  DiametePizza,String NameDrink,String PriceDrink){

        String  insert = "SELECT id FROM " + Const.GOODS_TABLE + "(" + Const.GOODS_ID + "," + Const.GOODS_NamePizza
                + ","  + Const.GOODS_PricePizza + "," + Const.GOODS_DiametePizza + "," + Const.GOODS_NameDrink
                + "" + Const.GOODS_PriceDrink +")" + "VALUES(?,?,?,?,?,?)";


    try {

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);

        prSt.setString(1,idGoods);
        prSt.setString(2,NamePizza);
        prSt.setString(3,PricePizza);
        prSt.setString(4,DiametePizza);
        prSt.setString(5,NameDrink);
        prSt.setString(6,PriceDrink);
        prSt.executeUpdate();
    } catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
        }
   }
}


