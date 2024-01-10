
public class Customer {
	
	private int custId;
	private String custName;
	private Address addr;
	private Account accobj;
	public Customer(int custId, String custName, Address addr, Account accobj) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.accobj = accobj;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Account getAccobj() {
		return accobj;
	}
	public void setAccobj(Account accobj) {
		this.accobj = accobj;
	}
	
	

}
