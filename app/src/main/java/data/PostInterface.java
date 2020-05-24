package data;

import java.util.List;

import io.reactivex.Observable;
import pojo.PostModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PostInterface {
    @GET("posts")
    public Observable<List<PostModel>> getPosts();


}
