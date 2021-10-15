package org.helb.baseproject.model.dto.api;

import org.helb.baseproject.model.entity.Advertisement;
import org.helb.baseproject.repo.AdvertissementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AdvertissementService {

    @Autowired
    public AdvertissementRepository advertissementRepository;

    public List<Advertisement> getAllAd (){
        return this.advertissementRepository.findAll();
    }
    public long getSizeAdApi () {
        return advertissementRepository.count();
    }
    public Advertisement getRandAd () {
        List<Advertisement> ads = advertissementRepository.findAll();
        int randAd = (int)(Math.random()*ads.size()+1);
        return ads.get(randAd);
    }
}
