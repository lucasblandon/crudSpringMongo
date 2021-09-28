package com.lb.crudmongo.models;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "envios")
public class EnvioDTO {
    @Id
    private String _id;
    private String paquete;
    private Double costo;
    private LocalDate fechaEnvio;

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getPaquete() {
        return paquete;
    }
    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

}
