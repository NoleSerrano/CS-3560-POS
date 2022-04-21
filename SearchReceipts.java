
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class SearchReceipts extends JFrame {

	private JPanel contentPane;
	private JTextField txtReceiptId;
	private JTable table;
	private JTextField txtDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchReceipts frame = new SearchReceipts();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ghost text booleans
	boolean txtReceiptIdHelper = true;
	boolean txtTableNumberHelper = true;
	boolean txtTotalAmountHelper = true;
	boolean txtTotalMinHelper = true;
	boolean txtTotalMaxHelper = true;
	boolean txtDateHelper = true;
	boolean txtDateMinHelper = true;
	boolean txtDateMaxHelper = true;

	private JTextField txtDateMin;
	private JTextField txtDateMax;
	private JTextField txtTotalAmount;
	private JTextField txtTotalMin;
	private JTextField txtTotalMax;
	private JTextField txtTableNumber;

	/**
	 * Create the frame.
	 */

	public SearchReceipts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnReceiptIdExactly = new JRadioButton("");
		JRadioButton rdbtnTableNumberExactly = new JRadioButton("");
		JRadioButton rdbtnTotalAmountExactly = new JRadioButton("");
		JRadioButton rdbtnTotalAmountMinMax = new JRadioButton("");
		JRadioButton rdbtnDateExactly = new JRadioButton("");
		JRadioButton rdbtnDateMinMax = new JRadioButton("");
		
		
		
		txtDateMax = new JTextField();
		txtDateMax.setForeground(Color.GRAY);
		txtDateMax.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnDateMinMax.setSelected(true);
				if (txtDateMaxHelper) {
					txtDateMax.setForeground(Color.BLACK);
					txtDateMax.setText("");
					txtDateMaxHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtDateMax.getText().isEmpty()) {
					txtDateMax.setForeground(Color.GRAY);
					txtDateMax.setText("max");
					txtDateMaxHelper = true;
				}
			}
		});

		txtDateMin = new JTextField();
		txtDateMin.setForeground(Color.GRAY);
		txtDateMin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnDateMinMax.setSelected(true);
				if (txtDateMinHelper) {
					txtDateMin.setForeground(Color.BLACK);
					txtDateMin.setText("");
					txtDateMinHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtDateMin.getText().isEmpty()) {
					txtDateMin.setForeground(Color.GRAY);
					txtDateMin.setText("min");
					txtDateMinHelper = true;
				}
			}
		});

		txtDate = new JTextField();
		txtDate.setForeground(Color.GRAY);
		txtDate.setText("is exactly");
		txtDate.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnDateExactly.setSelected(true);
				if (txtDateHelper) {
					txtDate.setForeground(Color.BLACK);
					txtDate.setText("");
					txtDateHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtDate.getText().isEmpty()) {
					txtDate.setForeground(Color.GRAY);
					txtDate.setText("is exactly");
					txtDateHelper = true;
				}
			}

		});

		txtTotalMax = new JTextField();
		txtTotalMax.setForeground(Color.GRAY);
		txtTotalMax.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnTotalAmountMinMax.setSelected(true);
				if (txtTotalMaxHelper) {
					txtTotalMax.setForeground(Color.BLACK);
					txtTotalMax.setText("");
					txtTotalMaxHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtTotalMax.getText().isEmpty()) {
					txtTotalMax.setForeground(Color.GRAY);
					txtTotalMax.setText("max");
					txtTotalMaxHelper = true;
				}
			}
		});

		txtTotalMin = new JTextField();
		txtTotalMin.setForeground(Color.GRAY);
		txtTotalMin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnTotalAmountMinMax.setSelected(true);
				if (txtTotalMinHelper) {
					txtTotalMin.setForeground(Color.BLACK);
					txtTotalMin.setText("");
					txtTotalMinHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtTotalMin.getText().isEmpty()) {
					txtTotalMin.setForeground(Color.GRAY);
					txtTotalMin.setText("min");
					txtTotalMinHelper = true;
				}
			}
		});

		txtTotalAmount = new JTextField();
		txtTotalAmount.setForeground(Color.GRAY);
		txtTotalAmount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnTotalAmountExactly.setSelected(true);
				if (txtTotalAmountHelper) {
					txtTotalAmount.setForeground(Color.BLACK);
					txtTotalAmount.setText("");
					txtTotalAmountHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtTotalAmount.getText().isEmpty()) {
					txtTotalAmount.setForeground(Color.GRAY);
					txtTotalAmount.setText("is exactly");
					txtTotalAmountHelper = true;
				}
			}
		});

		txtReceiptId = new JTextField();
		txtReceiptId.setForeground(Color.GRAY);
		txtReceiptId.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnReceiptIdExactly.setSelected(true);
				if (txtReceiptIdHelper) {
					txtReceiptId.setForeground(Color.BLACK);
					txtReceiptId.setText("");
					txtReceiptIdHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtReceiptId.getText().isEmpty()) {
					txtReceiptId.setForeground(Color.GRAY);
					txtReceiptId.setText("is exactly");
					txtReceiptIdHelper = true;
				}
			}
		});

		JLabel lblNewLabel = new JLabel("Receipt ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(25, 25, 105, 15);
		contentPane.add(lblNewLabel);

		JRadioButton rdbtnReceiptIdAny = new JRadioButton("Any");
		rdbtnReceiptIdAny.setSelected(true);
		rdbtnReceiptIdAny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnReceiptIdAny.setBounds(25, 47, 53, 20);
		contentPane.add(rdbtnReceiptIdAny);
		txtReceiptId.setText("is exactly");
		txtReceiptId.setBounds(45, 70, 150, 20);
		contentPane.add(txtReceiptId);
		txtReceiptId.setColumns(10);

		
		rdbtnReceiptIdExactly.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnReceiptIdExactly.setBounds(25, 70, 20, 20);
		contentPane.add(rdbtnReceiptIdExactly);

		JLabel lblTableNumber = new JLabel("Table Number");
		lblTableNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTableNumber.setBounds(25, 101, 105, 15);
		contentPane.add(lblTableNumber);

		txtTableNumber = new JTextField();
		txtTableNumber.setForeground(Color.GRAY);
		txtTableNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				rdbtnTableNumberExactly.setSelected(true);
				if (txtTableNumberHelper) {
					txtTableNumber.setForeground(Color.BLACK);
					txtTableNumber.setText("");
					txtTableNumberHelper = false;
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtTableNumber.getText().isEmpty()) {
					txtTableNumber.setForeground(Color.GRAY);
					txtTableNumber.setText("is exactly");
					txtTableNumberHelper = true;
				}
			}
		});
		txtTableNumber.setText("is exactly");
		txtTableNumber.setColumns(10);
		txtTableNumber.setBounds(45, 146, 150, 20);
		contentPane.add(txtTableNumber);

		JRadioButton rdbtnTableNumberAny = new JRadioButton("Any");
		rdbtnTableNumberAny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnTableNumberAny.setBounds(25, 123, 53, 20);
		contentPane.add(rdbtnTableNumberAny);

		rdbtnTableNumberExactly.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnTableNumberExactly.setBounds(25, 146, 20, 20);
		contentPane.add(rdbtnTableNumberExactly);

		JLabel lblTotalAmount = new JLabel("Total Amount");
		lblTotalAmount.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalAmount.setBounds(25, 177, 105, 15);
		contentPane.add(lblTotalAmount);

		JRadioButton rdbtnTotalAmountAny = new JRadioButton("Any");
		rdbtnTotalAmountAny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnTotalAmountAny.setBounds(25, 199, 72, 20);
		contentPane.add(rdbtnTotalAmountAny);
		txtTotalAmount.setText("is exactly");
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBounds(45, 222, 150, 20);
		contentPane.add(txtTotalAmount);

		rdbtnTotalAmountExactly.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnTotalAmountExactly.setBounds(25, 222, 20, 20);
		contentPane.add(rdbtnTotalAmountExactly);
		txtTotalMin.setText("min");
		txtTotalMin.setColumns(10);
		txtTotalMin.setBounds(45, 245, 150, 20);
		contentPane.add(txtTotalMin);

		rdbtnTotalAmountMinMax.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnTotalAmountMinMax.setBounds(25, 245, 20, 20);
		contentPane.add(rdbtnTotalAmountMinMax);
		txtTotalMax.setText("max");
		txtTotalMax.setColumns(10);
		txtTotalMax.setBounds(45, 268, 150, 20);
		contentPane.add(txtTotalMax);

		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(25, 299, 105, 15);
		contentPane.add(lblDate);

		JRadioButton rdbtnDateAny = new JRadioButton("Any");
		rdbtnDateAny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnDateAny.setBounds(25, 321, 72, 20);
		contentPane.add(rdbtnDateAny);
		txtDate.setColumns(10);
		txtDate.setBounds(45, 344, 150, 20);
		contentPane.add(txtDate);

		rdbtnDateExactly.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnDateExactly.setBounds(25, 344, 20, 20);
		contentPane.add(rdbtnDateExactly);
		txtDateMin.setText("min");
		txtDateMin.setColumns(10);
		txtDateMin.setBounds(45, 367, 150, 20);
		contentPane.add(txtDateMin);

		rdbtnDateMinMax.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rdbtnDateMinMax.setBounds(25, 367, 20, 20);
		contentPane.add(rdbtnDateMinMax);
		txtDateMax.setText("max");
		txtDateMax.setColumns(10);
		txtDateMax.setBounds(45, 390, 150, 20);
		contentPane.add(txtDateMax);

		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPaid.setBounds(25, 421, 105, 15);
		contentPane.add(lblPaid);

		JRadioButton rdbtnPaidAny = new JRadioButton("Any");
		rdbtnPaidAny.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnPaidAny.setBounds(25, 443, 72, 20);
		contentPane.add(rdbtnPaidAny);

		JRadioButton rdbtnPaidPaid = new JRadioButton("Paid");
		rdbtnPaidPaid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnPaidPaid.setBounds(25, 466, 72, 20);
		contentPane.add(rdbtnPaidPaid);

		JRadioButton rdbtnPaidUnpaid = new JRadioButton("Unpaid");
		rdbtnPaidUnpaid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnPaidUnpaid.setBounds(25, 489, 72, 20);
		contentPane.add(rdbtnPaidUnpaid);

		JLabel lblNewLabel_1 = new JLabel("Receipt ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(205, 25, 105, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Table Number");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(320, 25, 105, 14);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Total Amount");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(435, 25, 105, 14);
		contentPane.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(550, 25, 105, 14);
		contentPane.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Paid");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(665, 25, 105, 14);
		contentPane.add(lblNewLabel_1_1_1_1_1);

		table = new JTable();
		table.setBounds(205, 50, 565, 446);
		contentPane.add(table);

		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(25, 516, 180, 40);
		contentPane.add(btnNewButton);

		JButton btnUpdateReceipt = new JButton("Update Receipt");
		btnUpdateReceipt.setBackground(SystemColor.controlHighlight);
		btnUpdateReceipt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnUpdateReceipt.setBounds(405, 516, 180, 40);
		contentPane.add(btnUpdateReceipt);

		JButton btnRemoveReceipt = new JButton("Remove Receipt");
		btnRemoveReceipt.setBackground(SystemColor.controlHighlight);
		btnRemoveReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRemoveReceipt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRemoveReceipt.setBounds(595, 516, 180, 40);
		contentPane.add(btnRemoveReceipt);

		JButton btnTableMenu = new JButton("Return to Tables");
		btnTableMenu.setBackground(SystemColor.controlHighlight);
		btnTableMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTableMenu.setBounds(25, 567, 180, 40);
		contentPane.add(btnTableMenu);

		JButton btnNewReceipt = new JButton("New Receipt");
		btnNewReceipt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewReceipt.setBackground(SystemColor.controlHighlight);
		btnNewReceipt.setBounds(215, 516, 180, 40);
		contentPane.add(btnNewReceipt);

		// Radial Groups
		ButtonGroup groupReceiptId = new ButtonGroup();
		groupReceiptId.add(rdbtnReceiptIdAny);
		groupReceiptId.add(rdbtnReceiptIdExactly);

		ButtonGroup groupTableNumber = new ButtonGroup();
		groupTableNumber.add(rdbtnTableNumberAny);
		groupTableNumber.add(rdbtnTableNumberExactly);
		rdbtnTableNumberAny.setSelected(true);

		ButtonGroup groupTotalAmount = new ButtonGroup();
		groupTotalAmount.add(rdbtnTotalAmountAny);
		groupTotalAmount.add(rdbtnTotalAmountExactly);
		groupTotalAmount.add(rdbtnTotalAmountMinMax);
		rdbtnTotalAmountAny.setSelected(true);

		ButtonGroup groupDate = new ButtonGroup();
		groupDate.add(rdbtnDateAny);
		groupDate.add(rdbtnDateExactly);
		groupDate.add(rdbtnDateMinMax);
		rdbtnDateAny.setSelected(true);

		ButtonGroup groupPaid = new ButtonGroup();
		groupPaid.add(rdbtnPaidAny);
		groupPaid.add(rdbtnPaidPaid);
		groupPaid.add(rdbtnPaidUnpaid);
		rdbtnPaidAny.setSelected(true);

	}
}
