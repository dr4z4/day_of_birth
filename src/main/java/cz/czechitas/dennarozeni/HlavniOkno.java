package cz.czechitas.dennarozeni;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel labDatum;
    JTextField txtDen;
    JLabel labOddelovac1;
    JTextField txtMesic;
    JLabel labOddelovac2;
    JTextField txtRok;
    JButton btnPrepocitat;
    JLabel labDenNarozeni;
    JTextField txtDenNarozeni;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStiskuBtnPrepocitat(ActionEvent e) {
         //zbytečně složitě:
//        String denString = txtDen.getText();
//        int den = Integer.parseInt(denString);
//        String mesicString = txtMesic.getText();
//        int mesic = Integer.parseInt(mesicString);
//        String rokString = txtRok.getText();
//        int rok = Integer.parseInt(rokString);
        int den = Integer.parseInt(txtDen.getText());
        int mesic = Integer.parseInt(txtMesic.getText());
        int rok = Integer.parseInt(txtRok.getText());

        LocalDate datumNarozeni = LocalDate.of(rok, mesic, den);
        DayOfWeek denVTydnu = datumNarozeni.getDayOfWeek();
        DateTimeFormatter formatovac = DateTimeFormatter.ofPattern("EEEE");
        String nazevDne = formatovac.format(denVTydnu);

        txtDenNarozeni.setText(nazevDne);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        labDatum = new JLabel();
        txtDen = new JTextField();
        labOddelovac1 = new JLabel();
        txtMesic = new JTextField();
        labOddelovac2 = new JLabel();
        txtRok = new JTextField();
        btnPrepocitat = new JButton();
        labDenNarozeni = new JLabel();
        txtDenNarozeni = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DenNarozeniGUI");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[fill]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- labDatum ----
        labDatum.setText("Datum narozen\u00ed:");
        contentPane.add(labDatum, "cell 0 0");

        //---- txtDen ----
        txtDen.setColumns(2);
        contentPane.add(txtDen, "cell 1 0");

        //---- labOddelovac1 ----
        labOddelovac1.setText(".");
        contentPane.add(labOddelovac1, "cell 2 0");

        //---- txtMesic ----
        txtMesic.setColumns(2);
        contentPane.add(txtMesic, "cell 3 0");

        //---- labOddelovac2 ----
        labOddelovac2.setText(".");
        contentPane.add(labOddelovac2, "cell 4 0");

        //---- txtRok ----
        txtRok.setColumns(4);
        contentPane.add(txtRok, "cell 5 0");

        //---- btnPrepocitat ----
        btnPrepocitat.setText("P\u0159epo\u010d\u00edtat");
        btnPrepocitat.addActionListener(e -> priStiskuBtnPrepocitat(e));
        contentPane.add(btnPrepocitat, "cell 0 1 6 1,alignx center,growx 0");

        //---- labDenNarozeni ----
        labDenNarozeni.setText("Den, kdy jste se narodil(a):");
        contentPane.add(labDenNarozeni, "cell 0 2");

        //---- txtDenNarozeni ----
        txtDenNarozeni.setEditable(false);
        contentPane.add(txtDenNarozeni, "cell 1 2 5 1");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
