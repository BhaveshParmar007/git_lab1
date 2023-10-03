package org.ncu.hireWheels.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicles {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id" , nullable = false)
    private int vehicleId;


    @Column(name = "vehicle_model" ,  nullable = false)
    private String vehicleModel;
    
    @Column(name = "vehicle_no" ,  nullable = false)
    private int vehicleNo;
    
    @ManyToOne
    @JoinColumn(name = "vehicle_subcategory_id", referencedColumnName = "")
    private int vehicleSubcategoryId;
    
    @Column(name = "color",  nullable = false)
    private String color;
    
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "")
    private int locationId;
    
    @ManyToOne
    @JoinColumn(name = "fuel_type_id", referencedColumnName = "")
    private int fuelTypeId;
    
    @Column(name = "availability_status" ,  nullable = false)
    private int availabilityStatus;
    
    @Column(name = "vehicle_image_url " ,  nullable = false)
    private int vehicleImageUrl ;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public int getVehicleSubcategoryId() {
		return vehicleSubcategoryId;
	}

	public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
		this.vehicleSubcategoryId = vehicleSubcategoryId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(int fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public int getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(int availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public int getVehicleImageUrl() {
		return vehicleImageUrl;
	}

	public void setVehicleImageUrl(int vehicleImageUrl) {
		this.vehicleImageUrl = vehicleImageUrl;
	}

	public Vehicles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicles(int vehicleId, String vehicleModel, int vehicleNo, int vehicleSubcategoryId, String color,
			int locationId, int fuelTypeId, int availabilityStatus, int vehicleImageUrl) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.vehicleNo = vehicleNo;
		this.vehicleSubcategoryId = vehicleSubcategoryId;
		this.color = color;
		this.locationId = locationId;
		this.fuelTypeId = fuelTypeId;
		this.availabilityStatus = availabilityStatus;
		this.vehicleImageUrl = vehicleImageUrl;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicleId=" + vehicleId + ", vehicleModel=" + vehicleModel + ", vehicleNo=" + vehicleNo
				+ ", vehicleSubcategoryId=" + vehicleSubcategoryId + ", color=" + color + ", locationId=" + locationId
				+ ", fuelTypeId=" + fuelTypeId + ", availabilityStatus=" + availabilityStatus + ", vehicleImageUrl="
				+ vehicleImageUrl + "]";
	}
    
    
	
}
