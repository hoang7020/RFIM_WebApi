package vn.com.rfim_api_spring.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.com.rfim_api_spring.persistences.entities.Shelf;
import vn.com.rfim_api_spring.services.ShelfService;
import vn.com.rfim_api_spring.services.dtos.ShelfDTO;
import vn.com.rfim_api_spring.services.response.ResultResponse;
import vn.com.rfim_api_spring.services.response.ShelfData;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShelfController {

    @Autowired
    private ShelfService service;

    @RequestMapping(value = "/shelves", method = RequestMethod.GET)
    public ResponseEntity findAllShelves() {
        ResultResponse response = new ResultResponse();
        List<ShelfDTO> shelves = service.getAll();
        if (shelves.size() > 0) {
            response.setMessage("Ok");
            response.setData(new ShelfData(shelves));
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setMessage("No shelf found");
            return new ResponseEntity(response, HttpStatus.NOT_FOUND);
        }
    }
}
