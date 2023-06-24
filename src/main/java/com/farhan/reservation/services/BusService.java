package com.farhan.reservation.services;

import com.farhan.reservation.entities.Bus;

import java.util.List;

public interface BusService {
    Bus addBus(Bus bus);
    List<Bus> getAllBus();
}
