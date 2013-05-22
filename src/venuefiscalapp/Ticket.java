
package venuefiscalapp;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class Ticket implements MediumOutputStrategy {

    //Variables used for methods
    private double revenue;
    private String name;
    private double atten;
    private double percentCap;
    
    //totals variables
    private double totalRev;
    private double totalAtten;

    //static counter
    private static int gameNum = 1;
    private static int totalGames = 1;

    //Objects/classes
    private Stadium stadium;
    private Venue venue;
    private StadiumDatabase sd;
    private List<MediumOutputStrategy> mList = new ArrayList<>();
    
    //Formatters
    private NumberFormat money = NumberFormat.getCurrencyInstance();
    private NumberFormat num = NumberFormat.getIntegerInstance();
    private NumberFormat dec = DecimalFormat.getPercentInstance();
    
    
    
    /**
     *
     */
    public Ticket(){}

    
    
    /**
     * passing in ticket/medium object list
     * 
     * @param medList
     */
    public Ticket(List<MediumOutputStrategy> medList) {
        this.mList = medList;
    }

    
    /**
     * 
     * Inputs the name and attendance, passes it to the stadium.
     * 
     * @param name
     * @param attendance
     */
    @Override
    public void inputInfo(String name, double attendance) {
        this.name = name;
        this.atten = attendance;
        venue = new Stadium(name, attendance);
    }
    
    /**
     *
     * @param name
     * @return garage obj (if found)
     */
    @Override
    public Stadium getVenue(String name) {
       sd = new StadiumDatabase();
       return sd.searchForStadiumName(name);
    }

    
    /**
     * Returns attendance that was input
     * 
     * @return atten
     */
    @Override
    public double getAttendance() {
        return atten;
    }

    /**
     * Sets attendance
     * 
     * @param attendance
     */
    @Override
    public void setAttendance(double attendance) {
        this.atten = attendance;
    }
    
    

    /**
     * Gets revenue from the name and attendance that
     * was entered for particular park
     * 
     * @return revenue
     */
    @Override
    public double getRevenue() {
        revenue = getVenue(name).getRevenue(atten);
        return revenue;
    }

    /**
     * Sets revenue
     * 
     * @param revenue
     */
    @Override
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    
    
    /**
     * Sets the percent of capacity that was taken up
     * based on attendance.
     * 
     * @param percentCap
     */
    @Override
    public void setPercentCap(double percentCap) {
        this.percentCap = percentCap;
    }

    /**
     * Gets the percent of capacity that was taken up
     * based on attendance.
     * 
     * @return percentCap
     */
    @Override
    public double getPercentCap() {
        percentCap = (atten / getVenue(name).getCapacity());
        return percentCap;
    }
    
    
    
    /**
     * Loops thru the list of medium objects (ticket etc.) then gets
     * the revenue for each one, and adds it a cumulative total.
     * 
     * @return totalRev
     */
    @Override
    public double getTotalRev() {
        for (int i=0; i < mList.size(); i++){
            totalRev += mList.get(i).getRevenue();
        }
        return totalRev;
    }

    /**
     * Loops thru the list of medium objects (ticket etc.) then gets
     * the attendance for each one, and adds it a cumulative total.
     * 
     * @return totalAtten
     */
    @Override
    public double getTotalAtten() {
        for (int i=0; i < mList.size(); i++){
            totalAtten += mList.get(i).getAttendance();
        }
        return totalAtten;
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public String outputGame() {
        StringBuilder sb = new StringBuilder();
        final String LINE = "\n";
        final String GAMES = "Game #:   ";
        final String COM = ", ";
        final String VENUE = "Venue:    ";
        final String CASH = "Net:       ";
        final String ATTN = "Atten:     ";
        final String PER_CAP = "Cap:       ";
        final String PHONE = "Phone:    ";
        
        sb.append(getVenue(name).getAddress());
        sb.append(LINE);
        sb.append(getVenue(name).getCity()).append(COM).append(getVenue(name).getState());
        sb.append(LINE);
        sb.append(getVenue(name).getPhoneNum());
        sb.append(LINE + LINE + GAMES + gameNum);
        sb.append(LINE).append(VENUE);
        sb.append(getVenue(name).getName());
        sb.append(LINE + CASH);
        sb.append(money.format(getRevenue()));
        sb.append(LINE + ATTN);
        sb.append(num.format(getAttendance()));
        sb.append(LINE + PER_CAP);
        sb.append(dec.format(getPercentCap()));
        sb.append(LINE);
        
        gameNum++;
        
        return sb.toString();
    }

    /**
     *
     * @return
     */
    @Override
    public String outputTotals() {
        StringBuilder sb = new StringBuilder();
        final String LINE = "\n";
        final String COM = ", ";
        final String VENUE = "Venue:    ";
        final String CASH = "Gross:       ";
        final String ATTN = "Net Atten:     ";
        final String GAMES = "Net Games:    ";
        
        sb.append(GAMES + totalGames);
        sb.append(LINE);
        sb.append(CASH + money.format(getTotalRev()));
        sb.append(LINE);
        sb.append(ATTN + num.format(getTotalAtten()));
        sb.append(LINE);
        
        totalGames++;
        
        return sb.toString();
    }
}
