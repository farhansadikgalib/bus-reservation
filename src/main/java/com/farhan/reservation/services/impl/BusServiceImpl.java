package com.farhan.reservation.services.impl;

import com.farhan.reservation.entities.Bus;
import com.farhan.reservation.repos.BusRepository;
import com.farhan.reservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}

