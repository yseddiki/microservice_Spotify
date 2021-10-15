package org.helb.baseproject.api;

import org.helb.baseproject.model.dto.api.AdvertissementService;
import org.helb.baseproject.model.entity.Advertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdvertisementController {

    @Autowired
    private AdvertissementService advertissementService;
        @GetMapping("api/ad/getAllAd")
    public List<Advertisement> getAllAd (){
        return this.advertissementService.getAllAd();
    }
    @GetMapping("api/ad/getSizeAdAPI")
    public Long  getSizeAdAPI() {
        return  this.advertissementService.getSizeAdApi();
    }
    @GetMapping("api/ad/getRandAd")
    public Advertisement  getRandAd() {
        return  this.advertissementService.getRandAd();
    }

}
