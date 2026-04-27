package p000;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class s39 {

    /* JADX INFO: renamed from: r */
    public static final int f80519r = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<x3a, bth> f80520a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final v38 f80521b;

    /* JADX INFO: renamed from: d */
    public boolean f80523d;

    /* JADX INFO: renamed from: e */
    public boolean f80524e;

    /* JADX INFO: renamed from: f */
    public boolean f80525f;

    /* JADX INFO: renamed from: g */
    public boolean f80526g;

    /* JADX INFO: renamed from: h */
    public boolean f80527h;

    /* JADX INFO: renamed from: i */
    public boolean f80528i;

    /* JADX INFO: renamed from: j */
    @gib
    public zsg f80529j;

    /* JADX INFO: renamed from: k */
    @gib
    public hug f80530k;

    /* JADX INFO: renamed from: l */
    @gib
    public nzb f80531l;

    /* JADX INFO: renamed from: m */
    @gib
    public rud f80532m;

    /* JADX INFO: renamed from: n */
    @gib
    public rud f80533n;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f80522c = new Object();

    /* JADX INFO: renamed from: o */
    @yfb
    public final CursorAnchorInfo.Builder f80534o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    @yfb
    public final float[] f80535p = x3a.m33183constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: q */
    @yfb
    public final Matrix f80536q = new Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public s39(@yfb qy6<? super x3a, bth> qy6Var, @yfb v38 v38Var) {
        this.f80520a = qy6Var;
        this.f80521b = v38Var;
    }

    private final void updateCursorAnchorInfo() {
        if (this.f80521b.isActive()) {
            x3a.m33192resetimpl(this.f80535p);
            this.f80520a.invoke(x3a.m33181boximpl(this.f80535p));
            float[] fArr = this.f80535p;
            rud rudVar = this.f80533n;
            md8.checkNotNull(rudVar);
            float f = -rudVar.getLeft();
            rud rudVar2 = this.f80533n;
            md8.checkNotNull(rudVar2);
            x3a.m33202translateimpl(fArr, f, -rudVar2.getTop(), 0.0f);
            C12773st.m32333setFromEL8BTi8(this.f80536q, this.f80535p);
            v38 v38Var = this.f80521b;
            CursorAnchorInfo.Builder builder = this.f80534o;
            zsg zsgVar = this.f80529j;
            md8.checkNotNull(zsgVar);
            nzb nzbVar = this.f80531l;
            md8.checkNotNull(nzbVar);
            hug hugVar = this.f80530k;
            md8.checkNotNull(hugVar);
            Matrix matrix = this.f80536q;
            rud rudVar3 = this.f80532m;
            md8.checkNotNull(rudVar3);
            rud rudVar4 = this.f80533n;
            md8.checkNotNull(rudVar4);
            v38Var.updateCursorAnchorInfo(r39.build(builder, zsgVar, nzbVar, hugVar, matrix, rudVar3, rudVar4, this.f80525f, this.f80526g, this.f80527h, this.f80528i));
            this.f80524e = false;
        }
    }

    public final void invalidate() {
        synchronized (this.f80522c) {
            this.f80529j = null;
            this.f80531l = null;
            this.f80530k = null;
            this.f80532m = null;
            this.f80533n = null;
            bth bthVar = bth.f14751a;
        }
    }

    public final void requestUpdate(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        synchronized (this.f80522c) {
            try {
                this.f80525f = z3;
                this.f80526g = z4;
                this.f80527h = z5;
                this.f80528i = z6;
                if (z) {
                    this.f80524e = true;
                    if (this.f80529j != null) {
                        updateCursorAnchorInfo();
                    }
                }
                this.f80523d = z2;
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb rud rudVar, @yfb rud rudVar2) {
        synchronized (this.f80522c) {
            try {
                this.f80529j = zsgVar;
                this.f80531l = nzbVar;
                this.f80530k = hugVar;
                this.f80532m = rudVar;
                this.f80533n = rudVar2;
                if (this.f80524e || this.f80523d) {
                    updateCursorAnchorInfo();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
