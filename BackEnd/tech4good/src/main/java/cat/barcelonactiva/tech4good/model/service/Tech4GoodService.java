package cat.barcelonactiva.tech4good.model.service;
import cat.barcelonactiva.tech4good.model.domain.CommercialCensus;
import cat.barcelonactiva.tech4good.model.dto.CommercialCensusDTO;
import cat.barcelonactiva.tech4good.model.repository.CommercialCensusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Tech4GoodService {

    @Autowired
    CommercialCensusRepository commercialCensusRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CommercialCensusDTO> findAllCommercialCensus() {

        List<CommercialCensus> commercialCensusDTOS = commercialCensusRepository.findAll();
        return convertCommercialCensusListToDTO(commercialCensusDTOS);
    }

    /**
     * Private method to convert a commercialCensus to a DTO.
     */
    private CommercialCensusDTO convertCommercialCensusToDTO(CommercialCensus commercialCensus) {
        return modelMapper.map(commercialCensus, CommercialCensusDTO.class);
    }

    /**
     * Private method to convert a list of CommercialCensus to a DTO.
     */
    private List<CommercialCensusDTO> convertCommercialCensusListToDTO(List<CommercialCensus> commercialCensusList) {
        return commercialCensusList.stream().map(this::convertCommercialCensusToDTO).collect(Collectors.toList());
    }


}
