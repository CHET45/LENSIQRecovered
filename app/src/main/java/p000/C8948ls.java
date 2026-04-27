package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import p000.ip6;

/* JADX INFO: renamed from: ls */
/* JADX INFO: loaded from: classes.dex */
@c5e(26)
@e0g(parameters = 1)
public final class C8948ls extends AbstractC12286ru {

    /* JADX INFO: renamed from: n */
    public static final int f58571n = 0;

    /* JADX INFO: renamed from: l */
    @yfb
    public final ParcelFileDescriptor f58572l;

    /* JADX INFO: renamed from: m */
    @gib
    public final String f58573m;

    public /* synthetic */ C8948ls(ParcelFileDescriptor parcelFileDescriptor, jp6 jp6Var, int i, ip6.C7556e c7556e, jt3 jt3Var) {
        this(parcelFileDescriptor, jp6Var, i, c7556e);
    }

    @Override // p000.AbstractC12286ru
    @gib
    public Typeface doLoad$ui_text_release(@gib Context context) {
        return anh.f11422a.createFromFileDescriptor(this.f58572l, context, getVariationSettings());
    }

    @Override // p000.AbstractC12286ru
    @gib
    public String getCacheKey() {
        return this.f58573m;
    }

    @yfb
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.f58572l;
    }

    @yfb
    public String toString() {
        return "Font(fileDescriptor=" + this.f58572l + ", weight=" + getWeight() + ", style=" + ((Object) fp6.m29577toStringimpl(mo30175getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ C8948ls(ParcelFileDescriptor parcelFileDescriptor, jp6 jp6Var, int i, ip6.C7556e c7556e, int i2, jt3 jt3Var) {
        this(parcelFileDescriptor, (i2 & 2) != 0 ? jp6.f51403b.getNormal() : jp6Var, (i2 & 4) != 0 ? fp6.f37355b.m29582getNormal_LCdwA() : i, c7556e, null);
    }

    private C8948ls(ParcelFileDescriptor parcelFileDescriptor, jp6 jp6Var, int i, ip6.C7556e c7556e) {
        super(jp6Var, i, c7556e, null);
        this.f58572l = parcelFileDescriptor;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
