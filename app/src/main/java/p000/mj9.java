package p000;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
public class mj9 implements Interceptor {

    /* JADX INFO: renamed from: c */
    public static final String f61141c = "OkHttpUtils";

    /* JADX INFO: renamed from: a */
    public String f61142a;

    /* JADX INFO: renamed from: b */
    public boolean f61143b;

    public mj9(String str, boolean z) {
        str = TextUtils.isEmpty(str) ? f61141c : str;
        this.f61143b = z;
        this.f61142a = str;
    }

    private String bodyToString(Request request) {
        try {
            Request requestBuild = request.newBuilder().build();
            Buffer buffer = new Buffer();
            requestBuild.body().writeTo(buffer);
            return buffer.readUtf8();
        } catch (IOException unused) {
            return "something error when show requestBody.";
        }
    }

    private boolean isText(MediaType mediaType) {
        if (mediaType.type() != null && mediaType.type().equals("text")) {
            return true;
        }
        if (mediaType.subtype() != null) {
            return mediaType.subtype().equals("json") || mediaType.subtype().equals("xml") || mediaType.subtype().equals("html") || mediaType.subtype().equals("webviewhtml");
        }
        return false;
    }

    private void logForRequest(Request request) {
        MediaType mediaTypeContentType;
        try {
            String string = request.url().toString();
            Headers headers = request.headers();
            Log.e(this.f61142a, "========request'log=======");
            Log.e(this.f61142a, "method : " + request.method());
            Log.e(this.f61142a, "url : " + string);
            if (headers != null && headers.size() > 0) {
                Log.e(this.f61142a, "headers : " + headers.toString());
            }
            RequestBody requestBodyBody = request.body();
            if (requestBodyBody != null && (mediaTypeContentType = requestBodyBody.contentType()) != null) {
                Log.e(this.f61142a, "requestBody's contentType : " + mediaTypeContentType.toString());
                if (isText(mediaTypeContentType)) {
                    Log.e(this.f61142a, "requestBody's content : " + bodyToString(request));
                } else {
                    Log.e(this.f61142a, "requestBody's content :  maybe [file part] , too large too print , ignored!");
                }
            }
            Log.e(this.f61142a, "========request'log=======end");
        } catch (Exception unused) {
        }
    }

    private Response logForResponse(Response response) {
        ResponseBody responseBodyBody;
        MediaType mediaTypeContentType;
        try {
            Log.e(this.f61142a, "========response'log=======");
            Response responseBuild = response.newBuilder().build();
            Log.e(this.f61142a, "url : " + responseBuild.request().url());
            Log.e(this.f61142a, "code : " + responseBuild.code());
            Log.e(this.f61142a, "protocol : " + responseBuild.protocol());
            if (!TextUtils.isEmpty(responseBuild.message())) {
                Log.e(this.f61142a, "message : " + responseBuild.message());
            }
            if (this.f61143b && (responseBodyBody = responseBuild.body()) != null && (mediaTypeContentType = responseBodyBody.contentType()) != null) {
                Log.e(this.f61142a, "responseBody's contentType : " + mediaTypeContentType.toString());
                if (isText(mediaTypeContentType)) {
                    String strString = responseBodyBody.string();
                    Log.e(this.f61142a, "responseBody's content : " + strString);
                    return response.newBuilder().body(ResponseBody.create(mediaTypeContentType, strString)).build();
                }
                Log.e(this.f61142a, "responseBody's content :  maybe [file part] , too large too print , ignored!");
            }
            Log.e(this.f61142a, "========response'log=======end");
        } catch (Exception unused) {
        }
        return response;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        logForRequest(request);
        return logForResponse(chain.proceed(request));
    }

    public mj9(String str) {
        this(str, false);
    }
}
