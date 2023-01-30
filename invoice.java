package c22;

import java.sql.Date;

public class invoice {
int id;
String customerFullName;
String  phoneNumber;
Date  invoiceDate;
int numberOfItems;
int totalAmount;
int paidAmoun;
int balance;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerFullName() {
	return customerFullName;
}
public void setCustomerFullName(String customerFullName) {
	this.customerFullName = customerFullName;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Date getInvoiceDate() {
	return invoiceDate;
}
public void setInvoiceDate(Date invoiceDate) {
	this.invoiceDate = invoiceDate;
}
public int getNumberOfItems() {
	return numberOfItems;
}
public void setNumberOfItems(int numberOfItems) {
	this.numberOfItems = numberOfItems;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public int getPaidAmoun() {
	return paidAmoun;
}
public void setPaidAmoun(int paidAmoun) {
	this.paidAmoun = paidAmoun;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}



}
