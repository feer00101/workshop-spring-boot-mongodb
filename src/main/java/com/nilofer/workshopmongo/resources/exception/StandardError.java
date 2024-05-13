package com.nilofer.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private Long timestamp;
    private Integer status;
    private String error;
    private String menssage;
    private String path;

    public StandardError() {

    }

    public StandardError(Long timestamp, Integer status, String error, String menssage, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.menssage = menssage;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
