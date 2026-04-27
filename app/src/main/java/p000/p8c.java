package p000;

import android.graphics.Outline;
import android.os.Build;
import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,325:1\n1#2:326\n26#3:327\n26#3:328\n26#3:329\n26#3:330\n26#3:331\n26#3:332\n26#3:333\n26#3:334\n38#4,5:335\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n267#1:327\n268#1:328\n269#1:329\n270#1:330\n280#1:331\n281#1:332\n282#1:333\n283#1:334\n299#1:335,5\n*E\n"})
@e0g(parameters = 0)
public final class p8c {

    /* JADX INFO: renamed from: p */
    public static final int f69998p = 8;

    /* JADX INFO: renamed from: a */
    public boolean f69999a = true;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Outline f70000b;

    /* JADX INFO: renamed from: c */
    @gib
    public n8c f70001c;

    /* JADX INFO: renamed from: d */
    @gib
    public vic f70002d;

    /* JADX INFO: renamed from: e */
    @gib
    public vic f70003e;

    /* JADX INFO: renamed from: f */
    public boolean f70004f;

    /* JADX INFO: renamed from: g */
    public boolean f70005g;

    /* JADX INFO: renamed from: h */
    @gib
    public vic f70006h;

    /* JADX INFO: renamed from: i */
    @gib
    public mbe f70007i;

    /* JADX INFO: renamed from: j */
    public float f70008j;

    /* JADX INFO: renamed from: k */
    public long f70009k;

    /* JADX INFO: renamed from: l */
    public long f70010l;

    /* JADX INFO: renamed from: m */
    public boolean f70011m;

    /* JADX INFO: renamed from: n */
    @gib
    public vic f70012n;

    /* JADX INFO: renamed from: o */
    @gib
    public vic f70013o;

