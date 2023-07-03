package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;
import FuramaResort.model.Facility.House;
import FuramaResort.model.Facility.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    public static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500,1),0);
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500,1),0);
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500,1),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,49999999,12,"Ngắn hạn","Oke",500),0);
    }
    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public Map<Facility,Integer> getFacilities() {
        return facilityIntegerMap;
    }

    @Override
    public void addFacility() {

    }

    @Override
    public void editFacility() {

    }
}
