
package pyq23;
public class DataBuoy {
    protected String id;
    protected int latitude;
    protected int longitude;
    protected double air_temperature;
    protected double water_temperature;

    public DataBuoy(String id, int latitude, int longitude, double air_temperature, double water_temperature) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.air_temperature = air_temperature;
        this.water_temperature = water_temperature;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public double getAir_temperature() {
        return air_temperature;
    }

    public void setAir_temperature(double air_temperature) {
        this.air_temperature = air_temperature;
    }

    public double getWater_temperature() {
        return water_temperature;
    }

    public void setWater_temperature(double water_temperature) {
        this.water_temperature = water_temperature;
    }
}
