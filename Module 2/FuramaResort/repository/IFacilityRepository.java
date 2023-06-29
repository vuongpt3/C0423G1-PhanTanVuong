package FuramaResort.repository;

import FuramaResort.model.Facility.Facility;

import java.util.ArrayList;

public interface IFacilityRepository extends Repository {
    ArrayList<Facility> display();
    void addFacility();
    void editFacility();
}
