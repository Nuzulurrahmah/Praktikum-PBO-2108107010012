import javax.swing.*;

  /**
   *
   * @author Nuzulurrahmah (2108107010012)
   * @version 19.11.2022
   */


public class LembarPenilaian {

    /**
     * @param 
     */
    public static void main(String[] args) {
        JPanel panel=new JPanel();
        JFrame frame=new JFrame("Lembar Penilaian");
        frame.setSize(320,380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel lblnim=new JLabel("NIM");
        lblnim.setBounds(12,10,70,20);
        panel.add(lblnim);
        JButton btnCari=new JButton("Cari");
        btnCari.setBounds(180,10,80,20);
        panel.add(btnCari);
        JLabel lblNama=new JLabel("Nama");
        lblNama.setBounds(12,30,70,20);
        panel.add(lblNama);
        JLabel lblKelas=new JLabel("Kelas");
        lblKelas.setBounds(12,50,100,20);
        panel.add(lblKelas);
        JRadioButton kelasA=new JRadioButton("A");
        kelasA.setBounds(75,50,50,20);
        panel.add(kelasA);
        JRadioButton kelasB=new JRadioButton("B");
        kelasB.setBounds(125,50,50,20);
        panel.add(kelasB);
        JRadioButton kelasC=new JRadioButton("C");
        kelasC.setBounds(175,50,50,20);
        panel.add(kelasC);
        JLabel lblKelompok=new JLabel("Kelompok");
        lblKelompok.setBounds(12,70,100,20);
        panel.add(lblKelompok);
        String[] kelompok={"1","2","3"};
        JComboBox cbKelompok=new JComboBox(kelompok);
        cbKelompok.setBounds(75,70,100,20);
        panel.add(cbKelompok);
        
        JLabel lblNilai=new JLabel("Nilai");
        lblNilai.setBounds(12,120,70,20);
        panel.add(lblNilai);
        
        JLabel lblTugas1=new JLabel("Tugas1");
        lblTugas1.setBounds(12,140,70,20);
        panel.add(lblTugas1);
        
        JLabel lblTugas2=new JLabel("Tugas2");
        lblTugas2.setBounds(12,160,70,20);
        panel.add(lblTugas2);
        
        JLabel lblTugas3=new JLabel("Tugas3");
        lblTugas3.setBounds(12,180,70,20);
        panel.add(lblTugas3);
        
        JLabel lblTugas4=new JLabel("Tugas4");
        lblTugas4.setBounds(12,200,70,20);
        panel.add(lblTugas4);
        
        JLabel lblTugas5=new JLabel("Tugas5");
        lblTugas5.setBounds(12,220,70,20);
        panel.add(lblTugas5);
        JButton btnSave=new JButton("Save");
        btnSave.setBounds(180,220,80,20);
        panel.add(btnSave);
        
        
        JLabel lblUts=new JLabel("UTS");
        lblUts.setBounds(12,240,70,20);
        panel.add(lblUts);
        JButton btnUpdate=new JButton("Update");
        btnUpdate.setBounds(180,240,80,20);
        panel.add(btnUpdate);
        
        JLabel lblUas=new JLabel("UAS");
        lblUas.setBounds(12,260,70,20);
        panel.add(lblUas);
        JButton btnExit=new JButton("Exit");
        btnExit.setBounds(180,260,80,20);
        panel.add(btnExit);
        
        JTextField txtnim=new JTextField(20);
        txtnim.setBounds(75,10,100,20);
        panel.add(txtnim);
        JTextField txtNama=new JTextField(20);
        txtNama.setBounds(75,30,185,20);
        panel.add(txtNama);
        JTextField txtTugas1=new JTextField(20);
        txtTugas1.setBounds(75,140,100,20);
        txtTugas1.setText("0");
        panel.add(txtTugas1);
        JTextField txtTugas2=new JTextField(20);
        txtTugas1.setBounds(75,160,100,20);
        txtTugas2.setText("0");
        panel.add(txtTugas2);
        JTextField txtTugas3=new JTextField(20);
        txtTugas3.setBounds(75,180,100,20);
        txtTugas3.setText("0");
        panel.add(txtTugas3);
        JTextField txtTugas4=new JTextField(20);
        txtTugas4.setBounds(75,200,100,20);
        txtTugas4.setText("0");
        panel.add(txtTugas4);
        JTextField txtTugas5=new JTextField(20);
        txtTugas5.setBounds(75,220,100,20);
        txtTugas5.setText("0");
        panel.add(txtTugas5);
        JTextField txtUts=new JTextField(20);
        txtUts.setBounds(75,240,100,20);
        txtUts.setText("0");
        panel.add(txtUts);
        JTextField txtUas=new JTextField(20);
        txtUas.setBounds(75,260,100,20);
        txtUas.setText("0");
        panel.add(txtUas);
        
        
        frame.setVisible(true);

    }
    
}
