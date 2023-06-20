package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.CommercialCensus;
import cat.barcelonactiva.tech4good.model.domain.CommercialGalleries;
import cat.barcelonactiva.tech4good.model.dto.CommercialCensusDTO;
import cat.barcelonactiva.tech4good.model.dto.CommercialGalleriesDTO;
import cat.barcelonactiva.tech4good.model.repository.CommercialCensusRepository;
import cat.barcelonactiva.tech4good.model.repository.CommercialGalleriesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CommercialGalleriesService {
    @Autowired
    CommercialGalleriesRepository commercialGalleriesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CommercialGalleriesDTO> findAllCommercialGalleries() {

        List<CommercialGalleries> commercialGalleriesDTOS = commercialGalleriesRepository.findAll();
        return convertCommercialGalleriesListToDTO(commercialGalleriesDTOS);
    }

    /**
     * Private method to convert a commercialGalleries to a DTO.
     */
    private CommercialGalleriesDTO convertCommercialGalleriesToDTO(CommercialGalleries commercialGalleries) {
        return modelMapper.map(commercialGalleries, CommercialGalleriesDTO.class);
    }

    /**
     * Private method to convert a list of CommercialGalleries to a DTO.
     */
    private List<CommercialGalleriesDTO> convertCommercialGalleriesListToDTO(List<CommercialGalleries> commercialGalleriesList) {
        return commercialGalleriesList.stream().map(this::convertCommercialGalleriesToDTO).collect(Collectors.toList());
    }
}
