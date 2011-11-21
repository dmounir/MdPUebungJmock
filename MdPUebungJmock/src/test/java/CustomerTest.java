import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class CustomerTest {
	
	Mockery context;
    ICustomer customer;

	@Before
	public void setUp() throws Exception {
		
        context = new JUnit4Mockery();
        customer = new Customer();
	}

	@Test
	public void testStoreCustomer() {
		// set up
        final IDatabase database = context.mock(IDatabase.class);
        customer.setName("Name");
        customer.setVorname("Vorname");
        customer.setAdresse("Adresse");

        context.checking(new Expectations() {
            {
                one(database).writeCustomerData(customer);
            }
        });

        customer.storeCustomer(database);
      
	}

}
