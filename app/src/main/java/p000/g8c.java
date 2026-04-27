package p000;

import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes7.dex */
public class g8c extends o0c<g8c> {

    /* JADX INFO: renamed from: f */
    public RequestBody f38996f;

    /* JADX INFO: renamed from: g */
    public String f38997g;

    /* JADX INFO: renamed from: h */
    public String f38998h;

    public g8c(String str) {
        this.f38997g = str;
    }

    @Override // p000.o0c
    public u3e build() {
        return new f8c(this.f38996f, this.f38998h, this.f38997g, this.f66174a, this.f66175b, this.f66177d, this.f66176c, this.f66178e).build();
    }

    public g8c requestBody(RequestBody requestBody) {
        this.f38996f = requestBody;
        return this;
    }

    public g8c requestBody(String str) {
        this.f38998h = str;
        return this;
    }
}
