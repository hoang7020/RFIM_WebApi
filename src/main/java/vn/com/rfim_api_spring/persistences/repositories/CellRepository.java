package vn.com.rfim_api_spring.persistences.repositories;

import vn.com.rfim_api_spring.persistences.entities.Cell;

import java.util.List;

public interface CellRepository {

    public List<Cell> getByFloorId(String floorId);

    public boolean registerCell(String cellId, String cellRfid);
}
