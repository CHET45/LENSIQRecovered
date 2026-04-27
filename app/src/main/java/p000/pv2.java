package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class pv2 implements yq4, yic, nr0.InterfaceC10013b, gr8 {

    /* JADX INFO: renamed from: a */
    public final Paint f72192a;

    /* JADX INFO: renamed from: b */
    public final RectF f72193b;

    /* JADX INFO: renamed from: c */
    public final Matrix f72194c;

    /* JADX INFO: renamed from: d */
    public final Path f72195d;

    /* JADX INFO: renamed from: e */
    public final RectF f72196e;

    /* JADX INFO: renamed from: f */
    public final String f72197f;

    /* JADX INFO: renamed from: g */
    public final boolean f72198g;

    /* JADX INFO: renamed from: h */
    public final List<gv2> f72199h;

    /* JADX INFO: renamed from: i */
    public final go9 f72200i;

    /* JADX INFO: renamed from: j */
    @hib
    public List<yic> f72201j;

    /* JADX INFO: renamed from: k */
    @hib
    public wdh f72202k;

    public pv2(go9 go9Var, pr0 pr0Var, v8f v8fVar) {
        this(go9Var, pr0Var, v8fVar.getName(), v8fVar.isHidden(), contentsFromModels(go9Var, pr0Var, v8fVar.getItems()), m19792a(v8fVar.getItems()));
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static C8540kx m19792a(List<sw2> list) {
        for (int i = 0; i < list.size(); i++) {
            sw2 sw2Var = list.get(i);
            if (sw2Var instanceof C8540kx) {
                return (C8540kx) sw2Var;
            }
        }
        return null;
    }

    private static List<gv2> contentsFromModels(go9 go9Var, pr0 pr0Var, List<sw2> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            gv2 content = list.get(i).toContent(go9Var, pr0Var);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    private boolean hasTwoOrMoreDrawableContent() {
        int i = 0;
        for (int i2 = 0; i2 < this.f72199h.size(); i2++) {
            if ((this.f72199h.get(i2) instanceof yq4) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        wdh wdhVar = this.f72202k;
        if (wdhVar != null) {
            wdhVar.applyValueCallback(t, bp9Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<yic> m19793b() {
        if (this.f72201j == null) {
            this.f72201j = new ArrayList();
            for (int i = 0; i < this.f72199h.size(); i++) {
                gv2 gv2Var = this.f72199h.get(i);
                if (gv2Var instanceof yic) {
                    this.f72201j.add((yic) gv2Var);
                }
            }
        }
        return this.f72201j;
    }

    /* JADX INFO: renamed from: c */
    public Matrix m19794c() {
        wdh wdhVar = this.f72202k;
        if (wdhVar != null) {
            return wdhVar.getMatrix();
        }
        this.f72194c.reset();
        return this.f72194c;
    }

    @Override // p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f72198g) {
            return;
        }
        this.f72194c.set(matrix);
        wdh wdhVar = this.f72202k;
        if (wdhVar != null) {
            this.f72194c.preConcat(wdhVar.getMatrix());
            i = (int) (((((this.f72202k.getOpacity() == null ? 100 : this.f72202k.getOpacity().getValue().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f72200i.isApplyingOpacityToLayersEnabled() && hasTwoOrMoreDrawableContent() && i != 255;
        if (z) {
            this.f72193b.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.f72193b, this.f72194c, true);
            this.f72192a.setAlpha(i);
            e1i.saveLayerCompat(canvas, this.f72193b, this.f72192a);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f72199h.size() - 1; size >= 0; size--) {
            gv2 gv2Var = this.f72199h.get(size);
            if (gv2Var instanceof yq4) {
                ((yq4) gv2Var).draw(canvas, this.f72194c, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f72194c.set(matrix);
        wdh wdhVar = this.f72202k;
        if (wdhVar != null) {
            this.f72194c.preConcat(wdhVar.getMatrix());
        }
        this.f72196e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f72199h.size() - 1; size >= 0; size--) {
            gv2 gv2Var = this.f72199h.get(size);
            if (gv2Var instanceof yq4) {
                ((yq4) gv2Var).getBounds(this.f72196e, this.f72194c, z);
                rectF.union(this.f72196e);
            }
        }
    }

    @Override // p000.gv2
    public String getName() {
        return this.f72197f;
    }

    @Override // p000.yic
    public Path getPath() {
        this.f72194c.reset();
        wdh wdhVar = this.f72202k;
        if (wdhVar != null) {
            this.f72194c.set(wdhVar.getMatrix());
        }
        this.f72195d.reset();
        if (this.f72198g) {
            return this.f72195d;
        }
        for (int size = this.f72199h.size() - 1; size >= 0; size--) {
            gv2 gv2Var = this.f72199h.get(size);
            if (gv2Var instanceof yic) {
                this.f72195d.addPath(((yic) gv2Var).getPath(), this.f72194c);
            }
        }
        return this.f72195d;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f72200i.invalidateSelf();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        if (fr8Var.matches(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                fr8Var2 = fr8Var2.addKey(getName());
                if (fr8Var.fullyResolvesTo(getName(), i)) {
                    list.add(fr8Var2.resolve(this));
                }
            }
            if (fr8Var.propagateToChildren(getName(), i)) {
                int iIncrementDepthBy = i + fr8Var.incrementDepthBy(getName(), i);
                for (int i2 = 0; i2 < this.f72199h.size(); i2++) {
                    gv2 gv2Var = this.f72199h.get(i2);
                    if (gv2Var instanceof gr8) {
                        ((gr8) gv2Var).resolveKeyPath(fr8Var, iIncrementDepthBy, list, fr8Var2);
                    }
                }
            }
        }
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f72199h.size());
        arrayList.addAll(list);
        for (int size = this.f72199h.size() - 1; size >= 0; size--) {
            gv2 gv2Var = this.f72199h.get(size);
            gv2Var.setContents(arrayList, this.f72199h.subList(0, size));
            arrayList.add(gv2Var);
        }
    }

    public pv2(go9 go9Var, pr0 pr0Var, String str, boolean z, List<gv2> list, @hib C8540kx c8540kx) {
        this.f72192a = new it8();
        this.f72193b = new RectF();
        this.f72194c = new Matrix();
        this.f72195d = new Path();
        this.f72196e = new RectF();
        this.f72197f = str;
        this.f72200i = go9Var;
        this.f72198g = z;
        this.f72199h = list;
        if (c8540kx != null) {
            wdh wdhVarCreateAnimation = c8540kx.createAnimation();
            this.f72202k = wdhVarCreateAnimation;
            wdhVarCreateAnimation.addAnimationsToLayer(pr0Var);
            this.f72202k.addListener(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            gv2 gv2Var = list.get(size);
            if (gv2Var instanceof fb7) {
                arrayList.add((fb7) gv2Var);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((fb7) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }
}
