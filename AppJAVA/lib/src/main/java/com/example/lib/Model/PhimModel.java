package com.example.lib.Model;

public class PhimModel {
    private String TenPhim;

    private String idPhim;

    private String linkimg;

    private String linkPhim;

    private String mota;

    private String idTheloai;

    public String getTenPhim ()
    {
        return TenPhim;
    }

    public void setTenPhim (String TenPhim)
    {
        this.TenPhim = TenPhim;
    }

    public String getIdPhim ()
    {
        return idPhim;
    }

    public void setIdPhim (String idPhim)
    {
        this.idPhim = idPhim;
    }

    public String getLinkimg ()
    {
        return linkimg;
    }

    public void setLinkimg (String linkimg)
    {
        this.linkimg = linkimg;
    }

    public String getLinkPhim ()
    {
        return linkPhim;
    }

    public void setLinkPhim (String linkPhim)
    {
        this.linkPhim = linkPhim;
    }

    public String getMota ()
    {
        return mota;
    }

    public void setMota (String mota)
    {
        this.mota = mota;
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
        return "ClassPojo [TenPhim = "+TenPhim+", idPhim = "+idPhim+", linkimg = "+linkimg+", linkPhim = "+linkPhim+", mota = "+mota+", idTheloai = "+idTheloai+"]";
    }
}
