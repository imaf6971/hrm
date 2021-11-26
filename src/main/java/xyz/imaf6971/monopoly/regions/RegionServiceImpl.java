package xyz.imaf6971.monopoly.regions;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository repository;

    @Override
    public List<Region> getRegions() {
        return repository.findAll();
    }

    @Override
    public Region getRegionById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Region saveRegion(Region region) {
        return repository.save(region);
    }

    @Override
    public void deleteRegion(Long id) {
        repository.deleteById(id);
    }
}
