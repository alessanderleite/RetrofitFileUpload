package br.com.alessanderleite.retrofitfileupload;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Api {

    //the base URL for our API
    //make sure you are not using localhost
    //find the ip using ipconfig command
    String BASE_URL = "http://192.168.0.48/ImageUploadApi/";

    //this is our multipart request
    //we have tow parameters on is name and other one is description
    @Multipart
    @POST("Api.php?apicall=upload")
    Call<MyResponse> uploadImage(@Part("image\"; filenam=\"myfile.jpg\" ")RequestBody file, @Part("desc") RequestBody desc);
}
