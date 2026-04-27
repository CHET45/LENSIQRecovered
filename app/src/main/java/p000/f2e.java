package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p000.nr0;

/* JADX INFO: loaded from: classes3.dex */
public class f2e implements yq4, yic, fb7, nr0.InterfaceC10013b, hr8 {

    /* JADX INFO: renamed from: a */
    public final Matrix f34880a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Path f34881b = new Path();

    /* JADX INFO: renamed from: c */
    public final go9 f34882c;

    /* JADX INFO: renamed from: d */
    public final pr0 f34883d;

    /* JADX INFO: renamed from: e */
    public final String f34884e;

    /* JADX INFO: renamed from: f */
    public final boolean f34885f;

    /* JADX INFO: renamed from: g */
    public final nr0<Float, Float> f34886g;

    /* JADX INFO: renamed from: h */
    public final nr0<Float, Float> f34887h;

    /* JADX INFO: renamed from: i */
    public final wdh f34888i;

    /* JADX INFO: renamed from: j */
    public pv2 f34889j;

    public f2e(go9 go9Var, pr0 pr0Var, e2e e2eVar) {
        this.f34882c = go9Var;
        this.f34883d = pr0Var;
        this.f34884e = e2eVar.getName();
        this.f34885f = e2eVar.isHidden();
        nr0<Float, Float> nr0VarCreateAnimation = e2eVar.getCopies().createAnimation();
        this.f34886g = nr0VarCreateAnimation;
        pr0Var.addAnimation(nr0VarCreateAnimation);
        nr0VarCreateAnimation.addUpdateListener(this);
        nr0<Float, Float> nr0VarCreateAnimation2 = e2eVar.getOffset().createAnimation();
        this.f34887h = nr0VarCreateAnimation2;
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0VarCreateAnimation2.addUpdateListener(this);
        wdh wdhVarCreateAnimation = e2eVar.getTransform().createAnimation();
        this.f34888i = wdhVarCreateAnimation;
        wdhVarCreateAnimation.addAnimationsToLayer(pr0Var);
        wdhVarCreateAnimation.addListener(this);
    }

    @Override // p000.fb7
    public void absorbContent(ListIterator<gv2> listIterator) {
        if (this.f34889j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f34889j = new pv2(this.f34882c, this.f34883d, "Repeater", this.f34885f, arrayList, null);
    }

    @Override // p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        if (this.f34888i.applyValueCallback(t, bp9Var)) {
            return;
        }
        if (t == to9.f85504u) {
            this.f34886g.setValueCallback(bp9Var);
        } else if (t == to9.f85505v) {
            this.f34887h.setValueCallback(bp9Var);
        }
    }

    @Override // p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.f34886g.getValue().floatValue();
        float fFloatValue2 = this.f34887h.getValue().floatValue();
        float fFloatValue3 = this.f34888i.getStartOpacity().getValue().floatValue() / 100.0f;
        float fFloatValue4 = this.f34888i.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.f34880a.set(matrix);
            float f = i2;
            this.f34880a.preConcat(this.f34888i.getMatrixForRepeater(f + fFloatValue2));
            this.f34889j.draw(canvas, this.f34880a, (int) (i * awa.lerp(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // p000.yq4
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f34889j.getBounds(rectF, matrix, z);
    }

    @Override // p000.gv2
    public String getName() {
        return this.f34884e;
    }

    @Override // p000.yic
    public Path getPath() {
        Path path = this.f34889j.getPath();
        this.f34881b.reset();
        float fFloatValue = this.f34886g.getValue().floatValue();
        float fFloatValue2 = this.f34887h.getValue().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.f34880a.set(this.f34888i.getMatrixForRepeater(i + fFloatValue2));
            this.f34881b.addPath(path, this.f34880a);
        }
        return this.f34881b;
    }

    @Override // p000.nr0.InterfaceC10013b
    public void onValueChanged() {
        this.f34882c.invalidateSelf();
    }

    @Override // p000.gr8
    public void resolveKeyPath(fr8 fr8Var, int i, List<fr8> list, fr8 fr8Var2) {
        awa.resolveKeyPath(fr8Var, i, list, fr8Var2, this);
    }

    @Override // p000.gv2
    public void setContents(List<gv2> list, List<gv2> list2) {
        this.f34889j.setContents(list, list2);
    }
}
