package com.kdt.dto;

import java.sql.Timestamp;
import java.util.Set;

import com.kdt.domain.entities.RealEstateAgent;

public class EstateDTO {
	private Long estateId;
//    private String writer;
    private Long deposit;
    private Long price;
    private double area;
    private Long zipcode;
    private String address1;
    private String address2;
    private double latitude;
    private double longitude;
    private Long roomFloors;
    private Long buildingFloors;
    private Long maintenanceCost;
    private String title;
    private String contents;
    private String memo;
    private Timestamp writeDate;
    private boolean soldStatus;
    private RoomDTO room;
    private StructureDTO structure;
    private BuildingDTO building;
    private TransactionDTO transaction;
    private HeatingSystemDTO heatingSystem;
    private Set<EstateOptionDTO> optionList;
    private Set<EstateImageDTO> images;
    private RealEstateAgent realEstateAgent;
	public Long getEstateId() {
		return estateId;
	}
	public void setEstateId(Long estateId) {
		this.estateId = estateId;
	}
	public Long getDeposit() {
		return deposit;
	}
	public void setDeposit(Long deposit) {
		this.deposit = deposit;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Long getRoomFloors() {
		return roomFloors;
	}
	public void setRoomFloors(Long roomFloors) {
		this.roomFloors = roomFloors;
	}
	public Long getBuildingFloors() {
		return buildingFloors;
	}
	public void setBuildingFloors(Long buildingFloors) {
		this.buildingFloors = buildingFloors;
	}
	public Long getMaintenanceCost() {
		return maintenanceCost;
	}
	public void setMaintenanceCost(Long maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public boolean isSoldStatus() {
		return soldStatus;
	}
	public void setSoldStatus(boolean soldStatus) {
		this.soldStatus = soldStatus;
	}
	public RoomDTO getRoom() {
		return room;
	}
	public void setRoom(RoomDTO room) {
		this.room = room;
	}
	public StructureDTO getStructure() {
		return structure;
	}
	public void setStructure(StructureDTO structure) {
		this.structure = structure;
	}
	public BuildingDTO getBuilding() {
		return building;
	}
	public void setBuilding(BuildingDTO building) {
		this.building = building;
	}
	public TransactionDTO getTransaction() {
		return transaction;
	}
	public void setTransaction(TransactionDTO transaction) {
		this.transaction = transaction;
	}
	public HeatingSystemDTO getHeatingSystem() {
		return heatingSystem;
	}
	public void setHeatingSystem(HeatingSystemDTO heatingSystem) {
		this.heatingSystem = heatingSystem;
	}
	public Set<EstateOptionDTO> getOptionList() {
		return optionList;
	}
	public void setOptionList(Set<EstateOptionDTO> optionList) {
		this.optionList = optionList;
	}
	public Set<EstateImageDTO> getImages() {
		return images;
	}
	public void setImages(Set<EstateImageDTO> images) {
		this.images = images;
	}
	public RealEstateAgent getRealEstateAgent() {
		return realEstateAgent;
	}
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		this.realEstateAgent = realEstateAgent;
	}
	public EstateDTO(Long estateId, Long deposit, Long price, double area, Long zipcode, String address1,
			String address2, double latitude, double longitude, Long roomFloors, Long buildingFloors,
			Long maintenanceCost, String title, String contents, String memo, Timestamp writeDate, boolean soldStatus,
			RoomDTO room, StructureDTO structure, BuildingDTO building, TransactionDTO transaction,
			HeatingSystemDTO heatingSystem, Set<EstateOptionDTO> optionList, Set<EstateImageDTO> images,
			RealEstateAgent realEstateAgent) {
		super();
		this.estateId = estateId;
		this.deposit = deposit;
		this.price = price;
		this.area = area;
		this.zipcode = zipcode;
		this.address1 = address1;
		this.address2 = address2;
		this.latitude = latitude;
		this.longitude = longitude;
		this.roomFloors = roomFloors;
		this.buildingFloors = buildingFloors;
		this.maintenanceCost = maintenanceCost;
		this.title = title;
		this.contents = contents;
		this.memo = memo;
		this.writeDate = writeDate;
		this.soldStatus = soldStatus;
		this.room = room;
		this.structure = structure;
		this.building = building;
		this.transaction = transaction;
		this.heatingSystem = heatingSystem;
		this.optionList = optionList;
		this.images = images;
		this.realEstateAgent = realEstateAgent;
	}
	public EstateDTO() {
		super();
	}

}
