package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.MultipleResource;
import com.journaldev.retrofitintro.pojo.User;
import com.journaldev.retrofitintro.pojo.UserList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


interface APIInterface {

    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();


    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);


    @POST("/api/users")
    Call<User> createUser(@Body User user);


    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
}
