package p000;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public final class ua3 {

    /* JADX INFO: renamed from: s */
    public static final int f87258s = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final b5d f87259a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final u38 f87260b;

    /* JADX INFO: renamed from: d */
    public boolean f87262d;

    /* JADX INFO: renamed from: e */
    public boolean f87263e;

    /* JADX INFO: renamed from: f */
    public boolean f87264f;

    /* JADX INFO: renamed from: g */
    public boolean f87265g;

    /* JADX INFO: renamed from: h */
    public boolean f87266h;

    /* JADX INFO: renamed from: i */
    public boolean f87267i;

    /* JADX INFO: renamed from: j */
    @gib
    public zsg f87268j;

    /* JADX INFO: renamed from: k */
    @gib
    public hug f87269k;

    /* JADX INFO: renamed from: l */
    @gib
    public nzb f87270l;

    /* JADX INFO: renamed from: n */
    @gib
    public rud f87272n;

    /* JADX INFO: renamed from: o */
    @gib
    public rud f87273o;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f87261c = new Object();

    /* JADX INFO: renamed from: m */
    @yfb
    public qy6<? super x3a, bth> f87271m = C13428b.f87278a;

    /* JADX INFO: renamed from: p */
    @yfb
    public final CursorAnchorInfo.Builder f87274p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    @yfb
    public final float[] f87275q = x3a.m33183constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: r */
    @yfb
    public final Matrix f87276r = new Matrix();

    /* JADX INFO: renamed from: ua3$a */
    public static final class C13427a extends tt8 implements qy6<x3a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13427a f87277a = new C13427a();

        public C13427a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(x3a x3aVar) {
            m32583invoke58bKbWc(x3aVar.m33204unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m32583invoke58bKbWc(@yfb float[] fArr) {
        }
    }

    /* JADX INFO: renamed from: ua3$b */
    public static final class C13428b extends tt8 implements qy6<x3a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C13428b f87278a = new C13428b();

        public C13428b() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(x3a x3aVar) {
            m32584invoke58bKbWc(x3aVar.m33204unboximpl());
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m32584invoke58bKbWc(@yfb float[] fArr) {
        }
    }

    public ua3(@yfb b5d b5dVar, @yfb u38 u38Var) {
        this.f87259a = b5dVar;
        this.f87260b = u38Var;
    }

    private final void updateCursorAnchorInfo() {
        if (this.f87260b.isActive()) {
            this.f87271m.invoke(x3a.m33181boximpl(this.f87275q));
            this.f87259a.mo27742localToScreen58bKbWc(this.f87275q);
            C12773st.m32333setFromEL8BTi8(this.f87276r, this.f87275q);
            u38 u38Var = this.f87260b;
            CursorAnchorInfo.Builder builder = this.f87274p;
            zsg zsgVar = this.f87268j;
            md8.checkNotNull(zsgVar);
            nzb nzbVar = this.f87270l;
            md8.checkNotNull(nzbVar);
            hug hugVar = this.f87269k;
            md8.checkNotNull(hugVar);
            Matrix matrix = this.f87276r;
            rud rudVar = this.f87272n;
            md8.checkNotNull(rudVar);
            rud rudVar2 = this.f87273o;
            md8.checkNotNull(rudVar2);
            u38Var.updateCursorAnchorInfo(sa3.build(builder, zsgVar, nzbVar, hugVar, matrix, rudVar, rudVar2, this.f87264f, this.f87265g, this.f87266h, this.f87267i));
            this.f87263e = false;
        }
    }

    public final void invalidate() {
        synchronized (this.f87261c) {
            this.f87268j = null;
            this.f87270l = null;
            this.f87269k = null;
            this.f87271m = C13427a.f87277a;
            this.f87272n = null;
            this.f87273o = null;
            bth bthVar = bth.f14751a;
        }
    }

    public final void requestUpdate(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        synchronized (this.f87261c) {
            try {
                this.f87264f = z3;
                this.f87265g = z4;
                this.f87266h = z5;
                this.f87267i = z6;
                if (z) {
                    this.f87263e = true;
                    if (this.f87268j != null) {
                        updateCursorAnchorInfo();
                    }
                }
                this.f87262d = z2;
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void updateTextLayoutResult(@yfb zsg zsgVar, @yfb nzb nzbVar, @yfb hug hugVar, @yfb qy6<? super x3a, bth> qy6Var, @yfb rud rudVar, @yfb rud rudVar2) {
        synchronized (this.f87261c) {
            try {
                this.f87268j = zsgVar;
                this.f87270l = nzbVar;
                this.f87269k = hugVar;
                this.f87271m = qy6Var;
                this.f87272n = rudVar;
                this.f87273o = rudVar2;
                if (this.f87263e || this.f87262d) {
                    updateCursorAnchorInfo();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
