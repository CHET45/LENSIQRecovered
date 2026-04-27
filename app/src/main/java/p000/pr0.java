package p000;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.ev9;
import p000.nr0;
import p000.tu8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pr0 implements yq4, nr0.InterfaceC10013b, gr8 {

    /* JADX INFO: renamed from: D */
    public static final int f71691D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f71692E = 16;

    /* JADX INFO: renamed from: F */
    public static final int f71693F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f71694G = 19;

    /* JADX INFO: renamed from: A */
    @hib
    public Paint f71695A;

    /* JADX INFO: renamed from: B */
    public float f71696B;

    /* JADX INFO: renamed from: C */
    @hib
    public BlurMaskFilter f71697C;

    /* JADX INFO: renamed from: a */
    public final Path f71698a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f71699b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final Matrix f71700c = new Matrix();

    /* JADX INFO: renamed from: d */
    public final Paint f71701d = new it8(1);

    /* JADX INFO: renamed from: e */
    public final Paint f71702e;

    /* JADX INFO: renamed from: f */
    public final Paint f71703f;

    /* JADX INFO: renamed from: g */
    public final Paint f71704g;

    /* JADX INFO: renamed from: h */
    public final Paint f71705h;

    /* JADX INFO: renamed from: i */
    public final RectF f71706i;

    /* JADX INFO: renamed from: j */
    public final RectF f71707j;

    /* JADX INFO: renamed from: k */
    public final RectF f71708k;

    /* JADX INFO: renamed from: l */
    public final RectF f71709l;

    /* JADX INFO: renamed from: m */
    public final RectF f71710m;

    /* JADX INFO: renamed from: n */
    public final String f71711n;

    /* JADX INFO: renamed from: o */
    public final Matrix f71712o;

    /* JADX INFO: renamed from: p */
    public final go9 f71713p;

    /* JADX INFO: renamed from: q */
    public final tu8 f71714q;

    /* JADX INFO: renamed from: r */
    @hib
    public iv9 f71715r;

    /* JADX INFO: renamed from: s */
    @hib
    public n46 f71716s;

    /* JADX INFO: renamed from: t */
    @hib
    public pr0 f71717t;

    /* JADX INFO: renamed from: u */
    @hib
    public pr0 f71718u;

    /* JADX INFO: renamed from: v */
    public List<pr0> f71719v;

    /* JADX INFO: renamed from: w */
    public final List<nr0<?, ?>> f71720w;

    /* JADX INFO: renamed from: x */
    public final wdh f71721x;

    /* JADX INFO: renamed from: y */
    public boolean f71722y;

    /* JADX INFO: renamed from: z */
    public boolean f71723z;

    /* JADX INFO: renamed from: pr0$a */
    public static /* synthetic */ class C11076a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f71724a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f71725b;

        static {
            int[] iArr = new int[ev9.EnumC5478a.values().length];
            f71725b = iArr;
            try {
                iArr[ev9.EnumC5478a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71725b[ev9.EnumC5478a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71725b[ev9.EnumC5478a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71725b[ev9.EnumC5478a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[tu8.EnumC13243a.values().length];
            f71724a = iArr2;
            try {
                iArr2[tu8.EnumC13243a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71724a[tu8.EnumC13243a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71724a[tu8.EnumC13243a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71724a[tu8.EnumC13243a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71724a[tu8.EnumC13243a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f71724a[tu8.EnumC13243a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f71724a[tu8.EnumC13243a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public pr0(go9 go9Var, tu8 tu8Var) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f71702e = new it8(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f71703f = new it8(1, mode2);
        it8 it8Var = new it8(1);
        this.f71704g = it8Var;
        this.f71705h = new it8(PorterDuff.Mode.CLEAR);
        this.f71706i = new RectF();
        this.f71707j = new RectF();
        this.f71708k = new RectF();
        this.f71709l = new RectF();
        this.f71710m = new RectF();
        this.f71712o = new Matrix();
        this.f71720w = new ArrayList();
        this.f71722y = true;
        this.f71696B = 0.0f;
        this.f71713p = go9Var;
        this.f71714q = tu8Var;
        this.f71711n = tu8Var.m22856e() + "#draw";
        if (tu8Var.m22855d() == tu8.EnumC13244b.INVERT) {
            it8Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            it8Var.setXfermode(new PorterDuffXfermode(mode));
        }
        wdh wdhVarCreateAnimation = tu8Var.m22870s().createAnimation();
        this.f71721x = wdhVarCreateAnimation;
        wdhVarCreateAnimation.addListener(this);
        if (tu8Var.m22854c() != null && !tu8Var.m22854c().isEmpty()) {
            iv9 iv9Var = new iv9(tu8Var.m22854c());
            this.f71715r = iv9Var;
            Iterator<nr0<r8f, Path>> it = iv9Var.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (nr0<Integer, Integer> nr0Var : this.f71715r.getOpacityAnimations()) {
                addAnimation(nr0Var);
                nr0Var.addUpdateListener(this);
            }
        }
        setupInOutAnimations();
    }

    private void applyAddMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var, nr0<Integer, Integer> nr0Var2) {
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        this.f71701d.setAlpha((int) (nr0Var2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.f71698a, this.f71701d);
    }

    private void applyIntersectMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var, nr0<Integer, Integer> nr0Var2) {
        e1i.saveLayerCompat(canvas, this.f71706i, this.f71702e);
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        this.f71701d.setAlpha((int) (nr0Var2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.f71698a, this.f71701d);
        canvas.restore();
    }

    private void applyInvertedAddMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var, nr0<Integer, Integer> nr0Var2) {
        e1i.saveLayerCompat(canvas, this.f71706i, this.f71701d);
        canvas.drawRect(this.f71706i, this.f71701d);
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        this.f71701d.setAlpha((int) (nr0Var2.getValue().intValue() * 2.55f));
        canvas.drawPath(this.f71698a, this.f71703f);
        canvas.restore();
    }

    private void applyInvertedIntersectMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var, nr0<Integer, Integer> nr0Var2) {
        e1i.saveLayerCompat(canvas, this.f71706i, this.f71702e);
        canvas.drawRect(this.f71706i, this.f71701d);
        this.f71703f.setAlpha((int) (nr0Var2.getValue().intValue() * 2.55f));
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        canvas.drawPath(this.f71698a, this.f71703f);
        canvas.restore();
    }

    private void applyInvertedSubtractMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var, nr0<Integer, Integer> nr0Var2) {
        e1i.saveLayerCompat(canvas, this.f71706i, this.f71703f);
        canvas.drawRect(this.f71706i, this.f71701d);
        this.f71703f.setAlpha((int) (nr0Var2.getValue().intValue() * 2.55f));
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        canvas.drawPath(this.f71698a, this.f71703f);
        canvas.restore();
    }

    private void applyMasks(Canvas canvas, Matrix matrix) {
        bt8.beginSection("Layer#saveLayer");
        e1i.saveLayerCompat(canvas, this.f71706i, this.f71702e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            clearCanvas(canvas);
        }
        bt8.endSection("Layer#saveLayer");
        for (int i = 0; i < this.f71715r.getMasks().size(); i++) {
            ev9 ev9Var = this.f71715r.getMasks().get(i);
            nr0<r8f, Path> nr0Var = this.f71715r.getMaskAnimations().get(i);
            nr0<Integer, Integer> nr0Var2 = this.f71715r.getOpacityAnimations().get(i);
            int i2 = C11076a.f71725b[ev9Var.getMaskMode().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f71701d.setColor(-16777216);
                        this.f71701d.setAlpha(255);
                        canvas.drawRect(this.f71706i, this.f71701d);
                    }
                    if (ev9Var.isInverted()) {
                        applyInvertedSubtractMask(canvas, matrix, nr0Var, nr0Var2);
                    } else {
                        applySubtractMask(canvas, matrix, nr0Var);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (ev9Var.isInverted()) {
                            applyInvertedAddMask(canvas, matrix, nr0Var, nr0Var2);
                        } else {
                            applyAddMask(canvas, matrix, nr0Var, nr0Var2);
                        }
                    }
                } else if (ev9Var.isInverted()) {
                    applyInvertedIntersectMask(canvas, matrix, nr0Var, nr0Var2);
                } else {
                    applyIntersectMask(canvas, matrix, nr0Var, nr0Var2);
                }
            } else if (areAllMasksNone()) {
                this.f71701d.setAlpha(255);
                canvas.drawRect(this.f71706i, this.f71701d);
            }
        }
        bt8.beginSection("Layer#restoreLayer");
        canvas.restore();
        bt8.endSection("Layer#restoreLayer");
    }

    private void applySubtractMask(Canvas canvas, Matrix matrix, nr0<r8f, Path> nr0Var) {
        this.f71698a.set(nr0Var.getValue());
        this.f71698a.transform(matrix);
        canvas.drawPath(this.f71698a, this.f71703f);
    }

    private boolean areAllMasksNone() {
        if (this.f71715r.getMaskAnimations().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f71715r.getMasks().size(); i++) {
            if (this.f71715r.getMasks().get(i).getMaskMode() != ev9.EnumC5478a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    @hib
    /* JADX INFO: renamed from: b */
    public static pr0 m19703b(jn2 jn2Var, tu8 tu8Var, go9 go9Var, bn9 bn9Var) {
        switch (C11076a.f71724a[tu8Var.getLayerType().ordinal()]) {
            case 1:
                return new y8f(go9Var, tu8Var, jn2Var);
            case 2:
                return new jn2(go9Var, tu8Var, bn9Var.getPrecomps(tu8Var.m22860i()), bn9Var);
            case 3:
                return new cvf(go9Var, tu8Var);
            case 4:
                return new mv7(go9Var, tu8Var);
            case 5:
                return new yhb(go9Var, tu8Var);
            case 6:
                return new bug(go9Var, tu8Var);
            default:
                dj9.warning("Unknown layer type " + tu8Var.getLayerType());
                return null;
        }
    }

    private void buildParentLayerListIfNeeded() {
        if (this.f71719v != null) {
            return;
        }
        if (this.f71718u == null) {
            this.f71719v = Collections.emptyList();
            return;
        }
        this.f71719v = new ArrayList();
        for (pr0 pr0Var = this.f71718u; pr0Var != null; pr0Var = pr0Var.f71718u) {
            this.f71719v.add(pr0Var);
        }
    }

    private void clearCanvas(Canvas canvas) {
        bt8.beginSection("Layer#clearLayer");
        RectF rectF = this.f71706i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f71705h);
        bt8.endSection("Layer#clearLayer");
    }

    private void intersectBoundsWithMask(RectF rectF, Matrix matrix) {
        this.f71708k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m19705d()) {
            int size = this.f71715r.getMasks().size();
            for (int i = 0; i < size; i++) {
                ev9 ev9Var = this.f71715r.getMasks().get(i);
                Path value = this.f71715r.getMaskAnimations().get(i).getValue();
                if (value != null) {
                    this.f71698a.set(value);
                    this.f71698a.transform(matrix);
                    int i2 = C11076a.f71725b[ev9Var.getMaskMode().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && ev9Var.isInverted()) {
                        return;
                    }
                    this.f71698a.computeBounds(this.f71710m, false);
                    if (i == 0) {
                        this.f71708k.set(this.f71710m);
                    } else {
                        RectF rectF2 = this.f71708k;
                        rectF2.set(Math.min(rectF2.left, this.f71710m.left), Math.min(this.f71708k.top, this.f71710m.top), Math.max(this.f71708k.right, this.f71710m.right), Math.max(this.f71708k.bottom, this.f71710m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f71708k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void intersectBoundsWithMatte(RectF rectF, Matrix matrix) {
        if (m19706e() && this.f71714q.m22855d() != tu8.EnumC13244b.INVERT) {
            this.f71709l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f71717t.getBounds(this.f71709l, matrix, true);
            if (rectF.intersect(this.f71709l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void invalidateSelf() {
        this.f71713p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupInOutAnimations$0() {
        setVisible(this.f71716s.getFloatValue() == 1.0f);
    }

    private void recordRenderTime(float f) {
        this.f71713p.getComposition().getPerformanceTracker().recordRenderTime(this.f71714q.m22856e(), f);
    }

    private void setVisible(boolean z) {
        if (z != this.f71722y) {
            this.f71722y = z;
            invalidateSelf();
        }
    }

    private void setupInOutAnimations() {
        if (this.f71714q.m22853b().isEmpty()) {
            setVisible(true);
            return;
        }
        n46 n46Var = new n46(this.f71714q.m22853b());
        this.f71716s = n46Var;
        n46Var.setIsDiscrete();
        this.f71716s.addUpdateListener(new nr0.InterfaceC10013b() { // from class: or0
            @Override // p000.nr0.InterfaceC10013b
            public final void onValueChanged() {
                this.f68364a.lambda$setupInOutAnimations$0();
            }
        });
        setVisible(this.f71716s.getValue().floatValue() == 1.0f);
        addAnimation(this.f71716s);
    }

    public void addAnimation(@hib nr0<?, ?> nr0Var) {
        if (nr0Var == null) {
            return;
        }
        this.f71720w.add(nr0Var);
    }

    @un1
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        this.f71721x.applyValueCallback(t, bp9Var);
    }

    /* JADX INFO: renamed from: c */
    public tu8 m19704c() {
        return this.f71714q;
    }

    /* JADX INFO: renamed from: d */
    public boolean m19705d() {
        iv9 iv9Var = this.f71715r;
        return (iv9Var == null || iv9Var.getMaskAnimations().isEmpty()) ? false : true;
    }

    @Override // p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        bt8.beginSection(this.f71711n);
        if (!this.f71722y || this.f71714q.isHidden()) {
            bt8.endSection(this.f71711n);
            return;
        }
        buildParentLayerListIfNeeded();
        bt8.beginSection("Layer#parentMatrix");
        this.f71699b.reset();
        this.f71699b.set(matrix);
        for (int size = this.f71719v.size() - 1; size >= 0; size--) {
            this.f71699b.preConcat(this.f71719v.get(size).f71721x.getMatrix());
        }
        bt8.endSection("Layer#parentMatrix");
        int iIntValue = (int) ((((i / 255.0f) * (this.f71721x.getOpacity() == null ? 100 : this.f71721x.getOpacity().getValue().intValue())) / 100.0f) * 255.0f);
        if (!m19706e() && !m19705d()) {
            this.f71699b.preConcat(this.f71721x.getMatrix());
            bt8.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.f71699b, iIntValue);
            bt8.endSection("Layer#drawLayer");
            recordRenderTime(bt8.endSection(this.f71711n));
            return;
        }
        bt8.beginSection("Layer#computeBounds");
        getBounds(this.f71706i, this.f71699b, false);
        intersectBoundsWithMatte(this.f71706i, matrix);
        this.f71699b.preConcat(this.f71721x.getMatrix());
        intersectBoundsWithMask(this.f71706i, this.f71699b);
        this.f71707j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f71700c);
        if (!this.f71700c.isIdentity()) {
            Matrix matrix2 = this.f71700c;
            matrix2.invert(matrix2);
            this.f71700c.mapRect(this.f71707j);
        }
        if (!this.f71706i.intersect(this.f71707j)) {
            this.f71706i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        bt8.endSection("Layer#computeBounds");
        if (this.f71706i.width() >= 1.0f && this.f71706i.height() >= 1.0f) {
            bt8.beginSection("Layer#saveLayer");
            this.f71701d.setAlpha(255);
            e1i.saveLayerCompat(canvas, this.f71706i, this.f71701d);
            bt8.endSection("Layer#saveLayer");
            clearCanvas(canvas);
            bt8.beginSection("Layer#drawLayer");
            drawLayer(canvas, this.f71699b, iIntValue);
            bt8.endSection("Layer#drawLayer");
            if (m19705d()) {
                applyMasks(canvas, this.f71699b);
            }
            if (m19706e()) {
                bt8.beginSection("Layer#drawMatte");
                bt8.beginSection("Layer#saveLayer");
                e1i.saveLayerCompat(canvas, this.f71706i, this.f71704g, 19);
                bt8.endSection("Layer#saveLayer");
                clearCanvas(canvas);
                this.f71717t.draw(canvas, matrix, iIntValue);
                bt8.beginSection("Layer#restoreLayer");
                canvas.restore();
                bt8.endSection("Layer#restoreLayer");
                bt8.endSection("Layer#drawMatte");
            }
            bt8.beginSection("Layer#restoreLayer");
            canvas.restore();
            bt8.endSection("Layer#restoreLayer");
        }
        if (this.f71723z && (paint = this.f71695A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f71695A.setColor(-251901);
            this.f71695A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f71706i, this.f71695A);
            this.f71695A.setStyle(Paint.Style.FILL);
            this.f71695A.setColor(1357638635);
            canvas.drawRect(this.f71706i, this.f71695A);
        }
        recordRenderTime(bt8.endSection(this.f71711n));
    }

    public abstract void drawLayer(Canvas canvas, Matrix matrix, int i);

    /* JADX INFO: renamed from: e */
    public boolean m19706e() {
        return this.f71717t != null;
    }

    /* JADX INFO: renamed from: f */
    public void mo14185f(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
    }

    /* JADX INFO: renamed from: g */
    public void m19707g(@hib pr0 pr0Var) {
        this.f71717t = pr0Var;
    }

    @hib
    public w91 getBlurEffect() {
        return this.f71714q.getBlurEffect();
    }

    public BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.f71696B == f) {
            return this.f71697C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f71697C = blurMaskFilter;
        this.f71696B = f;
        return blurMaskFilter;
    }

    @Override // p000.yq4
    @un1
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f71706i.set(0.0f, 0.0f, 0.0f, 0.0f);
        buildParentLayerListIfNeeded();
        this.f71712o.set(matrix);
        if (z) {
            List<pr0> list = this.f71719v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f71712o.preConcat(this.f71719v.get(size).f71721x.getMatrix());
                }
            } else {
                pr0 pr0Var = this.f71718u;
                if (pr0Var != null) {
                    this.f71712o.preConcat(pr0Var.f71721x.getMatrix());
                }
            }
        }
        this.f71712o.preConcat(this.f71721x.getMatrix());
    }

    @hib
    public wr4 getDropShadowEffect() {
        return this.f71714q.getDropShadowEffect();
    }

    @Override // p000.gv2
    public String getName() {
        return this.f71714q.m22856e();
    }

    /* JADX INFO: renamed from: h */
    public void m19708h(@hib pr0 pr0Var) {
        this.f71718u = pr0Var;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        invalidateSelf();
    }

    public void removeAnimation(nr0<?, ?> nr0Var) {
        this.f71720w.remove(nr0Var);
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        pr0 pr0Var = this.f71717t;
        if (pr0Var != null) {
            fr8 fr8VarAddKey = fr8Var2.addKey(pr0Var.getName());
            if (fr8Var.fullyResolvesTo(this.f71717t.getName(), i)) {
                list.add(fr8VarAddKey.resolve(this.f71717t));
            }
            if (fr8Var.propagateToChildren(getName(), i)) {
                this.f71717t.mo14185f(fr8Var, fr8Var.incrementDepthBy(this.f71717t.getName(), i) + i, list, fr8VarAddKey);
            }
        }
        if (fr8Var.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                fr8Var2 = fr8Var2.addKey(getName());
                if (fr8Var.fullyResolvesTo(getName(), i)) {
                    list.add(fr8Var2.resolve(this));
                }
            }
            if (fr8Var.propagateToChildren(getName(), i)) {
                mo14185f(fr8Var, i + fr8Var.incrementDepthBy(getName(), i), list, fr8Var2);
            }
        }
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (z && this.f71695A == null) {
            this.f71695A = new it8();
        }
        this.f71723z = z;
    }

    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f71721x.setProgress(f);
        if (this.f71715r != null) {
            for (int i = 0; i < this.f71715r.getMaskAnimations().size(); i++) {
                this.f71715r.getMaskAnimations().get(i).setProgress(f);
            }
        }
        n46 n46Var = this.f71716s;
        if (n46Var != null) {
            n46Var.setProgress(f);
        }
        pr0 pr0Var = this.f71717t;
        if (pr0Var != null) {
            pr0Var.setProgress(f);
        }
        for (int i2 = 0; i2 < this.f71720w.size(); i2++) {
            this.f71720w.get(i2).setProgress(f);
        }
    }
}
