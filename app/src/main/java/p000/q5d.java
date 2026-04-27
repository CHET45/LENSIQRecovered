package p000;

import java.util.Map;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public class q5d extends n0c {

    /* JADX INFO: renamed from: i */
    public static MediaType f73285i = MediaType.parse("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: g */
    public String f73286g;

    /* JADX INFO: renamed from: h */
    public MediaType f73287h;

    public q5d(String str, Object obj, Map<String, String> map, Map<String, String> map2, String str2, MediaType mediaType, int i) {
        super(str, obj, map, map2, i);
        this.f73286g = str2;
        this.f73287h = mediaType;
        if (str2 == null) {
            p75.illegalArgument("the content can not be null !", new Object[0]);
        }
        if (this.f73287h == null) {
            this.f73287h = f73285i;
        }
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: b */
    public Request mo10718b(RequestBody requestBody) {
        return this.f62901f.post(requestBody).build();
    }

    @Override // p000.n0c
    /* JADX INFO: renamed from: c */
    public RequestBody mo10719c() {
        return RequestBody.create(this.f73287h, this.f73286g);
    }
}
