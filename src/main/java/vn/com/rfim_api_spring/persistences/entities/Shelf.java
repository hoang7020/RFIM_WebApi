package vn.com.rfim_api_spring.persistences.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Shelf")
public class Shelf {
    @Id
//    @Column(name = "ShelfId")
    private String shelfId;
    //    @Column(name = "shelfCode")
    private String shelfCode;
    //    @Column(name = "Description")
    private String description;
    //    @Column(name = "FloorNumber")
    private int floorNumber;
    //    @Column(name = "CellNumber")
    private int cellNumber;

    public String getShelfId() {
        return shelfId;
    }

    public void setShelfId(String shelfId) {
        this.shelfId = shelfId;
    }

    public String getShelfCode() {
        return shelfCode;
    }

    public void setShelfCode(String shelfCode) {
        this.shelfCode = shelfCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(int cellNumber) {
        this.cellNumber = cellNumber;
    }
}
