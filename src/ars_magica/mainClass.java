package ars_magica;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.Box;
import javax.swing.ListSelectionModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.ScrollPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.JTextComponent;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.Icon;
import java.awt.Canvas;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.Window.Type;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.VetoableChangeListener;

import ars_magica.RefreshModel;
import ars_magica.Settings;
import ars_magica.swap;

import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.AbstractAction;
import javax.swing.Action;

@SuppressWarnings({ "serial", "unused" })
public class mainClass extends JFrame {
	
	public JPanel contentPane;
	public JTabbedPane tabbedPane;
	public JPanel panelVirtues;
	public JTextField textField;
	public final ButtonGroup buttonGroup = new ButtonGroup();
	public JTextField textField_3;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	@SuppressWarnings("rawtypes")
	public JList list;
	public JMenu mnHelp;
	public JTextField textField_12;
	public JTextField textField_13;
	public JTextField textField_14;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	public JTextField textField_23;
	public JTextField textField_24;
	public JTextField textField_25;
	public JTextField textField_26;
	public JTextField textField_27;
	public JTextField textField_28;
	public JTextField textField_29;
	public JTextField textField_30;
	public JTextField textField_31;
	public JTextField textField_32;
	public JTextField textField_33;
	public JTextField textField_34;
	public JTextField textField_35;
	public JTextField textField_36;
	public JTextField textField_37;
	public JTextField textField_38;
	public JTextField textField_39;
	public JTextField textField_40;
	public JTextField textField_41;
	public JTextField textField_42;
	public JTextField textField_43;
	public JTextField textField_44;
	public JTextField textField_45;
	public JTextField textField_46;
	public JTextField simpleDieMod;
	public JTextField stressDieMod;
	public JTextField simpleDieCount;
	public JTextField stressDieCount;
	public JTextField botchDieCount;
	public JScrollPane scrollPane_3;
	public JTextField nSidedDieCount;
	public JTextField nSidedDieSides;
	public JTextField Creo_Score;
	public JTextField intellego_Score;
	public JTextField muto_Score;
	public JTextField perdo_Score;
	public JTextField rego_Score;
	public JTextField animal_Score;
	public JTextField aquam_Score;
	public JTextField auram_Score;
	public JTextField corpus_Score;
	public JTextField herbam_Score;
	public JTextField ignem_Score;
	public JTextField imaginem_Score;
	public JTextField mentem_Score;
	public JTextField terram_Score;
	public JTextField vim_Score;
	public JScrollPane scrollPane_4;
	public JScrollPane scrollPane_5;
	private JTable Equipmenttable;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_1;
	private JButton FlawEdit;
	private JButton btnAddFlaw;
	private JLabel lblPoints;
	private JTextField FlawPoints;
	private JLabel label;
	private JTextField virtuePoints;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JScrollPane scrollPane_10;
	private JButton FlawRemove;
	private JLabel lblValue;
	private JLabel lblDescription;
	private JLabel lblGreaterpoor;
	private JLabel lblTotal;
	private JLabel lblComments;
	private JLabel lblIntelligence;
	private JLabel lblPerception;
	private JLabel lblStrength;
	private JLabel lblStamina;
	private JLabel lblPresence;
	private JLabel lblCommunication;
	private JLabel lblDexterity;
	private JLabel lblQuickness;
	private JLabel lblNewLabel;
	private JTable PersonalityTable;
	private JScrollPane scrollPane_11;

	private int SpellArrayIndex=0;
	private int VirtueArrayIndex=0;
	private int FlawArrayIndex=0;
	private int EquipmentArrayIndex=0;
	private int AbilityArrayIndex=0;
	
	File fileLoaded = null;
	private JButton VirtueUp;
	private JButton VirtueDown;
	private JButton FlawUp;
	private JButton FlawDown;
	private JTextArea EquipmentDesc;
	private JScrollPane scrollPane_7;
	private JButton EquipmentSwapUp;
	private JButton EquipmentSwapDown;
	private JButton AbilitySwapDown;
	private JButton AbilitySwapUp;
	private JLabel lblModifier;
	private JLabel lblOfDie;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel lblSides;
	private JLabel lblSimpleDie;
	private JLabel lblStressDie;
	private JLabel lblBotchDie;
	private JLabel lblNSidedDie;
	private JLabel lblName;
	private JLabel lblCharacterType;
	private JLabel lblSagaName;
	private JLabel lblGraduationYear;
	private JLabel lblCovenant;
	private JLabel lblTribunal;
	private JLabel lblLongevityRitual;
	private JLabel lblWarpingPoints;
	private JLabel lblHouse;
	private JLabel lblBirthYear;
	private JLabel lblReligion;
	private JLabel lblCurrentYear;
	private JLabel lblApparentAge;
	private JLabel lblGender;
	private JLabel lblCharacteristicsPoints;
	private JLabel lblSpent;
	private JLabel lblRemaining;
	private JLabel lblCreo;
	private JLabel lblIntellego;
	private JLabel lblMuto;
	private JLabel lblPerdo;
	private JLabel lblRego;
	private JLabel lblScore;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblAnimal;
	private JLabel lblAquam;
	private JLabel lblAuram;
	private JLabel lblCorpus;
	private JLabel lblHerbam;
	private JLabel lblIgnem;
	private JLabel lblImaginem;
	private JLabel lblMentem;
	private JLabel lblTerram;
	private JLabel lblVim;
	private JSeparator separator_2;
	private JMenu mnTheme;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainClass frame = new mainClass();
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public mainClass() {

		setTitle("Ars Magica V"+Version.getVersion());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 423);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmSave = new JMenuItem("Save");

		mnFile.add(mntmSave);

		JMenuItem mntmLoad = new JMenuItem("Load");

		mnFile.add(mntmLoad);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		mnFile.add(mntmExit);
		
		separator_2 = new JSeparator();
		mnFile.add(separator_2);

		mnHelp = new JMenu("Help");
		mnHelp.setEnabled(false);
		menuBar.add(mnHelp);

		JMenu mnSetup = new JMenu("Setup");
		mnHelp.add(mnSetup);

		JMenu mnVirtuesflaws = new JMenu("Virtues/Flaws");
		mnHelp.add(mnVirtuesflaws);

		JMenu mnCharactistics = new JMenu("Charactistics");
		mnHelp.add(mnCharactistics);

		JMenu mnAbilities = new JMenu("Abilities");
		mnHelp.add(mnAbilities);

		JMenu mnArts = new JMenu("Arts");
		mnHelp.add(mnArts);

		JMenu mnSpells = new JMenu("Spells");
		mnHelp.add(mnSpells);

		JMenuItem mntmCreateNewSpell = new JMenuItem("Create New Spell");
		mnSpells.add(mntmCreateNewSpell);

		JSeparator separator = new JSeparator();
		mnSpells.add(separator);

		JMenuItem mntmStressDie = new JMenuItem("Stress Die");
		mnSpells.add(mntmStressDie);

		JMenuItem mntmCastSpell = new JMenuItem("Cast Spell");
		mnSpells.add(mntmCastSpell);

		JMenuItem mntmRemoveSpell = new JMenuItem("Remove Spell");
		mnSpells.add(mntmRemoveSpell);

		JSeparator separator_1 = new JSeparator();
		mnSpells.add(separator_1);

		JMenuItem mntmRefresh = new JMenuItem("Refresh");
		mnSpells.add(mntmRefresh);

		JMenu mnEquipment = new JMenu("Equipment");
		mnHelp.add(mnEquipment);

		JMenu mnCharacter = new JMenu("Character");
		mnHelp.add(mnCharacter);

		JMenu mnDiceRolling = new JMenu("Dice Rolling");
		mnHelp.add(mnDiceRolling);

		JMenuItem mntmSimpleDie = new JMenuItem("Simple Die");
		mnDiceRolling.add(mntmSimpleDie);

		JMenuItem mntmStressDie_1 = new JMenuItem("Stress Die");
		mnDiceRolling.add(mntmStressDie_1);

		JMenuItem mntmBotchDie = new JMenuItem("Botch Die");
		mnDiceRolling.add(mntmBotchDie);

		JMenuItem mntmNSidedDie = new JMenuItem("N Sided Die");
		mnDiceRolling.add(mntmNSidedDie);
		
		JMenu mnSettings = new JMenu("Settings");
		menuBar.add(mnSettings);
		
		JMenuItem mntmChangeLog = new JMenuItem("Change Log");
		
		
		mnSettings.add(mntmChangeLog);
		
		JSeparator separator_3 = new JSeparator();
		mnSettings.add(separator_3);
		
		mnTheme = new JMenu("Theme");
		mnTheme.setEnabled(false);
		mnSettings.add(mnTheme);
		
		JRadioButtonMenuItem rdbtnmntmStandard = new JRadioButtonMenuItem("Standard");
		
		buttonGroup_1.add(rdbtnmntmStandard);
		rdbtnmntmStandard.setSelected(true);
		mnTheme.add(rdbtnmntmStandard);
		
		JRadioButtonMenuItem rdbtnmntmDark = new JRadioButtonMenuItem("Dark");
		
		buttonGroup_1.add(rdbtnmntmDark);
		mnTheme.add(rdbtnmntmDark);
		
		JMenu mnTabbedLayout = new JMenu("Tabbed Layout");
		mnSettings.add(mnTabbedLayout);
		
		JRadioButtonMenuItem rdbtnmntmBottom = new JRadioButtonMenuItem("Bottom");
		
		buttonGroup_2.add(rdbtnmntmBottom);
		rdbtnmntmBottom.setSelected(true);
		mnTabbedLayout.add(rdbtnmntmBottom);
		

		JRadioButtonMenuItem rdbtnmntmLeft = new JRadioButtonMenuItem("Left");
		buttonGroup_2.add(rdbtnmntmLeft);
		mnTabbedLayout.add(rdbtnmntmLeft);
		
		JRadioButtonMenuItem rdbtnmntmTop = new JRadioButtonMenuItem("Top");
		
		buttonGroup_2.add(rdbtnmntmTop);
		mnTabbedLayout.add(rdbtnmntmTop);
		
		JRadioButtonMenuItem rdbtnmntmRight = new JRadioButtonMenuItem("Right");
		
		buttonGroup_2.add(rdbtnmntmRight);
		mnTabbedLayout.add(rdbtnmntmRight);
		
		JSeparator separator_4 = new JSeparator();
		mnSettings.add(separator_4);
		
		JMenuItem mntmCheckVersion = new JMenuItem("Check Version");
		
		mnSettings.add(mntmCheckVersion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		
		tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

		JPanel panelSetup = new JPanel();
		tabbedPane.addTab("Setup", null, panelSetup, null);
		panelSetup.setLayout(null);

		JPanel panelForMagi = new JPanel();
		panelForMagi.setBounds(10, 104, 567, 225);
		panelSetup.add(panelForMagi);
		panelForMagi.setLayout(null);

		textField_7 = new JTextField();
		textField_7.setBounds(102, 0, 465, 20);
		panelForMagi.add(textField_7);
		textField_7.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(69, 31, 498, 20);
		panelForMagi.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setBounds(60, 60, 507, 20);
		panelForMagi.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setBounds(118, 91, 449, 20);
		panelForMagi.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField();
		textField_11.setBounds(102, 122, 465, 20);
		panelForMagi.add(textField_11);
		textField_11.setColumns(10);

		JComboBox comboBox_9 = new JComboBox();
		comboBox_9
				.setModel(new DefaultComboBoxModel(new String[] { "Bjornaer", "Bonisagus", "Criamon", "Ex Miscellanea",
						"Flambeau", "Guernicus", "Jerbiton", "Mercere", "Merinita", "Tremere", "Tyalus", "Verditus" }));
		comboBox_9.setSelectedIndex(0);
		comboBox_9.setBounds(69, 153, 498, 20);
		panelForMagi.add(comboBox_9);
		
		lblGraduationYear = new JLabel("Graduation Year:");
		lblGraduationYear.setBounds(0, 0, 129, 18);
		panelForMagi.add(lblGraduationYear);
		
		lblCovenant = new JLabel("Covenant:");
		lblCovenant.setBounds(0, 31, 84, 18);
		panelForMagi.add(lblCovenant);
		
		lblTribunal = new JLabel("Tribunal:");
		lblTribunal.setBounds(0, 60, 84, 20);
		panelForMagi.add(lblTribunal);
		
		lblLongevityRitual = new JLabel("Longevity Ritual:");
		lblLongevityRitual.setBounds(0, 91, 98, 20);
		panelForMagi.add(lblLongevityRitual);
		
		lblWarpingPoints = new JLabel("Warping Points:");
		lblWarpingPoints.setBounds(0, 122, 106, 20);
		panelForMagi.add(lblWarpingPoints);
		
		lblHouse = new JLabel("House:");
		lblHouse.setBounds(0, 153, 54, 20);
		panelForMagi.add(lblHouse);

		textField = new JTextField();
		textField.setBounds(59, 11, 518, 20);
		panelSetup.add(textField);
		textField.setColumns(10);

		String[] playerType = { "Magi", "Companion", "Grog" };
		JComboBox comboBox = new JComboBox(playerType);
		comboBox.setBounds(120, 42, 457, 20);
		panelSetup.add(comboBox);

		textField_3 = new JTextField();
		textField_3.setBounds(94, 73, 484, 20);
		panelSetup.add(textField_3);
		textField_3.setColumns(10);
		
		lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 46, 20);
		panelSetup.add(lblName);
		
