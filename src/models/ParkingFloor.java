package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpotsList;
}
