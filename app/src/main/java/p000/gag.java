package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class gag extends fu0 {

    /* JADX INFO: renamed from: r */
    public final pr0 f39150r;

    /* JADX INFO: renamed from: s */
    public final String f39151s;

    /* JADX INFO: renamed from: t */
    public final boolean f39152t;

    /* JADX INFO: renamed from: u */
    public final nr0<Integer, Integer> f39153u;

    /* JADX INFO: renamed from: v */
    @hib
    public nr0<ColorFilter, ColorFilter> f39154v;

    public gag(go9 go9Var, pr0 pr0Var, e9f e9fVar) {
        super(go9Var, pr0Var, e9fVar.getCapType().toPaintCap(), e9fVar.getJoinType().toPaintJoin(), e9fVar.getMiterLimit(), e9fVar.getOpacity(), e9fVar.getWidth(), e9fVar.getLineDashPattern(), e9fVar.getDashOffset());
        this.f39150r = pr0Var;
        this.f39151s = e9fVar.getName();
        this.f39152t = e9fVar.isHidden();
        nr0<Integer, Integer> nr0VarCreateAnimation = e9fVar.getColor().createAnimation();
        this.f39153u = nr0VarCreateAnimation;
        nr0VarCreateAnimation.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation);
    }

    @Override // p000.fu0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85485b) {
            this.f39153u.setValueCallback(bp9Var);
            return;
        }
        if (t == to9.f85479K) {
            nr0<ColorFilter, ColorFilter> nr0Var = this.f39154v;
            if (nr0Var != null) {
                this.f39150r.removeAnimation(nr0Var);
            }
            if (bp9Var == null) {
                this.f39154v = null;
                return;
            }
            d2i d2iVar = new d2i(bp9Var);
            this.f39154v = d2iVar;
            d2iVar.addUpdateListener(this);
            this.f39150r.addAnimation(this.f39153u);
        }
    }

    @Override // p000.fu0, p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f39152t) {
            return;
        }
        this.f37743i.setColor(((h92) this.f39153u).getIntValue());
        nr0<ColorFilter, ColorFilter> nr0Var = this.f39154v;
        if (nr0Var != null) {
            this.f37743i.setColorFilter(nr0Var.getValue());
        }
        super.draw(canvas, matrix, i);
    }

    @Override // p000.gv2
    public String getName() {
        return this.f39151s;
    }
}
