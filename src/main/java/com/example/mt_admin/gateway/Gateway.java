package com.example.mt_admin.gateway;

import com.example.mt_admin.DTO.ConfigDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Gateway {
    public ConfigDTO getConfig() {
        //TODO get from REST gateway
        ConfigDTO configDTO = new ConfigDTO();
        configDTO.setActualSignature("ВИТ");
        configDTO.setSignatures(List.of("ВИТ","КИТ","PIT"));
        configDTO.setOmsConnectionId("f2b0e237-8d3d-4a1c-a36e-55ffb78de48b");
        configDTO.setOmsId("b95e0688-fe05-4894-856a-021bfa08b5ef");

        return configDTO;
    }

    public void sendConfig(ConfigDTO configDTO) {
        //TODO send over REST to gateway
        System.out.println("Config sent to gateway ");
    }
}
