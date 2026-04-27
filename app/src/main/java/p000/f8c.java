package p000;

import android.text.TextUtils;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.http.HttpMethod;
import p000.g1c;

/* JADX INFO: loaded from: classes7.dex */
public class f8c extends n0c {

    /* JADX INFO: renamed from: j */
    public static MediaType f35685j = MediaType.parse("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: g */
    public RequestBody f35686g;

    /* JADX INFO: renamed from: h */
    public String f35687h;

    /* JADX INFO: renamed from: i */
    public String f35688i;

    public f8c(RequestBody requestBody, String str, String str2, String str3, Object obj, Map<String, String> map, Map<String, String> map2, int i) {
        super(str3, obj, map, map2, i);
        this.f35686g = requestBody;
        this.f35687h = str2;
        this.f35688i = str;
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: b */
    public Request mo10718b(RequestBody requestBody) {
        if (this.f35687h.equals(g1c.C6087d.f38270c)) {
            this.f62901f.put(requestBody);
        } else if (this.f35687h.equals(g1c.C6087d.f38269b)) {
            if (requestBody == null) {
                this.f62901f.delete();
            } else {
                this.f62901f.delete(requestBody);
            }
        } else if (this.f35687h.equals("HEAD")) {
            this.f62901f.head();
        } else if (this.f35687h.equals(g1c.C6087d.f38271d)) {
            this.f62901f.patch(requestBody);
        }
        return this.f62901f.build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: c */
    public RequestBody mo10719c() {
        if (this.f35686g == null && TextUtils.isEmpty(this.f35688i) && HttpMethod.requiresRequestBody(this.f35687h)) {
            p75.illegalArgument("requestBody and content can not be null in method:" + this.f35687h, new Object[0]);
        }
        if (this.f35686g == null && !TextUtils.isEmpty(this.f35688i)) {
            this.f35686g = RequestBody.create(f35685j, this.f35688i);
        }
        return this.f35686g;
    }
}
