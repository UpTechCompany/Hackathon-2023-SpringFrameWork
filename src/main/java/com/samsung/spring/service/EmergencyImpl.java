package com.samsung.spring.service;

import com.samsung.spring.dao.EmergencyDao;
import com.samsung.spring.dao.UserDao;
import com.samsung.spring.domain.Emergency;
import com.samsung.spring.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmergencyImpl implements EmergencyService{

    private final EmergencyDao emergencyDao;


    @Override
    public Emergency addEmergency(Emergency emergency) {
        return emergencyDao.save(emergency);
    }

    @Override
    public List<Emergency> getAllEmergency() {
        return emergencyDao.findAll();
    }

    @Override
    public Emergency getByIdEmergency(long id) {
        return emergencyDao.findById(id).orElse(null);
    }

    @Override
    public Emergency updateEmergency(Emergency emergency) {
        return emergencyDao.save(emergency);
    }

    @Override
    public void deleteByIdEmergency(long id) {
        emergencyDao.deleteById(id);
    }
}
