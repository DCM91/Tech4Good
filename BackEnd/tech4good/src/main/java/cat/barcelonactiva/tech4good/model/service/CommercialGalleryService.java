package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.CommercialGallery;
import cat.barcelonactiva.tech4good.model.dto.CommercialGalleryDTO;
import cat.barcelonactiva.tech4good.model.repository.CommercialGalleryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CommercialGalleryService {
    @Autowired
    CommercialGalleryRepository commercialGalleryRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CommercialGalleryDTO> findAllCommercialGalleries() {

        List<CommercialGallery> commercialGalleryDTOS = commercialGalleryRepository.findAll();
        return convertCommercialGalleriesListToDTO(commercialGalleryDTOS);
    }

    /**
     * Private method to convert a commercialGallery to a DTO.
     */
    private CommercialGalleryDTO convertCommercialGalleriesToDTO(CommercialGallery commercialGallery) {
        return modelMapper.map(commercialGallery, CommercialGalleryDTO.class);
    }

    /**
     * Private method to convert a list of CommercialGallery to a DTO.
     */
    private List<CommercialGalleryDTO> convertCommercialGalleriesListToDTO(List<CommercialGallery> commercialGalleryList) {
        return commercialGalleryList.stream().map(this::convertCommercialGalleriesToDTO).collect(Collectors.toList());
    }
}
