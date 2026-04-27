package p000;

import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import p000.j23;
import p000.k5d;

/* JADX INFO: loaded from: classes7.dex */
public class l5d extends n0c {

    /* JADX INFO: renamed from: g */
    public List<k5d.C8203a> f56232g;

    /* JADX INFO: renamed from: l5d$a */
    public class C8624a implements j23.InterfaceC7726b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ do1 f56233a;

        /* JADX INFO: renamed from: l5d$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f56235a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f56236b;

            public a(long j, long j2) {
                this.f56235a = j;
                this.f56236b = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C8624a c8624a = C8624a.this;
                long j = this.f56236b;
                c8624a.f56233a.inProgress((this.f56235a * 1.0f) / j, j, l5d.this.f62900e);
            }
        }

        public C8624a(do1 do1Var) {
            this.f56233a = do1Var;
        }

        @Override // p000.j23.InterfaceC7726b
        public void onRequestProgress(long j, long j2) {
            g1c.getInstance().getDelivery().execute(new a(j, j2));
        }
    }

    public l5d(String str, Object obj, Map<String, String> map, Map<String, String> map2, List<k5d.C8203a> list, int i) {
        super(str, obj, map, map2, i);
        this.f56232g = list;
    }

    private void addParams(MultipartBody.Builder builder) {
        Map<String, String> map = this.f62898c;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : this.f62898c.keySet()) {
            builder.addPart(Headers.m18735of("Content-Disposition", "form-data; name=\"" + str + "\""), RequestBody.create((MediaType) null, this.f62898c.get(str)));
        }
    }

    private String guessMimeType(String str) {
        String contentTypeFor;
        try {
            contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            contentTypeFor = null;
        }
        return contentTypeFor == null ? "application/octet-stream" : contentTypeFor;
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: b */
    public Request mo10718b(RequestBody requestBody) {
        return this.f62901f.post(requestBody).build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: c */
    public RequestBody mo10719c() {
        List<k5d.C8203a> list = this.f56232g;
        if (list == null || list.isEmpty()) {
            FormBody.Builder builder = new FormBody.Builder();
            addParams(builder);
            return builder.build();
        }
        MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
        addParams(type);
        for (int i = 0; i < this.f56232g.size(); i++) {
            k5d.C8203a c8203a = this.f56232g.get(i);
            type.addFormDataPart(c8203a.f52606a, c8203a.f52607b, RequestBody.create(MediaType.parse(guessMimeType(c8203a.f52607b)), c8203a.f52608c));
        }
        return type.build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: d */
    public RequestBody mo13741d(RequestBody requestBody, do1 do1Var) {
        return do1Var == null ? requestBody : new j23(requestBody, new C8624a(do1Var));
    }

    private void addParams(FormBody.Builder builder) {
        Map<String, String> map = this.f62898c;
        if (map != null) {
            for (String str : map.keySet()) {
                builder.add(str, this.f62898c.get(str));
            }
        }
    }
}
