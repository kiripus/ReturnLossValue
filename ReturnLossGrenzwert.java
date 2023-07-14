import java.awt.*;
import java.awt.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.12.2017
  * @author 
  */

public class ReturnLossGrenzwert extends Frame {
  // Anfang Attribute
  private Label lReturnLossGrenzwert = new Label();
  private Label lIsteinDPXverbaut = new Label();
  private Button bJa1 = new Button();
  private Button bNein1 = new Button();
  private Label lIsteinTMAverbaut = new Label();
  private Button bJa2 = new Button();
  private Button bNein2 = new Button();
  private Label lIsteinUSSverbaut = new Label();
  private Button bJa3 = new Button();
  private Button bNein3 = new Button();
  private Label lWielangistderJumper = new Label();
  private NumberField numberFieldJumper = new NumberField();
  private Label labelInm = new Label();
  private Label lWielangistderFeeder = new Label();
  private NumberField numberFieldFeeder = new NumberField();
  private Label lInm = new Label();
  private Button bBerechnen = new Button();
  private Button bZuruecksetzen = new Button();
  private Label lDampfung = new Label();
  private Label labelErgebniss1 = new Label();
  private Label lIndB = new Label();
  private double dpx = 0;
  private double TMA = 0;
  private double ÜSS = 0;
  private double jumper = 0;
  private double feeder = 0;
  private double ergebniss1 = 0;
  private double ergebniss2 = 0;
  
  
  private Label lKommazahlenmussenmit = new Label();
  private Label lPunktangegebenwerden = new Label();
  private Label lBykgProductions1 = new Label();
  private Label lGrenzwert = new Label();
  private Label labelErgebniss2 = new Label();
  private Label lIndB1 = new Label();
  // Ende Attribute
  
