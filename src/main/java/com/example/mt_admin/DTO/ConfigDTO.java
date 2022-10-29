package com.example.mt_admin.DTO;

import java.util.List;
import java.util.Objects;

public class ConfigDTO {
    private String actualSignature;
    private List<String> signatures;
    private String OmsConnectionId;
    private String OmsId;

    public ConfigDTO() {
    }

    public ConfigDTO(String actualSignature, List<String> signatures, String omsConnectionId, String omsId) {
        this.actualSignature = actualSignature;
        this.signatures = signatures;
        OmsConnectionId = omsConnectionId;
        OmsId = omsId;
    }

    public String getActualSignature() {
        return actualSignature;
    }

    public void setActualSignature(String actualSignature) {
        this.actualSignature = actualSignature;
    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }

    public String getOmsConnectionId() {
        return OmsConnectionId;
    }

    public void setOmsConnectionId(String omsConnectionId) {
        OmsConnectionId = omsConnectionId;
    }

    public String getOmsId() {
        return OmsId;
    }

    public void setOmsId(String omsId) {
        OmsId = omsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfigDTO configDTO = (ConfigDTO) o;
        return Objects.equals(actualSignature, configDTO.actualSignature) && Objects.equals(OmsConnectionId, configDTO.OmsConnectionId) && Objects.equals(OmsId, configDTO.OmsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualSignature, OmsConnectionId, OmsId);
    }
}
