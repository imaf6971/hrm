package xyz.imaf6971.monopoly.regions;

import java.util.List;

public interface RegionService {
    List<Region> getRegions();
    Region getRegionById(Long id);
    Region saveRegion(Region region);
    void deleteRegion(Long id);
}
