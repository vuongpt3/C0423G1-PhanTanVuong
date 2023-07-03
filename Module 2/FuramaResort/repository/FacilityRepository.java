package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;
import FuramaResort.model.Facility.House;
import FuramaResort.model.Facility.Room;
import FuramaResort.model.Facility.Villa;
import FuramaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    public static final String PATH_FILE_FACILITY = "C:\\C0423G1-PhanTanVuong\\Module 2\\FuramaResort\\data\\facility.csv";
    public static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",30,1),0);
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",30,1),0);
        facilityIntegerMap.put(new Villa("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",30,1),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",5),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",5),0);
        facilityIntegerMap.put(new House("1","Châm cứu",500,499999.9,12,"Ngắn hạn","Oke",5),0);
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
    public void addFacility(Facility facility) {
        facilityIntegerMap.put(facility,0);
    }

    @Override
    public void editFacility() {

    }
}
