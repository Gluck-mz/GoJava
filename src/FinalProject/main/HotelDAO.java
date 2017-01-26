package FinalProject.main;

import java.util.List;


public class HotelDAO extends DAOImpl<Hotel> {
    private List<Hotel> hotels;

    public HotelDAO(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    public Hotel save(Hotel aHotel) {
        return super.save(aHotel);
    }

    @Override
    public Hotel remove(Hotel aHotel) {
        return super.remove(aHotel);
    }

    @Override
    public Hotel update(Hotel aHotel) {
        return super.update(aHotel);
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }
}
