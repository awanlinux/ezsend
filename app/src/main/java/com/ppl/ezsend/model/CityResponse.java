package com.ppl.ezsend.model;

import com.google.gson.annotations.SerializedName;

public class CityResponse {
    @SerializedName("rajaongkir")
    public RajaOngkirCity rajaongkir;

    public RajaOngkirCity getRajaongkir() {
        return rajaongkir;
    }
}