  public ReturnLossGrenzwert() { 
    // Frame-Initialisierung
    super();
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 329; 
    int frameHeight = 752;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("ReturnLossGrenzwert");
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    lReturnLossGrenzwert.setBounds(0, 0, 299, 49);
    lReturnLossGrenzwert.setText("Return Loss Grenzwert");
    lReturnLossGrenzwert.setAlignment(Label.CENTER);
   lReturnLossGrenzwert.setFont(new Font("Dialog", Font.PLAIN, 28));
    cp.add(lReturnLossGrenzwert);
    cp.setBackground(new Color(0xC0C0C0));
    lIsteinDPXverbaut.setBounds(8, 64, 219, 25);
    lIsteinDPXverbaut.setText("Ist ein DPX verbaut?");
    lIsteinDPXverbaut.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lIsteinDPXverbaut);
    bJa1.setBounds(8, 104, 57, 25);
    bJa1.setLabel("Ja");
    bJa1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bJa1_ActionPerformed(evt);
      }
    });
    bJa1.setBackground(new Color(0xEEEEEE));
    cp.add(bJa1);
    bNein1.setBounds(88, 104, 57, 25);
    bNein1.setLabel("Nein");
    bNein1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNein1_ActionPerformed(evt);
      }
    });
    cp.add(bNein1);
    lIsteinTMAverbaut.setBounds(8, 152, 219, 33);
    lIsteinTMAverbaut.setText("Ist ein TMA verbaut?");
    lIsteinTMAverbaut.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lIsteinTMAverbaut);
    bJa2.setBounds(8, 200, 57, 25);
    bJa2.setLabel("Ja");
    bJa2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bJa2_ActionPerformed(evt);
      }
    });
    cp.add(bJa2);
    bNein2.setBounds(88, 200, 57, 25);
    bNein2.setLabel("Nein");
    bNein2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNein2_ActionPerformed(evt);
      }
    });
    cp.add(bNein2);
    lIsteinUSSverbaut.setBounds(8, 248, 219, 41);
    lIsteinUSSverbaut.setText("Ist ein ÜSS verbaut?");
    lIsteinUSSverbaut.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lIsteinUSSverbaut);
    bJa3.setBounds(8, 304, 57, 25);
    bJa3.setLabel("Ja");
    bJa3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bJa3_ActionPerformed(evt);
      }
    });
    cp.add(bJa3);
    bNein3.setBounds(88, 304, 57, 25);
    bNein3.setLabel("Nein");
    bNein3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNein3_ActionPerformed(evt);
      }
    });
    bNein3.setBackground(new Color(0xEEEEEE));
    cp.add(bNein3);
    lWielangistderJumper.setBounds(8, 352, 235, 33);
    lWielangistderJumper.setText("Wie lang ist der Jumper?");
    lWielangistderJumper.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lWielangistderJumper);
    numberFieldJumper.setBounds(8, 400, 57, 25);
    numberFieldJumper.setText("");
    numberFieldJumper.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(numberFieldJumper);
    labelInm.setBounds(72, 400, 37, 25);
    labelInm.setText("in m");
    labelInm.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(labelInm);
    lWielangistderFeeder.setBounds(8, 448, 235, 33);
    lWielangistderFeeder.setText("Wie lang ist der Feeder?");
    lWielangistderFeeder.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lWielangistderFeeder);
    numberFieldFeeder.setBounds(8, 496, 57, 25);
    numberFieldFeeder.setText("");
    numberFieldFeeder.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(numberFieldFeeder);
    lInm.setBounds(72, 496, 37, 25);
    lInm.setText("in m");
    lInm.setFont(new Font("Dialog", Font.PLAIN, 18));
    cp.add(lInm);
    bBerechnen.setBounds(32, 544, 105, 33);
    bBerechnen.setLabel("Berechnen");
    bBerechnen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBerechnen_ActionPerformed(evt);  
      }
    });
    cp.add(bBerechnen);
    bZuruecksetzen.setBounds(160, 544, 105, 33);
    bZuruecksetzen.setLabel("Zurücksetzen");
    bZuruecksetzen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bZuruecksetzen_ActionPerformed(evt);
      }
    });
    cp.add(bZuruecksetzen);
    lDampfung.setBounds(32, 592, 91, 33);
    lDampfung.setText("Dämpfung:");
    lDampfung.setFont(new Font("Dialog", Font.PLAIN, 18));
    lDampfung.setAlignment(Label.CENTER);
    cp.add(lDampfung);
    labelErgebniss1.setBounds(128, 592, 75, 33);
    labelErgebniss1.setText("");
    labelErgebniss1.setFont(new Font("Dialog", Font.PLAIN, 18));
    labelErgebniss1.setAlignment(Label.CENTER);
    cp.add(labelErgebniss1);
    lIndB.setBounds(224, 592, 43, 33);
    lIndB.setText("in dB");
    lIndB.setFont(new Font("Dialog", Font.PLAIN, 18));
    lIndB.setAlignment(Label.CENTER);
    cp.add(lIndB);
    lKommazahlenmussenmit.setBounds(152, 392, 156, 17);
    lKommazahlenmussenmit.setText("Kommazahlen müssen mit ");
    cp.add(lKommazahlenmussenmit);
    lPunktangegebenwerden.setBounds(152, 408, 155, 19);
    lPunktangegebenwerden.setText("Punkt angegeben werden!");
    cp.add(lPunktangegebenwerden);
    lBykgProductions1.setBounds(192, 696, 107, 19);
    lBykgProductions1.setText("by kg-Productions");
    cp.add(lBykgProductions1);
    lGrenzwert.setBounds(32, 640, 91, 33);
    lGrenzwert.setText("Grenzwert:");
    lGrenzwert.setFont(new Font("Dialog", Font.PLAIN, 18));
    lGrenzwert.setAlignment(Label.CENTER);
    cp.add(lGrenzwert);
    labelErgebniss2.setBounds(128, 640, 75, 33);
    labelErgebniss2.setText("");
    labelErgebniss2.setFont(new Font("Dialog", Font.PLAIN, 18));
    labelErgebniss2.setAlignment(Label.CENTER);
    cp.add(labelErgebniss2);
    lIndB1.setBounds(224, 640, 45, 33);
    lIndB1.setText("in dB");
    lIndB1.setFont(new Font("Dialog", Font.PLAIN, 18));
    lIndB1.setAlignment(Label.CENTER);
    cp.add(lIndB1);
    // Ende Komponenten
     
    setVisible(true);
  } // end of public ReturnLossGrenzwert
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ReturnLossGrenzwert();
    
  } // end of main
  
  public void bJa1_ActionPerformed(ActionEvent evt) {
    dpx = 0.2   ;
    
    bJa1.setBackground(Color.GRAY) ;  
    bNein1.setBackground(new Color(0xEEEEEE))  ;
  } // end of bJa1_ActionPerformed

  public void bNein1_ActionPerformed(ActionEvent evt) {
    dpx = 0;
    
    bNein1.setBackground(Color.GRAY) ;
    bJa1.setBackground(new Color(0xEEEEEE)) ;
    
  } // end of bNein1_ActionPerformed

  public void bJa2_ActionPerformed(ActionEvent evt) {
    TMA = 1.3;
    
    bJa2.setBackground(Color.GRAY) ;
    bNein2.setBackground(new Color(0xEEEEEE))  ;
  } // end of bJa2_ActionPerformed

  public void bNein2_ActionPerformed(ActionEvent evt) {
    TMA = 0 ;
    
    bNein2.setBackground(Color.GRAY) ;
    bJa2.setBackground(new Color(0xEEEEEE)) ;
  } // end of bNein2_ActionPerformed
  
  
  public void bJa3_ActionPerformed(ActionEvent evt) {
    ÜSS = 0.1 ;
    
    bJa3.setBackground(Color.GRAY) ;
    bNein3.setBackground(new Color(0xEEEEEE)) ;
  } // end of bJa3_ActionPerformed 
    
  
  public void bNein3_ActionPerformed(ActionEvent evt) {
    ÜSS = 0;
    
    bNein3.setBackground(Color.GRAY) ;
    bJa3.setBackground(new Color(0xEEEEEE)) ;
  } // end of bNein3_ActionPerformed
  
  public void bBerechnen_ActionPerformed(ActionEvent evt) {
    jumper = numberFieldJumper.getDouble() * 0.0708 ;
    feeder = numberFieldFeeder.getDouble() * 0.025;                                               
    ergebniss1 = dpx +  TMA +  ÜSS + jumper + feeder ;
    ergebniss2 = -20 * Math.log10(Math.pow(10,-1.3) + Math.pow(10,(-2 * ergebniss1 - 14) / 20));                               
    ergebniss2 = Math.round(ergebniss2 * 1000)/1000.0 ;
    ergebniss1 = Math.round(ergebniss1 * 1000)/1000.0 ;
    labelErgebniss1.setText(Double.toString(ergebniss1))    ;
    labelErgebniss2.setText(Double.toString(ergebniss2))    ;
  } // end of bBerechnen_ActionPerformed

  public void bZuruecksetzen_ActionPerformed(ActionEvent evt) {
    numberFieldJumper.clear(); 
    numberFieldFeeder.clear();
    labelErgebniss1.setText("") ;
    labelErgebniss2.setText("") ;
    ÜSS = 0 ; 
    TMA = 0 ;
    dpx = 0 ;
    feeder = 0 ;
    jumper = 0 ;
    ergebniss1 = 0 ;
    ergebniss2 = 0 ;
    bJa1.setBackground(new Color(0xEEEEEE));
    bJa2.setBackground(new Color(0xEEEEEE));
    bJa3.setBackground(new Color(0xEEEEEE));
    bNein1.setBackground(new Color(0xEEEEEE));
    bNein2.setBackground(new Color(0xEEEEEE));
    bNein3.setBackground(new Color(0xEEEEEE));
    
  } // end of bZuruecksetzen_ActionPerformed
                                                       
  // Ende Methoden
} // end of class ReturnLossGrenzwert

