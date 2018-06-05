package com.ppl.ezsend.interfaces;

import com.ppl.ezsend.model.CityResult;
import com.ppl.ezsend.model.ProvinceResult;

public interface ClickListener {
    void onProvinceItemClick(ProvinceResult provinceResult);
    void onCityItemClick(CityResult cityResult);
}
