package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id") private String id;
    @SerializedName("user_name") private String userName;
    @SerializedName("image_url") private String imageUrl;
    @SerializedName("_id") private String imageId;
    @SerializedName("video_url") private String videoUrl;
    @SerializedName("createdAt") private  String createAt;
    @SerializedName("updateAt") private String updateAt;

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public String getImageId()
    {
        return imageId;
    }

    public String getVideoUrl(){
        return videoUrl;
    }

    public String getCreateAt(){
        return createAt;
    }

    public String getUpdateAt(){
        return updateAt;
    }
    @Override public String toString() {
        return "";
    }
}
