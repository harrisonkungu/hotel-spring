package com.hotelmanager.entity;

import javax.persistence.*;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity
@Table(name = "hotel")
public class HotelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "opened_on")
    private Date opened_on;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getOpened_on() {
		return opened_on;
	}

	public void setOpened_on(Date opened_on) {
		this.opened_on = opened_on;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "address")
    private String address;

    public HotelEntity() {
    }

    public HotelEntity(Long id, String name, String location, Date opened_on, String address) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.opened_on = opened_on;
        this.address = address;
    }

}