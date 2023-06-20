package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.MarketsFairs;
import cat.barcelonactiva.tech4good.model.domain.MarketsMun;
import cat.barcelonactiva.tech4good.model.dto.MarketsFairsDTO;
import cat.barcelonactiva.tech4good.model.dto.MarketsMunDTO;
import cat.barcelonactiva.tech4good.model.repository.MarketsFairsRepository;
import cat.barcelonactiva.tech4good.model.repository.MarketsMunRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketsMunService {

    @Autowired
    MarketsMunRepository marketsMunRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MarketsMunDTO> findAllMarketsMun() {

        List<MarketsMun> marketsMun = marketsMunRepository.findAll();
        return convertMarketsMunListToDTO(marketsMun);
    }

    /**
     * Private method to convert a marketMun to a DTO.
     */
    private MarketsMunDTO convertMarketsMunToDTO(MarketsMun marketsMun) {
        return modelMapper.map(marketsMun, MarketsMunDTO.class);
    }

    /**
     * Private method to convert a list of marketsMun to a DTO.
     */
    private List<MarketsMunDTO> convertMarketsMunListToDTO(List<MarketsMun> marketsMunList) {
        return marketsMunList.stream().map(this::convertMarketsMunToDTO).collect(Collectors.toList());
    }


}