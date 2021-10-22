package org.helb.baseproject.model.dto.api;

import org.helb.baseproject.model.entity.Advertisement;
import org.helb.baseproject.repo.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {
    @Autowired
    public AdvertisementRepository advertisementRepository;

    public List<Advertisement> getAllAd (){
        return this.advertisementRepository.findAll();
    }
    public long getSizeAdApi () {
        return advertisementRepository.count();
    }
    public Advertisement getRandAd () {
        List<Advertisement> ads = advertisementRepository.findAll();
        int randAd = (int)(Math.random()*ads.size()+1);
        return ads.get(randAd);
    }
    public boolean getBoolAd(){
        boolean response ;
        int rand=2 ;
        if((int) (Math.random()*rand) ==1) {
            response=true;
        }
        else{
        response =false;
        }
        return response;
    }
}
