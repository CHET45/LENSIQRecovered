package p000;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class qea extends jda {

    /* JADX INFO: renamed from: d */
    public final int f74247d;

    /* JADX INFO: renamed from: e */
    public final boolean f74248e;

    public qea(Throwable th, @hib lda ldaVar, @hib Surface surface) {
        super(th, ldaVar);
        this.f74247d = System.identityHashCode(surface);
        this.f74248e = surface == null || surface.isValid();
    }
}
