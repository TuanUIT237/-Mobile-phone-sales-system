/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import ConnectDB_Notify.KiemTraDuLieu;
import ConnectDB_Notify.ThongBao;
import Model.KhuyenMai;
import Process.prKhuyenMai;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class QuanLyKhuyenMai extends javax.swing.JPanel {
    private GiaoDienChinh parentForm;
    private DefaultTableModel tblModel;
    /**
     * Creates new form QuanLyKhuyenMai
     */
    public QuanLyKhuyenMai() {
        initComponents();
        
        initTable();
        
        loadDataToTable();
    }
    
    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã khuyến mãi","Tên chương trình","Ngày bắt đầu","Ngày kết thúc","Phần trăm khuyến mãi"});
        tableKM.setModel(tblModel);
    }
    
    private void loadDataToTable(){
        try{
            prKhuyenMai kt1 = new prKhuyenMai();

            List<KhuyenMai> list1 = kt1.FindAll();
            tblModel.setRowCount(0);
            for(KhuyenMai it :list1){
                tblModel.addRow(new Object[]{
                it.getMaKM(), it.getTenKM(),it.getNgayBD(),it.getNgayKT(),it.getPhantramKM()
                });
            }
            tblModel.fireTableDataChanged();
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    private String getmaKM(){
        int count =0;
        prKhuyenMai kt = new prKhuyenMai();
        try {
            count = kt.somaKM();
        } catch (Exception ex) {
            Logger.getLogger(QuanLyBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(count<9){
            return "KM00" +(count+1);
        }else if(count>=9 && count<99){
            return "KM" +0 +(count+1);
        }else
            return "KM" +(count+1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmaKM = new javax.swing.JTextField();
        txttenCT = new javax.swing.JTextField();
        txtphantramKM = new javax.swing.JTextField();
        btnthemKM = new javax.swing.JButton();
        btnxoaKM = new javax.swing.JButton();
        btncapnhatKM = new javax.swing.JButton();
        btnluuKM = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtmaKM1 = new javax.swing.JTextField();
        btntracuuKM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKM = new javax.swing.JTable();
        dateBD = new com.toedter.calendar.JDateChooser();
        dateKT = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lý Khuyến Mãi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN KHUYẾN MÃI");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã khuyến mãi:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên chương trình:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bắt đầu:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Kết thúc:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Phần trăm KM:");

        txtmaKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtmaKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaKMActionPerformed(evt);
            }
        });

        txttenCT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtphantramKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnthemKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnthemKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/add.png"))); // NOI18N
        btnthemKM.setText("Thêm mới");
        btnthemKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemKMActionPerformed(evt);
            }
        });

        btnxoaKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnxoaKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/delete.png"))); // NOI18N
        btnxoaKM.setText("Xóa");
        btnxoaKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaKMActionPerformed(evt);
            }
        });

        btncapnhatKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btncapnhatKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/update.png"))); // NOI18N
        btncapnhatKM.setText("Cập nhật");
        btncapnhatKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatKMActionPerformed(evt);
            }
        });

        btnluuKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnluuKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/save.png"))); // NOI18N
        btnluuKM.setText("Lưu");
        btnluuKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuKMActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã KM:");

        txtmaKM1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btntracuuKM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btntracuuKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/search.png"))); // NOI18N
        btntracuuKM.setText("Tra cứu");
        btntracuuKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntracuuKMActionPerformed(evt);
            }
        });

        tableKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKM);

        dateBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        dateKT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttenCT, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(txtphantramKM)
                                    .addComponent(dateBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btncapnhatKM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnthemKM))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnluuKM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnxoaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtmaKM1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntracuuKM, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntracuuKM)
                        .addComponent(txtmaKM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttenCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtphantramKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(dateKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthemKM)
                            .addComponent(btnluuKM))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncapnhatKM)
                            .addComponent(btnxoaKM)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtmaKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaKMActionPerformed
       
    }//GEN-LAST:event_txtmaKMActionPerformed

    private void btnthemKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemKMActionPerformed
        txtmaKM.setText(getmaKM());
        txttenCT.setText("");
        txtphantramKM.setText("0");
        dateBD.setDate(null);
        dateKT.setDate(null);
        loadDataToTable();
    }//GEN-LAST:event_btnthemKMActionPerformed

    private void btnxoaKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaKMActionPerformed
        StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtmaKM, sb, "Mã khuyến mãi trống!!");
        if(sb.length()>0){
            ThongBao.showLoi(parentForm, sb.toString(), "Lỗi!!");
            return;
        }
        if(ThongBao.showXacNhan(parentForm, "Bạn có muốn xóa mã khuyến mãi này không?", "Hỏi")== JOptionPane.NO_OPTION){
            return;
        }
        try{
            prKhuyenMai kt = new prKhuyenMai();
            if(kt.delete(txtmaKM.getText())){
                ThongBao.showThongBao(parentForm, "Khuyến mãi đã được xóa", "Thông báo");
                btnthemKMActionPerformed(evt);
                loadDataToTable();
            }else{
                ThongBao.showXacNhan(parentForm, "Lỗi!! Không thể xóa.", "Cảnh báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnxoaKMActionPerformed

    private void btncapnhatKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatKMActionPerformed
       StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtmaKM, sb, "Mã khuyến mãi trống!!");
        int countResult=0;
        String maKMText = txtmaKM.getText();
        String tenCTText = txttenCT.getText();
        double phantramKMText = Double.parseDouble(txtphantramKM.getText());
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yy");
        String NgayBDdate =DateFormat.format(dateBD.getDate());
        String NgayKTdate = DateFormat.format(dateKT.getDate());
        prKhuyenMai kt = new prKhuyenMai();
        countResult= kt.update(maKMText,tenCTText,NgayBDdate,NgayKTdate,phantramKMText);
    
        if(countResult == 0){
             JOptionPane.showMessageDialog(this,"Cập nhật không thành công!", "Lỗi cập nhật CSDL",JOptionPane.ERROR_MESSAGE);
        }else if(countResult==1){
            JOptionPane.showMessageDialog(this,"Cập nhật thành thành công!");
            loadDataToTable();
        }
    }//GEN-LAST:event_btncapnhatKMActionPerformed

    private void btnluuKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuKMActionPerformed
        StringBuilder sb =new StringBuilder();
        KiemTraDuLieu.DuLieuTrong(txtmaKM, sb, "Mã khuyến mãi trống!!");
        int countResult=0;
        String maKMText = txtmaKM.getText();
        String tenCTText = txttenCT.getText();
        Double phantramKMText = Double.parseDouble(txtphantramKM.getText());
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MMM-yy");
        String NgayBDdate =DateFormat.format(dateBD.getDate());
        String NgayKTdate =DateFormat.format(dateKT.getDate());
        prKhuyenMai kt = new prKhuyenMai();
        countResult= kt.insert(maKMText, tenCTText, NgayBDdate, NgayKTdate,phantramKMText);
    
        if(countResult == 0){
             JOptionPane.showMessageDialog(this,"Lưu không thành công!", "Lỗi thêm CSDL",JOptionPane.ERROR_MESSAGE);
        }else if(countResult==1&& Double.parseDouble(txtphantramKM.getText())>=0){
            JOptionPane.showMessageDialog(this,"Lưu thành thành công!");
            loadDataToTable();
        }
    }//GEN-LAST:event_btnluuKMActionPerformed

    private void btntracuuKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntracuuKMActionPerformed
       try{
            prKhuyenMai kt =new prKhuyenMai();
            KhuyenMai km = kt.FindByID(txtmaKM1.getText());
            
            if(km != null){
                txtmaKM.setText(km.getMaKM());
                txttenCT.setText(km.getTenKM());
                dateBD.setDate(km.getNgayBD());
                dateKT.setDate(km.getNgayKT());
                txtphantramKM.setText(String.format("%.2f", km.getPhantramKM()));
            }else{
                ThongBao.showThongBao(parentForm, "Không tìm thấy thông tin khuyến mãi theo yêu cầu", "Thông báo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btntracuuKMActionPerformed

    private void tableKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKMMouseClicked
       try{
            int row = tableKM.getSelectedRow();
            
            if(row>=0){
                String id = (String) tableKM.getValueAt(row, 0);
                prKhuyenMai kt = new prKhuyenMai();
                KhuyenMai km = kt.FindByID(id);
                
                if(km != null){
                    txtmaKM.setText(km.getMaKM());
                    txttenCT.setText(km.getTenKM());
                    dateBD.setDate(km.getNgayBD());
                    dateKT.setDate(km.getNgayKT());
                    txtphantramKM.setText(String.format("%.2f", km.getPhantramKM()));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            ThongBao.showLoi(parentForm, e.getMessage(), "Lỗi");
        }                      
    }//GEN-LAST:event_tableKMMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhatKM;
    private javax.swing.JButton btnluuKM;
    private javax.swing.JButton btnthemKM;
    private javax.swing.JButton btntracuuKM;
    private javax.swing.JButton btnxoaKM;
    private com.toedter.calendar.JDateChooser dateBD;
    private com.toedter.calendar.JDateChooser dateKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableKM;
    private javax.swing.JTextField txtmaKM;
    private javax.swing.JTextField txtmaKM1;
    private javax.swing.JTextField txtphantramKM;
    private javax.swing.JTextField txttenCT;
    // End of variables declaration//GEN-END:variables
}