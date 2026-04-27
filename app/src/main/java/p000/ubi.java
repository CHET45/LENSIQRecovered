package p000;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0898a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class ubi extends zzg {

    /* JADX INFO: renamed from: p */
    public static final String f87459p = "ViewTimeCycle";

    /* JADX INFO: renamed from: ubi$a */
    public static class C13465a extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setAlpha(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$b */
    public static class C13466b extends ubi {

        /* JADX INFO: renamed from: q */
        public String f87460q;

        /* JADX INFO: renamed from: r */
        public SparseArray<C0898a> f87461r;

        /* JADX INFO: renamed from: s */
        public SparseArray<float[]> f87462s = new SparseArray<>();

        /* JADX INFO: renamed from: t */
        public float[] f87463t;

        /* JADX INFO: renamed from: u */
        public float[] f87464u;

        public C13466b(String attribute, SparseArray<C0898a> attrList) {
            this.f87460q = attribute.split(",")[1];
            this.f87461r = attrList;
        }

        @Override // p000.zzg
        public void setPoint(int position, float value, float period, int shape, float offset) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            this.f106630a.getPos(t, this.f87463t);
            float[] fArr = this.f87463t;
            float f = fArr[fArr.length - 2];
            float f2 = fArr[fArr.length - 1];
            long j = time - this.f106638i;
            if (Float.isNaN(this.f106639j)) {
                float floatValue = cache.getFloatValue(view, this.f87460q, 0);
                this.f106639j = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.f106639j = 0.0f;
                }
            }
            float f3 = (float) ((((double) this.f106639j) + ((j * 1.0E-9d) * ((double) f))) % 1.0d);
            this.f106639j = f3;
            this.f106638i = time;
            float fM27162a = m27162a(f3);
            this.f106637h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f87464u;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f106637h;
                float f4 = this.f87463t[i];
                this.f106637h = z | (((double) f4) != 0.0d);
                fArr2[i] = (f4 * fM27162a) + f2;
                i++;
            }
            md3.setInterpolatedValue(this.f87461r.valueAt(0), view, this.f87464u);
            if (f != 0.0f) {
                this.f106637h = true;
            }
            return this.f106637h;
        }

        @Override // p000.zzg
        public void setup(int curveType) {
            int size = this.f87461r.size();
            int iNumberOfInterpolatedValues = this.f87461r.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i = iNumberOfInterpolatedValues + 2;
            this.f87463t = new float[i];
            this.f87464u = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = this.f87461r.keyAt(i2);
                C0898a c0898aValueAt = this.f87461r.valueAt(i2);
                float[] fArrValueAt = this.f87462s.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                c0898aValueAt.getValuesToInterpolate(this.f87463t);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f87463t.length) {
                        dArr2[i2][i3] = r8[i3];
                        i3++;
                    }
                }
                double[] dArr3 = dArr2[i2];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.f106630a = db3.get(curveType, dArr, dArr2);
        }

        public void setPoint(int position, C0898a value, float period, int shape, float offset) {
            this.f87461r.append(position, value);
            this.f87462s.append(position, new float[]{period, offset});
            this.f106631b = Math.max(this.f106631b, shape);
        }
    }

    /* JADX INFO: renamed from: ubi$c */
    public static class C13467c extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setElevation(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$d */
    public static class C13468d extends ubi {
        public boolean setPathRotate(View view, gq8 cache, float t, long time, double dx, double dy) {
            view.setRotation(get(t, time, view, cache) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
            return this.f106637h;
        }

        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$e */
    public static class C13469e extends ubi {

        /* JADX INFO: renamed from: q */
        public boolean f87465q = false;

        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(t, time, view, cache));
            } else {
                if (this.f87465q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f87465q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(get(t, time, view, cache)));
                    } catch (IllegalAccessException e) {
                        Log.e(ubi.f87459p, "unable to setProgress", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(ubi.f87459p, "unable to setProgress", e2);
                    }
                }
            }
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$f */
    public static class C13470f extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setRotation(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$g */
    public static class C13471g extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setRotationX(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$h */
    public static class C13472h extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setRotationY(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$i */
    public static class C13473i extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setScaleX(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$j */
    public static class C13474j extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setScaleY(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$k */
    public static class C13475k extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setTranslationX(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$l */
    public static class C13476l extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setTranslationY(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    /* JADX INFO: renamed from: ubi$m */
    public static class C13477m extends ubi {
        @Override // p000.ubi
        public boolean setProperty(View view, float t, long time, gq8 cache) {
            view.setTranslationZ(get(t, time, view, cache));
            return this.f106637h;
        }
    }

    public static ubi makeCustomSpline(String str, SparseArray<C0898a> attrList) {
        return new C13466b(str, attrList);
    }

    public static ubi makeSpline(String str, long currentTime) {
        ubi c13471g;
        str.hashCode();
        switch (str) {
            case "rotationX":
                c13471g = new C13471g();
                break;
            case "rotationY":
                c13471g = new C13472h();
                break;
            case "translationX":
                c13471g = new C13475k();
                break;
            case "translationY":
                c13471g = new C13476l();
                break;
            case "translationZ":
                c13471g = new C13477m();
                break;
            case "progress":
                c13471g = new C13469e();
                break;
            case "scaleX":
                c13471g = new C13473i();
                break;
            case "scaleY":
                c13471g = new C13474j();
                break;
            case "rotation":
                c13471g = new C13470f();
                break;
            case "elevation":
                c13471g = new C13467c();
                break;
            case "transitionPathRotate":
                c13471g = new C13468d();
                break;
            case "alpha":
                c13471g = new C13465a();
                break;
            default:
                return null;
        }
        c13471g.m27163b(currentTime);
        return c13471g;
    }

    public float get(float pos, long time, View view, gq8 cache) {
        this.f106630a.getPos(pos, this.f106636g);
        float[] fArr = this.f106636g;
        float f = fArr[1];
        if (f == 0.0f) {
            this.f106637h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f106639j)) {
            float floatValue = cache.getFloatValue(view, this.f106635f, 0);
            this.f106639j = floatValue;
            if (Float.isNaN(floatValue)) {
                this.f106639j = 0.0f;
            }
        }
        float f2 = (float) ((((double) this.f106639j) + (((time - this.f106638i) * 1.0E-9d) * ((double) f))) % 1.0d);
        this.f106639j = f2;
        cache.setFloatValue(view, this.f106635f, 0, f2);
        this.f106638i = time;
        float f3 = this.f106636g[0];
        float fM27162a = (m27162a(this.f106639j) * f3) + this.f106636g[2];
        this.f106637h = (f3 == 0.0f && f == 0.0f) ? false : true;
        return fM27162a;
    }

    public abstract boolean setProperty(View view, float t, long time, gq8 cache);
}
