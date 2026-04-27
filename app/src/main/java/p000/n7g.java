package p000;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public class n7g extends Converter.Factory {

    /* JADX INFO: renamed from: n7g$a */
    public static class C9723a implements Converter<ResponseBody, String> {
        @Override // retrofit2.Converter
        public String convert(ResponseBody responseBody) throws IOException {
            return responseBody.string();
        }
    }

    public static n7g create() {
        return new n7g();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@efb Type type, @efb Annotation[] annotationArr, @efb Retrofit retrofit) {
        if (type == String.class) {
            return new C9723a();
        }
        return null;
    }
}
