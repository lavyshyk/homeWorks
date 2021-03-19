package shop.customers;

public class PrivilegedCustomer extends Customer{

   private int privilegeAccountNo;

   public PrivilegedCustomer(String name, int privilegeAccountNo) {
      super(name);
      this.privilegeAccountNo = privilegeAccountNo;
   }

   public int getPrivilegeAccountNo() {
      return privilegeAccountNo;
   }
}
