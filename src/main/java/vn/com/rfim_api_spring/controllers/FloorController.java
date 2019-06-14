package vn.com.rfim_api_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.rfim_api_spring.services.FloorService;
import vn.com.rfim_api_spring.services.dtos.FloorDTO;
import vn.com.rfim_api_spring.services.response.FloorData;
import vn.com.rfim_api_spring.services.response.ResultResponse;

import java.util.List;

@RestController
public class FloorController {

    @Autowired
    private FloorService service;

    @RequestMapping(value = "/floors", method = RequestMethod.GET)
    public ResponseEntity getAllFloors() {
        ResultResponse response = new ResultResponse();
        List<FloorDTO> floors = service.getAll();
        if (floors.size() > 0) {
            response.setMessage("Ok");
            response.setData(new FloorData(floors));
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setMessage("No floor found");
            return new ResponseEntity(response, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/floors/{id}", method = RequestMethod.GET)
    public ResponseEntity getByShelfId(@PathVariable("id") String id) {
        ResultResponse response = new ResultResponse();
        List<FloorDTO> floors = service.getByShelfId(id);
        if (floors.size() > 0) {
            response.setMessage("Ok");
            response.setData(new FloorData(floors));
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setMessage("No floor found");
            return new ResponseEntity(response, HttpStatus.NOT_FOUND);
        }
    }
}
