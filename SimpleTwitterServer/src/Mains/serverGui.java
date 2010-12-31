package Mains;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;

import server.hibernate___foundation.EUtente;
import server.hibernate___foundation.EUtenteCriteria;

//VS4E -- DO NOT REMOVE THIS LINE!
public class serverGui extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JTextPane jTextPane0;
	private JScrollPane jScrollPane0;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JTabbedPane jTabbedPane0;
	private JTable jTable0;
	private JScrollPane jScrollPane1;
	private JTable jTable1;
	private JScrollPane jScrollPane2;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	private static serverGui instance=null;
	private static ArrayList<EUtente> utenti =null;
	
	private serverGui() {
		initComponents();
	}
	
	public static serverGui getInstance()
	{
		if(serverGui.instance==null)
		{
			serverGui.instance=new serverGui();
		}
		return serverGui.instance;
	}
	public static ArrayList<EUtente> getUtenti()
	{
		return serverGui.utenti;
	}
	
	public void fillUtenti()
	{
		try
		{
			EUtenteCriteria eUtenteCriteria = new EUtenteCriteria();
			serverGui.utenti=new ArrayList<EUtente>(eUtenteCriteria.list());
			this.fillTable();
		}catch(PersistentException ex)
		{
			ex.printStackTrace();
		}
	}
	public void fillTable()
	{
		DefaultTableModel model = (DefaultTableModel)this.jTable0.getModel();
		int rows=model.getRowCount();
		for(int i=0; i< rows; i++)
		{
			model.removeRow(0);
		}
		Object[] rowData;
		for(int i=0; i<serverGui.utenti.size(); i++)
		{
			rowData = new Object[3];
			rowData[0]=(Object) serverGui.utenti.get(i).getId();
			rowData[1]=(Object) serverGui.utenti.get(i).getUsername();
			if(serverGui.utenti.get(i).getConnected())
			{
				rowData[2]=(Object)"On-Line";
			}
			else
			{
				rowData[2]=(Object)"Off-Line";
			}
			model.insertRow(0, rowData);
		}
	}
	
	private void initComponents() {
		setBackground(new Color(64, 0, 64));
		setAlwaysOnTop(true);
		setLayout(new FlowLayout());
		add(getJPanel0());
		add(getJScrollPane0());
		setSize(1024, 768);
	}

	private JScrollPane getJScrollPane2() {
		if (jScrollPane2 == null) {
			jScrollPane2 = new JScrollPane();
			jScrollPane2.setViewportView(getJTable1());
		}
		return jScrollPane2;
	}

	private JTable getJTable1() {
		if (jTable1 == null) {
			jTable1 = new JTable();
			jTable1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Contenuto","Autore","Data"}) {
				private static final long serialVersionUID = 1L;
				Class<?>[] types = new Class<?>[] { Object.class, Object.class, };
	
				public Class<?> getColumnClass(int columnIndex) {
					return types[columnIndex];
				}
			});
		}
		return jTable1;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTable0());
		}
		return jScrollPane1;
	}

	private JTable getJTable0() {
		if (jTable0 == null) {
			jTable0 = new JTable();
			jTable0.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Id", "Username","Connected" }) {
				private static final long serialVersionUID = 1L;
				Class<?>[] types = new Class<?>[] { Object.class, Object.class,Object.class };
	
				public Class<?> getColumnClass(int columnIndex) {
					return types[columnIndex];
				}
			});
		}
		return jTable0;
	}

	private JTabbedPane getJTabbedPane0() {
		if (jTabbedPane0 == null) {
			jTabbedPane0 = new JTabbedPane();
			jTabbedPane0.setBackground(new Color(214, 217, 223));
			jTabbedPane0.addTab("Lista Utenti", getJPanel1());
			jTabbedPane0.addTab("Note Utenti", getJPanel2());
		}
		return jTabbedPane0;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, null, Color.gray));
			jPanel2.setLayout(new BorderLayout());
			jPanel2.add(getJScrollPane2(), BorderLayout.CENTER);
		}
		return jPanel2;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, null, Color.gray));
			jPanel1.setLayout(new BorderLayout());
			jPanel1.add(getJScrollPane1(), BorderLayout.CENTER);
		}
		return jPanel1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setPreferredSize(new Dimension(1020, 260));
			jScrollPane0.setViewportView(getJTextPane0());
		}
		return jScrollPane0;
	}

	public JTextPane getJTextPane0() {
		if (jTextPane0 == null) {
			jTextPane0 = new JTextPane();
			jTextPane0.setPreferredSize(new Dimension(300, 20));
		}
		return jTextPane0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBackground(new Color(214, 217, 223));
			jPanel0.setMinimumSize(new Dimension(100, 100));
			jPanel0.setPreferredSize(new Dimension(1020, 500));
			jPanel0.setLayout(new BorderLayout());
			jPanel0.add(getJTabbedPane0(), BorderLayout.CENTER);
		}
		return jPanel0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				serverGui frame = serverGui.getInstance();
				frame.setDefaultCloseOperation(serverGui.EXIT_ON_CLOSE);
				frame.setTitle("SimpleTwitterClient-Server");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.fillUtenti();
			}
		});
	}

}
