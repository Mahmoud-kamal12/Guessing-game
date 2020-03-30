package tofun.films.icons;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Form extends javax.swing.JFrame {


    public Form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labOrder = new javax.swing.JLabel();
        labResult = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSummit = new javax.swing.JButton();
        labWord = new javax.swing.JLabel();
        btnStart1 = new javax.swing.JButton();
        newWords = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 30, 68));
        setForeground(new java.awt.Color(0, 31, 71));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 27, 64));
        jPanel1.setForeground(new java.awt.Color(0, 31, 71));

        labOrder.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labOrder.setForeground(new java.awt.Color(245, 249, 250));
        labOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labOrder.setText("Welcome to my game");

        labResult.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        labResult.setForeground(new java.awt.Color(245, 249, 250));
        labResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAnswer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtAnswer.setEnabled(false);
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnswerKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 249, 250));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Answer");

        btnSummit.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnSummit.setText("Summit");
        btnSummit.setPreferredSize(new java.awt.Dimension(95, 39));
        btnSummit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSummitMouseClicked(evt);
            }
        });
        btnSummit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummitActionPerformed(evt);
            }
        });

        labWord.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labWord.setForeground(new java.awt.Color(245, 249, 250));
        labWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labWord.setText("Word");

        btnStart1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnStart1.setForeground(new java.awt.Color(255, 0, 51));
        btnStart1.setText("Exit");
        btnStart1.setPreferredSize(new java.awt.Dimension(95, 39));
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        newWords.setFont(new java.awt.Font("Segoe Print", 1, 20)); // NOI18N
        newWords.setText("new list");
        newWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labResult, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newWords, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnSummit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 354, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(labWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labWord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labResult, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnStart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addComponent(btnSummit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(newWords, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

Image iconform ,tr ,fs;
static String []Words;
static char []Selsectd_word;
static String Selsectd_word_to_check;
static char []arr2_to_store_indexs;
static int num_stars , pons , mero = 10 ,index_input_letter = 1 , numberwords ;
static char[] ee ;
    
public static char[] removeTheElement(char[] arr, int index) 
{ 

    char[] anotherArray = new char[arr.length - 1]; 
    for (int i = 0, k = 0 , c = 0; i < arr.length; i++)
    { 

        if (i == index)
            continue;
        anotherArray[k++] = arr[i]; 
    } 
    return anotherArray; 
}

public static int randomnum(int start , int end)
    {
        int r ;
        
        r = start + (int)(Math.random() * ((end - start)));
        
        return r ;
    }

public static boolean check_number_of_word_is_repeted(int []arr1 , int size , int Random_Index)
{
    int x = 0;
    for (int i = 0 ; i< size ;i++)
        if(Random_Index == arr1[i])
            x++;
    if(x == 0){return true;}
    else {return false;}
}

public static char[] LetterFound(char arr2[] ,String check_character)
{
    for(int i = 0 ; i < arr2.length ; i++)
        {
            if( check_character.equals(String.valueOf(arr2[i]))) 
            {
                arr2 = removeTheElement(arr2,i);
                break;
            }
        }
    return arr2;
}
    
public static void play()
{
    pons = 0 ; index_input_letter = 0 ;index_input_letter = 0 ; num_stars = 0;
    numberwords = Integer.parseInt(JOptionPane.showInputDialog("Enter number of words "));
    Words = new String[numberwords];
    for(int i = 0 ; i < numberwords ;i++)
    {
        Words[i] = JOptionPane.showInputDialog("Enter Word number " + (i+1) + " :)");
    }    

    Selsectd_word = Words[randomnum(0, numberwords)].toCharArray();
    Selsectd_word_to_check = String.valueOf(Selsectd_word);
    int num_letters_will_remove = randomnum(1, Selsectd_word.length);
    int []arr1_to_check_number_of_word_is_repeted =new int[num_letters_will_remove + 1];
    arr2_to_store_indexs=new char[num_letters_will_remove];
    int size_arr1 = 0 , Random_Index , size_arr2 = 0;
    arr1_to_check_number_of_word_is_repeted[0]=999999999;
    int counter = num_letters_will_remove;
    for(int i = 0 ; i < counter ;i++)
    {
        Random_Index = randomnum(0, num_letters_will_remove);
        if(check_number_of_word_is_repeted(arr1_to_check_number_of_word_is_repeted, size_arr1, Random_Index))
        {
            arr2_to_store_indexs[size_arr2] = Selsectd_word[Random_Index];
            Selsectd_word[Random_Index] = '*';
            num_stars++;
            arr1_to_check_number_of_word_is_repeted[size_arr1]= Random_Index;
            size_arr1++;
            size_arr2++;
        }
        else {counter++;}
    }
    mero = (num_stars * (2/100));
    ee =Selsectd_word_to_check.toCharArray();
}
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            iconform = ImageIO.read(getClass().getResource("icona.png"));
            this.setIconImage(iconform);
        } catch (IOException ex) {
            Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void newWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWordsActionPerformed
        play();
        labWord.setText(String.valueOf(Selsectd_word));
        labOrder.setText("Enter letter number " + (index_input_letter + 1) + " to check "+ " try number " + (mero ) + " : ");
        txtAnswer.enable();
        txtAnswer.requestFocus();
    }//GEN-LAST:event_newWordsActionPerformed

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnStart1ActionPerformed

    private void btnSummitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummitActionPerformed
        mero--;
        String check_character;
        check_character = txtAnswer.getText();
        int len = arr2_to_store_indexs.length;
        arr2_to_store_indexs=LetterFound(arr2_to_store_indexs, check_character);
        if(arr2_to_store_indexs.length < len)
        {
            labResult.setText("True");
            index_input_letter++;
            pons++;
            labOrder.setText("Enter letter number " + (index_input_letter + 1) + " to check "+ " try number " + (mero) + " : ");
            for(int q = 0 ; q < Selsectd_word_to_check.length() ; q++)
            {
                String nm = String.valueOf(ee[q]);
                boolean bb=check_character.equals(String.valueOf(nm));
                if(bb)
                {
                    Selsectd_word[q]= check_character.toCharArray()[0];
                    String ss =String.valueOf(Selsectd_word);
                    labWord.setText(ss);
                    ee[q]='ّ';
                    break;
                }
            }
        }
        else
        {
            labResult.setText("False");
            labOrder.setText("Enter letter number " + (index_input_letter +1 ) + " to check "+ " try number " + (mero ) + " : ");
        }
        if(mero == 0 || pons == num_stars)
        {
            if(pons == num_stars)
            {
                labOrder.setText("Congratulation, you won the game :)");
                labWord.setText("Word is " + Selsectd_word_to_check);
                txtAnswer.disable();
                labResult.setText(null);
            }
            else
            labOrder.setText("Sorry, you lost the game :)");
            txtAnswer.disable();
            labResult.setText(null);
        }
        txtAnswer.setText("");
        txtAnswer.requestFocus();

    }//GEN-LAST:event_btnSummitActionPerformed

    private void btnSummitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSummitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSummitMouseClicked

    private void txtAnswerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            btnSummit.doClick();
        }
    }//GEN-LAST:event_txtAnswerKeyPressed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(() -> {
            new Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnSummit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labOrder;
    private javax.swing.JLabel labResult;
    private javax.swing.JLabel labWord;
    private javax.swing.JButton newWords;
    private javax.swing.JTextField txtAnswer;
    // End of variables declaration//GEN-END:variables
}
