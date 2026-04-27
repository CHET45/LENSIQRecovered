package p000;

import java.io.File;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes7.dex */
public class i5d extends o0c<i5d> {

    /* JADX INFO: renamed from: f */
    public File f45798f;

    /* JADX INFO: renamed from: g */
    public MediaType f45799g;

    @Override // p000.o0c
    public u3e build() {
        return new j5d(this.f66174a, this.f66175b, this.f66177d, this.f66176c, this.f45798f, this.f45799g, this.f66178e).build();
    }

    public o0c file(File file) {
        this.f45798f = file;
        return this;
    }

    public o0c mediaType(MediaType mediaType) {
        this.f45799g = mediaType;
        return this;
    }
}
