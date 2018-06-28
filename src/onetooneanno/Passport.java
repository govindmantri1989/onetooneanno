/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetooneanno;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Govind
 */
@Entity
@Table(name = "newpassport888")
public class Passport {
//          @GenericGenerator(name="id",strategy = "foreign", 
  //            parameters = @Parameter(name="peoperty",value = "person"))
    
@Id
                  
     int pid;
    @Column
    
    Date issueDate;
    @Column
    Date expireDate;
    @OneToOne(cascade = CascadeType.ALL)
            @JoinColumn(name = "this_is_fk_key_for_pk_in_person")
    Person person;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
