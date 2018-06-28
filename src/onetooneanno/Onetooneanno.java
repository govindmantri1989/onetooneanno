/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetooneanno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Govind
 */
public class Onetooneanno 
{
    public static void main(String[] args) throws Exception
    {
        
     Configuration c=new Configuration();
        c.configure();
        SessionFactory sf = c.buildSessionFactory();
        Session sess = sf.openSession();
        Person p=new Person();
        SimpleDateFormat sfd=new SimpleDateFormat("dd/mm/yy");
        
        Date idate = sfd.parse("1/1/2010");
   
        Date edate = sfd.parse("2/1/2019");
   p.setId(561);
   p.setEmail("govindmantri4@gmail.com");
   p.setName("govind");
   p.setPhone("939393939");
   p.setDob(edate);
   Passport pp=new  Passport();
  pp.setPid(999007);
   pp.setIssueDate(idate);
   pp.setExpireDate(edate);
   pp.setPerson(p);
    sess.save(pp);
        System.out.println("hi");
        System.out.println("hello");
        System.out.println("The end");
    sess.beginTransaction().commit();
   
}
}
