package p000;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public class vd8 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final UnsupportedEncodingException f90737a;

    public vd8(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException == null) {
            throw new IllegalArgumentException();
        }
        this.f90737a = unsupportedEncodingException;
    }

    public UnsupportedEncodingException getEncodingException() {
        return this.f90737a;
    }
}