		lblCharacterType = new JLabel("Character Type:");
		lblCharacterType.setBounds(10, 42, 95, 20);
		panelSetup.add(lblCharacterType);
		
		lblSagaName = new JLabel("Saga Name:");
		lblSagaName.setBounds(10, 73, 70, 20);
		panelSetup.add(lblSagaName);

		JPanel panelCharacter = new JPanel();
		tabbedPane.addTab("Character", null, panelCharacter, null);
		panelCharacter.setLayout(null);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(84, 11, 494, 20);
		panelCharacter.add(textField_2);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(78, 42, 504, 20);
		panelCharacter.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(101, 73, 184, 20);
		panelCharacter.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(391, 73, 194, 20);
		panelCharacter.add(textField_6);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(75, 104, 504, 20);
		panelCharacter.add(textField_1);

		lblNewLabel = new JLabel("Personality Traits:");
		lblNewLabel.setBounds(10, 135, 119, 20);
		panelCharacter.add(lblNewLabel);

		scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(126, 135, 452, 71);
		panelCharacter.add(scrollPane_11);

		PersonalityTable = new JTable();
		scrollPane_11.setViewportView(PersonalityTable);
		PersonalityTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Trait", "Value"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblMakeSureThe = new JLabel("(Make Sure the Table is De-Selected when finished)");
		lblMakeSureThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakeSureThe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMakeSureThe.setBounds(136, 217, 395, 32);
		panelCharacter.add(lblMakeSureThe);
		
		lblBirthYear = new JLabel("Birth Year:");
		lblBirthYear.setBounds(10, 11, 64, 20);
		panelCharacter.add(lblBirthYear);
		
		lblReligion = new JLabel("Religion:");
		lblReligion.setBounds(10, 42, 55, 20);
		panelCharacter.add(lblReligion);
		
		lblCurrentYear = new JLabel("Current Year:");
		lblCurrentYear.setBounds(10, 73, 81, 20);
		panelCharacter.add(lblCurrentYear);
		
		lblApparentAge = new JLabel("Apparent Age:");
		lblApparentAge.setBounds(295, 73, 81, 20);
		panelCharacter.add(lblApparentAge);
		
		lblGender = new JLabel("Gender:");
		lblGender.setBounds(10, 104, 55, 20);
		panelCharacter.add(lblGender);
		PersonalityTable.getColumnModel().getColumn(0).setPreferredWidth(206);

		panelVirtues = new JPanel();
		tabbedPane.addTab("Virtues", null, panelVirtues, null);

		scrollPane_2 = new JScrollPane();

		JList list_Virtues = new JList();
		
		scrollPane_2.setViewportView(list_Virtues);
		list_Virtues.setValueIsAdjusting(true);
		list_Virtues.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnAddVirtue = new JButton("Add Virtue");
		btnAddVirtue.setToolTipText("Add a new Virtue");

		JButton btnRemoveSelected = new JButton("Remove Selected");
		btnRemoveSelected.setToolTipText("Remove Selected Virtue");

		JButton btnEdit_3 = new JButton("Edit");
		btnEdit_3.setToolTipText("Edit Selected Virtue");

		scrollPane_10 = new JScrollPane();

		JTextArea VirtueDesc = new JTextArea();
		scrollPane_10.setViewportView(VirtueDesc);
		VirtueDesc.setLineWrap(true);
		VirtueDesc.setEditable(false);

		label = new JLabel("Points:");

		virtuePoints = new JTextField();
		virtuePoints.setText("0");
		virtuePoints.setEditable(false);
		virtuePoints.setColumns(10);
		
		VirtueUp = new JButton("\u25B2");
		
