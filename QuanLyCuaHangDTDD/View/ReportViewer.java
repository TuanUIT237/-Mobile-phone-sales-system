/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.JFrame;
import java.awt.Container;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import  ConnectDB_Notify.KetNoiDatabase;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author NGUYEN QUOC TRUNG
 */
public class ReportViewer extends JFrame{
    
    public ReportViewer(String fileName) throws SQLException
    {
        this(fileName,null);
    } 
    
    public ReportViewer(String fileName, HashMap parameter) throws SQLException
    {
        super("View report");
        try
        {
            JasperReport jsr=JasperCompileManager.compileReport(fileName);
            JasperPrint print = JasperFillManager.fillReport(jsr, parameter,KetNoiDatabase.getOracleConnection());
            JRViewer view = new JRViewer(print);
            Container c =  getContentPane();
            c.add(view);
        }catch(ClassNotFoundException | SQLException | JRException e)
        {
        }
        setBounds(10, 10, 1000, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
