package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.ShoppingCenter;
import cat.barcelonactiva.tech4good.model.dto.ShoppingCenterDTO;
import cat.barcelonactiva.tech4good.model.repository.ShoppingCenterRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ShoppingCenterService {
    @Autowired
    ShoppingCenterRepository shoppingCenterRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ShoppingCenterDTO> findAllShoppingCenters() {

        List<ShoppingCenter> shoppingCenters = shoppingCenterRepository.findAll();
        return convertShoppingCentersListToDTO(shoppingCenters);
    }

    /**
     * Private method to convert a commercialGalleries to a DTO.
     */
    private ShoppingCenterDTO convertShoppingCentersToDTO(ShoppingCenter shoppingCenter) {
        return modelMapper.map(shoppingCenter, ShoppingCenterDTO.class);
    }

    /**
     * Private method to convert a list of CommercialGallery to a DTO.
     */
    private List<ShoppingCenterDTO> convertShoppingCentersListToDTO(List<ShoppingCenter> shoppingCenterList) {
        return shoppingCenterList.stream().map(this::convertShoppingCentersToDTO).collect(Collectors.toList());
    }
}

