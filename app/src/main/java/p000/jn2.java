package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.tu8;

/* JADX INFO: loaded from: classes3.dex */
public class jn2 extends pr0 {

    /* JADX INFO: renamed from: H */
    @hib
    public nr0<Float, Float> f51272H;

    /* JADX INFO: renamed from: I */
    public final List<pr0> f51273I;

    /* JADX INFO: renamed from: J */
    public final RectF f51274J;

    /* JADX INFO: renamed from: K */
    public final RectF f51275K;

    /* JADX INFO: renamed from: L */
    public final Paint f51276L;

    /* JADX INFO: renamed from: M */
    @hib
    public Boolean f51277M;

    /* JADX INFO: renamed from: N */
    @hib
    public Boolean f51278N;

    /* JADX INFO: renamed from: O */
    public boolean f51279O;

    /* JADX INFO: renamed from: jn2$a */
    public static /* synthetic */ class C7986a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51280a;

        static {
            int[] iArr = new int[tu8.EnumC13244b.values().length];
            f51280a = iArr;
            try {
                iArr[tu8.EnumC13244b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51280a[tu8.EnumC13244b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public jn2(go9 go9Var, tu8 tu8Var, List<tu8> list, bn9 bn9Var) {
        int i;
        pr0 pr0Var;
        super(go9Var, tu8Var);
        this.f51273I = new ArrayList();
        this.f51274J = new RectF();
        this.f51275K = new RectF();
        this.f51276L = new Paint();
        this.f51279O = true;
        C15326xw c15326xwM22868q = tu8Var.m22868q();
        if (c15326xwM22868q != null) {
            nr0<Float, Float> nr0VarCreateAnimation = c15326xwM22868q.createAnimation();
            this.f51272H = nr0VarCreateAnimation;
            addAnimation(nr0VarCreateAnimation);
            this.f51272H.addUpdateListener(this);
        } else {
            this.f51272H = null;
        }
        zl9 zl9Var = new zl9(bn9Var.getLayers().size());
        int size = list.size() - 1;
        pr0 pr0Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            tu8 tu8Var2 = list.get(size);
            pr0 pr0VarM19703b = pr0.m19703b(this, tu8Var2, go9Var, bn9Var);
            if (pr0VarM19703b != null) {
                zl9Var.put(pr0VarM19703b.m19704c().getId(), pr0VarM19703b);
                if (pr0Var2 != null) {
                    pr0Var2.m19707g(pr0VarM19703b);
                    pr0Var2 = null;
                } else {
                    this.f51273I.add(0, pr0VarM19703b);
                    int i2 = C7986a.f51280a[tu8Var2.m22855d().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        pr0Var2 = pr0VarM19703b;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < zl9Var.size(); i++) {
            pr0 pr0Var3 = (pr0) zl9Var.get(zl9Var.keyAt(i));
            if (pr0Var3 != null && (pr0Var = (pr0) zl9Var.get(pr0Var3.m19704c().m22857f())) != null) {
                pr0Var3.m19708h(pr0Var);
            }
        }
    }

    @Override // p000.pr0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85473E) {
            if (bp9Var == null) {
                nr0<Float, Float> nr0Var = this.f51272H;
                if (nr0Var != null) {
                    nr0Var.setValueCallback(null);
                    return;
                }
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f51272H = d2iVar;
            d2iVar.addUpdateListener(this);
            addAnimation(this.f51272H);
        }
    }

    @Override // p000.pr0
    public void drawLayer(Canvas canvas, Matrix matrix, int i) {
        bt8.beginSection("CompositionLayer#draw");
        this.f51275K.set(0.0f, 0.0f, this.f71714q.m22859h(), this.f71714q.m22858g());
        matrix.mapRect(this.f51275K);
        boolean z = this.f71713p.isApplyingOpacityToLayersEnabled() && this.f51273I.size() > 1 && i != 255;
        if (z) {
            this.f51276L.setAlpha(i);
            e1i.saveLayerCompat(canvas, this.f51275K, this.f51276L);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f51273I.size() - 1; size >= 0; size--) {
            if (((this.f51279O || !"__container".equals(this.f71714q.m22856e())) && !this.f51275K.isEmpty()) ? canvas.clipRect(this.f51275K) : true) {
                this.f51273I.get(size).draw(canvas, matrix, i);
            }
        }
        canvas.restore();
        bt8.endSection("CompositionLayer#draw");
    }

    @Override // p000.pr0
    /* JADX INFO: renamed from: f */
    public void mo14185f(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        for (int i2 = 0; i2 < this.f51273I.size(); i2++) {
            this.f51273I.get(i2).resolveKeyPath(fr8Var, i, list, fr8Var2);
        }
    }

    @Override // p000.pr0, p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.f51273I.size() - 1; size >= 0; size--) {
            this.f51274J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f51273I.get(size).getBounds(this.f51274J, this.f71712o, true);
            rectF.union(this.f51274J);
        }
    }

    public boolean hasMasks() {
        if (this.f51278N == null) {
            for (int size = this.f51273I.size() - 1; size >= 0; size--) {
                pr0 pr0Var = this.f51273I.get(size);
                if (pr0Var instanceof y8f) {
                    if (pr0Var.m19705d()) {
                        this.f51278N = Boolean.TRUE;
                        return true;
                    }
                } else if ((pr0Var instanceof jn2) && ((jn2) pr0Var).hasMasks()) {
                    this.f51278N = Boolean.TRUE;
                    return true;
                }
            }
            this.f51278N = Boolean.FALSE;
        }
        return this.f51278N.booleanValue();
    }

    public boolean hasMatte() {
        if (this.f51277M == null) {
            if (m19706e()) {
                this.f51277M = Boolean.TRUE;
                return true;
            }
            for (int size = this.f51273I.size() - 1; size >= 0; size--) {
                if (this.f51273I.get(size).m19706e()) {
                    this.f51277M = Boolean.TRUE;
                    return true;
                }
            }
            this.f51277M = Boolean.FALSE;
        }
        return this.f51277M.booleanValue();
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f51279O = z;
    }

    @Override // p000.pr0
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        Iterator<pr0> it = this.f51273I.iterator();
        while (it.hasNext()) {
            it.next().setOutlineMasksAndMattes(z);
        }
    }

    @Override // p000.pr0
    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        super.setProgress(f);
        if (this.f51272H != null) {
            f = ((this.f51272H.getValue().floatValue() * this.f71714q.m22852a().getFrameRate()) - this.f71714q.m22852a().getStartFrame()) / (this.f71713p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.f51272H == null) {
            f -= this.f71714q.m22865n();
        }
        if (this.f71714q.m22869r() != 0.0f && !"__container".equals(this.f71714q.m22856e())) {
            f /= this.f71714q.m22869r();
        }
        for (int size = this.f51273I.size() - 1; size >= 0; size--) {
            this.f51273I.get(size).setProgress(f);
        }
    }
}
