package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.MarketFair;
import cat.barcelonactiva.tech4good.model.dto.MarketFairDTO;
import cat.barcelonactiva.tech4good.model.repository.MarketFairRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketFairService {

    @Autowired
    MarketFairRepository marketFairRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MarketFairDTO> findAllMarketsFairs() {

        List<MarketFair> marketFairs = marketFairRepository.findAll();
        return convertMarketsFairsListToDTO(marketFairs);
    }

    /**
     * Private method to convert a marketFair to a DTO.
     */
    private MarketFairDTO convertMarketsFairsToDTO(MarketFair marketFair) {
        return modelMapper.map(marketFair, MarketFairDTO.class);
    }

    /**
     * Private method to convert a list of marketFair to a DTO.
     */
    private List<MarketFairDTO> convertMarketsFairsListToDTO(List<MarketFair> marketFairList) {
        return marketFairList.stream().map(this::convertMarketsFairsToDTO).collect(Collectors.toList());
    }


}