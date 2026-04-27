package p000;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class knh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final i2g<Object> f54819a;

    /* JADX INFO: renamed from: b */
    @gib
    public final knh f54820b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f54821c;

    public knh(@yfb i2g<? extends Object> i2gVar, @gib knh knhVar) {
        this.f54819a = i2gVar;
        this.f54820b = knhVar;
        this.f54821c = i2gVar.getValue();
    }

    @yfb
    public final Object getInitial() {
        return this.f54821c;
    }

    @yfb
    public final Typeface getTypeface() {
        Object obj = this.f54821c;
        md8.checkNotNull(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        knh knhVar;
        return this.f54819a.getValue() != this.f54821c || ((knhVar = this.f54820b) != null && knhVar.isStaleResolvedFont());
    }

    public /* synthetic */ knh(i2g i2gVar, knh knhVar, int i, jt3 jt3Var) {
        this(i2gVar, (i & 2) != 0 ? null : knhVar);
    }
}
