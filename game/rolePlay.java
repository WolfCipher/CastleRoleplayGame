/*
Riley Howardsmith
This is my selection statement project
It is an RPG game with different character roles
10/26/2021
*/
package game;

import javax.swing.*;
public class rolePlay
{
  public static String[] chooseRole = {"knight", "wizard","scholar"};
  public static String[] yesNo = {"Yes", "No"};
  public static String[] fightMonsters = {"Act", "Do nothing"};
  public static String[] magicResearch = {"Orb of Healing", "Staff of Power"};
  public static int role, study, skill = 0, fight, truth = 0, randomNum = (int)(Math.random()*10)+1;
  public static String help, weapon, name, name2, role2;
  public static ImageIcon castle = new ImageIcon("castle.jpg");
  //********************************STORY*LINE************************************
  public static void storyLine(){
  skill = 0;
  startFunction();
  //******************************ROLE KNIGHT*******************************
  if(role == 0){
    if(study == 0){
    skill++;
      if(randomNum < 1){
        JOptionPane.showMessageDialog(null, "You improved your skill in basic\nswordplay and feel energized.", "KINGDOM ROLEPLAY", -1);
      }//end if BASICS
      else if(randomNum < 8){
        JOptionPane.showMessageDialog(null, "While training, you were able to learn the next level techniques\nin swordplay. Your success gives you renewed strength.", "KINGDOM ROLEPLAY", -1);
        skill++;
      }//end of RETALIATE
      else if(randomNum <=11){
        JOptionPane.showMessageDialog(null, "While practicing, you came up with a new advanced move and taught\nit to everyone. Your success gives you high hopes for the future.", "KINGDOM ROLEPLAY",-1);
        skill++;
        skill++;
      }//end of ADVANCED MOVE
    }//end if study
    fight = JOptionPane.showOptionDialog(null, "Monsters have trespassed your kingdom. What do you do?", "KINGDOM ROLEPLAY", 1, -1, null, fightMonsters, fightMonsters[0]);
    if (fight == 0){
      weapon = JOptionPane.showInputDialog(null, "You can choose a bow, sword, or axe.\nWhich do you choose?", "KINGDOM ROLEPLAY", -1);
      JOptionPane.showMessageDialog(null,"You get your " +weapon+ " and your armor.\nYou race across the kingdom to fight the monsters.", "KINGDOM ROLEPLAY", -1);
    } //end knight fight
    actOrNot();
  } //end if knight role
  //************************************ROLE WIZARD**********************************************
  if(role == 1){
    if(study == 0){
    skill++;
      if(randomNum < 1){
        JOptionPane.showMessageDialog(null, "Though nothing came of your study of magical artifacts, you have\nlearned a great deal more spells and feel energized.", "KINGDOM ROLEPLAY", -1);
      }//end if NOTHING
      else if(randomNum < 8){
        JOptionPane.showMessageDialog(null, "In your study of magical artifacts, you recognized that the dusty sphere\nused for decoration in the castle is actually the orb of healing. You are able\nto acquire it and its magic gives you renewed strength.", "KINGDOM ROLEPLAY", -1);
        skill++;
      }//end of ORB OF HEALING
      else if(randomNum <=11){
        JOptionPane.showMessageDialog(null, "In your study of magical artifacts, you solved a riddle and discovered the secret hiding place of\nthe staff of power. Your success gives you high hopes for the future.", "KINGDOM ROLEPLAY", -1);
        skill++;
        skill++;
      }//end of STAFF OF POWER
    }//end if study
    fight = JOptionPane.showOptionDialog(null, "Monsters have trespassed your kingdom. What do you do?", "KINGDOM ROLEPLAY", 1, -1, null, fightMonsters, fightMonsters[0]);
    if (fight == 0){
      weapon = JOptionPane.showInputDialog(null, "You can choose a staff, orb, or wand.\nWhich do you choose?", "KINGDOM ROLEPLAY", -1);
      JOptionPane.showMessageDialog(null,"You get your " +weapon+ " and race across the kingdom.\nYou curse the monsters and endow the knights' armor\nand the villages with a defensive charm.", "KINGDOM ROLEPLAY", -1);
    } //end wizard fight
    actOrNot();
  } //end if wizard role
  //*****************************ROLE SCHOLAR******************************************************
  if(role == 2){
    if(study == 0){
    skill++;
      if(randomNum < 1){
        JOptionPane.showMessageDialog(null, "Though you didn't make any breakthroughs, you have learned a great\ndeal about monster societies, which gives you more determination.", "KINGDOM ROLEPLAY", -1);
      }//end if NOTHING
      else if(randomNum < 8){
        JOptionPane.showMessageDialog(null, "In your study of monsters, you recognized a pattern in the chosen days\nof attack: the monsters attacked under the blood moon.\nYour spirits have been enlightened by your discovery.", "KINGDOM ROLEPLAY", -1);
        skill++;
      }//end of LIGHT WEAKNESS
      else if(randomNum <=11){
        JOptionPane.showMessageDialog(null, "In your study of monsters, you realized that monsters preferred attacking at\nnight and never leave the shadows. Could it be that light is their weakness?\nYour discovery was proven true, and the knights were able to use it to their\nadvantage when fighting the monsters.\nYour success gives you high hopes for the future.", "KINGDOM ROLEPLAY", -1);
        skill++;
        skill++;
      }//end of STAFF OF POWER
    }//end if study
    fight = JOptionPane.showOptionDialog(null, "Monsters have trespassed your kingdom. What do you do?", "KINGDOM ROLEPLAY", 1, -1, null, fightMonsters, fightMonsters[0]);
    if (fight == 0){
      weapon = JOptionPane.showInputDialog(null, "You have limited time to grab something you help you.\nYou can get your own notes or a book. Which do you choose?", "KINGDOM ROLEPLAY", -1);
      JOptionPane.showMessageDialog(null,"You get your " +weapon+ " and race across the kingdom.\nYou help the kingdom form strategies of attack.", "KINGDOM ROLEPLAY", -1);
    } //end scholar fight
    actOrNot();
  } //end if scholar role

 }//end storyLine function
   //********************************TURN*BACK**************************************
  public static void turnBack(){
   JOptionPane.showMessageDialog(null, "During your life after the monster attack, you meet an... interesting... character.\nThey say that they can reverse time so that you can change your life's path.","KINGDOM ROLEPLAY",-1);
   help = JOptionPane.showInputDialog(null, "Do you accept their help?", "KINGDOM ROLEPLAY", -1);
   if(help.equalsIgnoreCase("yes")||help.equalsIgnoreCase("sure")||help.equalsIgnoreCase("yep")||help.equalsIgnoreCase("yup")||help.equalsIgnoreCase("of course")||help.equalsIgnoreCase("yim")||help.equalsIgnoreCase("yea")||help.equalsIgnoreCase("certainly")||help.equalsIgnoreCase("definitely")||help.equalsIgnoreCase("okay")||help.equalsIgnoreCase("i guess")||help.equalsIgnoreCase("aye")||help.equalsIgnoreCase("okie")){
   JOptionPane.showMessageDialog(null, "You told them " +help+ ". They give you the option to start your\nlife anew as a knight, wizard, or scholar.","KINGDOM ROLEPLAY",-1);
   storyLine();
   }//end if YES
   else{
      if(fight == 0 && skill >= 4 && truth == 1){
      JOptionPane.showMessageDialog(null, "You told them " +help+ ".\nYou continue your life, knowing that\nyour decisions made your life the happiest\nit could be. You are happy as a "+chooseRole[role]+"\nand enjoy your life to the fullest.","KINGDOM ROLEPLAY",-1);
      }//end if happiest ending
      else{
      JOptionPane.showMessageDialog(null, "You told them " +help+ ".\nYou continue your life, wondering what\nwould have happened if you had said yes.\nNevertheless, you find peace in your life\nin one way or another.","KINGDOM ROLEPLAY",-1);
      }//end if not happiest ending
      JOptionPane.showMessageDialog(null, "Your skill points, earned by taking action and studying, total to " +skill+ ".","KINGDOM ROLEPLAY",-1);
   }//end if NO
   }//end TURN BACK
   //**********************START*FUNCTION****************************************
  public static void startFunction(){
    role = JOptionPane.showOptionDialog(null, "Welcome to the kingdom. Choose your role.", "KINGDOM ROLEPLAY", 1, -1, castle, chooseRole, chooseRole[0]);
    try{
    name = JOptionPane.showInputDialog(null, "You have been accepted as a "+chooseRole[role]+". What do you wish to be called?","KINGDOM ROLEPLAY", -1);
    study = JOptionPane.showOptionDialog(null, "Good luck, "+chooseRole[role]+" " +name+". Do you choose to practice your skills?", "KINGDOM ROLEPLAY", 1, -1, null, yesNo, yesNo[0]);
    }//end try
    catch(Exception e){
    error();
    }//end catch
  }//startFunction end
  //***********************ACT*OR*NOT*********************************************
  public static void actOrNot(){
   if(fight == 0){
    if(skill >= 1){
    JOptionPane.showMessageDialog(null, "You were a valiant member of the kingdom's "+chooseRole[role]+"s.\nYour studying paid off; there were no casualties.\nYou and other notable heroes are being brought\nbefore the ruling family for a ceremony.", "KINGDOM ROLEPLAY", -1);
    skill++;
    skill++;
    skill++;
    honorCeremony();
    }//if studied + acted
    else{
     if(randomNum < 8){
      JOptionPane.showMessageDialog(null, "Your kingdom succeeded in fighting off the monsters, but just barely.", "KINGDOM ROLEPLAY", -1);
      skill++;
      turnBack();
      }//end of BARELY MADE IT
     else if(randomNum <=11){
       JOptionPane.showMessageDialog(null, "Your kingdom succeeded in fighting off the monsters.\nThough you didn't study, you got lucky and your people are calling you a hero.\nYou and other notable heroes are being brought before the ruling family for a ceremony.", "KINGDOM ROLEPLAY", -1);
       skill++;
       skill++;
       honorCeremony();
      }//end of BETTER ENDING FOR THOSE WHO DID NOT STUDY
    }//if did not study + acted
   }//end if ACT
   else{
     if(randomNum < 8){
        JOptionPane.showMessageDialog(null, "Without everyone doing their part, the kingdom was overrun with monsters.\nYou feel very guilty as you survey the damage wrought upon your kingdom.\nYou struggle to survive on your own.", "KINGDOM ROLEPLAY", -1);
        turnBack();
     }//end FAILED KINGDOM
     else if(randomNum <=11){
        JOptionPane.showMessageDialog(null, "Even though you didn't act, the kingdom survived, but just barely.\nThe rulers of your kingdom are angry, however, with everyone who did not do their part.\nYou and the other people who didn't act have been exiled.\nYou live with these people and struggle to survive with them.","KINGDOM ROLEPLAY",-1);
        turnBack();
     }//end EXILED
   }//end if DID NOT ACT
  }//end actOrNot function
  //********************************HONOR CEREMONY*****************************
  public static void honorCeremony(){
  name2 = JOptionPane.showInputDialog(null, "You and the other heroes are brought to a pavilion.\nBecause there are so many heroes, the\nroyal family is asking for names to differentiate you.\nWhat do you tell them your name is?","KINGDOM ROLEPLAY",-1);
  if(name2.equalsIgnoreCase(name)){
   role2 = JOptionPane.showInputDialog(null, "You feel great pride in telling the royal family your name, " +name2+".\nThey ask you what role you played. What do you tell them? \"I am a ______.\"","KINGDOM ROLEPLAY",-1);
   if(role2.equalsIgnoreCase(chooseRole[role])){
   JOptionPane.showMessageDialog(null, "In telling your role and name truthfully,\nthe royal family connected you with your deeds.\nYou have been promoted. Go ahead, feel pride.","KINGDOM ROLEPLAY",-1);
   truth++;
   turnBack();
   }//end if tell true role
   else{
   JOptionPane.showMessageDialog(null, "You feel shame afterwards for lying.\nThe royal family gives you respectful nods\nbut does not connect you with your deeds.","KINGDOM ROLEPLAY",-1);
   turnBack();
  }//end if tell false role
  }//end if tell true name
  else{
   role2 = JOptionPane.showInputDialog(null, "You feel shame for lying and calling yourself " +name2+"\ninstead of "+name+". They ask you what\nrole you played. What do you tell them? \"I am a ______.\"","KINGDOM ROLEPLAY",-1);
   if(role2.equalsIgnoreCase(chooseRole[role])){
   JOptionPane.showMessageDialog(null, "Though you told your role truthfully,\nthe royal family does not connect you with your deeds.\nYou watch as the other heroes are promoted.","KINGDOM ROLEPLAY",-1);
   turnBack();
   }//end if tell true role
   else{
   JOptionPane.showMessageDialog(null, "You feel disgusted with yourself for lying.\nThe royal family believes that you must be\nmistaken in coming to the heroes' side of the pavilion.","KINGDOM ROLEPLAY",-1);
   turnBack();
   }//end if tell false role
  }//end if tell false name
  }//end honor ceremony
  //*********************************ERROR***********************************************
  public static void error(){
  JOptionPane.showMessageDialog(null, "You created an error in the function. Starting over your experience.","KINGDOM ROLEPLAY",-1);
  storyLine();
  }//end error function
  //********************************START PROGRAM***************************************
  public static void main(String[] args)
  {
  storyLine();
  }//end main
}//end program


