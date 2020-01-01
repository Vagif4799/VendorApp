package app.services;

import app.entities.Vendor;

import java.util.List;
import java.util.Optional;

public interface VendorService {

    Vendor saveVendor(Vendor vendor);
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(Vendor vendor);
    Optional<Vendor> getVendorById(int id);
    List<Vendor> getAllVendors();

}
