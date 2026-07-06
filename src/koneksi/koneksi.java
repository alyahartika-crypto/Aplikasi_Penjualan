/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

    private Connection conn;

    public Connection connect() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/aplikasi_penjualan";

            conn = DriverManager.getConnection(url, "root", "");

            System.out.println("Koneksi berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi gagal : " + e.getMessage());

        }

        return conn;
    }
}
