package video_poker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JToggleButton;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.ListSelectionModel;

public class GUImain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -665167978436879563L;
	private JPanel contentPane;
	private JPanel centralPanel;
	private JLabel lblCard1;
	private JLabel lblCard2;
	private JLabel lblCard3;
	private JLabel lblCard4;
	private JLabel lblCard5;
	private JPanel panel_1;
	private JTable table;
	private JToggleButton btnNewButton;
	private JToggleButton btnNewButton_1;
	private JToggleButton btnNewButton_2;
	private JToggleButton btnNewButton_3;
	private JToggleButton btnNewButton_4;
	private JPanel panel;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUImain frame = new GUImain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUImain() {
		setTitle("Video Poker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1258, 848);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getCentralPanel(), BorderLayout.CENTER);
		contentPane.add(getPanel_1(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
	}

	private JPanel getCentralPanel() {
		if (centralPanel == null) {
			centralPanel = new JPanel();
			centralPanel.setPreferredSize(new Dimension(200, 0));
			centralPanel.setSize(new Dimension(220, 350));
			GridBagLayout gbl_centralPanel = new GridBagLayout();
			gbl_centralPanel.columnWidths = new int[]{241, 241, 241, 241, 241, 0};
			gbl_centralPanel.rowHeights = new int[]{409, 82, 0};
			gbl_centralPanel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
			gbl_centralPanel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			centralPanel.setLayout(gbl_centralPanel);
			GridBagConstraints gbc_lblCard1 = new GridBagConstraints();
			gbc_lblCard1.fill = GridBagConstraints.VERTICAL;
			gbc_lblCard1.insets = new Insets(0, 0, 5, 5);
			gbc_lblCard1.gridx = 0;
			gbc_lblCard1.gridy = 0;
			centralPanel.add(getLblCard1(), gbc_lblCard1);
			GridBagConstraints gbc_lblCard2 = new GridBagConstraints();
			gbc_lblCard2.fill = GridBagConstraints.VERTICAL;
			gbc_lblCard2.insets = new Insets(0, 0, 5, 5);
			gbc_lblCard2.gridx = 1;
			gbc_lblCard2.gridy = 0;
			centralPanel.add(getLblCard2(), gbc_lblCard2);
			GridBagConstraints gbc_lblCard3 = new GridBagConstraints();
			gbc_lblCard3.fill = GridBagConstraints.VERTICAL;
			gbc_lblCard3.insets = new Insets(0, 0, 5, 5);
			gbc_lblCard3.gridx = 2;
			gbc_lblCard3.gridy = 0;
			centralPanel.add(getLblCard3(), gbc_lblCard3);
			GridBagConstraints gbc_lblCard4 = new GridBagConstraints();
			gbc_lblCard4.fill = GridBagConstraints.VERTICAL;
			gbc_lblCard4.insets = new Insets(0, 0, 5, 5);
			gbc_lblCard4.gridx = 3;
			gbc_lblCard4.gridy = 0;
			centralPanel.add(getLblCard4(), gbc_lblCard4);
			GridBagConstraints gbc_lblCard5 = new GridBagConstraints();
			gbc_lblCard5.fill = GridBagConstraints.VERTICAL;
			gbc_lblCard5.insets = new Insets(0, 0, 5, 0);
			gbc_lblCard5.gridx = 4;
			gbc_lblCard5.gridy = 0;
			centralPanel.add(getLblCard5(), gbc_lblCard5);
			GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
			gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton.gridx = 0;
			gbc_btnNewButton.gridy = 1;
			centralPanel.add(getBtnNewButton(), gbc_btnNewButton);
			GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
			gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_2.gridx = 1;
			gbc_btnNewButton_2.gridy = 1;
			centralPanel.add(getBtnNewButton_2(), gbc_btnNewButton_2);
			GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
			gbc_btnNewButton_1.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_1.gridx = 2;
			gbc_btnNewButton_1.gridy = 1;
			centralPanel.add(getBtnNewButton_1(), gbc_btnNewButton_1);
			GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
			gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
			gbc_btnNewButton_3.gridx = 3;
			gbc_btnNewButton_3.gridy = 1;
			centralPanel.add(getBtnNewButton_3(), gbc_btnNewButton_3);
			GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
			gbc_btnNewButton_4.gridx = 4;
			gbc_btnNewButton_4.gridy = 1;
			centralPanel.add(getBtnNewButton_4(), gbc_btnNewButton_4);
			resize();
		}
		return centralPanel;
	}
	private JLabel getLblCard1() {
		if (lblCard1 == null) {
			lblCard1 = new JLabel("");
			lblCard1.setSize(new Dimension(220, 350));
			
//			Image image = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_hearts.png").getScaledInstance(lblCard1.getWidth(), lblCard1.getHeight(), 0);
//			lblCard1.setIcon(new ImageIcon(image));
		}
		return lblCard1;
	}
	private JLabel getLblCard2() {
		if (lblCard2 == null) {
			lblCard2 = new JLabel("");
			lblCard2.setSize(new Dimension(220, 350));
			
//			Image image = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_diamonds.png").getScaledInstance(lblCard2.getWidth(), lblCard2.getHeight(), 0);
//			lblCard2.setIcon(new ImageIcon(image));
		}
		return lblCard2;
	}
	private JLabel getLblCard3() {
		if (lblCard3 == null) {
			lblCard3 = new JLabel("");
			lblCard3.setSize(new Dimension(220, 350));
			
//			Image image = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_clubs.png").getScaledInstance(lblCard3.getWidth(), lblCard3.getHeight(), 0);
//			lblCard3.setIcon(new ImageIcon(image));
		}
		return lblCard3;
	}
	private JLabel getLblCard4() {
		if (lblCard4 == null) {
			lblCard4 = new JLabel("");
			lblCard4.setSize(new Dimension(220, 350));
			
//			Image image = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_spades.png").getScaledInstance(lblCard4.getWidth(), lblCard4.getHeight(), 0);
//			lblCard4.setIcon(new ImageIcon(image));
		}
		return lblCard4;
	}
	private JLabel getLblCard5() {
		if (lblCard5 == null) {
			lblCard5 = new JLabel("");
			lblCard5.setSize(new Dimension(220, 350));
			
//			Image image = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/king_of_clubs.png").getScaledInstance(lblCard5.getWidth(), lblCard5.getHeight(), 0);
//			lblCard5.setIcon(new ImageIcon(image));
		}
		return lblCard5;
	}
	
	public void resize() {
		Image image1 = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_hearts.png").getScaledInstance(lblCard1.getWidth(), lblCard1.getHeight(), 0);
		lblCard1.setIcon(new ImageIcon(image1));
		
		Image image2 = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_diamonds.png").getScaledInstance(lblCard2.getWidth(), lblCard2.getHeight(), 0);
		lblCard2.setIcon(new ImageIcon(image2));
		
		Image image3 = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_clubs.png").getScaledInstance(lblCard3.getWidth(), lblCard3.getHeight(), 0);
		lblCard3.setIcon(new ImageIcon(image3));
		
		Image image4 = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/ace_of_spades.png").getScaledInstance(lblCard4.getWidth(), lblCard4.getHeight(), 0);
		lblCard4.setIcon(new ImageIcon(image4));
		
		Image image5 = Toolkit.getDefaultToolkit().getImage("/home/milos/Downloads/PNG-cards-1.2/king_of_clubs.png").getScaledInstance(lblCard5.getWidth(), lblCard5.getHeight(), 0);
		lblCard5.setIcon(new ImageIcon(image5));
		
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 30));
			panel_1.add(getTable());
		}
		return panel_1;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setGridColor(Color.RED);
			table.setSelectionBackground(Color.RED);
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			table.setForeground(Color.BLACK);
			table.setColumnSelectionAllowed(true);
			table.setShowHorizontalLines(false);
			table.setBackground(Color.LIGHT_GRAY);
			table.setRowHeight(20);
			table.setRowSelectionAllowed(false);
			table.setFont(new Font("Dialog", Font.PLAIN, 20));
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"", null, null, null, null, null},
					{"  ROYAL FLUSH", new Integer(250), new Integer(500), new Integer(750), new Integer(1000), new Integer(4000)},
					{"  STRAIGHT FLUSH", new Integer(50), new Integer(100), new Integer(150), new Integer(200), new Integer(250)},
					{"  FOUR OF A KIND", new Integer(25), new Integer(50), new Integer(75), new Integer(100), new Integer(125)},
					{"  FULL HOUSE", new Integer(9), new Integer(18), new Integer(27), new Integer(36), new Integer(45)},
					{"  FLUSH", new Integer(6), new Integer(12), new Integer(18), new Integer(24), new Integer(30)},
					{"  STRAIGHT", new Integer(4), new Integer(8), new Integer(12), new Integer(16), new Integer(20)},
					{"  THREE OF A KIND", new Integer(3), new Integer(6), new Integer(9), new Integer(12), new Integer(15)},
					{"  TWO PAIR", new Integer(2), new Integer(4), new Integer(6), new Integer(8), new Integer(10)},
					{"JACKS OR BETTER", new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5)},
				},
				new String[] {
					"Combination", "New column", "New column", "New column", "New column", "New column"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
				boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(200);
		}
		return table;
	}
	private JToggleButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JToggleButton("HOLD");
			btnNewButton.setPreferredSize(new Dimension(200, 60));
		}
		return btnNewButton;
	}
	private JToggleButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JToggleButton("HOLD");
			btnNewButton_1.setPreferredSize(new Dimension(200, 60));
		}
		return btnNewButton_1;
	}
	private JToggleButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JToggleButton("HOLD");
			btnNewButton_2.setPreferredSize(new Dimension(200, 60));
		}
		return btnNewButton_2;
	}
	private JToggleButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JToggleButton("HOLD");
			btnNewButton_3.setPreferredSize(new Dimension(200, 60));
		}
		return btnNewButton_3;
	}
	private JToggleButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JToggleButton("HOLD");
			btnNewButton_4.setPreferredSize(new Dimension(200, 60));
		}
		return btnNewButton_4;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.BLUE, Color.BLACK));
			panel.setPreferredSize(new Dimension(10, 80));
			panel.setLayout(new GridLayout(0, 3, 50, 50));
			panel.add(getBtnNewButton_5());
			panel.add(getBtnNewButton_6());
			panel.add(getBtnNewButton_7());
		}
		return panel;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("New button");
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("New button");
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("New button");
		}
		return btnNewButton_7;
	}
}
