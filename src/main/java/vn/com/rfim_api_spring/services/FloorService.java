package vn.com.rfim_api_spring.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.rfim_api_spring.persistences.entities.Floor;
import vn.com.rfim_api_spring.persistences.repositories.FloorRepository;
import vn.com.rfim_api_spring.services.dtos.FloorDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class FloorService {

    @Autowired
    private FloorRepository context;
    @Autowired
    private ModelMapper mapper;

    public List<FloorDTO> getAll() {
        List<FloorDTO> floors = mapper.map(context.getAll(), new TypeToken<List<FloorDTO>>(){}.getType());
        return floors;
    }

}
