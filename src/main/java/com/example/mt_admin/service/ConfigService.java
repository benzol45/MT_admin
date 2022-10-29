package com.example.mt_admin.service;

import com.example.mt_admin.DTO.ConfigDTO;
import com.example.mt_admin.gateway.Gateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {
    private final Gateway gateway;

    @Autowired
    public ConfigService(Gateway gateway) {
        this.gateway = gateway;
    }

    public ConfigDTO getCurrent() {
        return gateway.getConfig();
    }

    public void saveNew(ConfigDTO configDTO) {
        ConfigDTO current = getCurrent();

        boolean isChanged = !(current.equals(configDTO));

        if (isChanged) {
            gateway.sendConfig(configDTO);
        }
    }
}
