// import necessary libraries
import java.awt.;
import javax.swing.;
import java.awt.event.*;

public class UpdateProfile extends JFrame implements ActionListener {
// create necessary components
JLabel labelName, labelAge, labelGender;
JTextField textName, textAge;
JComboBox comboGender;
JButton buttonUpdate;

public UpdateProfile() {
// set layout of frame
setLayout(new FlowLayout());

Copy code
// initialize components
labelName = new JLabel("Name: ");
labelAge = new JLabel("Age: ");
labelGender = new JLabel("Gender: ");
textName = new JTextField(20);
textAge = new JTextField(3);
comboGender = new JComboBox(new String[] {"Male", "Female", "Other"});
buttonUpdate = new JButton("Update");

// add components to frame
add(labelName);
add(textName);
add(labelAge);
add(textAge);
add(labelGender);
add(comboGender);
add(buttonUpdate);

// add action listener to button
buttonUpdate.addActionListener(this);

// set frame properties
setTitle("Update Profile");
setSize(300, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

// action performed method for button
public void actionPerformed(ActionEvent e) {
// get user input from text fields and combo box
String name = textName.getText();
int age = Integer.parseInt(textAge.getText());
String gender = comboGender.getSelectedItem().toString();

Copy code
// update user profile with new information
UserProfile.setName(name);
UserProfile.setAge(age);
UserProfile.setGender(gender);

// display success message
JOptionPane.showMessageDialog(this, "Profile updated successfully!");
}

public static void main(String[] args) {
new UpdateProfile();
}
}



