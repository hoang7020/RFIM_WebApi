package vn.com.rfim_api_spring.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.com.rfim_api_spring.persistences.entities.Shelf;
import vn.com.rfim_api_spring.persistences.repositories.ShelfRepository;
import vn.com.rfim_api_spring.services.dtos.ShelfDTO;

import java.util.List;

@Service
@Transactional
public class ShelfService {

    @Autowired
    private ShelfRepository context;
    @Autowired
    private ModelMapper mapper;

    public List<ShelfDTO> getAll() {
        List<ShelfDTO> shelves = mapper.map(context.getAll(), new TypeToken<List<ShelfDTO>>(){}.getType());
        return shelves;
    }
}
