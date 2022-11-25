package computer;

import java.util.EnumMap;
import java.util.EnumSet;

enum Level {
    HIGH  ("ahri"),  //calls constructor with value 3
    MEDIUM("s"),  //calls constructor with value 2
    LOW   ("jds")   //calls constructor with value 1
    ; // semicolon needed when fields / methods follow


    private final String levelCode;    //field

    private Level(String levelCode) {
        this.levelCode = levelCode;
    }
    
    public String getLevelCode() {
        return this.levelCode;
    }
    
}
public class Enums {

	public static void main(String[] args) {
		
		Level level = Level.MEDIUM;   //keeala irukka linethaa ipdi potrukom
		//Level lev = new Level(Level.MEDIUM);

		System.out.println(level.getLevelCode());
		/*********enummasp****************/
	    EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM,Level.LOW);
	    System.out.println(enumSet);
	    /******************Enummap***********/
	    EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
	    enumMap.put(Level.HIGH  , "High levl");
	    enumMap.put(Level.MEDIUM, "Medium levl");
	    enumMap.put(Level.LOW   , "Low level");

	    String levelValue = enumMap.get(Level.MEDIUM);
	    System.out.println(levelValue);
	}

}

