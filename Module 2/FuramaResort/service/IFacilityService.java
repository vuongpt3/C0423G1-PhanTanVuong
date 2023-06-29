package FuramaResort.service;

import FuramaResort.model.Facility.Facility;

import java.util.ArrayList;

public interface IFacilityService extends Service {
    ArrayList<Facility> display();
    void addFacility();
    void editFacility();
}
