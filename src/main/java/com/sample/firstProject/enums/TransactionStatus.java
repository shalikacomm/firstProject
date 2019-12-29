package com.sample.firstProject.enums;

public enum  TransactionStatus {

    ACTIVE("ACTIVE"), DEACTIVE("DEACTIVE");

    private String code;

    TransactionStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

   public static TransactionStatus getEnum(String code){
        switch (code){
            case "ACTIVE":
                return ACTIVE;
            case "DEACTIVE":
                return DEACTIVE;
            default:
                return null;
        }
    }


}
