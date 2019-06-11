package vn.com.rfim_api_spring.persistences.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cell")
public class Cell {
    @Id
    private String cellId;
    private int cellNo;
    private String cellRfid;
    private String Description;


}
