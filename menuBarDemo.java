import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class menuBarDemo extends JFrame implements ActionListener{
    JLabel lblfno=new JLabel("FIRST NUMBER");
    JLabel lblsno=new JLabel("SECOND NUMBER");
    JLabel lblresult=new JLabel("RESULT");

    
    JTextField txtfno=new JTextField();
    JTextField txtsno=new JTextField();
    JTextField txtresult=new JTextField();

    JMenuBar mbr=new JMenuBar();
    JMenu mnu=new JMenu("CAL");

    JMenuItem item1=new JMenuItem("ADD" );
    JMenuItem item2=new JMenuItem("SUB" );

    Double n1,n2,res;

    menuBarDemo(){
        //designing frames
        super("CALCULATOR");
        ImageIcon icon=new ImageIcon("C://Users/hp/Downloads/calcuation.png");
        setIconImage(icon.getImage());
        setLayout(null);
        setBackground(Color.lightGray);
        setResizable(false);
        setSize(600, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setJMenuBar(mbr);
        mbr.add(mnu);

        mnu.add(item1);
        mnu.add(item2);

        lblfno.setBounds(100, 200, 100, 20);
        lblsno.setBounds(100, 250, 150, 20);
        lblresult.setBounds(100, 300, 100, 20);

        txtfno.setBounds(300, 200, 100, 20);
        txtsno.setBounds(300, 250, 100, 20);
        txtresult.setBounds(300, 300, 100, 20);

        txtresult.setEditable(false);
        txtresult.setBackground(Color.green);

        add(lblfno);
        add(lblsno);
        add(lblresult);
        add(txtfno);
        add(txtsno);
        add(txtresult);


        item1.addActionListener(this);
        item2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e) throws NumberFormatException
    {
       try{
        n1=Double.parseDouble(txtfno.getText());
        n2=Double.parseDouble(txtsno.getText());
       
        
        
            if(e.getSource() == item1)
            {
               
                res=n1+n2;
                txtresult.requestFocus();
                txtresult.setText(String.valueOf(res));

             }
             if(e.getSource() == item2)
            {
                
                res=n1-n2;
                txtresult.requestFocus();
                txtresult.setText(String.valueOf(res));
             }
            
        }
        catch(NumberFormatException ex)
        {
           JOptionPane.showMessageDialog(this, "Enter Numbers Only", "Error", JOptionPane.ERROR_MESSAGE);
           txtfno.setText("");
           txtsno.setText("");
           txtresult.setText("");
        }
        catch (Exception ex)
        {
           JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           txtfno.setText("");
           txtsno.setText("");
           txtresult.setText("");  
        }
    }
    public static void main(String[] args)
    {
        menuBarDemo mn=new menuBarDemo();
        mn.setVisible(true);
    }
}

