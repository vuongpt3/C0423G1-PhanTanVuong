package case_study.furama_resort_management_app.model;

public class InformationRoom {
    private String freeService;
    public InformationRoom(String freeService){
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "InformationRoom{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
