package com.samsung.spring.service;

import com.samsung.spring.domain.Emergency;
import com.samsung.spring.domain.User;

import java.util.List;

public interface EmergencyService {
    Emergency addEmergency(Emergency emergency);
    List<Emergency> getAllEmergency();
    Emergency getByIdEmergency(long id);
    Emergency updateEmergency(Emergency emergency);
    void deleteByIdEmergency(long id);
}
