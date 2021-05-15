import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;
import static java.lang.Math.abs;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 10.05.2021
  * @author 
  */

public class vierGewinnt extends JFrame {
  // Anfang Attribute
  private JButton aButton = new JButton();
  private JButton bButton = new JButton();
  private JButton cButton = new JButton();
  private JButton dButton = new JButton();
  private JButton eButton = new JButton();
  private JButton fButton = new JButton();
  private JButton gButton = new JButton();
  private JLabel a6 = new JLabel();
  private JLabel b6 = new JLabel();
  private JLabel c6 = new JLabel();
  private JLabel d6 = new JLabel();
  private JLabel e6 = new JLabel();
  private JLabel f6 = new JLabel();
  private JLabel g6 = new JLabel();
  private JLabel a5 = new JLabel();
  private JLabel b5 = new JLabel();
  private JLabel c5 = new JLabel();
  private JLabel d5 = new JLabel();
  private JLabel e5 = new JLabel();
  private JLabel f5 = new JLabel();
  private JLabel g5 = new JLabel();
  private JLabel a4 = new JLabel();
  private JLabel b4 = new JLabel();
  private JLabel c4 = new JLabel();
  private JLabel d4 = new JLabel();
  private JLabel e4 = new JLabel();
  private JLabel f4 = new JLabel();
  private JLabel g4 = new JLabel();
  private JLabel a3 = new JLabel();
  private JLabel b3 = new JLabel();
  private JLabel c3 = new JLabel();
  private JLabel d3 = new JLabel();
  private JLabel e3 = new JLabel();
  private JLabel f3 = new JLabel();
  private JLabel g3 = new JLabel();
  private JLabel a2 = new JLabel();
  private JLabel b2 = new JLabel();
  private JLabel c2 = new JLabel();
  private JLabel d2 = new JLabel();
  private JLabel e2 = new JLabel();
  private JLabel f2 = new JLabel();
  private JLabel g2 = new JLabel();
  private JLabel a1 = new JLabel();
  private JLabel b1 = new JLabel();
  private JLabel c1 = new JLabel();
  private JLabel d1 = new JLabel();
  private JLabel e1 = new JLabel();
  private JLabel f1 = new JLabel();
  private JLabel g1 = new JLabel();
  private JLabel titleLabel = new JLabel();
  private JLabel amZugLabel = new JLabel();
  private JLabel farbeLabel = new JLabel();
  // Ende Attribute

  ImageIcon leer = new ImageIcon("leer.png");                                       
  ImageIcon rot = new ImageIcon("rot.png");                                         
  ImageIcon gelb = new ImageIcon("gelb.png");
  boolean rotAmZug = true;
  int [][] FeldArray = new int[7][6];
  int B = 7;
  int H = 6;
  int a = 0;
  int b = 0;
  int c = 0;
  int d = 0;
  int e = 0;
  int f = 0;
  int g = 0;
  boolean debug=true;
  int schwierigkeit=3;
  
