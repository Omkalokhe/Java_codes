package aggreagtion;

public class Controller {
	
	public static void main(String[] args) {
		
		Collage c=new Collage();
		c.setcId(4057);
		c.setcName("SITS");
		c.setCaddress("Katraj");
		
		Student s=new Student();
		s.setSrollNo(01);
		s.setSname("OM");
		s.setSaddress("Nigdi");
		s.setMobileNo(8329752311l);
		s.setCollage(c);
		
		
		System.out.println(s);
 	}
	

}
