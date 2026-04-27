package p000;

import java.util.Map;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n0c {

    /* JADX INFO: renamed from: a */
    public String f62896a;

    /* JADX INFO: renamed from: b */
    public Object f62897b;

    /* JADX INFO: renamed from: c */
    public Map<String, String> f62898c;

    /* JADX INFO: renamed from: d */
    public Map<String, String> f62899d;

    /* JADX INFO: renamed from: e */
    public int f62900e;

    /* JADX INFO: renamed from: f */
    public Request.Builder f62901f = new Request.Builder();

    public n0c(String str, Object obj, Map<String, String> map, Map<String, String> map2, int i) {
        this.f62896a = str;
        this.f62897b = obj;
        this.f62898c = map;
        this.f62899d = map2;
        this.f62900e = i;
        if (str == null) {
            p75.illegalArgument("url can not be null.", new Object[0]);
        }
        initBuilder();
    }

    private void initBuilder() {
        this.f62901f.url(this.f62896a).tag(this.f62897b);
        m17691a();
    }

    /* JADX INFO: renamed from: a */
    public void m17691a() {
        Headers.Builder builder = new Headers.Builder();
        Map<String, String> map = this.f62899d;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (String str : this.f62899d.keySet()) {
            builder.add(str, this.f62899d.get(str));
        }
        this.f62901f.headers(builder.build());
    }

    /* JADX INFO: renamed from: b */
    public abstract Request mo10718b(RequestBody requestBody);

    public u3e build() {
        return new u3e(this);
    }

    /* JADX INFO: renamed from: c */
    public abstract RequestBody mo10719c();

    /* JADX INFO: renamed from: d */
    public RequestBody mo13741d(RequestBody requestBody, do1 do1Var) {
        return requestBody;
    }

    public Request generateRequest(do1 do1Var) {
        return mo10718b(mo13741d(mo10719c(), do1Var));
    }

    public int getId() {
        return this.f62900e;
    }
}
