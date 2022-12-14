package Day_100_CaseStudy.models;


public class Booking  {
    private String bookingId;
    private String startDate;
    private String endDate;
    private String customerId;
    private String serviceName;


    public Booking() {
    }

    public Booking(String bookingId, String startDate, String endDate, String customerId, String serviceName) {
        this.bookingId = bookingId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customerId = customerId;
        this.serviceName = serviceName;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return
                "bookingId='" + bookingId + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", serviceName='" + serviceName + '\''
                ;
    }
}
