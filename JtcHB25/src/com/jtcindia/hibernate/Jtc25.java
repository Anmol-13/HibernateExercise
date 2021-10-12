package com.jtcindia.hibernate;

public class Jtc25 {
	public static void main(String[] args) {
		CustomerDAO cdao = DAOFactory.getCustomerDAO();
//		CustomerDAO s = new CustomerTo(null, null, null, null, null);
		CustomerTo cto = new CustomerTo("som","som@jtcindia.com",9990399L,"noida","Enabled");
		cdao.addCustomer(cto);
		CustomerTo cto1 = new CustomerTo("Gom","Dom@jtcindia.com",9234359L,"noida","Enabled");
		cdao.addCustomer(cto1);
		CustomerTo c1 = cdao.getCustomerByCid(1);
		System.out.println(c1.getCid()+"\t"+c1.getCname()+"\t"+c1.getEmail()+"\t"+c1.getPhone()+"\t"+c1.getCity()+"\t"+c1.getStatus());
		cdao.deleteCustomer(1);
		
		CustomerTo c12 = cdao.getCustomerByCid(2);
		System.out.println(c12.getCid()+"\t"+c12.getCname()+"\t"+c12.getEmail()+"\t"+c12.getPhone()+"\t"+c12.getCity()+"\t"+c12.getStatus());

		
		CustomerTo c2 = cdao.getCustomerByCid(2);
		c2.setCname("SomPrakash");
		c2.setEmail("somprakash@jtcindia.com");
		c2.setPhone(77788678L);
		cdao.updateCustomer(c2);
		
		
		
		
	}

}
