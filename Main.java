/* Задание
Допишите классы Car и Track 
- Car принимает в конструктор значение расхода топлива на 100 км
- Track принимает первым аргументом расход топлива на 100 км в пересчете на один прицеп, и вторым аргументом, количество прицепов. Расход прямо пропорционален количеству прицепов
*/

public class Main {
    public static void main(String[] args) {
        AsphaltRoad asphaltRoad = new AsphaltRoad();
        

        Car car = new Car(7);
        Track track = new Track(15, 2);
        
        asphaltRoad.addVehicle(car);
        asphaltRoad.addVehicle(track);

        asphaltRoad.fillUp(car, 80);
        asphaltRoad.fillUp(track, 250);

        double distance = 500.0;
		asphaltRoad.drive(car, distance);
		asphaltRoad.drive(track, distance);
		
		asphaltRoad.printVehicleRemainingFuels();
    }
}
