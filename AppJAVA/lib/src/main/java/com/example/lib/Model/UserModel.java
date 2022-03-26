package com.example.lib.Model;

public class UserModel {
    private String idUser;

    private String TKUser;

    private String Email;

    private String NameUser;

    private String MKUser;

    public String getIdUser ()
    {
        return idUser;
    }

    public void setIdUser (String idUser)
    {
        this.idUser = idUser;
    }

    public String getTKUser ()
    {
        return TKUser;
    }

    public void setTKUser (String TKUser)
    {
        this.TKUser = TKUser;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public String getNameUser ()
    {
        return NameUser;
    }

    public void setNameUser (String NameUser)
    {
        this.NameUser = NameUser;
    }

    public String getMKUser ()
    {
        return MKUser;
    }

    public void setMKUser (String MKUser)
    {
        this.MKUser = MKUser;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [idUser = "+idUser+", TKUser = "+TKUser+", Email = "+Email+", NameUser = "+NameUser+", MKUser = "+MKUser+"]";
    }
}
