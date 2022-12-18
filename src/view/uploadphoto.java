// import necessary libraries
import java.awt.;
import javax.swing.;
import java.awt.event.*;
import java.io.File;
import javax.imageio.ImageIO;

public class UploadImage extends JFrame implements ActionListener {
// create necessary components
JLabel labelImage;
JButton buttonUpload;

public UploadImage() {
// set layout of frame
setLayout(new FlowLayout());

Copy code
// initialize components
labelImage = new JLabel();
buttonUpload = new JButton("Upload Image");

// add components to frame
add(labelImage);
add(buttonUpload);

// add action listener to button
buttonUpload.addActionListener(this);

// set frame properties
setTitle("Upload Image");
setSize(300, 200);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

// action performed method for button
public void actionPerformed(ActionEvent e) {
// create file chooser
JFileChooser fileChooser = new JFileChooser();

Copy code
// open file chooser and get user selection
int result = fileChooser.showOpenDialog(this);

// if user selects a file
if (result == JFileChooser.APPROVE_OPTION) {
  // get selected file
  File file = fileChooser.getSelectedFile();

  // try to read image from file and set as label's icon
  try {
    labelImage.setIcon(new ImageIcon(ImageIO.read(file)));
  } catch (Exception ex) {
    ex.printStackTrace();
  }
}
}

public static void main(String[] args) {
new UploadImage();
}
}