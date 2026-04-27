package p000;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public class e97 extends fu0 {

    /* JADX INFO: renamed from: C */
    public static final int f32211C = 32;

    /* JADX INFO: renamed from: A */
    public final nr0<PointF, PointF> f32212A;

    /* JADX INFO: renamed from: B */
    @hib
    public d2i f32213B;

    /* JADX INFO: renamed from: r */
    public final String f32214r;

    /* JADX INFO: renamed from: s */
    public final boolean f32215s;

    /* JADX INFO: renamed from: t */
    public final zl9<LinearGradient> f32216t;

    /* JADX INFO: renamed from: u */
    public final zl9<RadialGradient> f32217u;

    /* JADX INFO: renamed from: v */
    public final RectF f32218v;

    /* JADX INFO: renamed from: w */
    public final g97 f32219w;

    /* JADX INFO: renamed from: x */
    public final int f32220x;

    /* JADX INFO: renamed from: y */
    public final nr0<w87, w87> f32221y;

    /* JADX INFO: renamed from: z */
    public final nr0<PointF, PointF> f32222z;

    public e97(go9 go9Var, pr0 pr0Var, d97 d97Var) {
        super(go9Var, pr0Var, d97Var.getCapType().toPaintCap(), d97Var.getJoinType().toPaintJoin(), d97Var.getMiterLimit(), d97Var.getOpacity(), d97Var.getWidth(), d97Var.getLineDashPattern(), d97Var.getDashOffset());
        this.f32216t = new zl9<>();
        this.f32217u = new zl9<>();
        this.f32218v = new RectF();
        this.f32214r = d97Var.getName();
        this.f32219w = d97Var.getGradientType();
        this.f32215s = d97Var.isHidden();
        this.f32220x = (int) (go9Var.getComposition().getDuration() / 32.0f);
        nr0<w87, w87> nr0VarCreateAnimation = d97Var.getGradientColor().createAnimation();
        this.f32221y = nr0VarCreateAnimation;
        nr0VarCreateAnimation.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation);
        nr0<PointF, PointF> nr0VarCreateAnimation2 = d97Var.getStartPoint().createAnimation();
        this.f32222z = nr0VarCreateAnimation2;
        nr0VarCreateAnimation2.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation2);
        nr0<PointF, PointF> nr0VarCreateAnimation3 = d97Var.getEndPoint().createAnimation();
        this.f32212A = nr0VarCreateAnimation3;
        nr0VarCreateAnimation3.addUpdateListener(this);
        pr0Var.addAnimation(nr0VarCreateAnimation3);
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        d2i d2iVar = this.f32213B;
        if (d2iVar != null) {
            Integer[] numArr = (Integer[]) d2iVar.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int iRound = Math.round(this.f32222z.getProgress() * this.f32220x);
        int iRound2 = Math.round(this.f32212A.getProgress() * this.f32220x);
        int iRound3 = Math.round(this.f32221y.getProgress() * this.f32220x);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private LinearGradient getLinearGradient() {
        long gradientHash = getGradientHash();
        LinearGradient linearGradient = this.f32216t.get(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF value = this.f32222z.getValue();
        PointF value2 = this.f32212A.getValue();
        w87 value3 = this.f32221y.getValue();
        LinearGradient linearGradient2 = new LinearGradient(value.x, value.y, value2.x, value2.y, applyDynamicColorsIfNeeded(value3.getColors()), value3.getPositions(), Shader.TileMode.CLAMP);
        this.f32216t.put(gradientHash, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        long gradientHash = getGradientHash();
        RadialGradient radialGradient = this.f32217u.get(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF value = this.f32222z.getValue();
        PointF value2 = this.f32212A.getValue();
        w87 value3 = this.f32221y.getValue();
        int[] iArrApplyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(value3.getColors());
        float[] positions = value3.getPositions();
        RadialGradient radialGradient2 = new RadialGradient(value.x, value.y, (float) Math.hypot(value2.x - r7, value2.y - r8), iArrApplyDynamicColorsIfNeeded, positions, Shader.TileMode.CLAMP);
        this.f32217u.put(gradientHash, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.fu0, p000.gr8
    public <T> void addValueCallback(T t, @hib bp9<T> bp9Var) {
        super.addValueCallback(t, bp9Var);
        if (t == to9.f85480L) {
            d2i d2iVar = this.f32213B;
            if (d2iVar != null) {
                this.f37740f.removeAnimation(d2iVar);
            }
            if (bp9Var == null) {
                this.f32213B = null;
                return;
            }
            d2i d2iVar2 = new d2i(bp9Var);
            this.f32213B = d2iVar2;
            d2iVar2.addUpdateListener(this);
            this.f37740f.addAnimation(this.f32213B);
        }
    }

    @Override // p000.fu0, p000.yq4
    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (this.f32215s) {
            return;
        }
        getBounds(this.f32218v, matrix, false);
        Shader linearGradient = this.f32219w == g97.LINEAR ? getLinearGradient() : getRadialGradient();
        linearGradient.setLocalMatrix(matrix);
        this.f37743i.setShader(linearGradient);
        super.draw(canvas, matrix, i);
    }

    @Override // p000.gv2
    public String getName() {
        return this.f32214r;
    }
}
