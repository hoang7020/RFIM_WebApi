package vn.com.rfim_api_spring.persistences.repositories;


import vn.com.rfim_api_spring.persistences.entities.Shelf;

import java.util.List;

public interface ShelfRepository {

    public List<Shelf> getAll();
}
