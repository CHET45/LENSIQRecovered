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
public abstract class mbi extends wyf {

    /* JADX INFO: renamed from: g */
    public static final String f60511g = "ViewSpline";

    /* JADX INFO: renamed from: mbi$a */
    public static class C9263a extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setAlpha(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$b */
    public static class C9264b extends mbi {

        /* JADX INFO: renamed from: h */
        public String f60512h;

        /* JADX INFO: renamed from: i */
        public SparseArray<C0898a> f60513i;

        /* JADX INFO: renamed from: j */
        public float[] f60514j;

        public C9264b(String attribute, SparseArray<C0898a> attrList) {
            this.f60512h = attribute.split(",")[1];
            this.f60513i = attrList;
        }

        @Override // p000.wyf
        public void setPoint(int position, float value) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p000.mbi
        public void setProperty(View view, float t) {
            this.f95797a.getPos(t, this.f60514j);
            md3.setInterpolatedValue(this.f60513i.valueAt(0), view, this.f60514j);
        }

        @Override // p000.wyf
        public void setup(int curveType) {
            int size = this.f60513i.size();
            int iNumberOfInterpolatedValues = this.f60513i.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f60514j = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f60513i.keyAt(i);
                C0898a c0898aValueAt = this.f60513i.valueAt(i);
                dArr[i] = ((double) iKeyAt) * 0.01d;
                c0898aValueAt.getValuesToInterpolate(this.f60514j);
                int i2 = 0;
                while (true) {
                    if (i2 < this.f60514j.length) {
                        dArr2[i][i2] = r6[i2];
                        i2++;
                    }
                }
            }
            this.f95797a = db3.get(curveType, dArr, dArr2);
        }

        public void setPoint(int position, C0898a value) {
            this.f60513i.append(position, value);
        }
    }

    /* JADX INFO: renamed from: mbi$c */
    public static class C9265c extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setElevation(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$d */
    public static class C9266d extends mbi {
        public void setPathRotate(View view, float t, double dx, double dy) {
            view.setRotation(get(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // p000.mbi
        public void setProperty(View view, float t) {
        }
    }

    /* JADX INFO: renamed from: mbi$e */
    public static class C9267e extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setPivotX(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$f */
    public static class C9268f extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setPivotY(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$g */
    public static class C9269g extends mbi {

        /* JADX INFO: renamed from: h */
        public boolean f60515h = false;

        @Override // p000.mbi
        public void setProperty(View view, float t) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(t));
                return;
            }
            if (this.f60515h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f60515h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(t)));
                } catch (IllegalAccessException e) {
                    Log.e(mbi.f60511g, "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e(mbi.f60511g, "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: mbi$h */
    public static class C9270h extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setRotation(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$i */
    public static class C9271i extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setRotationX(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$j */
    public static class C9272j extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setRotationY(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$k */
    public static class C9273k extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setScaleX(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$l */
    public static class C9274l extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setScaleY(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$m */
    public static class C9275m extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setTranslationX(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$n */
    public static class C9276n extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setTranslationY(get(t));
        }
    }

    /* JADX INFO: renamed from: mbi$o */
    public static class C9277o extends mbi {
        @Override // p000.mbi
        public void setProperty(View view, float t) {
            view.setTranslationZ(get(t));
        }
    }

    public static mbi makeCustomSpline(String str, SparseArray<C0898a> attrList) {
        return new C9264b(str, attrList);
    }

    public static mbi makeSpline(String str) {
        str.hashCode();
        switch (str) {
        }
        return new C9263a();
    }

    public abstract void setProperty(View view, float t);
}
