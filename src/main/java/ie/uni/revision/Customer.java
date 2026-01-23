package ie.uni.revision;

public class Customer {
  private String customerID;
  private String customerName;
  private String customerEmail;
  private String customerPhone;

  public Customer() {
    this.customerID = "";
    this.customerName = "";
    this.customerEmail = "";
    this.customerPhone = "";
  }

  public Customer(String cusID, String cusName, String cusEmail, String cusPhone) {
    this.customerID = cusID;
    this.customerName = cusName;
    this.customerEmail = cusEmail;
    this.customerPhone = cusPhone;
  }

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhone() {
    return customerPhone;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "customerID='" + customerID + '\'' +
        ", customerName='" + customerName + '\'' +
        ", customerEmail='" + customerEmail + '\'' +
        ", customerPhone='" + customerPhone + '\'' +
        '}';
  }
}
