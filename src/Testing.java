import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {
	
	static ShoppingCart cart ;
	@BeforeClass
	
	public static void setUpBeforeClass() throws Exception {
		cart= new ShoppingCart();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		int expCount1=0;
	int actuaCountl=cart.getCount();
	assertEquals(actuaCountl,expCount1);
	}

	@Test
	public void test2() {
		
		Book book = new Book("Java Book",  127);
		cart.addBook(book);
		
		int expCount2=1;
		int expTotalPrice=127;
		
		int actualCount2=cart.getCount();
		assertEquals(actualCount2,expCount2);

		int actualTotal= cart.totalprice();
		assertEquals(actualTotal,expTotalPrice);
	}
	@Test 
	public void test3() {
		Book book2=new Book("Web design Book",100);
        cart.addBook(book2);
		
		int expCount3=2;
		int expTotalPrice2=227;
		
		int actualCount3=cart.getCount();
		assertEquals(actualCount3,expCount3);

		int actualTotal2= cart.totalprice();
		assertEquals(actualTotal2,expTotalPrice2);
	}
}