  public vierGewinnt() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 900; 
    int frameHeight = 850;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("vierGewinnt");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    aButton.setBounds(100, 100, 100, 100);
    aButton.setText("V");
    aButton.setMargin(new Insets(2, 2, 2, 2));
    aButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    aButton_ActionPerformed(evt);
    }
    });
    cp.add(aButton);
    bButton.setBounds(200, 100, 100, 100);
    bButton.setText("V");
    bButton.setMargin(new Insets(2, 2, 2, 2));
    bButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    bButton_ActionPerformed(evt);
    }
    });
    cp.add(bButton);
    cButton.setBounds(300, 100, 100, 100);
    cButton.setText("V");
    cButton.setMargin(new Insets(2, 2, 2, 2));
    cButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    cButton_ActionPerformed(evt);
    }
    });
    cp.add(cButton);
    dButton.setBounds(400, 100, 100, 100);
    dButton.setText("V");
    dButton.setMargin(new Insets(2, 2, 2, 2));
    dButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    dButton_ActionPerformed(evt);
    }
    });
    cp.add(dButton);
    eButton.setBounds(500, 100, 100, 100);
    eButton.setText("V");
    eButton.setMargin(new Insets(2, 2, 2, 2));
    eButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    eButton_ActionPerformed(evt);
    }
    });
    cp.add(eButton);
    fButton.setBounds(600, 100, 100, 100);
    fButton.setText("V");
    fButton.setMargin(new Insets(2, 2, 2, 2));
    fButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    fButton_ActionPerformed(evt);
    }
    });
    cp.add(fButton);
    gButton.setBounds(700, 100, 100, 100);
    gButton.setText("V");
    gButton.setMargin(new Insets(2, 2, 2, 2));
    gButton.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    gButton_ActionPerformed(evt);
    }
    });
    cp.add(gButton);
    a6.setBounds(100, 200, 100, 100);
    a6.setText("");
    cp.add(a6);
    b6.setBounds(200, 200, 100, 100);
    b6.setText("");
    cp.add(b6);
    c6.setBounds(300, 200, 100, 100);
    c6.setText("");
    cp.add(c6);
    d6.setBounds(400, 200, 100, 100);
    d6.setText("");
    cp.add(d6);
    e6.setBounds(500, 200, 100, 100);
    e6.setText("");
    cp.add(e6);
    f6.setBounds(600, 200, 100, 100);
    f6.setText("");
    cp.add(f6);
    g6.setBounds(700, 200, 100, 100);
    g6.setText("");
    cp.add(g6);
    a5.setBounds(100, 300, 100, 100);
    a5.setText("");
    cp.add(a5);
    b5.setBounds(200, 300, 100, 100);
    b5.setText("");
    cp.add(b5);
    c5.setBounds(300, 300, 100, 100);
    c5.setText("");
    cp.add(c5);
    d5.setBounds(400, 300, 100, 100);
    d5.setText("");
    cp.add(d5);
    e5.setBounds(500, 300, 100, 100);
    e5.setText("");
    cp.add(e5);
    f5.setBounds(600, 300, 100, 100);
    f5.setText("");
    cp.add(f5);
    g5.setBounds(700, 300, 100, 100);
    g5.setText("");
    cp.add(g5);
    a4.setBounds(100, 400, 100, 100);
    a4.setText("");
    cp.add(a4);
    b4.setBounds(200, 400, 100, 100);
    b4.setText("");
    cp.add(b4);
    c4.setBounds(300, 400, 100, 100);
    c4.setText("");
    cp.add(c4);
    d4.setBounds(400, 400, 100, 100);
    d4.setText("");
    cp.add(d4);
    e4.setBounds(500, 400, 100, 100);
    e4.setText("");
    cp.add(e4);
    f4.setBounds(600, 400, 100, 100);
    f4.setText("");
    cp.add(f4);
    g4.setBounds(700, 400, 100, 100);
    g4.setText("");
    cp.add(g4);
    a3.setBounds(100, 500, 100, 100);
    a3.setText("");
    cp.add(a3);
    b3.setBounds(200, 500, 100, 100);
    b3.setText("");
    cp.add(b3);
    c3.setBounds(300, 500, 100, 100);
    c3.setText("");
    cp.add(c3);
    d3.setBounds(400, 500, 100, 100);
    d3.setText("");
    cp.add(d3);
    e3.setBounds(500, 500, 100, 100);
    e3.setText("");
    cp.add(e3);
    f3.setBounds(600, 500, 100, 100);
    f3.setText("");
    cp.add(f3);
    g3.setBounds(700, 500, 100, 100);
    g3.setText("");
    cp.add(g3);
    a2.setBounds(100, 600, 100, 100);
    a2.setText("");
    cp.add(a2);
    b2.setBounds(200, 600, 100, 100);
    b2.setText("");
    cp.add(b2);
    c2.setBounds(300, 600, 100, 100);
    c2.setText("");
    cp.add(c2);
    d2.setBounds(400, 600, 100, 100);
    d2.setText("");
    cp.add(d2);
    e2.setBounds(500, 600, 100, 100);
    e2.setText("");
    cp.add(e2);
    f2.setBounds(600, 600, 100, 100);
    f2.setText("");
    cp.add(f2);
    g2.setBounds(700, 600, 100, 100);
    g2.setText("");
    cp.add(g2);
    a1.setBounds(100, 700, 100, 100);
    a1.setText("");
    cp.add(a1);
    b1.setBounds(200, 700, 100, 100);
    b1.setText("");
    cp.add(b1);
    c1.setBounds(300, 700, 100, 100);
    c1.setText("");
    cp.add(c1);
    d1.setBounds(400, 700, 100, 100);
    d1.setText("");
    cp.add(d1);
    e1.setBounds(500, 700, 100, 100);
    e1.setText("");
    cp.add(e1);
    f1.setBounds(600, 700, 100, 100);
    f1.setText("");
    cp.add(f1);
    g1.setBounds(700, 700, 100, 100);
    g1.setText("");
    cp.add(g1);
    cp.setBackground(Color.GRAY);
    titleLabel.setBounds(100, 25, 300, 50);
    titleLabel.setText("Vier Gewinnt!");
    Hashtable<TextAttribute, Object> jLabel1_map = new Hashtable<TextAttribute, Object>();
    jLabel1_map.put(TextAttribute.FAMILY, "Arial Rounded MT Bold");
    jLabel1_map.put(TextAttribute.SIZE, new Integer(24));
    jLabel1_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    titleLabel.setFont(new Font(jLabel1_map));
    titleLabel.setForeground(Color.BLACK);
    titleLabel.setBackground(new Color(0xFFC800));
    titleLabel.setOpaque(true);
    titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(titleLabel);
    amZugLabel.setBounds(500, 40, 90, 30);
    amZugLabel.setText("Am Zug:");
    amZugLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
    amZugLabel.setForeground(Color.BLACK);
    cp.add(amZugLabel);
    farbeLabel.setBounds(590, 30, 50, 50);
    farbeLabel.setText("");
    farbeLabel.setBackground(Color.RED);
    farbeLabel.setOpaque(true);
    cp.add(farbeLabel);
    // Ende Komponenten
    erstelleFeld();
    setVisible(true);
  } // end of public vierGewinnt
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new vierGewinnt();
  } // end of main

  public boolean istRotAmZug() {                      //gibt an, ob rot am Zug ist oder nicht
    return rotAmZug;
  }

  public void erstelleFeld(){
    a1.setIcon(leer);
    a2.setIcon(leer);
    a3.setIcon(leer);
    a4.setIcon(leer);
    a5.setIcon(leer);
    a6.setIcon(leer);
    
    b1.setIcon(leer);
    b2.setIcon(leer);
    b3.setIcon(leer);
    b4.setIcon(leer);
    b5.setIcon(leer);
    b6.setIcon(leer);
    
    c1.setIcon(leer);
    c2.setIcon(leer);
    c3.setIcon(leer);
    c4.setIcon(leer);
    c5.setIcon(leer);
    c6.setIcon(leer);
    
    d1.setIcon(leer);
    d2.setIcon(leer);
    d3.setIcon(leer);
    d4.setIcon(leer);
    d5.setIcon(leer);
    d6.setIcon(leer);
    
    e1.setIcon(leer);
    e2.setIcon(leer);
    e3.setIcon(leer);
    e4.setIcon(leer);
    e5.setIcon(leer);
    e6.setIcon(leer);
    
    f1.setIcon(leer);
    f2.setIcon(leer);
    f3.setIcon(leer);
    f4.setIcon(leer);
    f5.setIcon(leer);
    f6.setIcon(leer);
    
    g1.setIcon(leer);
    g2.setIcon(leer);
    g3.setIcon(leer);
    g4.setIcon(leer);
    g5.setIcon(leer);
    g6.setIcon(leer);
  }

  public void neustarten(){
    erstelleFeld();
    rotAmZug=true;
    farbeLabel.setBackground(Color.RED);
    for (int i=0;i<B;i++) {                                     
      for (int j=0;j<H;j++) {
        FeldArray[i][j]=0;
      } 
    }
    a = 0;
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = 0;
    g = 0; 
  }

  public void rotGewinnt(){                                              //was passieren soll, wenn rot gewinnt
    JOptionPane.showMessageDialog(this, "Rot hat gewonnen!");            //ein Feld kommt auf, welches zeigt, dass rot gewonnen hat
    
    Object[] options = {"Ja",                                            //Array mit zwei Objekten, Antwortmoeglichkeiten Ja/Nein
    "Nein"};
    int i = JOptionPane.showOptionDialog(this, "Erneut spielen?",        //Frage ob erneut gespielt werden moechte
    "ENDE",
    JOptionPane.OK_CANCEL_OPTION,                                        //Fortfahren oder Abbrechen
    JOptionPane.QUESTION_MESSAGE,                                       //Frage
    null,
    options,
    options[1]);                                                        //gibt drei moeglichkeiten im Array
    
    

    if (i==-1) {                                                       // Spieler drueckt auf X
      System.exit(0);                                                  //Fenster wird beendet
    } // end of if
    
    if (i==0) {                                                       //Spieler drueckt auf Ja
      neustarten();                                                   //Methode "neustarten"
    } // end of if
    
    if (i==1) {                                                       //Spieler drueckt auf Nein
      System.exit(0);                                                 //Fenster wird beendet
    } // end of if
    
  }

  public void gelbGewinnt(){                                        //gelb gewinnt -> selbe Methode wie rotGewinnt -> siehe dort
    JOptionPane.showMessageDialog(this, "Gelb hat gewonnen!");
    
    Object[] options = {"Ja",                                    
    "Nein"};
    int i = JOptionPane.showOptionDialog(this, "Erneut spielen?",
    "ENDE",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);
    
    
    if (i==-1) {
      System.exit(0);
    } // end of if
    
    if (i==0) {
      neustarten();
    } // end of if
    
    if (i==1) {
      System.exit(0);
    } // end of if
  }

  public void unentschieden(){                                        //unentschieden -> selbe Methode wie rotGewinnt -> siehe dort
    JOptionPane.showMessageDialog(this, "Unentschieden!");
    
    Object[] options = {"Ja",                                    
    "Nein"};
    int i = JOptionPane.showOptionDialog(this, "Erneut spielen?",
    "ENDE",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[1]);
    
    
    if (i==-1) {
      System.exit(0);
    } // end of if
    
    if (i==0) {
      neustarten();
    } // end of if
    
    if (i==1) {
      System.exit(0);
    } // end of if
  }

  public void reiheVoll(){
    JOptionPane.showMessageDialog(this, "Diese Reihe ist voll, bitte nehme eine andere!");
  }

  public int getGewinner(){
    int h=0;
    int b=0;
    int i=0;
    int j=0;
    for (h=0;h<=5;h=h+1) {                             //h ist 0; solange wie h kleiner gleich 5; h um 1 erhoehen -> umm alle Hoehen zu ueberpruefen
      
      for (b=0;b<=6;b++) {                             //b ist 0; solange wie b kleiner gleich 6; h um 1 erhoehen -> umm alle Breiten zu ueberpruefen
        
        try {
          if ((FeldArray[b][h] != 0) && (FeldArray[b+1][h] != 0) && (FeldArray[b+2][h] != 0) && (FeldArray[b+3][h] != 0) &&(FeldArray[b][h] == FeldArray[b+1][h]) &&(FeldArray[b+1][h] == FeldArray[b+2][h]) &&(FeldArray[b+2][h] == FeldArray[b+3][h])) {                      //ueberprueft, ob 4 kontinuierliche Steine in einer horizontalen Reihe liegen. Alle muessen ungleich 0 sein und gleich wie der Stein nebenan
            
            return FeldArray[b][h];           //gibt 1 oder 2 zurueck, fuer rot oder gelb
            
          } // end of if
        } catch(Exception e) {
          //e.printStackTrace();
        }
        
      } // end of for
      
    } // end of for
    
    for (h=0;h<=5;h=h+1) {                       //h ist 0; solange wie h kleiner gleich 5; h um 1 erhoehen -> umm alle Hoehen zu ueberpruefen
      
      for (b=0;b<=6;b++) {                        //b ist 0; solange wie b kleiner gleich 6; h um 1 erhoehen -> umm alle Breiten zu ueberpruefen
        
        try {
          if ((FeldArray[b][h] != 0) && (FeldArray[b][h+1] != 0) && (FeldArray[b][h+2] != 0) && (FeldArray[b][h+3] != 0) &&(FeldArray[b][h] == FeldArray[b][h+1]) &&(FeldArray[b][h+1] == FeldArray[b][h+2]) &&(FeldArray[b][h+2] == FeldArray[b][h+3])) {                  //ueberprueft, ob 4 kontinuierliche Steine in einer vertikalen Reihe liegen. Alle muessen ungleich 0 sein und gleich wie der Stein nebenan
            
            return FeldArray[b][h];      //gibt 1 oder 2 zurueck, fuer rot oder gelb
            
          } // end of if
        } catch(Exception e) {
          //e.printStackTrace();
        }
        
      } // end of for
      
    } // end of for
    
    for (h=0;h<=5;h=h+1) {                     //h ist 0; solange wie h kleiner gleich 5; h um 1 erhoehen -> umm alle Hoehen zu ueberpruefen
      
      for (b=0;b<=6;b++) {                     //b ist 0; solange wie b kleiner gleich 6; h um 1 erhoehen -> umm alle Breiten zu ueberpruefen
        
        try {
          if ((FeldArray[b][h] != 0) && (FeldArray[b+1][h+1] != 0) && (FeldArray[b+2][h+2] != 0) && (FeldArray[b+3][h+3] != 0) &&(FeldArray[b][h] == FeldArray[b+1][h+1]) &&(FeldArray[b+1][h+1] == FeldArray[b+2][h+2]) &&(FeldArray[b+2][h+2] == FeldArray[b+3][h+3])) {              //ueberprueft, ob 4 kontinuierliche Steine in einer diagonalen Reihe nach rechts oben. Alle muessen ungleich 0 sein und gleich wie der Stein oben rechts
            
            return FeldArray[b][h];     //gibt 1 oder 2 zurueck, fuer rot oder gelb
            
          } // end of if
        } catch(Exception e) {
          //e.printStackTrace();
        }
        
      } // end of for
      
    } // end of for
    
    for (h=5;h>=0;h=h-1) {                           //h ist 5; solange wie h kleiner gleich 0; h um 1 reduzieren -> um alle hoehen zu ueberpruefen -> nach unten , da es so leichter ist zu ueberpruefen
      
      for (b=0;b<=6;b++) {                            //b ist 0; solange wie b kleiner gleich 6; h um 1 erhoehen -> um alle Breiten zu ueberpruefen
        
        try {
          if ((FeldArray[b][h] != 0) && (FeldArray[b+1][h-1] != 0) && (FeldArray[b+2][h-2] != 0) && (FeldArray[b+3][h-3] != 0) &&(FeldArray[b][h] == FeldArray[b+1][h-1]) &&(FeldArray[b+1][h-1] == FeldArray[b+2][h-2]) &&(FeldArray[b+2][h-2] == FeldArray[b+3][h-3])) {              //ueberprueft, ob 4 kontinuierliche Steine in einer diagonalen Reihe nach rechts unten. Alle muessen ungleich 0 sein und gleich wie der Stein unten rechts
            
            return FeldArray[b][h];
            
          } // end of if
        } catch(Exception e) {
          //e.printStackTrace();
        }
        
      } // end of for
      
    } // end of for
    
    for (h=0;h<=5;h++) {
      
      for (b=0;b<=6;b++) {
        i=FeldArray[b][h];
        if (i!=0) {
          j++;
          i=0;
        } // end of if
      } // end of for
      
    } // end of for
    
    if (j==42) {
      unentschieden();
    } // end of if
    
    return 0;                      //wenn nichts zutrifft, dann 0 zurueck geben
  }

  public void rotAmZug() {
    rotAmZug=false;
    farbeLabel.setBackground(Color.YELLOW);
    if (getGewinner()== 1) {                           //wenn vier rote (1=rot) in einer Reihe sind. Ueberprueft, ob vier in einer Reihe sind                    
      rotGewinnt();                                    //Methode rotGewinnt aufrufen
      return;               
    }
    spieleGelb();
  }

  public void gelbAmZug() {
    rotAmZug=true;
    farbeLabel.setBackground(Color.RED);
    if (getGewinner()== 2) {                                       
      gelbGewinnt();
      return;                                                   
    }
  }
    
  public void aButton_ActionPerformed(ActionEvent evt) {
    if (a==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (a==0) {
      if (istRotAmZug()==true) {
        FeldArray[0][0]=1;
        a++;
        a1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][0]=2;
        a++;
        a1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (a==1) {
      if (istRotAmZug()==true) {
        FeldArray[0][1]=1;
        a++;
        a2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][1]=2;
        a++;
        a2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (a==2) {
      if (istRotAmZug()==true) {
        FeldArray[0][2]=1;
        a++;
        a3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][2]=2;
        a++;
        a3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (a==3) {
      if (istRotAmZug()==true) {
        FeldArray[0][3]=1;
        a++;
        a4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][3]=2;
        a++;
        a4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (a==4) {
      if (istRotAmZug()==true) {
        FeldArray[0][4]=1;
        a++;
        a5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][4]=2;
        a++;
        a5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (a==5) {
      if (istRotAmZug()==true) {
        FeldArray[0][5]=1;
        a++;
        a6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[0][5]=2;
        a++;
        a6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of aButton_ActionPerformed

  public void bButton_ActionPerformed(ActionEvent evt) {
    if (b==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (b==0) {
      if (istRotAmZug()==true) {
        FeldArray[1][0]=1;
        b++;
        b1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][0]=2;
        b++;
        b1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (b==1) {
      if (istRotAmZug()==true) {
        FeldArray[1][1]=1;
        b++;
        b2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][1]=2;
        b++;
        b2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (b==2) {
      if (istRotAmZug()==true) {
        FeldArray[1][2]=1;
        b++;
        b3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][2]=2;
        b++;
        b3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (b==3) {
      if (istRotAmZug()==true) {
        FeldArray[1][3]=1;
        b++;
        b4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][3]=2;
        b++;
        b4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (b==4) {
      if (istRotAmZug()==true) {
        FeldArray[1][4]=1;
        b++;
        b5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][4]=2;
        b++;
        b5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (b==5) {
      if (istRotAmZug()==true) {
        FeldArray[1][5]=1;
        b++;
        b6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[1][5]=2;
        b++;
        b6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of bButton_ActionPerformed

  public void cButton_ActionPerformed(ActionEvent evt) {
    if (c==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (c==0) {
      if (istRotAmZug()==true) {
        FeldArray[2][0]=1;
        c++;
        c1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][0]=2;
        c++;
        c1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (c==1) {
      if (istRotAmZug()==true) {
        FeldArray[2][1]=1;
        c++;
        c2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][1]=2;
        c++;
        c2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (c==2) {
      if (istRotAmZug()==true) {
        FeldArray[2][2]=1;
        c++;
        c3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][2]=2;
        c++;
        c3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (c==3) {
      if (istRotAmZug()==true) {
        FeldArray[2][3]=1;
        c++;
        c4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][3]=2;
        c++;
        c4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (c==4) {
      if (istRotAmZug()==true) {
        FeldArray[2][4]=1;
        c++;
        c5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][4]=2;
        c++;
        c5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (c==5) {
      if (istRotAmZug()==true) {
        FeldArray[2][5]=1;
        c++;
        c6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[2][5]=2;
        c++;
        c6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of cButton_ActionPerformed

  public void dButton_ActionPerformed(ActionEvent evt) {
    if (d==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (d==0) {
      if (istRotAmZug()==true) {
        FeldArray[3][0]=1;
        d++;
        d1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][0]=2;
        d++;
        d1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (d==1) {
      if (istRotAmZug()==true) {
        FeldArray[3][1]=1;
        d++;
        d2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][1]=2;
        d++;
        d2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (d==2) {
      if (istRotAmZug()==true) {
        FeldArray[3][2]=1;
        d++;
        d3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][2]=2;
        d++;
        d3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (d==3) {
      if (istRotAmZug()==true) {
        FeldArray[3][3]=1;
        d++;
        d4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][3]=2;
        d++;
        d4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (d==4) {
      if (istRotAmZug()==true) {
        FeldArray[3][4]=1;
        d++;
        d5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][4]=2;
        d++;
        d5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (d==5) {
      if (istRotAmZug()==true) {
        FeldArray[3][5]=1;
        d++;
        d6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[3][5]=2;
        d++;
        d6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of dButton_ActionPerformed

  public void eButton_ActionPerformed(ActionEvent evt) {
    if (e==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (e==0) {
      if (istRotAmZug()==true) {
        FeldArray[4][0]=1;
        e++;
        e1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][0]=2;
        e++;
        e1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (e==1) {
      if (istRotAmZug()==true) {
        FeldArray[4][1]=1;
        e++;
        e2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][1]=2;
        e++;
        e2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (e==2) {
      if (istRotAmZug()==true) {
        FeldArray[4][2]=1;
        e++;
        e3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][2]=2;
        e++;
        e3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (e==3) {
      if (istRotAmZug()==true) {
        FeldArray[4][3]=1;
        e++;
        e4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][3]=2;
        e++;
        e4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (e==4) {
      if (istRotAmZug()==true) {
        FeldArray[4][4]=1;
        e++;
        e5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][4]=2;
        e++;
        e5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (e==5) {
      if (istRotAmZug()==true) {
        FeldArray[4][5]=1;
        e++;
        e6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[4][5]=2;
        e++;
        e6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of eButton_ActionPerformed

  public void fButton_ActionPerformed(ActionEvent evt) {
    if (f==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (f==0) {
      if (istRotAmZug()==true) {
        FeldArray[5][0]=1;
        f++;
        f1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][0]=2;
        f++;
        f1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (f==1) {
      if (istRotAmZug()==true) {
        FeldArray[5][1]=1;
        f++;
        f2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][1]=2;
        f++;
        f2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (f==2) {
      if (istRotAmZug()==true) {
        FeldArray[5][2]=1;
        f++;
        f3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][2]=2;
        f++;
        f3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (f==3) {
      if (istRotAmZug()==true) {
        FeldArray[5][3]=1;
        f++;
        f4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][3]=2;
        f++;
        f4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (f==4) {
      if (istRotAmZug()==true) {
        FeldArray[5][4]=1;
        f++;
        f5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][4]=2;
        f++;
        f5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (f==5) {
      if (istRotAmZug()==true) {
        FeldArray[5][5]=1;
        f++;
        f6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[5][5]=2;
        f++;
        f6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of fButton_ActionPerformed

  public void gButton_ActionPerformed(ActionEvent evt) {
    if (g==6) {
      reiheVoll();
      return;
    } // end of if
    
    if (g==0) {
      if (istRotAmZug()==true) {
        FeldArray[6][0]=1;
        g++;
        g1.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][0]=2;
        g++;
        g1.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (g==1) {
      if (istRotAmZug()==true) {
        FeldArray[6][1]=1;
        g++;
        g2.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][1]=2;
        g++;
        g2.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (g==2) {
      if (istRotAmZug()==true) {
        FeldArray[6][2]=1;
        g++;
        g3.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][2]=2;
        g++;
        g3.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (g==3) {
      if (istRotAmZug()==true) {
        FeldArray[6][3]=1;
        g++;
        g4.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][3]=2;
        g++;
        g4.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (g==4) {
      if (istRotAmZug()==true) {
        FeldArray[6][4]=1;
        g++;
        g5.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][4]=2;
        g++;
        g5.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
    if (g==5) {
      if (istRotAmZug()==true) {
        FeldArray[6][5]=1;
        g++;
        g6.setIcon(rot);
        rotAmZug();
        return;
      } // end of if
      else {
        FeldArray[6][5]=2;
        g++;
        g6.setIcon(gelb);
        gelbAmZug();
        return;
      } // end of if-else
    } // end of if
    
  } // end of gButton_ActionPerformed

  public void spieleGelb(){
    int bewertungMax=0;
    int maxI=0;
    int bewertung=0;
    int v=0;
    
    for (int i=0;i<B;i++) {
      v=istSpalteSpielbar(i);
      if (v>-1) {
        bewertung=berechneBewertung(i,v);
        if ((bewertung>bewertungMax) || (bewertung==bewertungMax && (abs(i-(B/2))<=1)) ) {
          bewertungMax=bewertung;
          maxI=i;
        } // end of if
      } // end of if
    } // end of for
    printDebug("Spalte:"+maxI +"bewertungMax:"+bewertungMax);


    if (maxI==0) {
      aButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==1) {
      bButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==2) {
      cButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==3) {
      dButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==4) {
      eButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==5) {
      fButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    if (maxI==6) {
      gButton_ActionPerformed(new ActionEvent(new Object(), 2, ""));
    } // end of if
    
  }  

  public int istSpalteSpielbar(int spalte){
    for (int j=0;j<H;j++) {
      if (FeldArray[spalte][j]==0) {
        return j;
      } // end of if
    } // end of for
    return -1;
  }  
    
  public int berechneBewertung(int i, int j){
    int bewertung=0;
    try {
      for (int a=-1;a<=schwierigkeit;a++) {
        for (int b=-1;b<=schwierigkeit;b++) {
          if (FeldArray[i+a][j+b]==2) {
            bewertung++;
            printDebug("j:"+ j +"i:"+ i +"Bewertung:"+bewertung );
          } // end of if
        } // end of for
      } // end of for
    } catch(Exception e) {
      
      printDebug("Fehler in berechneBewertung");
    } 
    return bewertung;
  }

  public void printDebug(String fehlermeldung){
    if (debug) {
      System.out.println(fehlermeldung);
    } // end of if
    return;
  }


  // Ende Methoden
} // end of class vierGewinnt

