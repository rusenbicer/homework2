public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService icustomerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService icustomerCheckService) {
		this.icustomerCheckService = icustomerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception{  

		if (icustomerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new Exception("Not a valid person");
		}
	}
	

}