		VirtueDown = new JButton("\u25BC");
		GroupLayout gl_panelVirtues = new GroupLayout(panelVirtues);
		gl_panelVirtues.setHorizontalGroup(
			gl_panelVirtues.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelVirtues.createSequentialGroup()
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(gl_panelVirtues.createParallelGroup(Alignment.LEADING)
						.addComponent(VirtueUp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(VirtueDown, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addComponent(scrollPane_10, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelVirtues.createSequentialGroup()
					.addComponent(btnAddVirtue, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnRemoveSelected, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnEdit_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(virtuePoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelVirtues.setVerticalGroup(
			gl_panelVirtues.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelVirtues.createSequentialGroup()
					.addGroup(gl_panelVirtues.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_10, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addGroup(gl_panelVirtues.createSequentialGroup()
							.addGap(80)
							.addComponent(VirtueUp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(VirtueDown)))
					.addGap(11)
					.addGroup(gl_panelVirtues.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddVirtue)
						.addComponent(btnRemoveSelected)
						.addComponent(btnEdit_3)
						.addGroup(gl_panelVirtues.createSequentialGroup()
							.addGap(1)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelVirtues.createSequentialGroup()
							.addGap(1)
							.addComponent(virtuePoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(9))
		);
		panelVirtues.setLayout(gl_panelVirtues);

		JPanel panelFlaws = new JPanel();
		tabbedPane.addTab("Flaws", null, panelFlaws, null);

		scrollPane = new JScrollPane();

		JList FlawNameBox = new JList();
		
		scrollPane.setViewportView(FlawNameBox);
		FlawNameBox.setValueIsAdjusting(true);
		FlawNameBox.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		scrollPane_1 = new JScrollPane();

		JTextArea FlawDesc = new JTextArea();
		scrollPane_1.setViewportView(FlawDesc);
		FlawDesc.setLineWrap(true);
		FlawDesc.setEditable(false);

		FlawEdit = new JButton("Edit");
		FlawEdit.setToolTipText("Edit Selected Flaw");

		btnAddFlaw = new JButton("Add Flaw");
		btnAddFlaw.setToolTipText("Creates a new Flaw");

		lblPoints = new JLabel("Points:");

		FlawPoints = new JTextField();
		FlawPoints.setText("0");
		FlawPoints.setEditable(false);
		FlawPoints.setColumns(10);

		FlawRemove = new JButton("Remove Flaw");
		FlawRemove.setToolTipText("Remove Selected Flaw");
		
		FlawUp = new JButton("\u25B2");
		
		FlawDown = new JButton("\u25BC");
		GroupLayout gl_panelFlaws = new GroupLayout(panelFlaws);
		gl_panelFlaws.setHorizontalGroup(
			gl_panelFlaws.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelFlaws.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(gl_panelFlaws.createParallelGroup(Alignment.LEADING)
						.addComponent(FlawUp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(FlawDown, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_panelFlaws.createSequentialGroup()
					.addComponent(btnAddFlaw, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(FlawRemove, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(FlawEdit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblPoints, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(FlawPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelFlaws.setVerticalGroup(
			gl_panelFlaws.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelFlaws.createSequentialGroup()
					.addGroup(gl_panelFlaws.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
						.addGroup(gl_panelFlaws.createSequentialGroup()
							.addGap(80)
							.addComponent(FlawUp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(FlawDown)))
					.addGap(11)
					.addGroup(gl_panelFlaws.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddFlaw)
						.addComponent(FlawRemove)
						.addComponent(FlawEdit)
						.addGroup(gl_panelFlaws.createSequentialGroup()
							.addGap(1)
							.addComponent(lblPoints, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelFlaws.createSequentialGroup()
							.addGap(1)
							.addComponent(FlawPoints, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(9))
		);
		panelFlaws.setLayout(gl_panelFlaws);

		JPanel panelCharactistics = new JPanel();
		tabbedPane.addTab("Charactistics", null, panelCharactistics, null);
		panelCharactistics.setLayout(null);

		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setText("7");
		textField_12.setBounds(151, 298, 27, 20);
		panelCharactistics.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setText("0");
		textField_13.setBounds(336, 298, 27, 20);
		panelCharactistics.add(textField_13);
		textField_13.setColumns(10);

		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.setText("7");
		textField_14.setBounds(502, 298, 19, 20);
		panelCharactistics.add(textField_14);
		textField_14.setColumns(10);

		JComboBox int_val = new JComboBox();

		int_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		int_val.setSelectedIndex(3);
		int_val.setBounds(106, 42, 62, 20);
		panelCharactistics.add(int_val);

		JComboBox per_val = new JComboBox();

		per_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		per_val.setSelectedIndex(3);
		per_val.setBounds(106, 73, 62, 20);
		panelCharactistics.add(per_val);

		JComboBox str_val = new JComboBox();
		str_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		str_val.setSelectedIndex(3);
		str_val.setBounds(106, 104, 62, 20);
		panelCharactistics.add(str_val);

		JComboBox sta_val = new JComboBox();
		sta_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		sta_val.setSelectedIndex(3);
		sta_val.setBounds(106, 135, 62, 20);
		panelCharactistics.add(sta_val);

		JComboBox pre_val = new JComboBox();
		pre_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		pre_val.setSelectedIndex(3);
		pre_val.setBounds(106, 166, 62, 20);
		panelCharactistics.add(pre_val);

		JComboBox com_val = new JComboBox();
		com_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		com_val.setSelectedIndex(3);
		com_val.setBounds(106, 197, 62, 20);
		panelCharactistics.add(com_val);

		JComboBox dex_val = new JComboBox();
		dex_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		dex_val.setSelectedIndex(3);
		dex_val.setBounds(106, 228, 62, 20);
		panelCharactistics.add(dex_val);

		JComboBox qui_val = new JComboBox();
		qui_val.setModel(new DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "0", "1", "2", "3" }));
		qui_val.setSelectedIndex(3);
		qui_val.setBounds(106, 259, 62, 20);
		panelCharactistics.add(qui_val);

		textField_15 = new JTextField();
		textField_15.setBounds(178, 42, 86, 20);
		panelCharactistics.add(textField_15);
		textField_15.setColumns(10);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(178, 73, 86, 20);
		panelCharactistics.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(178, 104, 86, 20);
		panelCharactistics.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(178, 135, 86, 20);
		panelCharactistics.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(178, 166, 86, 20);
		panelCharactistics.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(178, 197, 86, 20);
		panelCharactistics.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(178, 228, 86, 20);
		panelCharactistics.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(178, 259, 86, 20);
		panelCharactistics.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setEditable(false);
		textField_23.setBounds(277, 42, 86, 20);
		panelCharactistics.add(textField_23);
		textField_23.setColumns(10);

		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(277, 73, 86, 20);
		panelCharactistics.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setText("0");
		textField_25.setColumns(10);
		textField_25.setBounds(277, 104, 86, 20);
		panelCharactistics.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setText("0");
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		textField_26.setBounds(277, 135, 86, 20);
		panelCharactistics.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBounds(277, 166, 86, 20);
		panelCharactistics.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setText("0");
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(277, 197, 86, 20);
		panelCharactistics.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setText("0");
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(277, 228, 86, 20);
		panelCharactistics.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setText("0");
		textField_30.setColumns(10);
		textField_30.setBounds(277, 259, 86, 20);
		panelCharactistics.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setEditable(false);
		textField_31.setBounds(429, 42, 52, 20);
		panelCharactistics.add(textField_31);
		textField_31.setColumns(10);

		textField_32 = new JTextField();
		textField_32.setText("0");
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(429, 73, 52, 20);
		panelCharactistics.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(429, 104, 52, 20);
		panelCharactistics.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setText("0");
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(429, 135, 52, 20);
		panelCharactistics.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setText("0");
		textField_35.setColumns(10);
		textField_35.setBounds(429, 166, 52, 20);
		panelCharactistics.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(429, 197, 52, 20);
		panelCharactistics.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(429, 228, 52, 20);
		panelCharactistics.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(429, 259, 52, 20);
		panelCharactistics.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(491, 42, 86, 20);
		panelCharactistics.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(491, 73, 86, 20);
		panelCharactistics.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(491, 104, 86, 20);
		panelCharactistics.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(491, 135, 86, 20);
		panelCharactistics.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(491, 166, 86, 20);
		panelCharactistics.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(491, 197, 86, 20);
		panelCharactistics.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(491, 228, 86, 20);
		panelCharactistics.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(491, 259, 86, 20);
		panelCharactistics.add(textField_46);

		lblValue = new JLabel("Value");
		lblValue.setBounds(106, 11, 62, 20);
		panelCharactistics.add(lblValue);

		lblDescription = new JLabel("Description");
		lblDescription.setBounds(178, 11, 86, 20);
		panelCharactistics.add(lblDescription);

		lblGreaterpoor = new JLabel("Modifier");
		lblGreaterpoor.setBounds(274, 11, 86, 20);
		panelCharactistics.add(lblGreaterpoor);

		lblTotal = new JLabel("Total");
		lblTotal.setBounds(429, 11, 52, 20);
		panelCharactistics.add(lblTotal);

		lblComments = new JLabel("Comments");
		lblComments.setBounds(491, 11, 88, 20);
		panelCharactistics.add(lblComments);

		lblIntelligence = new JLabel("Intelligence:");
		lblIntelligence.setBounds(10, 42, 86, 20);
		panelCharactistics.add(lblIntelligence);

		lblPerception = new JLabel("Perception:");
		lblPerception.setBounds(10, 73, 86, 20);
		panelCharactistics.add(lblPerception);

		lblStrength = new JLabel("Strength:");
		lblStrength.setBounds(10, 104, 86, 20);
		panelCharactistics.add(lblStrength);

		lblStamina = new JLabel("Stamina:");
		lblStamina.setBounds(10, 135, 86, 20);
		panelCharactistics.add(lblStamina);

		lblPresence = new JLabel("Presence:");
		lblPresence.setBounds(10, 166, 86, 20);
		panelCharactistics.add(lblPresence);

		lblCommunication = new JLabel("Communication:");
		lblCommunication.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCommunication.setBounds(10, 197, 86, 20);
		panelCharactistics.add(lblCommunication);

		lblDexterity = new JLabel("Dexterity:");
		lblDexterity.setBounds(10, 228, 86, 20);
		panelCharactistics.add(lblDexterity);

		lblQuickness = new JLabel("Quickness:");
		lblQuickness.setBounds(10, 259, 75, 20);
		panelCharactistics.add(lblQuickness);
		
		lblCharacteristicsPoints = new JLabel("Characteristics Points:");
		lblCharacteristicsPoints.setBounds(10, 300, 168, 18);
		panelCharactistics.add(lblCharacteristicsPoints);
		
		lblSpent = new JLabel("Spent:");
		lblSpent.setBounds(277, 298, 52, 20);
		panelCharactistics.add(lblSpent);
		
		lblRemaining = new JLabel("Remaining:");
		lblRemaining.setBounds(429, 298, 92, 20);
		panelCharactistics.add(lblRemaining);

		JPanel panelAbilities = new JPanel();
		tabbedPane.addTab("Abilities", null, panelAbilities, null);

		JScrollPane scrollPane_9 = new JScrollPane();

		JList AbilityNames = new JList();
		
		scrollPane_9.setViewportView(AbilityNames);
		AbilityNames.setValueIsAdjusting(true);
		AbilityNames.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnAddAbilities = new JButton("Add Abilities");
		btnAddAbilities.setToolTipText("Add a new Ability");

		JButton btnEditAbility = new JButton("Edit Ability");
		btnEditAbility.setToolTipText("Edit Selected Ability");

		JButton btnRemoveAbility = new JButton("Remove");
		btnRemoveAbility.setToolTipText("Remove Selected Ability");

		JScrollPane scrollPane_8 = new JScrollPane();

		JTextArea AbilityDesc = new JTextArea();
		AbilityDesc.setEditable(false);
		scrollPane_8.setViewportView(AbilityDesc);
		AbilityDesc.setLineWrap(true);
		AbilityDesc.setWrapStyleWord(true);
		
		AbilitySwapDown = new JButton("\u25BC");
		
		AbilitySwapUp = new JButton("\u25B2");
		GroupLayout gl_panelAbilities = new GroupLayout(panelAbilities);
		gl_panelAbilities.setHorizontalGroup(
			gl_panelAbilities.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAbilities.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelAbilities.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAbilities.createSequentialGroup()
							.addComponent(scrollPane_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addGroup(gl_panelAbilities.createParallelGroup(Alignment.LEADING)
								.addComponent(AbilitySwapUp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(AbilitySwapDown, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addComponent(scrollPane_8, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
						.addGroup(gl_panelAbilities.createSequentialGroup()
							.addComponent(btnAddAbilities, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnEditAbility, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnRemoveAbility, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panelAbilities.setVerticalGroup(
			gl_panelAbilities.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelAbilities.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panelAbilities.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelAbilities.createSequentialGroup()
							.addGroup(gl_panelAbilities.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_9, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
								.addGroup(gl_panelAbilities.createSequentialGroup()
									.addGap(69)
									.addComponent(AbilitySwapUp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addGap(70)
									.addComponent(AbilitySwapDown)))
							.addGap(10))
						.addGroup(gl_panelAbilities.createSequentialGroup()
							.addComponent(scrollPane_8, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
							.addGap(10)))
					.addGroup(gl_panelAbilities.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAddAbilities)
						.addComponent(btnEditAbility)
						.addComponent(btnRemoveAbility))
					.addGap(11))
		);
		panelAbilities.setLayout(gl_panelAbilities);

		JPanel panelArts = new JPanel();
		tabbedPane.addTab("Arts", null, panelArts, null);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);

		JPanel panel = new JPanel();
		tabbedPane_3.addTab("Techniques", null, panel, null);
		panel.setLayout(null);

		Creo_Score = new JTextField();
		Creo_Score.setText("0");
		Creo_Score.setBounds(92, 42, 72, 20);
		panel.add(Creo_Score);
		Creo_Score.setColumns(10);

		intellego_Score = new JTextField();
		intellego_Score.setText("0");
		intellego_Score.setColumns(10);
		intellego_Score.setBounds(92, 73, 72, 20);
		panel.add(intellego_Score);

		muto_Score = new JTextField();
		muto_Score.setText("0");
		muto_Score.setColumns(10);
		muto_Score.setBounds(92, 104, 72, 20);
		panel.add(muto_Score);

		perdo_Score = new JTextField();
		perdo_Score.setText("0");
		perdo_Score.setColumns(10);
		perdo_Score.setBounds(92, 135, 72, 20);
		panel.add(perdo_Score);

		rego_Score = new JTextField();
		rego_Score.setText("0");
		rego_Score.setColumns(10);
		rego_Score.setBounds(92, 166, 72, 20);
		panel.add(rego_Score);
		
		lblCreo = new JLabel("Creo:");
		lblCreo.setBounds(10, 42, 72, 20);
		panel.add(lblCreo);
		
		lblIntellego = new JLabel("Intellego:");
		lblIntellego.setBounds(10, 73, 72, 20);
		panel.add(lblIntellego);
		
		lblMuto = new JLabel("Muto:");
		lblMuto.setBounds(10, 104, 72, 20);
		panel.add(lblMuto);
		
		lblPerdo = new JLabel("Perdo:");
		lblPerdo.setBounds(10, 135, 72, 20);
		panel.add(lblPerdo);
		
		lblRego = new JLabel("Rego:");
		lblRego.setBounds(10, 166, 72, 20);
		panel.add(lblRego);
		
		lblScore = new JLabel("Score");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setBounds(92, 11, 72, 20);
		panel.add(lblScore);

		JPanel panel_1 = new JPanel();
		tabbedPane_3.addTab("Forms", null, panel_1, null);
		panel_1.setLayout(null);

		animal_Score = new JTextField();
		animal_Score.setText("0");
		animal_Score.setColumns(10);
		animal_Score.setBounds(92, 42, 72, 20);
		panel_1.add(animal_Score);

		aquam_Score = new JTextField();
		aquam_Score.setText("0");
		aquam_Score.setColumns(10);
		aquam_Score.setBounds(92, 73, 72, 20);
		panel_1.add(aquam_Score);

		auram_Score = new JTextField();
		auram_Score.setText("0");
		auram_Score.setColumns(10);
		auram_Score.setBounds(92, 104, 72, 20);
		panel_1.add(auram_Score);

		corpus_Score = new JTextField();
		corpus_Score.setText("0");
		corpus_Score.setColumns(10);
		corpus_Score.setBounds(92, 135, 72, 20);
		panel_1.add(corpus_Score);

		herbam_Score = new JTextField();
		herbam_Score.setText("0");
		herbam_Score.setColumns(10);
		herbam_Score.setBounds(92, 166, 72, 20);
		panel_1.add(herbam_Score);

		ignem_Score = new JTextField();
		ignem_Score.setText("0");
		ignem_Score.setColumns(10);
		ignem_Score.setBounds(314, 42, 72, 20);
		panel_1.add(ignem_Score);

		imaginem_Score = new JTextField();
		imaginem_Score.setText("0");
		imaginem_Score.setColumns(10);
		imaginem_Score.setBounds(314, 73, 72, 20);
		panel_1.add(imaginem_Score);

		mentem_Score = new JTextField();
		mentem_Score.setText("0");
		mentem_Score.setColumns(10);
		mentem_Score.setBounds(314, 104, 72, 20);
		panel_1.add(mentem_Score);

		terram_Score = new JTextField();
		terram_Score.setText("0");
		terram_Score.setColumns(10);
		terram_Score.setBounds(314, 135, 72, 20);
		panel_1.add(terram_Score);

		vim_Score = new JTextField();
		vim_Score.setText("0");
		vim_Score.setColumns(10);
		vim_Score.setBounds(314, 166, 72, 20);
		panel_1.add(vim_Score);
		
		label_5 = new JLabel("Score");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(92, 14, 72, 20);
		panel_1.add(label_5);
		
		label_6 = new JLabel("Score");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(314, 17, 72, 20);
		panel_1.add(label_6);
		
		lblAnimal = new JLabel("Animal:");
		lblAnimal.setBounds(10, 42, 72, 20);
		panel_1.add(lblAnimal);
		
		lblAquam = new JLabel("Aquam:");
		lblAquam.setBounds(10, 73, 72, 20);
		panel_1.add(lblAquam);
		
		lblAuram = new JLabel("Auram:");
		lblAuram.setBounds(10, 104, 72, 20);
		panel_1.add(lblAuram);
		
		lblCorpus = new JLabel("Corpus:");
		lblCorpus.setBounds(10, 135, 72, 20);
		panel_1.add(lblCorpus);
		
		lblHerbam = new JLabel("Herbam:");
		lblHerbam.setBounds(10, 166, 72, 20);
		panel_1.add(lblHerbam);
		
		lblIgnem = new JLabel("Ignem:");
		lblIgnem.setBounds(232, 42, 72, 20);
		panel_1.add(lblIgnem);
		
		lblImaginem = new JLabel("Imaginem:");
		lblImaginem.setBounds(232, 73, 72, 20);
		panel_1.add(lblImaginem);
		
		lblMentem = new JLabel("Mentem:");
		lblMentem.setBounds(232, 104, 72, 20);
		panel_1.add(lblMentem);
		
		lblTerram = new JLabel("Terram:");
		lblTerram.setBounds(232, 135, 72, 20);
		panel_1.add(lblTerram);
		
		lblVim = new JLabel("Vim:");
		lblVim.setBounds(232, 166, 72, 20);
		panel_1.add(lblVim);
		GroupLayout gl_panelArts = new GroupLayout(panelArts);
		gl_panelArts.setHorizontalGroup(
			gl_panelArts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelArts.createSequentialGroup()
					.addGap(10)
					.addComponent(tabbedPane_3, GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panelArts.setVerticalGroup(
			gl_panelArts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelArts.createSequentialGroup()
					.addGap(11)
					.addComponent(tabbedPane_3, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
					.addGap(11))
		);
		panelArts.setLayout(gl_panelArts);

		JPanel panelSpells = new JPanel();
		tabbedPane.addTab("Spells", null, panelSpells, null);

		JButton btnCreateNewSpell = new JButton("Create New Spell");
		btnCreateNewSpell.setToolTipText("Creates A New Spell");

		JButton btnRemoveSpell = new JButton("Remove Spell");
		btnRemoveSpell.setToolTipText("Remove Selected Spell");

		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setToolTipText("Refresh the Spell List");

		scrollPane_5 = new JScrollPane();

		JTextArea infoSpell = new JTextArea();
		scrollPane_5.setViewportView(infoSpell);
		infoSpell.setEditable(false);
		infoSpell.setLineWrap(true);

		scrollPane_4 = new JScrollPane();

		JList listSpell = new JList();

		scrollPane_4.setViewportView(listSpell);
		listSpell.setValueIsAdjusting(true);

		listSpell.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnCast = new JButton("Cast Spell");
		btnCast.setToolTipText("Cast Selected Spell");

		JPanel panelEquipment = new JPanel();
		tabbedPane.addTab("Equipment", null, panelEquipment, null);

		JScrollPane scrollPane_6 = new JScrollPane();

		Equipmenttable = new JTable();
		
		
		Equipmenttable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane_6.setViewportView(Equipmenttable);
		Equipmenttable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Item", "Amount"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		Equipmenttable.getColumnModel().getColumn(0).setPreferredWidth(130);
		Equipmenttable.getColumnModel().getColumn(1).setPreferredWidth(30);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		scrollPane_7 = new JScrollPane();
		
		EquipmentDesc = new JTextArea();
		scrollPane_7.setViewportView(EquipmentDesc);
		EquipmentDesc.setWrapStyleWord(true);
		EquipmentDesc.setLineWrap(true);
		EquipmentDesc.setEditable(false);

		JButton btnCreateNewItem = new JButton("Create New Item");
		btnCreateNewItem.setToolTipText("Creates a New Item");

		JButton btnAddToItem = new JButton("Add to Item");
		btnAddToItem.setToolTipText("Adds to Selected Item");

		JLabel lblItemAmount = new JLabel("Item amount:");

		JButton btnRemoveAllItem = new JButton("Remove Item");
		btnRemoveAllItem.setToolTipText("Removes Selected Item");

		JSpinner EquipmentAdder = new JSpinner();
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setToolTipText("Edits Selected Item");
		
		EquipmentSwapUp = new JButton("\u25B2");
		
		EquipmentSwapDown = new JButton("\u25BC");
		GroupLayout gl_panelEquipment = new GroupLayout(panelEquipment);
		gl_panelEquipment.setHorizontalGroup(
			gl_panelEquipment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEquipment.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelEquipment.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelEquipment.createSequentialGroup()
							.addComponent(scrollPane_6, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addGroup(gl_panelEquipment.createParallelGroup(Alignment.LEADING)
								.addComponent(EquipmentSwapUp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(EquipmentSwapDown, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_7)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panelEquipment.createSequentialGroup()
							.addComponent(btnCreateNewItem, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnEditItem, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblItemAmount, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addComponent(EquipmentAdder, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnAddToItem, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnRemoveAllItem, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		gl_panelEquipment.setVerticalGroup(
			gl_panelEquipment.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelEquipment.createSequentialGroup()
					.addGroup(gl_panelEquipment.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panelEquipment.createSequentialGroup()
							.addGap(11)
							.addGroup(gl_panelEquipment.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane_6, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
								.addGroup(gl_panelEquipment.createSequentialGroup()
									.addGap(69)
									.addComponent(EquipmentSwapUp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addGap(70)
									.addComponent(EquipmentSwapDown))))
						.addGroup(gl_panelEquipment.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_7)))
					.addGap(11)
					.addGroup(gl_panelEquipment.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCreateNewItem)
						.addComponent(btnEditItem)
						.addComponent(lblItemAmount, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(EquipmentAdder, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddToItem))
					.addGap(11)
					.addComponent(btnRemoveAllItem)
					.addGap(10))
		);
		panelEquipment.setLayout(gl_panelEquipment);

		JToggleButton tlgStressDie = new JToggleButton("Stress Die");
		tlgStressDie.setToolTipText("Stress Die Mode For Casting");
		
		JButton button_SwapUp = new JButton("\u25B2");
		
		JButton buttonSwapDown = new JButton("\u25BC");
		
		JButton btnEditSpell = new JButton("Edit Spell");
		btnEditSpell.setToolTipText("Edit Selected Spell");
		GroupLayout gl_panelSpells = new GroupLayout(panelSpells);
		gl_panelSpells.setHorizontalGroup(
			gl_panelSpells.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSpells.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSpells.createSequentialGroup()
							.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
								.addComponent(button_SwapUp, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonSwapDown, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
							.addGap(3)
							.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelSpells.createSequentialGroup()
									.addComponent(btnEditSpell, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
									.addGap(8)
									.addComponent(tlgStressDie, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelSpells.createSequentialGroup()
									.addComponent(scrollPane_5)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(gl_panelSpells.createSequentialGroup()
							.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnRemoveSpell, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(btnCreateNewSpell, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnCast, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		gl_panelSpells.setVerticalGroup(
			gl_panelSpells.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelSpells.createSequentialGroup()
					.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelSpells.createSequentialGroup()
							.addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addGap(5))
						.addGroup(gl_panelSpells.createSequentialGroup()
							.addGap(80)
							.addComponent(button_SwapUp, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(buttonSwapDown, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panelSpells.createSequentialGroup()
							.addComponent(scrollPane_5, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
							.addGap(1)
							.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
								.addComponent(btnEditSpell)
								.addComponent(tlgStressDie))))
					.addGap(6)
					.addGroup(gl_panelSpells.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRefresh)
						.addComponent(btnRemoveSpell)
						.addComponent(btnCreateNewSpell)
						.addComponent(btnCast))
					.addGap(7))
		);
		panelSpells.setLayout(gl_panelSpells);
		contentPane.add(tabbedPane);
		
		JPanel panelRolling = new JPanel();
		tabbedPane.addTab("Dice Rolling", null, panelRolling, null);
		
		simpleDieMod = new JTextField();
		simpleDieMod.setText("0");
		simpleDieMod.setColumns(10);
		
		JButton simpleDieRoll = new JButton("Roll Die");
		simpleDieRoll.setToolTipText("Roll a Simple Die");
		
		scrollPane_3 = new JScrollPane();
		
		JTextArea textAreaDieRoll2 = new JTextArea();
		scrollPane_3.setViewportView(textAreaDieRoll2);
		textAreaDieRoll2.setEditable(false);
		textAreaDieRoll2.setLineWrap(true);
		
		stressDieMod = new JTextField();
		stressDieMod.setText("0");
		stressDieMod.setColumns(10);
		
		JButton stressDieRoll = new JButton("Roll Die");
		stressDieRoll.setToolTipText("Roll Stress Die");
		
		simpleDieCount = new JTextField();
		simpleDieCount.setText("1");
		simpleDieCount.setColumns(10);
		
		stressDieCount = new JTextField();
		stressDieCount.setText("1");
		stressDieCount.setColumns(10);
		
		botchDieCount = new JTextField();
		botchDieCount.setText("1");
		botchDieCount.setColumns(10);
		
		JButton botchDieRoll = new JButton("Roll Die");
		botchDieRoll.setToolTipText("Roll Botch Die");
		
		nSidedDieCount = new JTextField();
		nSidedDieCount.setText("1");
		nSidedDieCount.setColumns(10);
		
		JButton nSidedDieRoll = new JButton("Roll Die");
		nSidedDieRoll.setToolTipText("Roll Any Sided Die");
		
		nSidedDieSides = new JTextField();
		nSidedDieSides.setText("10");
		nSidedDieSides.setColumns(10);
		
		lblModifier = new JLabel("Modifier:");
		
		lblOfDie = new JLabel("# of Die:");
		
		label_1 = new JLabel("# of Die:");
		
		label_2 = new JLabel("# of Die:");
		
		label_3 = new JLabel("Modifier:");
		
		label_4 = new JLabel("# of Die:");
		
		lblSides = new JLabel("Sides:");
		
		lblSimpleDie = new JLabel("Simple Die: (1-10)");
		lblSimpleDie.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblStressDie = new JLabel("Stress Die:(0-9)");
		lblStressDie.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblBotchDie = new JLabel("Botch Die: (0-9)");
		lblBotchDie.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNSidedDie = new JLabel("N Sided Die: (0 - (sides-1))");
		lblNSidedDie.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelRolling = new GroupLayout(panelRolling);
		gl_panelRolling.setHorizontalGroup(
			gl_panelRolling.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRolling.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSimpleDie, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addComponent(lblModifier, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(simpleDieMod, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelRolling.createSequentialGroup()
									.addGap(55)
									.addComponent(simpleDieCount, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblOfDie, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addComponent(simpleDieRoll, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblStressDie, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(stressDieMod, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelRolling.createSequentialGroup()
									.addGap(55)
									.addComponent(stressDieCount, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addComponent(stressDieRoll, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblBotchDie, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(botchDieCount, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(139)
							.addComponent(botchDieRoll, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNSidedDie, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addComponent(lblSides, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(nSidedDieSides, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panelRolling.createSequentialGroup()
									.addGap(55)
									.addComponent(nSidedDieCount, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
							.addGap(10)
							.addComponent(nSidedDieRoll, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panelRolling.setVerticalGroup(
			gl_panelRolling.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRolling.createSequentialGroup()
					.addGap(11)
					.addComponent(lblSimpleDie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(lblModifier, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(simpleDieMod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addComponent(simpleDieCount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOfDie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
						.addComponent(simpleDieRoll))
					.addGap(9)
					.addComponent(lblStressDie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(stressDieMod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(stressDieCount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(stressDieRoll))
					.addGap(9)
					.addComponent(lblBotchDie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(botchDieCount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botchDieRoll))
					.addGap(8)
					.addComponent(lblNSidedDie, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(lblSides, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addComponent(nSidedDieSides, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelRolling.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panelRolling.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(nSidedDieCount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(nSidedDieRoll)))
				.addGroup(Alignment.TRAILING, gl_panelRolling.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
					.addContainerGap())
		);
		panelRolling.setLayout(gl_panelRolling);

		nSidedDieRoll.addActionListener(new ActionListener() {// n sided die
			public void actionPerformed(ActionEvent arg0) {
				long start = System.nanoTime();
				if (nSidedDieSides.getText().equals("")) {
					nSidedDieSides.setText(10 + "");// sided die
				}
				if (nSidedDieCount.getText().equals("")) {//number of die
					nSidedDieCount.setText(1 + "");
				}
				
				DieRolls.nSided(Integer.parseInt(nSidedDieSides.getText()), Integer.parseInt(nSidedDieCount.getText()),textAreaDieRoll2);
				
			}
		});

		simpleDieRoll.addActionListener(new ActionListener() {// simple die
			public void actionPerformed(ActionEvent e) {
				if (simpleDieMod.getText().equals("")) {
					simpleDieMod.setText(0 + "");
				}
				if (simpleDieCount.getText().equals("")) {
					simpleDieCount.setText(1 + "");
				}
				DieRolls.simpleDie(Integer.parseInt(simpleDieMod.getText()), Integer.parseInt(simpleDieCount.getText()),textAreaDieRoll2);
				
			}
		});

		stressDieRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (stressDieMod.getText().equals("")) {
					stressDieMod.setText(0 + "");
				}
				if (stressDieCount.getText().equals("")) {
					stressDieCount.setText(1 + "");
				}
				DieRolls.stressDie(Integer.parseInt(stressDieMod.getText()), Integer.parseInt(stressDieCount.getText()), textAreaDieRoll2);
				
			}
		});

		botchDieRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (botchDieCount.getText().equals("")) {
					botchDieCount.setText(1 + "");
				}
				DieRolls.botchDie(Integer.parseInt(botchDieCount.getText()), textAreaDieRoll2);
				
			}
		});

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (comboBox.getSelectedIndex() != 0) {

					panelForMagi.setVisible(false);
					panelSpells.setEnabled(false);
					panelArts.setEnabled(false);
				} else {
					panelForMagi.setVisible(true);
					panelSpells.setEnabled(true);
					panelArts.setEnabled(true);
				}
			}
		});

		// textField_12 charactistic points starting
		// textField_13//spent points number
		// textField_14//remaining points

		int[][] points = new int[7][2];
		points[0][0] = -3;
		points[0][1] = -6;
		points[1][0] = -2;
		points[1][1] = -3;
		points[2][0] = -1;
		points[2][1] = -1;
		points[3][0] = 0;
		points[3][1] = 0;
		points[4][0] = 1;
		points[4][1] = 1;
		points[5][0] = 2;
		points[5][1] = 3;
		points[6][0] = 3;
		points[6][1] = 6;

		int_val.addActionListener(new ActionListener() {// intelligence -3 :
															// 3 box
			public void actionPerformed(ActionEvent arg0) {
				// int number = comboBox_1.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		per_val.addActionListener(new ActionListener() {// PERCEPTION -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_2.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		per_val.addActionListener(new ActionListener() {// PERCEPTION -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_2.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});
		str_val.addActionListener(new ActionListener() {// STRENGTH -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_3.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});
		sta_val.addActionListener(new ActionListener() {// STAMINA -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_4.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});
		pre_val.addActionListener(new ActionListener() {// PRESENCE -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_5.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		com_val.addActionListener(new ActionListener() {// COMMUNICATION -3 :
															// 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_6.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		dex_val.addActionListener(new ActionListener() {// DEXTERITY -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_7.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		qui_val.addActionListener(new ActionListener() {// QUICKNESS -3 : 3
			public void actionPerformed(ActionEvent e) {
				// int number = comboBox_8.getSelectedIndex();

				textField_13
						.setText((points[int_val.getSelectedIndex()][1] + points[per_val.getSelectedIndex()][1]
								+ points[str_val.getSelectedIndex()][1] + points[sta_val.getSelectedIndex()][1]
								+ points[pre_val.getSelectedIndex()][1] + points[com_val.getSelectedIndex()][1]
								+ points[dex_val.getSelectedIndex()][1] + points[qui_val.getSelectedIndex()][1])
								+ "");
				textField_14.setText(
						(-Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_12.getText())) + "");
			}
		});

		
		
		
		//Start Spell Stuff
		String [][] Spells = new String[1000][12];
		
		btnCreateNewSpell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane spell = new JOptionPane();//new GridLayout());
				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				String[] techniques = { "N/A", "Creo", "Intellego", "Muto", "Perdo", "Rego" };
				String[] forms = { "N/A", "Animal", "Aquam", "Auram", "Corpus", "Herbam", "Ignem", "Imaginem", "Mentem",
						"Terram", "Vim" };

				JCheckBox ritual = new JCheckBox();

				JComboBox tech = new JComboBox(techniques);
				JComboBox techreq = new JComboBox(techniques);

				JComboBox form = new JComboBox(forms);
				JComboBox formreq = new JComboBox(forms);

				panel.add(new JLabel("Techniques:")).setBounds(0, 0, 100, 20);

				panel.add(tech).setBounds(100, 0, 75, 20);
				panel.add(new JLabel("Techniques REQ:")).setBounds(0, 20, 100, 20);
				panel.add(techreq).setBounds(100, 20, 75, 20);

				panel.add(new JLabel("Forms:")).setBounds(200, 0, 75, 20);
				panel.add(form).setBounds(275, 0, 100, 20);
				panel.add(new JLabel("Forms REQ:")).setBounds(200, 20, 75, 20);
				panel.add(formreq).setBounds(275, 20, 100, 20);

				panel.add(new JLabel("Ritual?")).setBounds(0, 40, 50, 20);
				panel.add(ritual).setBounds(50, 40, 20, 20);

				panel.add(new JLabel("Name:")).setBounds(0, 60, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 60, 275, 20);

				panel.add(new JLabel("Level:")).setBounds(0, 80, 50, 20);
				JTextField level = new JTextField();
				panel.add(level).setBounds(50, 80, 100, 20);

				panel.add(new JLabel("Range:")).setBounds(175, 80, 50, 20);
				JTextField range = new JTextField();
				panel.add(range).setBounds(225, 80, 100, 20);

				panel.add(new JLabel("Duration:")).setBounds(0, 100, 100, 20);
				JTextField Duration = new JTextField();
				panel.add(Duration).setBounds(55, 100, 95, 20);

				panel.add(new JLabel("Target:")).setBounds(175, 100, 50, 20);
				JTextField Target = new JTextField();
				panel.add(Target).setBounds(225, 100, 100, 20);

				panel.add(new JLabel("Sense:")).setBounds(175, 120, 50, 20);
				JTextField Sense = new JTextField("N/A");
				panel.add(Sense).setBounds(225, 120, 100, 20);

				JTextArea desc = new JTextArea();
				desc.setLineWrap(true);

				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setBounds(0, 160, 400, 80);

				scrollPane_Desc.setViewportView(desc);
				panel.add(scrollPane_Desc);
				panel.add(new JLabel("Description:")).setBounds(0, 140, 100, 20);

				int result = JOptionPane.showConfirmDialog(null, panel, "Spells", JOptionPane.OK_CANCEL_OPTION);// ,
																												// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					
					Spells[SpellArrayIndex][0]=name.getText()+"";
					Spells[SpellArrayIndex][1]=tech.getSelectedIndex()+"";
					Spells[SpellArrayIndex][2]=techreq.getSelectedIndex()+"";
					Spells[SpellArrayIndex][3]=form.getSelectedIndex()+"";
					Spells[SpellArrayIndex][4]=formreq.getSelectedIndex()+"";
					Spells[SpellArrayIndex][5]=ritual.isSelected()+"";
					Spells[SpellArrayIndex][6]=level.getText()+"";
					Spells[SpellArrayIndex][7]=range.getText()+"";
					Spells[SpellArrayIndex][8]=Duration.getText()+"";
					Spells[SpellArrayIndex][9]=Target.getText()+"";
					Spells[SpellArrayIndex][10]=Sense.getText()+"";
					Spells[SpellArrayIndex][11]=desc.getText()+"";
					SpellArrayIndex+=1;
					
					//REFRESH
					listSpell.setModel(RefreshModel.Refresh(Spells,SpellArrayIndex));
					
				}
			}

		});

		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//REFRESH
				listSpell.setModel(RefreshModel.Refresh(Spells,SpellArrayIndex));

			}
		});

		listSpell.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				String[] tech = new String[6];
				tech[0] = "N/A";
				tech[1] = "Creo";
				tech[2] = "Intellego";
				tech[3] = "Muto";
				tech[4] = "Perdo";
				tech[5] = "Rego";

				String[] form = new String[11];
				form[0] = "N/A";
				form[1] = "Animal";
				form[2] = "Aquam";
				form[3] = "Auram";
				form[4] = "Corpus";
				form[5] = "Herbam";
				form[6] = "Ignem";
				form[7] = "Imaginem";
				form[8] = "Mentem";
				form[9] = "Terram";
				form[10] = "Vim";
				
				int iterator = listSpell.getSelectedIndex();
				if(iterator<0)
					return;
				
				infoSpell.setText("");
				infoSpell.setText(infoSpell.getText() + "Level: \n" + Spells[iterator][6]);

				infoSpell.setText(infoSpell.getText() + "\n\nTechniques: \n"
							+ tech[Integer.valueOf(Spells[iterator][1])]);

				if (!Spells[iterator][2].equals("0"))
					infoSpell.setText(infoSpell.getText() + "\n\nTechniques Req: \n"
								+ tech[Integer.valueOf(Spells[iterator][2])]);

				infoSpell.setText(infoSpell.getText() + "\n\nForms: \n"
							+ form[Integer.valueOf(Spells[iterator][3])]);

				if (!Spells[iterator][4].equals("0"))
					infoSpell.setText(infoSpell.getText() + "\n\nForm Req: \n"
								+ form[Integer.valueOf(Spells[iterator][4])]);

				infoSpell.setText(infoSpell.getText() + "\n\nRitual: \n" + Spells[iterator][5]);
				infoSpell.setText(infoSpell.getText() + "\n\nRange: \n" + Spells[iterator][7]);
				infoSpell.setText(infoSpell.getText() + "\n\nDuration: \n" + Spells[iterator][8]);
				infoSpell.setText(infoSpell.getText() + "\n\nTarget: \n" + Spells[iterator][9]);

				if (!Spells[iterator][10].equals("N/A")) {
					infoSpell.setText(infoSpell.getText() + "\n\nSense: \n" + Spells[iterator][10]);

				}
				infoSpell.setText(infoSpell.getText() + "\n" + "\n" + "Description:\n" + Spells[iterator][11]);
					
				infoSpell.setCaretPosition(0);
				
			}
		});

		btnRemoveSpell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (listSpell.getSelectedIndex() == -1) {
					return;
				}
				int result = JOptionPane.showConfirmDialog(null,
						"Are you Sure you want to delete this spell. This can not be undone!", null,
						JOptionPane.YES_NO_CANCEL_OPTION);// ,
															// JOptionPane.PLAIN_MESSAGE);

				if (result != 0) {
					return;
				}
				
				int removedNumber = listSpell.getSelectedIndex();
				for(int i=0; i<=11;i++){
					Spells[removedNumber][i]=Spells[SpellArrayIndex-1][i];
				}
				SpellArrayIndex-=1;
				
				//REFRESH
				listSpell.setModel(RefreshModel.Refresh(Spells,SpellArrayIndex));
				
				infoSpell.setText("");

			}
		});

		btnCast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (listSpell.getSelectedIndex() == -1) {
					return;
				}

				UIManager.put("OptionPane.minimumSize", new Dimension(200, 100));

				int selected = listSpell.getSelectedIndex();
				int mod = 0;

				int[] scoreTech = new int[5];
				scoreTech[0] = Integer.parseInt(Creo_Score.getText());
				scoreTech[1] = Integer.parseInt(intellego_Score.getText());
				scoreTech[2] = Integer.parseInt(muto_Score.getText());
				scoreTech[3] = Integer.parseInt(perdo_Score.getText());
				scoreTech[4] = Integer.parseInt(rego_Score.getText());

				int tech = Integer.parseInt(Spells[selected][1]) - 1;

				if (!Spells[selected][2].equals("0")) {
					
					int techReq = Integer.parseInt(Spells[selected][2]) - 1;

					mod += Math.min(scoreTech[tech], scoreTech[techReq]);

				} else {
					mod += scoreTech[tech];
				}

				int[] scoreForm = new int[10];
				scoreForm[0] = Integer.parseInt(animal_Score.getText());
				scoreForm[1] = Integer.parseInt(aquam_Score.getText());
				scoreForm[2] = Integer.parseInt(auram_Score.getText());
				scoreForm[3] = Integer.parseInt(corpus_Score.getText());
				scoreForm[4] = Integer.parseInt(herbam_Score.getText());
				scoreForm[5] = Integer.parseInt(ignem_Score.getText());
				scoreForm[6] = Integer.parseInt(imaginem_Score.getText());
				scoreForm[7] = Integer.parseInt(mentem_Score.getText());
				scoreForm[8] = Integer.parseInt(terram_Score.getText());
				scoreForm[9] = Integer.parseInt(vim_Score.getText());

				int form = Integer.parseInt(Spells[selected][3]) - 1;
				if (!Spells[selected][4].equals("0")) {
					int formReq = Integer.parseInt(Spells[selected][4]) - 1;
					mod += Math.min(scoreForm[form], scoreForm[formReq]);
				} else {
					mod += scoreForm[form];
				}

				mod += sta_val.getSelectedIndex() - 3;// stamina

				
				boolean casted = false;
				int fatigue = 0;

				int level = Integer.parseInt(Spells[selected][6]);

				if (tlgStressDie.isSelected()) {
					int total[] = DieRolls.stressDie(mod, 1,null);
					boolean Botched = false;

					//check to see if Botched
					if (total[1] >= 1)
						Botched = true;

					if (!Botched) {

						if ((total[0] - level) >= 0)
							casted = true;
						else if ((total[0] - level) >= -10) {
							casted = true;
							fatigue = 1;
						} else {
							casted = false;
							fatigue = 1;
						}
						JOptionPane.showMessageDialog(null,
								"Casted: " + casted + "\nFatigue: " + fatigue + "\nTotal rolled: " + total[0]);
					} else {// roll botch die
						//"Rolled"+total[1]+" Botch Die\n"+
						JOptionPane.showMessageDialog(null, "Botched: Roll Botch Die");
					}

				} else {// tlgStressDie false

					int total = DieRolls.simpleDie(mod, 1, null);
					if ((total - level) >= 0)
						casted = true;
					else if ((total - level) >= -10) {
						casted = true;
						fatigue = 1;
					} else {
						casted = false;
						fatigue = 1;
					}
					JOptionPane.showMessageDialog(null,
							"Casted: " + casted + "\nFatigue: " + fatigue + "\nTotal rolled: " + total);
				}

			}
		});
			
		btnEditSpell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int selected = listSpell.getSelectedIndex();
				if ( selected == -1) {
					return;
				}
				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				String[] techniques = { "N/A", "Creo", "Intellego", "Muto", "Perdo", "Rego" };
				String[] forms = { "N/A", "Animal", "Aquam", "Auram", "Corpus", "Herbam", "Ignem", "Imaginem", "Mentem",
						"Terram", "Vim" };

				JCheckBox ritual = new JCheckBox();
				

				JComboBox tech = new JComboBox(techniques);
				JComboBox techreq = new JComboBox(techniques);

				JComboBox form = new JComboBox(forms);
				JComboBox formreq = new JComboBox(forms);

				panel.add(new JLabel("Name:")).setBounds(0, 60, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 60, 275, 20);
				name.setText(Spells[selected][0]);
				
				panel.add(new JLabel("Techniques:")).setBounds(0, 0, 100, 20);
				panel.add(tech).setBounds(100, 0, 75, 20);
				tech.setSelectedIndex(Integer.parseInt(Spells[selected][1]));
				
				panel.add(new JLabel("Techniques REQ:")).setBounds(0, 20, 100, 20);
				panel.add(techreq).setBounds(100, 20, 75, 20);
				techreq.setSelectedIndex(Integer.parseInt(Spells[selected][2]));
				
				panel.add(new JLabel("Forms:")).setBounds(200, 0, 75, 20);
				panel.add(form).setBounds(275, 0, 100, 20);
				form.setSelectedIndex(Integer.parseInt(Spells[selected][3]));				
				
				panel.add(new JLabel("Forms REQ:")).setBounds(200, 20, 75, 20);
				panel.add(formreq).setBounds(275, 20, 100, 20);
				formreq.setSelectedIndex(Integer.parseInt(Spells[selected][4]));
				

				panel.add(new JLabel("Ritual?")).setBounds(0, 40, 50, 20);
				panel.add(ritual).setBounds(50, 40, 20, 20);
				if(Spells[selected][5].equals("true"))
					ritual.setSelected(true);

				panel.add(new JLabel("Level:")).setBounds(0, 80, 50, 20);
				JTextField level = new JTextField();
				panel.add(level).setBounds(50, 80, 100, 20);
				level.setText(Spells[selected][6]);

				panel.add(new JLabel("Range:")).setBounds(175, 80, 50, 20);
				JTextField range = new JTextField();
				panel.add(range).setBounds(225, 80, 100, 20);
				range.setText(Spells[selected][7]);

				panel.add(new JLabel("Duration:")).setBounds(0, 100, 100, 20);
				JTextField Duration = new JTextField();
				panel.add(Duration).setBounds(55, 100, 95, 20);
				Duration.setText(Spells[selected][8]);

				panel.add(new JLabel("Target:")).setBounds(175, 100, 50, 20);
				JTextField Target = new JTextField();
				panel.add(Target).setBounds(225, 100, 100, 20);
				Target.setText(Spells[selected][9]);

				panel.add(new JLabel("Sense:")).setBounds(175, 120, 50, 20);
				JTextField Sense = new JTextField("N/A");
				panel.add(Sense).setBounds(225, 120, 100, 20);
				Sense.setText(Spells[selected][10]);
				
				JTextArea desc = new JTextArea();
				desc.setLineWrap(true);
				desc.setText(Spells[selected][11]);

				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setBounds(0, 160, 400, 80);

				scrollPane_Desc.setViewportView(desc);
				panel.add(scrollPane_Desc);
				panel.add(new JLabel("Description:")).setBounds(0, 140, 100, 20);

				int result = JOptionPane.showConfirmDialog(null, panel, "Spells", JOptionPane.OK_CANCEL_OPTION);// ,
																												// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Spells[selected][0]=name.getText()+"";
					Spells[selected][1]=tech.getSelectedIndex()+"";
					Spells[selected][2]=techreq.getSelectedIndex()+"";
					Spells[selected][3]=form.getSelectedIndex()+"";
					Spells[selected][4]=formreq.getSelectedIndex()+"";
					Spells[selected][5]=ritual.isSelected()+"";
					Spells[selected][6]=level.getText()+"";
					Spells[selected][7]=range.getText()+"";
					Spells[selected][8]=Duration.getText()+"";
					Spells[selected][9]=Target.getText()+"";
					Spells[selected][10]=Sense.getText()+"";
					Spells[selected][11]=desc.getText()+"";
					//SpellArrayIndex+=1;
					
					//REFRESH
					listSpell.setModel(RefreshModel.Refresh(Spells,SpellArrayIndex));
					infoSpell.setText("");
				}
				
			}
		});
		
		button_SwapUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.up(listSpell, Spells, SpellArrayIndex, 11);
				
			}
		});
		
		buttonSwapDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.down(listSpell, Spells, SpellArrayIndex, 11);
				
			}
		});
		//end spell stuff
		
		
		
		// Virtues
		String [][] Virtues = new String[1000][4];
		btnAddVirtue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Major:")).setBounds(0, 20, 50, 20);
				JCheckBox major = new JCheckBox();
				panel.add(major).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Type:")).setBounds(100, 20, 50, 20);
				JTextField type = new JTextField();
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Virtues", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Virtues[VirtueArrayIndex][0]=name.getText();
					Virtues[VirtueArrayIndex][1]=major.isSelected()+"";
					Virtues[VirtueArrayIndex][2]=type.getText();
					Virtues[VirtueArrayIndex][3]=description.getText();
					VirtueArrayIndex+=1;
					
					//find out points
					int points = Integer.parseInt(virtuePoints.getText());
					
					if(major.isSelected())
						points += 3;
					else
						points +=1;
					
					virtuePoints.setText(points+"");

					//REFRESH
					list_Virtues.setModel(RefreshModel.Refresh(Virtues,VirtueArrayIndex));
					
				}
			}
		});
		
		list_Virtues.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int selected = list_Virtues.getSelectedIndex();
				
				if(selected==-1)
					return;
				
				if(selected<0)
					return;
				
				VirtueDesc.setText("");
				VirtueDesc.setText(VirtueDesc.getText() + "Major: \n" + Virtues[selected][1]);
				VirtueDesc.setText(VirtueDesc.getText() + "\n\nType: \n" + Virtues[selected][2]);
				VirtueDesc.setText(VirtueDesc.getText() + "\n" + "\n" + "Description:\n" + Virtues[selected][3]);
					
				VirtueDesc.setCaretPosition(0);
				
			}
		});
		
		btnRemoveSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = list_Virtues.getSelectedIndex();
				
				if (selected == -1) {
					return;
				}
				int result = JOptionPane.showConfirmDialog(null,
						"Are you Sure you want to delete this virtue. This can not be undone!", null,
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (result != 0) {
					return;
				}
				int points = Integer.parseInt(virtuePoints.getText());
				
				if(Virtues[selected][1].equals("true"))
					points -= 3;
				else
					points -=1;
				
				virtuePoints.setText(points+"");
				
				
				for(int i=0; i<=3;i++){
					Virtues[selected][i]=Virtues[VirtueArrayIndex-1][i];
				}
				VirtueArrayIndex-=1;
				VirtueDesc.setText("");
				
				//REFRESH
				list_Virtues.setModel(RefreshModel.Refresh(Virtues,VirtueArrayIndex));
				
			}
		});

		btnEdit_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = list_Virtues.getSelectedIndex();
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				name.setText(Virtues[selected][0]);
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Major:")).setBounds(0, 20, 50, 20);
				JCheckBox major = new JCheckBox();
				if(Virtues[selected][1].equals("true"))
					major.setSelected(true);
				panel.add(major).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Type:")).setBounds(100, 20, 50, 20);
				JTextField type = new JTextField();
				type.setText(Virtues[selected][2]);
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setText(Virtues[selected][3]);
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Virtues", JOptionPane.OK_CANCEL_OPTION);// ,
				

				if (result == 0) {// pressed OK
					
					
					Boolean previousMajor = Virtues[selected][1].equals("true");
					Virtues[selected][0]=name.getText();
					Virtues[selected][1]=major.isSelected()+"";
					Virtues[selected][2]=type.getText();
					Virtues[selected][3]=description.getText();
					
					
					//find out points
					int points = Integer.parseInt(virtuePoints.getText());
					
					if(major.isSelected()!=previousMajor){
						if(major.isSelected()){
							points+=2;
						}else{
							points-=2;
						}
					}
					VirtueDesc.setText("");
					
					virtuePoints.setText(points+"");
				}
					
				//REFRESH
				list_Virtues.setModel(RefreshModel.Refresh(Virtues,VirtueArrayIndex));
			}
		});
		
		VirtueUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				swap.up(list_Virtues, Virtues, VirtueArrayIndex, 3);
				
			}
		});
		
		VirtueDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.down(list_Virtues, Virtues, VirtueArrayIndex, 3);
				
			}
		});
		// end Virtues

		// Flaw
		String[][]Flaws = new String[1000][4];
		btnAddFlaw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Major:")).setBounds(0, 20, 50, 20);
				JCheckBox major = new JCheckBox();
				panel.add(major).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Type:")).setBounds(100, 20, 50, 20);
				JTextField type = new JTextField();
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Flaws", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Flaws[FlawArrayIndex][0]=name.getText();					
					Flaws[FlawArrayIndex][1]=major.isSelected()+"";
					Flaws[FlawArrayIndex][2]=type.getText();
					Flaws[FlawArrayIndex][3]=description.getText();
					FlawArrayIndex+=1;
					
					//find out points
					int points = Integer.parseInt(FlawPoints.getText());
					
					if(major.isSelected())
						points += 3;
					else
						points +=1;
					
					FlawPoints.setText(points+"");

					//REFRESH					
					FlawNameBox.setModel(RefreshModel.Refresh(Flaws,FlawArrayIndex));
				}
			}
		});

		FlawRemove.addActionListener(new ActionListener() {// remove
			public void actionPerformed(ActionEvent e) {
				int selected = FlawNameBox.getSelectedIndex();
				
				if (selected == -1) {
					return;
				}
				int result = JOptionPane.showConfirmDialog(null,
						"Are you Sure you want to delete this flaw. This can not be undone!", null,
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (result != 0) {
					return;
				}
				int points = Integer.parseInt(FlawPoints.getText());
				
				if(Flaws[selected][1].equals("true"))
					points -= 3;
				else
					points -=1;
				
				FlawPoints.setText(points+"");
				
				
				for(int i=0; i<=3;i++){
					Flaws[selected][i]=Flaws[FlawArrayIndex-1][i];
				}
				FlawArrayIndex-=1;
				FlawDesc.setText("");

				//REFRESH				
				FlawNameBox.setModel(RefreshModel.Refresh(Flaws,FlawArrayIndex));
				
			}
		});

		FlawEdit.addActionListener(new ActionListener() {// refresh
			public void actionPerformed(ActionEvent e) {
				
				int selected = FlawNameBox.getSelectedIndex();
				
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				name.setText(Flaws[selected][0]);
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Major:")).setBounds(0, 20, 50, 20);
				JCheckBox major = new JCheckBox();
				if(Flaws[selected][1].equals("true"))
					major.setSelected(true);
				panel.add(major).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Type:")).setBounds(100, 20, 50, 20);
				JTextField type = new JTextField();
				type.setText(Flaws[selected][2]);
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setText(Flaws[selected][3]);
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Flaws", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				Boolean previousMajor = Flaws[selected][1].equals("true");	
				
				if (result == 0) {// pressed OK
					Flaws[selected][0]=name.getText();					
					Flaws[selected][1]=major.isSelected()+"";
					Flaws[selected][2]=type.getText();
					Flaws[selected][3]=description.getText();
					
					//find out points
					int points = Integer.parseInt(FlawPoints.getText());				
					if(major.isSelected()!=previousMajor){
						if(major.isSelected()){
							points+=2;
						}else{
							points-=2;
						}
					}
					FlawDesc.setText("");
					
					
					FlawPoints.setText(points+"");
				}
				//REFRESH
				FlawNameBox.setModel(RefreshModel.Refresh(Flaws,FlawArrayIndex));
			}
		});
		
		FlawNameBox.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int selected = FlawNameBox.getSelectedIndex();
				
				if(selected==-1)
					return;
				
				if(selected<0)
					return;
				
				FlawDesc.setText("");
				FlawDesc.setText(FlawDesc.getText() + "Major: \n" + Flaws[selected][1]);
				FlawDesc.setText(FlawDesc.getText() + "\n\nType: \n" + Flaws[selected][2]);
				FlawDesc.setText(FlawDesc.getText() + "\n" + "\n" + "Description:\n" + Flaws[selected][3]);
					
				FlawDesc.setCaretPosition(0);
			}
		});
		
		FlawUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				swap.up(FlawNameBox, Flaws, FlawArrayIndex, 3);
				
			}
		});
		
		FlawDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.down(FlawNameBox, Flaws, FlawArrayIndex, 3);
			}
		});
		// end Flaws

		// abilities
		String[][]Ability = new String[1000][4];
		
		btnAddAbilities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Score:")).setBounds(0, 20, 50, 20);
				JTextField score = new JTextField();
				panel.add(score).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Specialzation:")).setBounds(70, 20, 100, 20);
				JTextField type = new JTextField();
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Abilities", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Ability[AbilityArrayIndex][0]=name.getText();					
					Ability[AbilityArrayIndex][1]=score.getText()+"";
					Ability[AbilityArrayIndex][2]=type.getText();
					Ability[AbilityArrayIndex][3]=description.getText();
					AbilityArrayIndex+=1;
					

					//REFRESH
					AbilityNames.setModel(RefreshModel.Refresh(Ability,AbilityArrayIndex));
				}
			}
		});

		btnEditAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected =  AbilityNames.getSelectedIndex();
				
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));

				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				name.setText(Ability[selected][0]);
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Score:")).setBounds(0, 20, 50, 20);
				JTextField score = new JTextField();
				score.setText(Ability[selected][1]);
				panel.add(score).setBounds(50, 20, 20, 20);

				panel.add(new JLabel("Specialzation:")).setBounds(70, 20, 100, 20);
				JTextField type = new JTextField();
				type.setText(Ability[selected][2]);
				panel.add(type).setBounds(150, 20, 250, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setText(Ability[selected][3]);
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Abilities", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Ability[selected][0]=name.getText();					
					Ability[selected][1]=score.getText()+"";
					Ability[selected][2]=type.getText();
					Ability[selected][3]=description.getText();					

					AbilityDesc.setText("");
					//REFRESH
					AbilityNames.setModel(RefreshModel.Refresh(Ability,AbilityArrayIndex));
				}
			}
		});

		btnRemoveAbility.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = AbilityNames.getSelectedIndex();
				
				if (selected == -1) {
					return;
				}
				int result = JOptionPane.showConfirmDialog(null,
						"Are you Sure you want to delete this ability. This can not be undone!", null,
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (result != 0) {
					return;
				}			
				
				for(int i=0; i<=3;i++){
					Ability[selected][i]=Ability[AbilityArrayIndex-1][i];
				}
				AbilityArrayIndex-=1;
				AbilityDesc.setText("");

				
				//REFRESH
			
				AbilityNames.setModel(RefreshModel.Refresh(Ability,AbilityArrayIndex));
			}
		});
		
		AbilityNames.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int selected = AbilityNames.getSelectedIndex();
				
				if(selected==-1)
					return;
				
				if(selected<0)
					return;
				
				AbilityDesc.setText("");
				AbilityDesc.setText(AbilityDesc.getText() + "Score: \n" + Ability[selected][1]);
				AbilityDesc.setText(AbilityDesc.getText() + "\n\nType: \n" + Ability[selected][2]);
				AbilityDesc.setText(AbilityDesc.getText() + "\n" + "\n" + "Description:\n" + Ability[selected][3]);
					
				AbilityDesc.setCaretPosition(0);
			}
		});
		
		AbilitySwapUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.up(AbilityNames, Ability, AbilityArrayIndex,3);
			}
		});
		AbilitySwapDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swap.down(AbilityNames,Ability,AbilityArrayIndex,3);
				
			}
		});
		// end Abilities

		// Equipment
		String[][]Equipment = new String[1000][3];
		//DefaultComboBoxModel EquipmentNames = new DefaultComboBoxModel();
		DefaultTableModel EquipmentNames = (DefaultTableModel) Equipmenttable.getModel();
		
		btnCreateNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));
				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Amount:")).setBounds(0, 20, 50, 20);
				JTextField amount = new JTextField("");
				panel.add(amount).setBounds(50, 20, 350, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Equipment", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Equipment[EquipmentArrayIndex][0]=name.getText();	
					Equipment[EquipmentArrayIndex][1]=amount.getText();
					Equipment[EquipmentArrayIndex][2]=description.getText();
					EquipmentArrayIndex+=1;
			
					EquipmentNames.addRow(new Object[]{Equipment[EquipmentArrayIndex-1][0], Equipment[EquipmentArrayIndex-1][1]});
					Equipmenttable.setModel(EquipmentNames);
				}
			}
		});
		
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int selected = Equipmenttable.getSelectedRow();
				
				UIManager.put("OptionPane.minimumSize", new Dimension(500, 300));
				JPanel panel = new JPanel();// new GridLayout());
				panel.setLayout(null);

				panel.add(new JLabel("Name:")).setBounds(0, 0, 50, 20);
				JTextField name = new JTextField();
				name.setText(Equipment[selected][0]);
				panel.add(name).setBounds(50, 0, 350, 20);

				panel.add(new JLabel("Amount:")).setBounds(0, 20, 50, 20);
				JTextField amount = new JTextField("");
				amount.setText(Equipment[selected][1]);
				panel.add(amount).setBounds(50, 20, 350, 20);

				panel.add(new JLabel("Description:")).setBounds(0, 100, 100, 20);
				JTextArea description = new JTextArea();
				description.setText(Equipment[selected][2]);
				description.setLineWrap(true);
				
				JScrollPane scrollPane_Desc = new JScrollPane();
				scrollPane_Desc.setViewportView(description);
				panel.add(scrollPane_Desc).setBounds(0, 120, 400, 100);

				int result = JOptionPane.showConfirmDialog(null, panel, "Equipment", JOptionPane.OK_CANCEL_OPTION);// ,
																													// JOptionPane.PLAIN_MESSAGE);

				if (result == 0) {// pressed OK
					Equipment[selected][0]=name.getText();	
					Equipment[selected][1]=amount.getText();
					Equipment[selected][2]=description.getText();
					EquipmentNames.setValueAt(name.getText(), selected, 0);
					EquipmentNames.setValueAt(amount.getText(), selected, 1);
					//EquipmentNames.addRow(new Object[]{Equipment[EquipmentArrayIndex-1][0], Equipment[EquipmentArrayIndex-1][1]});
					Equipmenttable.setModel(EquipmentNames);
					EquipmentDesc.setText(description.getText());
				}
				
			}
		});
		
		Equipmenttable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				int selected = Equipmenttable.getSelectedRow();
				if(selected <0)
					return;
				
				EquipmentDesc.setText("");
				EquipmentDesc.setText(Equipment[selected][2]);
				EquipmentDesc.setCaretPosition(0);
			}
		});
		
		btnAddToItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = Equipmenttable.getSelectedRow();
				if (selected < 0)
					return;
				
				int Total;
				if(Equipment[selected][1].equals(""))
				{
					Total = Integer.parseInt(EquipmentAdder.getValue().toString());
				}
				else
				{
					int adder = Integer.parseInt(EquipmentAdder.getValue().toString());
					Total = Integer.parseInt(Equipment[selected][1])+adder;
				}
				
				Equipment[selected][1]=Total+"";
				EquipmentNames.setValueAt(Equipment[selected][1], selected, 1);
			}
		});

		btnRemoveAllItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = Equipmenttable.getSelectedRow();
				
				if(selected <0)
					return;
				
				EquipmentNames.removeRow(selected);
				
				for(int i = selected; i<=EquipmentArrayIndex; i ++)
				{
					for(int a=0;a<=2;a++){
						Equipment[i][a]=Equipment[i+1][a];
					}
				}
					
				EquipmentArrayIndex-=1;
				EquipmentDesc.setText("");
				
			}
		});
		
		EquipmentSwapUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected =  Equipmenttable.getSelectedRow();
				if(selected <= 0)
					return;
				
				String temp;
				
				for(int i=0; i<=2;i++){
					temp=Equipment[selected][i];
					Equipment[selected][i]=Equipment[selected-1][i];
					Equipment[selected-1][i]=temp;
				}

				String temp1= Equipmenttable.getValueAt(selected, 0).toString();
				String temp2= Equipmenttable.getValueAt(selected, 1).toString();
				
				Equipmenttable.setValueAt(Equipmenttable.getValueAt(selected-1, 0).toString(), selected,0);
				Equipmenttable.setValueAt(Equipmenttable.getValueAt(selected-1, 1).toString(), selected,1);
				
				Equipmenttable.setValueAt(temp1,selected-1,0);
				Equipmenttable.setValueAt(temp2,selected-1,1);

				//keep the selected item selected
				Equipmenttable.grabFocus();
				Equipmenttable.changeSelection(selected-1, 0, false, false);
			}
		});
		
		EquipmentSwapDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected =  Equipmenttable.getSelectedRow();
				if(selected ==EquipmentArrayIndex-1)
					return;
				
				String temp;
				
				for(int i=0; i<=2;i++){
					temp=Equipment[selected][i];
					Equipment[selected][i]=Equipment[selected+1][i];
					Equipment[selected+1][i]=temp;
				}
				
				String temp1= Equipmenttable.getValueAt(selected, 0).toString();
				String temp2= Equipmenttable.getValueAt(selected, 1).toString();
				
				Equipmenttable.setValueAt(Equipmenttable.getValueAt(selected+1, 0).toString(), selected,0);
				Equipmenttable.setValueAt(Equipmenttable.getValueAt(selected+1, 1).toString(), selected,1);
				
				Equipmenttable.setValueAt(temp1,selected+1,0);
				Equipmenttable.setValueAt(temp2,selected+1,1);
				
				//keep the selected item selected
				Equipmenttable.grabFocus();
				Equipmenttable.changeSelection(selected+1, 0, false, false);
			}
		});
		// end Equipment

		
		
		//start save and load
		
		mntmLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileLoaded = new File("./Info/temp.json");

				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON file", "JSON", "json");
				fileChooser.setFileFilter(filter);

				if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fileChooser.getSelectedFile();
					// load from file

					JSONParser parser = new JSONParser();
					Object obj;
					try {
						obj = parser.parse(new FileReader(file.getAbsolutePath()));
						
						JSONObject json = (JSONObject) obj;

						Creo_Score.setText(json.get("Creo").toString());
						intellego_Score.setText(json.get("Intellego").toString());
						muto_Score.setText(json.get("Muto").toString());
						perdo_Score.setText(json.get("Perdo").toString());
						rego_Score.setText(json.get("Rego").toString());

						animal_Score.setText(json.get("Animal").toString());
						aquam_Score.setText(json.get("Aquam").toString());
						auram_Score.setText(json.get("Auram").toString());
						corpus_Score.setText(json.get("Corpus").toString());
						herbam_Score.setText(json.get("Herbam").toString());
						ignem_Score.setText(json.get("Ignem").toString());
						imaginem_Score.setText(json.get("Imaginem").toString());
						mentem_Score.setText(json.get("Mentem").toString());
						terram_Score.setText(json.get("Terram").toString());
						vim_Score.setText(json.get("Vim").toString());

						textField.setText(json.get("Name").toString());
						comboBox.setSelectedIndex(Integer.parseInt(json.get("Type").toString()));
						textField_1.setText(json.get("Gender").toString());
						textField_2.setText(json.get("Birth Year").toString());
						textField_3.setText(json.get("Saga Name").toString());
						textField_4.setText(json.get("Religion").toString());
						textField_5.setText(json.get("Current Year").toString());
						textField_6.setText(json.get("Apparent Age").toString());
						textField_7.setText(json.get("Graduation Year").toString());
						textField_8.setText(json.get("Covenant").toString());
						textField_9.setText(json.get("Tribunal").toString());
						textField_10.setText(json.get("Longevity Ritual").toString());
						textField_11.setText(json.get("Warp").toString());
						comboBox_9.setSelectedIndex(Integer.parseInt(json.get("House").toString()));

						int_val.setSelectedIndex(Integer.parseInt(json.get("Int").toString()));
						per_val.setSelectedIndex(Integer.parseInt(json.get("Per").toString()));
						str_val.setSelectedIndex(Integer.parseInt(json.get("Str").toString()));
						sta_val.setSelectedIndex(Integer.parseInt(json.get("Sta").toString()));
						pre_val.setSelectedIndex(Integer.parseInt(json.get("Pre").toString()));
						com_val.setSelectedIndex(Integer.parseInt(json.get("Com").toString()));
						dex_val.setSelectedIndex(Integer.parseInt(json.get("Dex").toString()));
						qui_val.setSelectedIndex(Integer.parseInt(json.get("Qui").toString()));
						
						
						DefaultTableModel PersonailtyTraits = (DefaultTableModel) PersonalityTable.getModel();
						
						PersonailtyTraits.setValueAt(json.get("Personality0_0"), 0, 0);
						PersonailtyTraits.setValueAt(json.get("Personality0_1"), 0, 1);

						PersonailtyTraits.setValueAt(json.get("Personality1_0"), 1, 0);
						PersonailtyTraits.setValueAt(json.get("Personality1_1"), 1, 1);

						PersonailtyTraits.setValueAt(json.get("Personality2_0"), 2, 0);
						PersonailtyTraits.setValueAt(json.get("Personality2_1"), 2, 1);
						
						
						PersonalityTable.setModel(PersonailtyTraits);
						
						
						JSONArray SpellArray = (JSONArray) json.get("Spells");
						Iterator i;
						i = SpellArray.iterator();
						int counter = 0;
						while(i.hasNext()){
							JSONObject info = (JSONObject)i.next();
							//System.out.println(info.get("Name"));
							Spells[counter][0]=info.get("Name").toString();
							Spells[counter][1]=info.get("Tech").toString();
							Spells[counter][2]=info.get("TechReq").toString();
							Spells[counter][3]=info.get("Form").toString();
							Spells[counter][4]=info.get("FormReq").toString();
							Spells[counter][5]=info.get("Ritual").toString();
							Spells[counter][6]=info.get("Level").toString();
							Spells[counter][7]=info.get("Range").toString();
							Spells[counter][8]=info.get("Duration").toString();
							Spells[counter][9]=info.get("Target").toString();
							Spells[counter][10]=info.get("Sense").toString();
							Spells[counter][11]=info.get("Desc").toString();
							
							counter++;
						}
						SpellArrayIndex=counter;
						listSpell.setModel(RefreshModel.Refresh(Spells,SpellArrayIndex));
						
						int Points;
						Points = 0;
						JSONArray FlawsArray = (JSONArray) json.get("Flaws");
						i = FlawsArray.iterator();
						counter = 0;
						while(i.hasNext()){
							JSONObject info = (JSONObject)i.next();
							Flaws[counter][0]=info.get("Name").toString();
							Flaws[counter][1]=info.get("Major").toString();
							Flaws[counter][2]=info.get("Type").toString();
							Flaws[counter][3]=info.get("Desc").toString();
							if(Flaws[counter][1].equals("true")){
								Points+=3;
							}else{
								Points++;
							}
							counter++;
						}
						FlawPoints.setText(Points+"");
						FlawArrayIndex=counter;
						FlawNameBox.setModel(RefreshModel.Refresh(Flaws,FlawArrayIndex));
						
						
						JSONArray VirtueArray = (JSONArray) json.get("Virtues");
						i = VirtueArray.iterator();
						counter = 0;
						Points=0;
						while(i.hasNext()){
							JSONObject info = (JSONObject)i.next();
							Virtues[counter][0]=info.get("Name").toString();
							Virtues[counter][1]=info.get("Major").toString();
							Virtues[counter][2]=info.get("Type").toString();
							Virtues[counter][3]=info.get("Desc").toString();
							if(Virtues[counter][1].equals("true")){
								Points+=3;
							}else{
								Points++;
							}
							counter++;
						}
						VirtueArrayIndex=counter;
						list_Virtues.setModel(RefreshModel.Refresh(Virtues,VirtueArrayIndex));
						virtuePoints.setText(Points+"");
						
						JSONArray AbilitiesArray = (JSONArray) json.get("Abilities");
						i = AbilitiesArray.iterator();
						counter = 0;
						while(i.hasNext()){
							JSONObject info = (JSONObject)i.next();
							Ability[counter][0]=info.get("Name").toString();
							Ability[counter][1]=info.get("Score").toString();
							Ability[counter][2]=info.get("Special").toString();
							Ability[counter][3]=info.get("Desc").toString();
							
							counter++;
						}
						AbilityArrayIndex=counter;
						AbilityNames.setModel(RefreshModel.Refresh(Ability,AbilityArrayIndex));
						
						
						JSONArray EquipmentArray = (JSONArray) json.get("Equipment");
						i = EquipmentArray.iterator();
						counter = 0;
						while(i.hasNext()){
							JSONObject info = (JSONObject)i.next();
							Equipment[counter][0]=info.get("Name").toString();
							Equipment[counter][1]=info.get("Amount").toString();
							Equipment[counter][2]=info.get("Desc").toString();
							EquipmentNames.addRow(new Object[]{Equipment[counter][0],Equipment[counter][1]});
							
							counter++;
						}
						EquipmentArrayIndex=counter;
						Equipmenttable.setModel(EquipmentNames);								

					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});

		mntmSave.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JSON file", "JSON", "json");
				fileChooser.setFileFilter(filter);

				if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

					File file = fileChooser.getSelectedFile();
					file = new File(fileChooser.getSelectedFile() + ".JSON");
					// save to file
					try {
						if (!file.exists()) {
							file.createNewFile();
						}
						//Save Spells
						JSONArray spellArray = new JSONArray();
						JSONObject spellStuff = new JSONObject();
						
						for(int i = 0; i != SpellArrayIndex; i ++){
							spellStuff.clear();
							spellStuff.put("Name", Spells[i][0]);
							spellStuff.put("Tech", Spells[i][1]);
							spellStuff.put("TechReq", Spells[i][2]);
							spellStuff.put("Form", Spells[i][3]);
							spellStuff.put("FormReq", Spells[i][4]);
							spellStuff.put("Ritual", Spells[i][5]);
							spellStuff.put("Level", Spells[i][6]);
							spellStuff.put("Range", Spells[i][7]);
							spellStuff.put("Duration", Spells[i][8]);
							spellStuff.put("Target", Spells[i][9]);
							spellStuff.put("Sense", Spells[i][10]);
							spellStuff.put("Desc", Spells[i][11]);

							spellArray.add(i, spellStuff.clone());
						}
						//End Save Spells
						
						
						//Save Flaws
						JSONArray flawsArray = new JSONArray();
						JSONObject flawsStuff = new JSONObject();
						
						for(int i = 0; i != FlawArrayIndex; i ++){
							flawsStuff.clear();
							flawsStuff.put("Name", Flaws[i][0]);
							flawsStuff.put("Major", Flaws[i][1]);
							flawsStuff.put("Type", Flaws[i][2]);
							flawsStuff.put("Desc", Flaws[i][3]);
							
							flawsArray.add(i, flawsStuff.clone());
						}
						//End Save Flaws
						
						
						//Save Virtues
						JSONArray virtuesArray = new JSONArray();
						JSONObject virtuesStuff = new JSONObject();
						
						for(int i = 0; i != VirtueArrayIndex; i ++){
							virtuesStuff.clear();
							virtuesStuff.put("Name", Virtues[i][0]);
							virtuesStuff.put("Major", Virtues[i][1]);
							virtuesStuff.put("Type", Virtues[i][2]);
							virtuesStuff.put("Desc", Virtues[i][3]);
							
							virtuesArray.add(i, virtuesStuff.clone());
						}
						//End Save Virtues
						
						
						//Save Abilities
						JSONArray AbilitiesArray = new JSONArray();
						JSONObject AbilitiesStuff = new JSONObject();
						
						for(int i = 0; i != AbilityArrayIndex; i ++){
							AbilitiesStuff.clear();
							AbilitiesStuff.put("Name", Ability[i][0]);
							AbilitiesStuff.put("Score", Ability[i][1]);
							AbilitiesStuff.put("Special", Ability[i][2]);
							AbilitiesStuff.put("Desc", Ability[i][3]);
							
							AbilitiesArray.add(i, AbilitiesStuff.clone());
						}
						//end Save Abilities
						
						
						//Save Equipment
						JSONArray EquipmentArray = new JSONArray();
						JSONObject EquipmentStuff = new JSONObject();
						
						for(int i = 0; i != EquipmentArrayIndex; i ++){
							EquipmentStuff.clear();
							EquipmentStuff.put("Name", Equipment[i][0]);
							EquipmentStuff.put("Amount", Equipment[i][1]);
							EquipmentStuff.put("Desc", Equipment[i][2]);
							
							EquipmentArray.add(i, EquipmentStuff.clone());
						}
						//End Save Equipment
						
						JSONObject info = new JSONObject();

						info.put("Spells",spellArray);
						info.put("Flaws",flawsArray);
						info.put("Virtues",virtuesArray);
						info.put("Abilities",AbilitiesArray);
						info.put("Equipment",EquipmentArray);
						
						info.put("Creo", Creo_Score.getText());
						info.put("Intellego", intellego_Score.getText());
						info.put("Muto", muto_Score.getText());
						info.put("Perdo", perdo_Score.getText());
						info.put("Rego", rego_Score.getText());

						info.put("Animal", animal_Score.getText());
						info.put("Aquam", aquam_Score.getText());
						info.put("Auram", auram_Score.getText());
						info.put("Corpus", corpus_Score.getText());
						info.put("Herbam", herbam_Score.getText());
						info.put("Ignem", ignem_Score.getText());
						info.put("Imaginem", imaginem_Score.getText());
						info.put("Mentem", mentem_Score.getText());
						info.put("Terram", terram_Score.getText());
						info.put("Vim", vim_Score.getText());

						info.put("Name", textField.getText());
						info.put("Type", comboBox.getSelectedIndex());
						info.put("Gender", textField_1.getText());
						info.put("Birth Year", textField_2.getText());
						info.put("Saga Name", textField_3.getText());
						info.put("Religion", textField_4.getText());
						info.put("Current Year", textField_5.getText());
						info.put("Apparent Age", textField_6.getText());
						info.put("Graduation Year", textField_7.getText());
						info.put("Covenant", textField_8.getText());
						info.put("Tribunal", textField_9.getText());
						info.put("Longevity Ritual", textField_10.getText());
						info.put("Warp", textField_11.getText());
						info.put("House", comboBox_9.getSelectedIndex());

						info.put("Int", int_val.getSelectedIndex());
						info.put("Per", per_val.getSelectedIndex());
						info.put("Str", str_val.getSelectedIndex());
						info.put("Sta", sta_val.getSelectedIndex());
						info.put("Pre", pre_val.getSelectedIndex());
						info.put("Com", com_val.getSelectedIndex());
						info.put("Dex", dex_val.getSelectedIndex());

						info.put("Qui", qui_val.getSelectedIndex());
						String test = (String) PersonalityTable.getModel().getValueAt(0, 0);
						info.put("Personality0_0", (String)PersonalityTable.getModel().getValueAt(0, 0));
						info.put("Personality0_1", (String)PersonalityTable.getModel().getValueAt(0, 1));
						
						info.put("Personality1_0", (String)PersonalityTable.getModel().getValueAt(1, 0));
						info.put("Personality1_1", (String)PersonalityTable.getModel().getValueAt(1, 1));
						
						info.put("Personality2_0", (String)PersonalityTable.getModel().getValueAt(2, 0));
						info.put("Personality2_1", (String)PersonalityTable.getModel().getValueAt(2, 1));
						
						FileWriter newFile = new FileWriter(file);// .write(arts.toJSONString());
						newFile.write(info.toJSONString());
						newFile.flush();
						newFile.close();
						// FileHandle.jsonFile(file);

					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
			}
		});
		//end save and load
		
		//Start Misc Menu Items
		mntmChangeLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings.changeLog();
			}
		});
		
		rdbtnmntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.colorAllComponents(contentPane,"standard");
				
			}
		});
		
		rdbtnmntmDark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings.colorAllComponents(contentPane,"dark");
			}
		});
		
		
		
		//Tabbed Placement
		rdbtnmntmBottom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Settings.setTabbedLayout("bottom");
				tabbedPane.setTabPlacement(Settings.getTabbedLayout());
				setBounds(100, 100, 610, 423);
				Settings.saveSettings();
			
			}
		});
		rdbtnmntmLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings.setTabbedLayout("left");
				tabbedPane.setTabPlacement(Settings.getTabbedLayout());
				setBounds(100, 100, 730, 423);
				Settings.saveSettings();
			}
		});
		rdbtnmntmTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings.setTabbedLayout("top");
				tabbedPane.setTabPlacement(Settings.getTabbedLayout());
				setBounds(100, 100, 610, 423);
				Settings.saveSettings();
			}
		});
		rdbtnmntmRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings.setTabbedLayout("right");
				tabbedPane.setTabPlacement(Settings.getTabbedLayout());
				setBounds(100, 100, 730, 423);
				Settings.saveSettings();
			}
		});
		
		mntmCheckVersion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		//LoadSettings();
		
	}
	
	public static void LoadSettings(){
		String[] Setting = new String[Settings.SaveSettingsArrayIndex];
		
		Setting = Settings.loadSettings();
	}
}
