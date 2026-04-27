package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.ProtocolException;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000.zk4;

/* JADX INFO: loaded from: classes6.dex */
public class pm4 implements zk4, zk4.InterfaceC16164a {

    /* JADX INFO: renamed from: b */
    @efb
    public final OkHttpClient f71376b;

    /* JADX INFO: renamed from: c */
    @efb
    public final Request.Builder f71377c;

    /* JADX INFO: renamed from: d */
    public Request f71378d;

    /* JADX INFO: renamed from: e */
    public Response f71379e;

    /* JADX INFO: renamed from: pm4$a */
    public static class C11025a implements zk4.InterfaceC16165b {

        /* JADX INFO: renamed from: a */
        public OkHttpClient.Builder f71380a;

        /* JADX INFO: renamed from: b */
        public volatile OkHttpClient f71381b;

        @efb
        public OkHttpClient.Builder builder() {
            if (this.f71380a == null) {
                this.f71380a = new OkHttpClient.Builder();
            }
            return this.f71380a;
        }

        @Override // p000.zk4.InterfaceC16165b
        public zk4 create(String str) throws IOException {
            if (this.f71381b == null) {
                synchronized (C11025a.class) {
                    try {
                        if (this.f71381b == null) {
                            OkHttpClient.Builder builder = this.f71380a;
                            this.f71381b = builder != null ? builder.build() : new OkHttpClient();
                            this.f71380a = null;
                        }
                    } finally {
                    }
                }
            }
            return new pm4(this.f71381b, str);
        }

        public C11025a setBuilder(@efb OkHttpClient.Builder builder) {
            this.f71380a = builder;
            return this;
        }
    }

    public pm4(@efb OkHttpClient okHttpClient, @efb Request.Builder builder) {
        this.f71376b = okHttpClient;
        this.f71377c = builder;
    }

    @Override // p000.zk4
    public void addHeader(String str, String str2) {
        this.f71377c.addHeader(str, str2);
    }

    @Override // p000.zk4
    public zk4.InterfaceC16164a execute() throws IOException {
        Request requestBuild = this.f71377c.build();
        this.f71378d = requestBuild;
        this.f71379e = this.f71376b.newCall(requestBuild).execute();
        return this;
    }

    @Override // p000.zk4.InterfaceC16164a
    public InputStream getInputStream() throws IOException {
        Response response = this.f71379e;
        if (response == null) {
            throw new IOException("Please invoke execute first!");
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            return responseBodyBody.byteStream();
        }
        throw new IOException("no body found on response!");
    }

    @Override // p000.zk4.InterfaceC16164a
    public String getRedirectLocation() {
        Response responsePriorResponse = this.f71379e.priorResponse();
        if (responsePriorResponse != null && this.f71379e.isSuccessful() && ivd.isRedirect(responsePriorResponse.code())) {
            return this.f71379e.request().url().toString();
        }
        return null;
    }

    @Override // p000.zk4
    public Map<String, List<String>> getRequestProperties() {
        Request request = this.f71378d;
        return request != null ? request.headers().toMultimap() : this.f71377c.build().headers().toMultimap();
    }

    @Override // p000.zk4
    public String getRequestProperty(String str) {
        Request request = this.f71378d;
        return request != null ? request.header(str) : this.f71377c.build().header(str);
    }

    @Override // p000.zk4.InterfaceC16164a
    public int getResponseCode() throws IOException {
        Response response = this.f71379e;
        if (response != null) {
            return response.code();
        }
        throw new IOException("Please invoke execute first!");
    }

    @Override // p000.zk4.InterfaceC16164a
    public String getResponseHeaderField(String str) {
        Response response = this.f71379e;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }

    @Override // p000.zk4.InterfaceC16164a
    public Map<String, List<String>> getResponseHeaderFields() {
        Response response = this.f71379e;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    @Override // p000.zk4
    public void release() {
        this.f71378d = null;
        Response response = this.f71379e;
        if (response != null) {
            response.close();
        }
        this.f71379e = null;
    }

    @Override // p000.zk4
    public boolean setRequestMethod(@efb String str) throws ProtocolException {
        this.f71377c.method(str, null);
        return true;
    }

    public pm4(@efb OkHttpClient okHttpClient, @efb String str) {
        this(okHttpClient, new Request.Builder().url(str));
    }
}
