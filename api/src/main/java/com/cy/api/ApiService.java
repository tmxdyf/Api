package com.cy.api;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by CY on 2016/3/16.
 */
interface ApiService {


    @FormUrlEncoded
    @POST("{method}")
    Call<String> post(@Path("method") String method, @FieldMap Map<String, String> fieldMap);


    @FormUrlEncoded
    @POST("{method}")
    Observable<String> post2(@Path("method") String method, @FieldMap Map<String, String> fieldMap);


}
