package com.ppl.ezsend.model;

import com.google.gson.annotations.SerializedName;

public class ProvinceResponse {
    @SerializedName("rajaongkir")
    public RajaOngkir rajaongkir;

    public RajaOngkir getRajaongkir() {
        return rajaongkir;
    }
}
