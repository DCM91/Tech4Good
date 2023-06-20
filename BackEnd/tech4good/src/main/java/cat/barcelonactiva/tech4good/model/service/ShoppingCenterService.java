package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.CommercialGalleries;
import cat.barcelonactiva.tech4good.model.domain.ShoppingCenters;
import cat.barcelonactiva.tech4good.model.dto.CommercialGalleriesDTO;
import cat.barcelonactiva.tech4good.model.dto.ShoppingCentersDTO;
import cat.barcelonactiva.tech4good.model.repository.CommercialGalleriesRepository;
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

    public List<ShoppingCentersDTO> findAllCommercialGalleries() {

        List<ShoppingCenters> shoppingCentersDTOS = shoppingCenterRepository.findAll();
        return convertshoppingCentersListToDTO(shoppingCentersDTOS);
    }

    /**
     * Private method to convert a commercialGalleries to a DTO.
     */
    private ShoppingCentersDTO convertShoppingCentersToDTO(ShoppingCenters shoppingCenters) {
        return modelMapper.map(shoppingCenters, ShoppingCentersDTO.class);
    }

    /**
     * Private method to convert a list of CommercialGalleries to a DTO.
     */
    private List<ShoppingCentersDTO> convertshoppingCentersListToDTO(List<ShoppingCenters> shoppingCentersList) {
        return shoppingCentersList.stream().map(this::convertShoppingCentersToDTO).collect(Collectors.toList());
    }
}
