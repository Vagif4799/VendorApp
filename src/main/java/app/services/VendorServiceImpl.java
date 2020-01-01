package app.services;

import app.entities.Vendor;
import app.repos.VendorRepository;
import app.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorServiceImpl implements VendorService {


    @Autowired
    private VendorRepository repository;

    @Override
    public Vendor saveVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        return repository.save(vendor);
    }

    @Override
    public void deleteVendor(Vendor vendor) {
        repository.delete(vendor);
    }

    @Override
    public Optional<Vendor> getVendorById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<Vendor> getAllVendors() {
        return repository.findAll();
    }


    public VendorRepository getRepository() {
        return repository;
    }

    public void setRepository(VendorRepository repository) {
        this.repository = repository;
    }

}
