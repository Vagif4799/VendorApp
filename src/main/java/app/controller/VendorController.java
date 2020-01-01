package app.controller;

import app.services.VendorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VendorController {


    private VendorService vendorService;


    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }




    public VendorService getVendorService() {
        return vendorService;
    }

    public void setVendorService(VendorService vendorService) {
        this.vendorService = vendorService;
    }
}
