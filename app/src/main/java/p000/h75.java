package p000;

import com.google.gson.JsonParseException;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.ParseException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes6.dex */
public class h75 {

    /* JADX INFO: renamed from: a */
    public static final int f42701a = 401;

    /* JADX INFO: renamed from: b */
    public static final int f42702b = 403;

    /* JADX INFO: renamed from: c */
    public static final int f42703c = 404;

    /* JADX INFO: renamed from: d */
    public static final int f42704d = 408;

    /* JADX INFO: renamed from: e */
    public static final int f42705e = 500;

    /* JADX INFO: renamed from: f */
    public static final int f42706f = 502;

    /* JADX INFO: renamed from: g */
    public static final int f42707g = 503;

    /* JADX INFO: renamed from: h */
    public static final int f42708h = 504;

    /* JADX INFO: renamed from: i */
    public static final int f42709i = 406;

    /* JADX INFO: renamed from: j */
    public static final int f42710j = 400;

    public static C6732a handleException(Throwable th) {
        if (th instanceof HttpException) {
            HttpException httpException = (HttpException) th;
            C6732a c6732a = new C6732a(th, 1003);
            if (httpException.code() == 400) {
                try {
                    String string = new JSONObject(httpException.response().errorBody().string()).getString(g55.f38799h);
                    if (string == null) {
                        string = "错误的请求";
                    }
                    c6732a.f42712b = string;
                } catch (IOException | JSONException unused) {
                    c6732a.f42712b = "解析错误响应时出错";
                }
            }
            return c6732a;
        }
        if ((th instanceof JsonParseException) || (th instanceof JSONException) || (th instanceof ParseException)) {
            return new C6732a(th, 1001);
        }
        if (th instanceof ConnectException) {
            return new C6732a(th, 1002);
        }
        if (th instanceof SSLHandshakeException) {
            return new C6732a(th, 1005);
        }
        if (th instanceof SocketTimeoutException) {
            return new C6732a(th, 1006);
        }
        if ((th instanceof UnknownHostException) || (th instanceof SocketException)) {
            return new C6732a(th, 1002);
        }
        if (th instanceof SSLException) {
            return new C6732a(th, 1006);
        }
        if (!(th instanceof EOFException) && !(th instanceof NullPointerException)) {
            return new C6732a(th, 1000);
        }
        return new C6732a(th, 1007);
    }

    /* JADX INFO: renamed from: h75$a */
    public static class C6732a extends Exception {

        /* JADX INFO: renamed from: a */
        public int f42711a;

        /* JADX INFO: renamed from: b */
        public String f42712b;

        public C6732a(Throwable th, int i) {
            super(th);
            this.f42711a = i;
        }

        public int getCode() {
            return this.f42711a;
        }

        @Override // java.lang.Throwable
        @hib
        public String getMessage() {
            return this.f42712b;
        }

        @Override // java.lang.Throwable
        @efb
        public String toString() {
            return "ResponseThrowable{code=" + this.f42711a + ", message='" + this.f42712b + "'}";
        }

        public C6732a(String str, int i) {
            this.f42711a = i;
            this.f42712b = str;
        }
    }
}
