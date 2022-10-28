package com.example.mt_admin.DTO;

import java.util.List;

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
}
