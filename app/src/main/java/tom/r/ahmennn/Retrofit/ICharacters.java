package tom.r.ahmennn.Retrofit;

import io.reactivex.Observable;
import retrofit2.http.GET;
import tom.r.ahmennn.Model.ListCharacters;

public interface ICharacters {
    @GET("character")
    Observable<ListCharacters> getListCharacters();
}
