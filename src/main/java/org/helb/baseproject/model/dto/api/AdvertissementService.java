package org.helb.baseproject.model.dto.api;

import org.helb.baseproject.model.entity.Advertisement;
import org.helb.baseproject.repo.AdvertissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertissementService {

    @Autowired
    public AdvertissementRepository advertissementRepository;

    public List<Advertisement> getAllAd (){
        return this.advertissementRepository.findAll();
    }

}
