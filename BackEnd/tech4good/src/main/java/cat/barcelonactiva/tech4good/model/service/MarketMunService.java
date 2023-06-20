package cat.barcelonactiva.tech4good.model.service;

import cat.barcelonactiva.tech4good.model.domain.MarketMun;
import cat.barcelonactiva.tech4good.model.dto.MarketMunDTO;
import cat.barcelonactiva.tech4good.model.repository.MarketMunRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketMunService {

    @Autowired
    MarketMunRepository marketMunRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<MarketMunDTO> findAllMarketsMun() {

        List<MarketMun> marketMun = marketMunRepository.findAll();
        return convertMarketsMunListToDTO(marketMun);
    }

    /**
     * Private method to convert a marketMun to a DTO.
     */
    private MarketMunDTO convertMarketsMunToDTO(MarketMun marketMun) {
        return modelMapper.map(marketMun, MarketMunDTO.class);
    }

    /**
     * Private method to convert a list of marketsMun to a DTO.
     */
    private List<MarketMunDTO> convertMarketsMunListToDTO(List<MarketMun> marketMunList) {
        return marketMunList.stream().map(this::convertMarketsMunToDTO).collect(Collectors.toList());
    }


}