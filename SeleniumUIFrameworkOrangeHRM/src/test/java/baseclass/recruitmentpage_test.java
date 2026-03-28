package baseclass;
import org.testng.annotations.Test;

import bseclass.base_class;

public class recruitmentpage_test extends base_class{
	//WebDriver driver;
	 @Test
	 public void addvacancymethod() {
		 dp.clickRecruitmentlink();
		 rp.addvacancy("automation engineer","post for automation engineer","Naveen","10");
}
}