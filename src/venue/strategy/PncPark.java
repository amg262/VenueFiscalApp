
package venue.strategy;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class PncPark implements VenueStrategy {
    private double capacity = 38496;
    private double price = 17.21;
    private double revenue = 0;
    private double percentCap = 0.0;
    
    /**
     *
     * @param cap
     */
    @Override
    public void setCapacity(double cap) {
        this.capacity = cap;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCapacity() {
        return capacity;
    }

    /**
     *
     * @param price
     */
    @Override
    public void setAvgTicketPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return
     */
    @Override
    public double getAvgTicketPrice() {
        return price;
    }
    

    /**
     *
     * @param attendance
     */
    @Override
    public void setRevenue(double attendance) {
        this.revenue = revenue;
    }

    /**
     *
     * @param attendance
     * @return
     */
    @Override
    public double getRevenue(double attendance) {
        revenue = (attendance * getAvgTicketPrice());
        return revenue;
    }
    
    /**
     *
     * @param percentCap
     */
    @Override
    public void setPercentCap(double percentCap) {
        this.percentCap = percentCap;
    }

    /**
     *
     * @param attendance
     * @return
     */
    @Override
    public double getPercentCap(double attendance) {
        percentCap = (attendance / getCapacity());
        return percentCap;
    }
}
