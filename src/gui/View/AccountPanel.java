package gui.View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Eren Özen, Onur Ertunç
 */
public class AccountPanel extends JPanel {

    // Properties of the account panel
    private JLabel accountLabel;
    private JLabel background;
    public JButton changePasswordButton;
    public JTextField donationsField;
    private JLabel donationsLabel;
    private JPanel jPanel1;
    public JButton logOutButton;
    public JTextField usernameField;
    public JLabel usernameLabel;

    /**
     * constructor of the class
     */
    public AccountPanel() {
        initComponents();
    }

    /**
     * initializes the properties of the class
     */
    private void initComponents() {

        //initialization of the components
        logOutButton = new JButton();
        usernameField = new JTextField();
        accountLabel = new JLabel();
        donationsLabel = new JLabel();
        changePasswordButton = new JButton();
        donationsField = new JTextField();
        usernameLabel = new JLabel();
        background = new JLabel();
        jPanel1 = new JPanel();

        // size of the panel and layout adjusted
        setPreferredSize(new Dimension(1280, 700));
        setLayout(null);

        // logOut button adjustments ( font, icon, text and listener)
        logOutButton.setFont(new Font("Arial", 0, 12));
        logOutButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/door.png")));
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        // logOut button added to the panel
        add(logOutButton);
        logOutButton.setBounds(720, 390, 180, 30);

        // username field adjustments ( editable, font, and listener)
        usernameField.setEditable(false);
        usernameField.setFont(new Font("Arial", 1, 12));
        usernameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        // username field added
        add(usernameField);
        usernameField.setBounds(400, 290, 180, 30);

        // account label adjustments ( font, foreground, alignment, text and position)
        accountLabel.setFont(new Font("Calibri", 1, 48));
        accountLabel.setForeground(new Color(255, 255, 255));
        accountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel.setText("ACCOUNT");
        accountLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(accountLabel);
        accountLabel.setBounds(540, 80, 200, 60);

        // donations label adjustments ( font, foreground, alignment, text and position)
        donationsLabel.setFont(new Font("Arial", 1, 18));
        donationsLabel.setForeground(new Color(255, 255, 255));
        donationsLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        donationsLabel.setText("Donations");
        donationsLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(donationsLabel);
        donationsLabel.setBounds(300, 390, 90, 30);

        //
        changePasswordButton.setFont(new Font("Arial", 0, 12));
        changePasswordButton.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/key.png")));
        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        add(changePasswordButton);
        changePasswordButton.setBounds(720, 290, 180, 30);

        donationsField.setBackground(new Color(240, 240, 240));
        donationsField.setFont(new Font("Arial", 1, 12));
        donationsField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                donationsFieldActionPerformed(evt);
            }
        });
        donationsField.setEditable(false);
        add(donationsField);
        donationsField.setBounds(400, 390, 180, 30);

        usernameLabel.setFont(new Font("Arial", 1, 18));
        usernameLabel.setForeground(new Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        usernameLabel.setText("Username");
        usernameLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        add(usernameLabel);
        usernameLabel.setBounds(300, 290, 90, 30);

        background.setFont(new Font("Calibri", 0, 11));
        background.setIcon(new ImageIcon(getClass().getResource("/gui/icons and backgrounds/final.jpg")));
        background.setMaximumSize(new Dimension(1280, 700));
        background.setMinimumSize(new Dimension(1280, 700));
        background.setPreferredSize(new Dimension(1280, 700));
        add(background);
        background.setBounds(0, 0, 1280, 700);

        jPanel1.setPreferredSize(new Dimension(1280, 700));
        jPanel1.setLayout(null);
        add(jPanel1);
        jPanel1.setBounds(0, 0, 1280, 700);
    }

    public void changePasswordButtonActionPerformed(ActionEvent evt) {

    }

    public void logOutButtonActionPerformed(ActionEvent evt) {


    }

    public void usernameFieldActionPerformed(ActionEvent evt) {

    }

    public void donationsFieldActionPerformed(ActionEvent evt) {

    }

}
