
public class EnumTest {
	
	public static void main(String[] args) {
//		Enum Day và Enum Subject
		Subject[] s1 = new Subject[] {Subject.Maths, Subject.Chemistry, Subject.Physics};
		Subject[] s2 = new Subject[] {Subject.Literature, Subject.Chemistry, Subject.Computer_Science};
		Subject[] s3 = new Subject[] {Subject.Maths, Subject.Literature, Subject.History };
		Subject[] s4 = new Subject[] {Subject.Chemistry, Subject.Geography, Subject.History};

		
		LearningSchedule ls1 = new LearningSchedule(Day.Monday, s1);
		LearningSchedule ls2 = new LearningSchedule(Day.Tuesday, s2);
		LearningSchedule ls3 = new LearningSchedule(Day.Wednesday, s3);
		LearningSchedule ls4 = new LearningSchedule(Day.Thursday, s4);
		LearningSchedule ls5 = new LearningSchedule(Day.Friday, s1);
		LearningSchedule ls6 = new LearningSchedule(Day.Saturday, s2);
		LearningSchedule ls7 = new LearningSchedule(Day.Sunday, s3);
		
		System.out.println("---TKB---");
		System.out.println(ls1);
		System.out.println(ls2);
		System.out.println(ls3);
		System.out.println(ls4);
		System.out.println(ls5);
		System.out.println(ls6);
		System.out.println(ls7);
		System.out.println();
		
//		Enum Month
		System.out.println(Month.Month_1+" có tối đa số ngày: "+ Month.Month_1.getNumOfDate());
		System.out.println(Month.Month_2+" có tối đa số ngày: "+ Month.Month_2.getNumOfDate());
		System.out.println(Month.Month_9+" có tối đa số ngày: "+ Month.Month_9.getNumOfDate());
		
		
	}
}