    public p8c() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f70000b = outline;
        this.f70009k = izb.f49009b.m30445getZeroF1C5BW0();
        this.f70010l = wpf.f95046b.m33078getZeroNHjbRc();
    }

    /* JADX INFO: renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m31732isSameBounds4L21HEs(mbe mbeVar, long j, long j2, float f) {
        return mbeVar != null && pbe.isSimple(mbeVar) && mbeVar.getLeft() == izb.m30429getXimpl(j) && mbeVar.getTop() == izb.m30430getYimpl(j) && mbeVar.getRight() == izb.m30429getXimpl(j) + wpf.m33069getWidthimpl(j2) && mbeVar.getBottom() == izb.m30430getYimpl(j) + wpf.m33066getHeightimpl(j2) && u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs()) == f;
    }

    private final void updateCache() {
        if (this.f70004f) {
            this.f70009k = izb.f49009b.m30445getZeroF1C5BW0();
            this.f70008j = 0.0f;
            this.f70003e = null;
            this.f70004f = false;
            this.f70005g = false;
            n8c n8cVar = this.f70001c;
            if (n8cVar == null || !this.f70011m || wpf.m33069getWidthimpl(this.f70010l) <= 0.0f || wpf.m33066getHeightimpl(this.f70010l) <= 0.0f) {
                this.f70000b.setEmpty();
                return;
            }
            this.f69999a = true;
            if (n8cVar instanceof n8c.C9742b) {
                updateCacheWithRect(((n8c.C9742b) n8cVar).getRect());
            } else if (n8cVar instanceof n8c.C9743c) {
                updateCacheWithRoundRect(((n8c.C9743c) n8cVar).getRoundRect());
            } else if (n8cVar instanceof n8c.C9741a) {
                updateCacheWithPath(((n8c.C9741a) n8cVar).getPath());
            }
        }
    }

    private final void updateCacheWithPath(vic vicVar) {
        if (Build.VERSION.SDK_INT > 28 || vicVar.isConvex()) {
            Outline outline = this.f70000b;
            if (!(vicVar instanceof C4947du)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C4947du) vicVar).getInternalPath());
            this.f70005g = !this.f70000b.canClip();
        } else {
            this.f69999a = false;
            this.f70000b.setEmpty();
            this.f70005g = true;
        }
        this.f70003e = vicVar;
    }

    private final void updateCacheWithRect(rud rudVar) {
        this.f70009k = mzb.Offset(rudVar.getLeft(), rudVar.getTop());
        this.f70010l = eqf.Size(rudVar.getWidth(), rudVar.getHeight());
        this.f70000b.setRect(Math.round(rudVar.getLeft()), Math.round(rudVar.getTop()), Math.round(rudVar.getRight()), Math.round(rudVar.getBottom()));
    }

    private final void updateCacheWithRoundRect(mbe mbeVar) {
        float fM32492getXimpl = u03.m32492getXimpl(mbeVar.m30993getTopLeftCornerRadiuskKHJgLs());
        this.f70009k = mzb.Offset(mbeVar.getLeft(), mbeVar.getTop());
        this.f70010l = eqf.Size(mbeVar.getWidth(), mbeVar.getHeight());
        if (pbe.isSimple(mbeVar)) {
            this.f70000b.setRoundRect(Math.round(mbeVar.getLeft()), Math.round(mbeVar.getTop()), Math.round(mbeVar.getRight()), Math.round(mbeVar.getBottom()), fM32492getXimpl);
            this.f70008j = fM32492getXimpl;
            return;
        }
        vic vicVarPath = this.f70002d;
        if (vicVarPath == null) {
            vicVarPath = C8522ku.Path();
            this.f70002d = vicVarPath;
        }
        vicVarPath.reset();
        vic.addRoundRect$default(vicVarPath, mbeVar, null, 2, null);
        updateCacheWithPath(vicVarPath);
    }

    public final void clipToOutline(@yfb vq1 vq1Var) {
        vic clipPath = getClipPath();
        if (clipPath != null) {
            vq1.m32779clipPathmtrdDE$default(vq1Var, clipPath, 0, 2, null);
            return;
        }
        float f = this.f70008j;
        if (f <= 0.0f) {
            vq1.m32780clipRectN_I0leg$default(vq1Var, izb.m30429getXimpl(this.f70009k), izb.m30430getYimpl(this.f70009k), izb.m30429getXimpl(this.f70009k) + wpf.m33069getWidthimpl(this.f70010l), izb.m30430getYimpl(this.f70009k) + wpf.m33066getHeightimpl(this.f70010l), 0, 16, null);
            return;
        }
        vic vicVarPath = this.f70006h;
        mbe mbeVar = this.f70007i;
        if (vicVarPath == null || !m31732isSameBounds4L21HEs(mbeVar, this.f70009k, this.f70010l, f)) {
            mbe mbeVarM31775RoundRectgG7oq9Y = pbe.m31775RoundRectgG7oq9Y(izb.m30429getXimpl(this.f70009k), izb.m30430getYimpl(this.f70009k), izb.m30429getXimpl(this.f70009k) + wpf.m33069getWidthimpl(this.f70010l), izb.m30430getYimpl(this.f70009k) + wpf.m33066getHeightimpl(this.f70010l), v03.CornerRadius$default(this.f70008j, 0.0f, 2, null));
            if (vicVarPath == null) {
                vicVarPath = C8522ku.Path();
            } else {
                vicVarPath.reset();
            }
            vic.addRoundRect$default(vicVarPath, mbeVarM31775RoundRectgG7oq9Y, null, 2, null);
            this.f70007i = mbeVarM31775RoundRectgG7oq9Y;
            this.f70006h = vicVarPath;
        }
        vq1.m32779clipPathmtrdDE$default(vq1Var, vicVarPath, 0, 2, null);
    }

    @gib
    public final Outline getAndroidOutline() {
        updateCache();
        if (this.f70011m && this.f69999a) {
            return this.f70000b;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.f70004f;
    }

    @gib
    public final vic getClipPath() {
        updateCache();
        return this.f70003e;
    }

    public final boolean getOutlineClipSupported() {
        return !this.f70005g;
    }

    /* JADX INFO: renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m31733isInOutlinek4lQ0M(long j) {
        n8c n8cVar;
        if (this.f70011m && (n8cVar = this.f70001c) != null) {
            return p8f.isInOutline(n8cVar, izb.m30429getXimpl(j), izb.m30430getYimpl(j), this.f70012n, this.f70013o);
        }
        return true;
    }

    /* JADX INFO: renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m31734updateS_szKao(@gib n8c n8cVar, float f, boolean z, float f2, long j) {
        this.f70000b.setAlpha(f);
        boolean zAreEqual = md8.areEqual(this.f70001c, n8cVar);
        boolean z2 = !zAreEqual;
        if (!zAreEqual) {
            this.f70001c = n8cVar;
            this.f70004f = true;
        }
        this.f70010l = j;
        boolean z3 = n8cVar != null && (z || f2 > 0.0f);
        if (this.f70011m != z3) {
            this.f70011m = z3;
            this.f70004f = true;
        }
        return z2;
    }
}
