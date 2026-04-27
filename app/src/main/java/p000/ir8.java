package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0897R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ir8 extends jr8 {

    /* JADX INFO: renamed from: R */
    public static final String f48045R = "KeyPosition";

    /* JADX INFO: renamed from: S */
    public static final String f48046S = "KeyPosition";

    /* JADX INFO: renamed from: T */
    public static final int f48047T = 2;

    /* JADX INFO: renamed from: U */
    public static final int f48048U = 1;

    /* JADX INFO: renamed from: V */
    public static final int f48049V = 0;

    /* JADX INFO: renamed from: W */
    public static final String f48050W = "transitionEasing";

    /* JADX INFO: renamed from: X */
    public static final String f48051X = "drawPath";

    /* JADX INFO: renamed from: Y */
    public static final String f48052Y = "percentWidth";

    /* JADX INFO: renamed from: Z */
    public static final String f48053Z = "percentHeight";

    /* JADX INFO: renamed from: a0 */
    public static final String f48054a0 = "sizePercent";

    /* JADX INFO: renamed from: b0 */
    public static final String f48055b0 = "percentX";

    /* JADX INFO: renamed from: c0 */
    public static final String f48056c0 = "percentY";

    /* JADX INFO: renamed from: d0 */
    public static final int f48057d0 = 2;

    /* JADX INFO: renamed from: F */
    public String f48058F = null;

    /* JADX INFO: renamed from: G */
    public int f48059G = dq8.f30366f;

    /* JADX INFO: renamed from: H */
    public int f48060H = 0;

    /* JADX INFO: renamed from: I */
    public float f48061I = Float.NaN;

    /* JADX INFO: renamed from: J */
    public float f48062J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f48063K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f48064L = Float.NaN;

    /* JADX INFO: renamed from: M */
    public float f48065M = Float.NaN;

    /* JADX INFO: renamed from: N */
    public float f48066N = Float.NaN;

    /* JADX INFO: renamed from: O */
    public int f48067O = 0;

    /* JADX INFO: renamed from: P */
    public float f48068P = Float.NaN;

    /* JADX INFO: renamed from: Q */
    public float f48069Q = Float.NaN;

    /* JADX INFO: renamed from: ir8$a */
    public static class C7574a {

        /* JADX INFO: renamed from: a */
        public static final int f48070a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f48071b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f48072c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f48073d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f48074e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f48075f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f48076g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f48077h = 8;

        /* JADX INFO: renamed from: i */
        public static final int f48078i = 9;

        /* JADX INFO: renamed from: j */
        public static final int f48079j = 10;

        /* JADX INFO: renamed from: k */
        public static final int f48080k = 11;

        /* JADX INFO: renamed from: l */
        public static final int f48081l = 12;

        /* JADX INFO: renamed from: m */
        public static SparseIntArray f48082m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f48082m = sparseIntArray;
            sparseIntArray.append(C0897R.styleable.KeyPosition_motionTarget, 1);
            f48082m.append(C0897R.styleable.KeyPosition_framePosition, 2);
            f48082m.append(C0897R.styleable.KeyPosition_transitionEasing, 3);
            f48082m.append(C0897R.styleable.KeyPosition_curveFit, 4);
            f48082m.append(C0897R.styleable.KeyPosition_drawPath, 5);
            f48082m.append(C0897R.styleable.KeyPosition_percentX, 6);
            f48082m.append(C0897R.styleable.KeyPosition_percentY, 7);
            f48082m.append(C0897R.styleable.KeyPosition_keyPositionType, 9);
            f48082m.append(C0897R.styleable.KeyPosition_sizePercent, 8);
            f48082m.append(C0897R.styleable.KeyPosition_percentWidth, 11);
            f48082m.append(C0897R.styleable.KeyPosition_percentHeight, 12);
            f48082m.append(C0897R.styleable.KeyPosition_pathMotionArc, 10);
        }

        private C7574a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(ir8 c, TypedArray a) {
            int indexCount = a.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = a.getIndex(i);
                switch (f48082m.get(index)) {
                    case 1:
                        if (MotionLayout.f6116c4) {
                            int resourceId = a.getResourceId(index, c.f30388b);
                            c.f30388b = resourceId;
                            if (resourceId == -1) {
                                c.f30389c = a.getString(index);
                            }
                        } else if (a.peekValue(index).type == 3) {
                            c.f30389c = a.getString(index);
                        } else {
                            c.f30388b = a.getResourceId(index, c.f30388b);
                        }
                        break;
                    case 2:
                        c.f30387a = a.getInt(index, c.f30387a);
                        break;
                    case 3:
                        if (a.peekValue(index).type == 3) {
                            c.f48058F = a.getString(index);
                        } else {
                            c.f48058F = gv4.f41449o[a.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        c.f51604D = a.getInteger(index, c.f51604D);
                        break;
                    case 5:
                        c.f48060H = a.getInt(index, c.f48060H);
                        break;
                    case 6:
                        c.f48063K = a.getFloat(index, c.f48063K);
                        break;
                    case 7:
                        c.f48064L = a.getFloat(index, c.f48064L);
                        break;
                    case 8:
                        float f = a.getFloat(index, c.f48062J);
                        c.f48061I = f;
                        c.f48062J = f;
                        break;
                    case 9:
                        c.f48067O = a.getInt(index, c.f48067O);
                        break;
                    case 10:
                        c.f48059G = a.getInt(index, c.f48059G);
                        break;
                    case 11:
                        c.f48061I = a.getFloat(index, c.f48061I);
                        break;
                    case 12:
                        c.f48062J = a.getFloat(index, c.f48062J);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + d99.f28832c + f48082m.get(index));
                        break;
                }
            }
            if (c.f30387a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public ir8() {
        this.f30390d = 2;
    }

    private void calcCartesianPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = Float.isNaN(this.f48063K) ? 0.0f : this.f48063K;
        float f4 = Float.isNaN(this.f48066N) ? 0.0f : this.f48066N;
        float f5 = Float.isNaN(this.f48064L) ? 0.0f : this.f48064L;
        this.f48068P = (int) (start_x + (f3 * f) + ((Float.isNaN(this.f48065M) ? 0.0f : this.f48065M) * f2));
        this.f48069Q = (int) (start_y + (f * f4) + (f2 * f5));
    }

    private void calcPathPosition(float start_x, float start_y, float end_x, float end_y) {
        float f = end_x - start_x;
        float f2 = end_y - start_y;
        float f3 = this.f48063K;
        float f4 = this.f48064L;
        this.f48068P = start_x + (f * f3) + ((-f2) * f4);
        this.f48069Q = start_y + (f2 * f3) + (f * f4);
    }

    private void calcScreenPosition(int layoutWidth, int layoutHeight) {
        float f = this.f48063K;
        float f2 = 0;
        this.f48068P = (layoutWidth * f) + f2;
        this.f48069Q = (layoutHeight * f) + f2;
    }

    @Override // p000.dq8
    public void addValues(HashMap<String, mbi> splines) {
    }

    @Override // p000.dq8
    public dq8 copy(dq8 src) {
        super.copy(src);
        ir8 ir8Var = (ir8) src;
        this.f48058F = ir8Var.f48058F;
        this.f48059G = ir8Var.f48059G;
        this.f48060H = ir8Var.f48060H;
        this.f48061I = ir8Var.f48061I;
        this.f48062J = Float.NaN;
        this.f48063K = ir8Var.f48063K;
        this.f48064L = ir8Var.f48064L;
        this.f48065M = ir8Var.f48065M;
        this.f48066N = ir8Var.f48066N;
        this.f48068P = ir8Var.f48068P;
        this.f48069Q = ir8Var.f48069Q;
        return this;
    }

    @Override // p000.jr8
    /* JADX INFO: renamed from: e */
    public void mo13347e(int layoutWidth, int layoutHeight, float start_x, float start_y, float end_x, float end_y) {
        int i = this.f48067O;
        if (i == 1) {
            calcPathPosition(start_x, start_y, end_x, end_y);
        } else if (i != 2) {
            calcCartesianPosition(start_x, start_y, end_x, end_y);
        } else {
            calcScreenPosition(layoutWidth, layoutHeight);
        }
    }

    @Override // p000.jr8
    /* JADX INFO: renamed from: f */
    public float mo13348f() {
        return this.f48068P;
    }

    @Override // p000.jr8
    /* JADX INFO: renamed from: g */
    public float mo13349g() {
        return this.f48069Q;
    }

    /* JADX INFO: renamed from: h */
    public void m13350h(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = (x - fCenterX) / fCenterX2;
            attribute[1] = "percentY";
            value[1] = (y - fCenterY) / fCenterY2;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = (x - fCenterX) / fCenterX2;
            value[1] = (y - fCenterY) / fCenterY2;
        } else {
            value[1] = (x - fCenterX) / fCenterX2;
            value[0] = (y - fCenterY) / fCenterY2;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13351i(RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        float fCenterX = start.centerX();
        float fCenterY = start.centerY();
        float fCenterX2 = end.centerX() - fCenterX;
        float fCenterY2 = end.centerY() - fCenterY;
        float fHypot = (float) Math.hypot(fCenterX2, fCenterY2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            value[0] = 0.0f;
            value[1] = 0.0f;
            return;
        }
        float f = fCenterX2 / fHypot;
        float f2 = fCenterY2 / fHypot;
        float f3 = y - fCenterY;
        float f4 = x - fCenterX;
        float f5 = ((f * f3) - (f4 * f2)) / fHypot;
        float f6 = ((f * f4) + (f2 * f3)) / fHypot;
        String str = attribute[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                value[0] = f6;
                value[1] = f5;
                return;
            }
            return;
        }
        attribute[0] = "percentX";
        attribute[1] = "percentY";
        value[0] = f6;
        value[1] = f5;
    }

    @Override // p000.jr8
    public boolean intersects(int layoutWidth, int layoutHeight, RectF start, RectF end, float x, float y) {
        mo13347e(layoutWidth, layoutHeight, start.centerX(), start.centerY(), end.centerX(), end.centerY());
        return Math.abs(x - this.f48068P) < 20.0f && Math.abs(y - this.f48069Q) < 20.0f;
    }

    /* JADX INFO: renamed from: j */
    public void m13352j(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        start.centerX();
        start.centerY();
        end.centerX();
        end.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = attribute[0];
        if (str == null) {
            attribute[0] = "percentX";
            value[0] = x / width;
            attribute[1] = "percentY";
            value[1] = y / height;
            return;
        }
        if ("percentX".equals(str)) {
            value[0] = x / width;
            value[1] = y / height;
        } else {
            value[1] = x / width;
            value[0] = y / height;
        }
    }

    @Override // p000.dq8
    public void load(Context context, AttributeSet attrs) {
        C7574a.read(this, context.obtainStyledAttributes(attrs, C0897R.styleable.KeyPosition));
    }

    @Override // p000.jr8
    public void positionAttributes(View view, RectF start, RectF end, float x, float y, String[] attribute, float[] value) {
        int i = this.f48067O;
        if (i == 1) {
            m13351i(start, end, x, y, attribute, value);
        } else if (i != 2) {
            m13350h(start, end, x, y, attribute, value);
        } else {
            m13352j(view, start, end, x, y, attribute, value);
        }
    }

    public void setType(int type) {
        this.f48067O = type;
    }

    @Override // p000.dq8
    public void setValue(String tag, Object value) {
        tag.hashCode();
        switch (tag) {
            case "transitionEasing":
                this.f48058F = value.toString();
                break;
            case "percentWidth":
                this.f48061I = m9298c(value);
                break;
            case "percentHeight":
                this.f48062J = m9298c(value);
                break;
            case "drawPath":
                this.f48060H = m9299d(value);
                break;
            case "sizePercent":
                float fM9298c = m9298c(value);
                this.f48061I = fM9298c;
                this.f48062J = fM9298c;
                break;
            case "percentX":
                this.f48063K = m9298c(value);
                break;
            case "percentY":
                this.f48064L = m9298c(value);
                break;
        }
    }

    @Override // p000.dq8
    /* JADX INFO: renamed from: clone */
    public dq8 mo28677clone() {
        return new ir8().copy(this);
    }
}
