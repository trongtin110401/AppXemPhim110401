package com.example.lib.Repository;

import com.example.lib.Model.PhimModel;
import com.example.lib.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Methods {
    @GET("api/user")
    Call<UserModel[]> getUser();
    @POST("api/user")
    Call<UserModel> postUser(@Body UserModel data);
    @GET("api/phim/theloai1")
    Call<PhimModel[]> getTheloai1();
    @GET("api/phim/theloai2")
    Call<PhimModel[]> getTheloai2();
    @GET("api/phim/theloai3")
    Call<PhimModel[]> getTheloai3();
    @GET("api/phim/theloai4")
    Call<PhimModel[]> getTheloai4();
    @GET("api/phim/theloai5")
    Call<PhimModel[]> getTheloai5();
}
