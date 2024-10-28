package Enum;

public enum Day {
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY;
	
	
	public boolean isWeekend() {
		
		return this == SATURDAY || this == SUNDAY;
	}
	
	
	public static void main(String args[]) {
		
		for(Day day : Day.values()) {
			
			System.out.println(day);
		}
		
		
		Day d = Day.FRIDAY;
		
		System.out.println(d.isWeekend());
		
		System.out.println(Day.FRIDAY.isWeekend());
		
	}

}
