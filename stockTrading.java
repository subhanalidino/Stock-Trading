class Stock{
	String symbol;
	String companyName;
	double price;
	int quantity;

	Stock(String symbol , String companyName , double price, int quantity){
		this.symbol = symbol;
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
	}

	void displayStock(){
		System.out.println("Displaying Symbol Of Stock: " + " " + symbol);
		System.out.println("Displaying Compnay Name: " + " " + companyName);
		System.out.println("Displaying the price: " + " " + price);
		System.out.println("Displaying the Quantity: " + " " + quantity);
	}

	void updatePrice(double newPrice){
		price = newPrice;
	}
}

class User{
	int userId;
	String name;
	double balance;

	User(int userId, String name, double balance){
		this.userId = userId;
		this.name = name;
		this.balance = balance;
	}

	void displayUser(){
		System.out.println("User ID is: " + " " + userId);
		System.out.println("User Name is: " + " " + name);
		System.out.println("User's Balance is: " + " " + balance);
	}

	void depositMoney(double DepositMoney){
		if(DepositMoney > 0 ){
			balance += DepositMoney;
			System.out.println("Your Money is deposited Successfully.");
		}
		else{
			System.out.println("Sorry Deposit denied.");
		}
		
	}

	void withdrawMoney(double withdrawnPrice){
		if(withdrawnPrice <= balance && withdrawnPrice > 0){
			balance -= withdrawnPrice;
			System.out.println("You withdraw Rs." + " " + withdrawnPrice);
		}
		else{
			System.out.println("Sorry you can not withdraw Money.");
		}
	}
}


class Transaction{
	int transactionId;
	User user;
	Stock stock;
	String type;
	int quantity;
	double totalAmount;

	Transaction(int transactionId, User user, Stock stock, String type, int quantity, double totalAmount){
		this.transactionId = transactionId;
		this.user = user;
		this.stock = stock;
		this.type = type;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	double calculateTotal(){
		totalAmount = stock.price * quantity;
		return totalAmount;
	}

	void displayTransaction(){
		System.out.println("Transaction ID: " + " " + transactionId);
		System.out.println("User Is : " + " " + user.name);
		System.out.println("Quantity :" + " " + quantity);
		System.out.println("Total Amount is : " + " " + totalAmount);
	}
}

class stockTrading{
	public static void main(String[] args){
		Stock ST = new Stock("AAPL" , "Apple" , 450.0 , 5);
		ST.displayStock();
		ST.updatePrice(550.0);
		User US = new User(4032 , "Atif" , 5000.0);
		US.displayUser();
		US.depositMoney(3000.0);
		US.withdrawMoney(1000.0);
		Transaction TS = new Transaction(1001, US, ST, "BUY", 5, 500.0);
		TS.calculateTotal();
		TS.displayTransaction();

	}
}
