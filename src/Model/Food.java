package Model;

/**
 * Transportation class 
 * @author Alper Mumcular
 * @version 17.12.2020
 */
public class Food extends Category {

  public static final double DAYS_IN_A_YEAR = 360;

  // FOOD QUESTIONS' CONSTANTS
  public static final double BEEF_LAMB_VEAL = 0.0201162791; //kgCO2
  public static final double FISH_SEAFOOD = 0.00025258658; // kgCO2
  public static final double OTHER_MEAT = 0.00766284; // kgCO2
  public static final double DAIRY = 0.00971251; // kgCO2
  public static final double GRAINS = 0.00207607; // kgCO2
  public static final double FRUITS = 0.00768758; // kgCO2
  public static final double POULTRY_EGGS = 0.01094276; // kgCO2
  public static final double SNACKS = 0.00566123; // kgCO2

  // DEFAULT CONSTANT
  public static final double DEFAULT = 7182.0;

  /**
   * constructor
   * @param h ---> default / personalise for food category
   */
  public Food(boolean h){
    super(h);
    setDef( DEFAULT );
  }

}