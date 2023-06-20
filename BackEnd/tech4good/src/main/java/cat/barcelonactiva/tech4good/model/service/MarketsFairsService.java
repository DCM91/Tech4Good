package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.MarketsFairs;
import cat.barcelonactiva.tech4good.model.dto.MarketsFairsDTO;
import cat.barcelonactiva.tech4good.model.repository.MarketsFairsRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketsFairsService {

    @Autowired
    MarketsFairsRepository marketsFairsRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MarketsFairsDTO> findAllMarketsFairs() {

        List<MarketsFairs> marketsFairs = marketsFairsRepository.findAll();
        return convertMarketsFairsListToDTO(marketsFairs);
    }

    /**
     * Private method to convert a marketFair to a DTO.
     */
    private MarketsFairsDTO convertMarketsFairsToDTO(MarketsFairs marketsFairs) {
        return modelMapper.map(marketsFairs, MarketsFairsDTO.class);
    }

    /**
     * Private method to convert a list of marketFairs to a DTO.
     */
    private List<MarketsFairsDTO> convertMarketsFairsListToDTO(List<MarketsFairs> marketsFairsList) {
        return marketsFairsList.stream().map(this::convertMarketsFairsToDTO).collect(Collectors.toList());
    }


}