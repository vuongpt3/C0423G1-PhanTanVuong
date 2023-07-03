package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;
import FuramaResort.model.Facility.House;
import FuramaResort.model.Facility.Room;
import FuramaResort.model.Facility.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository extends Repository {
    Map<Facility,Integer> getFacilities();
    void addFacility(Facility facility);
    void editFacility();
}
