package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@Entity
@Table(name = "tbl_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total")
    private Double total;
    @Basic(optional = false)
    @NotNull
    @Column(name = "check_in_date")
    private long checkInDate;
    @Column(name = "check_out_date")
    private BigInteger checkOutDate;
    @Column(name = "duration")
    private BigInteger duration;
    @Column(name = "allowed_parking_from")
    private BigInteger allowedParkingFrom;
    @Column(name = "allowed_parking_to")
    private BigInteger allowedParkingTo;
    @JoinColumn(name = "tbl_location_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Location locationId;
    @JoinColumn(name = "tbl_order_status_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private OrderStatus orderStatusId;
    @JoinColumn(name = "tbl_user_id", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private User userId;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public long getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(long checkInDate) {
        this.checkInDate = checkInDate;
    }

    public BigInteger getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(BigInteger checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public BigInteger getAllowedParkingFrom() {
        return allowedParkingFrom;
    }

    public void setAllowedParkingFrom(BigInteger allowedParkingFrom) {
        this.allowedParkingFrom = allowedParkingFrom;
    }

    public BigInteger getAllowedParkingTo() {
        return allowedParkingTo;
    }

    public void setAllowedParkingTo(BigInteger allowedParkingTo) {
        this.allowedParkingTo = allowedParkingTo;
    }

    public Location getLocationId() {
        return locationId;
    }

    public void setLocationId(Location locationId) {
        this.locationId = locationId;
    }

    public OrderStatus getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(OrderStatus orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

}
