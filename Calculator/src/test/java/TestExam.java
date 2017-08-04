
import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Exam;

public class TestExam {

	@Test
	public void test() {
		/* NUMBER 1 */
		assertEquals("one",Exam.number1());
		
		/* NUMBER 2 */
		assertEquals(8,Exam.number2(5));
		assertEquals(34,Exam.number2(8));
		assertNotNull(Exam.number2(5));
		assertNotSame(32,Exam.number2(7));
		assertNotEquals(32,Exam.number2(7));
		
		/* NUMBER 3 */
		assertEquals(26,Exam.number3(2, 2));
		assertNotEquals(27,Exam.number3(2, 2));
		
		
	}

}
