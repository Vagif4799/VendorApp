package app.controller;

import app.entities.Vendor;
import app.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class VendorController {


    @Autowired
    private VendorService vendorService;


    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createVendor";
    }


    @RequestMapping("/saveVendor")
    public String saveLocation(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap) {
        Vendor savedVendor = vendorService.saveVendor(vendor);
        String msg = "Vendor saved with id: " + savedVendor.getId();
        modelMap.addAttribute("msg", msg);
        return "createVendor";
    }

    @RequestMapping("/displayVendors")
    public String displayvendors(ModelMap modelMap) {
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }

    @RequestMapping("/deleteVendor")
    public String deleteVendor(@RequestParam("id")int id, ModelMap modelMap) {
        Optional<Vendor> vendorOptional = vendorService.getVendorById(id);
        Vendor vendor = vendorOptional.get();
        vendorService.deleteVendor(vendor);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }


    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id")int id, ModelMap modelMap) {
        Optional<Vendor> vendorOptional = vendorService.getVendorById(id);
        Vendor vendor = vendorOptional.get();
        modelMap.addAttribute("vendor", vendor);
        return "updateVendor";
    }

    @RequestMapping("/updateVendor")
    public String updateVendor(@ModelAttribute("vendor")Vendor vendor, ModelMap modelMap) {
        vendorService.updateVendor(vendor);
        List<Vendor> allVendors = vendorService.getAllVendors();
        modelMap.addAttribute("vendors", allVendors);
        return "displayVendors";
    }




    public VendorService getVendorService() {
        return vendorService;
    }

    public void setVendorService(VendorService vendorService) {
        this.vendorService = vendorService;
    }
}
