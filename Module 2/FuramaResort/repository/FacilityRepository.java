package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    public static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        //facilityIntegerMap.put(new Facility(1,"Châm cứu",500,49999999,12,"Ngắn hạn",)0);
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
