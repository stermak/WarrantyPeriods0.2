package com.example.WarrantyPeriods.Model;

import android.net.Uri;
import android.view.View;

public class SpisokModel {
    private String WarrantyName ,CompanyName , year1 , desc ;
    private View imageView;
    public SpisokModel() {}

    public String getWarrantyName()
    {
        return WarrantyName;
    }
    public void setWarrantyName(String WarrantyName)
    {
        this.WarrantyName = WarrantyName;
    }
    public String getCompanyName()
    {
        return CompanyName;
    }
    public void setCompanyName(String CompanyName)
    {
        this.CompanyName = CompanyName;
    }
    public String getYear1()
    {
        return year1;
    }
    public void setYear1(String year1)
    {
        this.year1 = year1;
    }
    public String getdesc() {
        return desc;
    }
    public void setdesc(String desc)
    {
        this.desc = desc;
    }
}