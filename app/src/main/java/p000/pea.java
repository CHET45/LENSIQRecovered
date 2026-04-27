package p000;

import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class pea extends ida {

    /* JADX INFO: renamed from: c */
    public final int f70558c;

    /* JADX INFO: renamed from: d */
    public final boolean f70559d;

    public pea(Throwable th, @hib kda kdaVar, @hib Surface surface) {
        super(th, kdaVar);
        this.f70558c = System.identityHashCode(surface);
        this.f70559d = surface == null || surface.isValid();
    }
}
