package by.htp.project6.entity;

public class Customer {

	private int id;
	private String fullname;
	private String address;
	private long creditCard;
	private long account;
	
	public Customer(int _id, String _fullname, String _address, long _creditCard, long _account) {
		this.id = _id;
		this.fullname = _fullname;
		this.address = _address;
		this.creditCard = _creditCard;
		this.account = _account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(long creditCard) {
		this.creditCard = creditCard;
	}

	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (account ^ (account >>> 32));
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (creditCard ^ (creditCard >>> 32));
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account != other.account)
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (creditCard != other.creditCard)
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Клиент №" + id + ": Имя: " + fullname + ", Адрес: " + address + ", Карта №" + creditCard
				+ ", Аккаунт №" + account;
	}


	
}
