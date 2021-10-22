package org.helb.baseproject.api;

import org.helb.baseproject.model.dto.api.AdvertisementService;
import org.helb.baseproject.model.entity.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;
        @GetMapping("api/ad/getAllAd")
    public List<Advertisement> getAllAd (){
        return this.advertisementService.getAllAd();
    }
    @GetMapping("api/ad/getSizeAdAPI")
    public Long  getSizeAdAPI() {
        return  this.advertisementService.getSizeAdApi();
    }
    @GetMapping("api/ad/getRandAd")
    public Advertisement  getRandAd() {
        return  this.advertisementService.getRandAd();
    }
    @GetMapping("api/ad/getBoolAd")
    public boolean  getBoolAd() {
        return  this.advertisementService.getBoolAd();
    }

}
