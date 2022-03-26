package com.example.lib.Model;

public class TheLoaiModel {

    private String tenTheloai;

    private String idTheloai;

    public String getTenTheloai ()
    {
        return tenTheloai;
    }

    public void setTenTheloai (String tenTheloai)
    {
        this.tenTheloai = tenTheloai;
    }

    public String getIdTheloai ()
    {
        return idTheloai;
    }

    public void setIdTheloai (String idTheloai)
    {
        this.idTheloai = idTheloai;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tenTheloai = "+tenTheloai+", idTheloai = "+idTheloai+"]";
    }
}


