package vn.com.rfim_api_spring.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.com.rfim_api_spring.persistences.repositories.CellRepository;
import vn.com.rfim_api_spring.services.dtos.CellDTO;
import vn.com.rfim_api_spring.services.response.CellData;
import vn.com.rfim_api_spring.services.response.ResultResponse;

import java.util.List;

@Service
@Transactional
public class CellService {

    @Autowired
    private CellRepository context;
    @Autowired
    private ModelMapper mapper;

    public ResponseEntity getByFloorId(String floorId) {
        ResultResponse response = new ResultResponse();
        List<CellDTO> cells = mapper.map(context.getByFloorId(floorId), new TypeToken<List<CellDTO>>(){}.getType());
        if (cells.size() > 0) {
            response.setMessage("Ok");
            response.setData(new CellData(cells));
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setMessage("No cell found");
            return new ResponseEntity(response, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity registerCell(String cellId, String cellRfid) {
        ResultResponse response = new ResultResponse();
        boolean result = context.registerCell(cellId, cellRfid);
        if (result) {
            response.setMessage("Register Cell Success!");
            return new ResponseEntity(response, HttpStatus.OK);
        } else {
            response.setMessage("Register Cell Fail!");
            return new ResponseEntity(response, HttpStatus.NOT_FOUND);
        }
    }

}
