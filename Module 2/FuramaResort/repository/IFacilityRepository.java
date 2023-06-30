package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository extends Repository {
    Map<Facility,Integer> getFacilities();
    void addFacility();
    void editFacility();
}
