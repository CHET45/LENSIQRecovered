package p000;

import okhttp3.MediaType;

/* JADX INFO: loaded from: classes7.dex */
public class p5d extends o0c<p5d> {

    /* JADX INFO: renamed from: f */
    public String f69735f;

    /* JADX INFO: renamed from: g */
    public MediaType f69736g;

    @Override // p000.o0c
    public u3e build() {
        return new q5d(this.f66174a, this.f66175b, this.f66177d, this.f66176c, this.f69735f, this.f69736g, this.f66178e).build();
    }

    public p5d content(String str) {
        this.f69735f = str;
        return this;
    }

    public p5d mediaType(MediaType mediaType) {
        this.f69736g = mediaType;
        return this;
    }
}
