package day8;

import java.util.List;

class Company{
	long companyId;
	String comapnyName;
	long numberOfEmployee;
	String companyEmail;
	long companyPhoneNumber;
}
class Room{
	long RoomId;
}
class WorkSpace{
	long workspaceId;
	Company company;
	List<Room> rooms;
}
class Floor{
	long floorId;
	List<WorkSpace> workspaces;
}
class Buildings{
	long buildingId;
	String buildingName;
	String Area;
	Address Address;
	List<Floor> floors;
	
}
class CoworkSpace{
	long id;
	String Name;
	String city;
	Address address;
	List<Buildings> buildings;
}
class Address{
	String address;
	long pin;
}
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
