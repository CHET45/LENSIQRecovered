package p000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0898a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class rai extends jq8 {

    /* JADX INFO: renamed from: i */
    public static final String f77617i = "ViewOscillator";

    /* JADX INFO: renamed from: rai$a */
    public static class C11974a extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setAlpha(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$b */
    public static class C11975b extends rai {

        /* JADX INFO: renamed from: j */
        public float[] f77618j = new float[1];

        /* JADX INFO: renamed from: k */
        public C0898a f77619k;

        @Override // p000.jq8
        /* JADX INFO: renamed from: a */
        public void mo14234a(Object custom) {
            this.f77619k = (C0898a) custom;
        }

        @Override // p000.rai
        public void setProperty(View view, float t) {
            this.f77618j[0] = get(t);
            md3.setInterpolatedValue(this.f77619k, view, this.f77618j);
        }
    }

    /* JADX INFO: renamed from: rai$c */
    public static class C11976c extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setElevation(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$d */
    public static class C11977d extends rai {
        public void setPathRotate(View view, float t, double dx, double dy) {
            view.setRotation(get(t) + ((float) Math.toDegrees(Math.atan2(dy, dx))));
        }

        @Override // p000.rai
        public void setProperty(View view, float t) {
        }
    }

    /* JADX INFO: renamed from: rai$e */
    public static class C11978e extends rai {

        /* JADX INFO: renamed from: j */
        public boolean f77620j = false;

        @Override // p000.rai
        public void setProperty(View view, float t) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(t));
                return;
            }
            if (this.f77620j) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f77620j = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(get(t)));
                } catch (IllegalAccessException e) {
                    Log.e(rai.f77617i, "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e(rai.f77617i, "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: rai$f */
    public static class C11979f extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setRotation(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$g */
    public static class C11980g extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setRotationX(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$h */
    public static class C11981h extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setRotationY(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$i */
    public static class C11982i extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setScaleX(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$j */
    public static class C11983j extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setScaleY(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$k */
    public static class C11984k extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setTranslationX(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$l */
    public static class C11985l extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setTranslationY(get(t));
        }
    }

    /* JADX INFO: renamed from: rai$m */
    public static class C11986m extends rai {
        @Override // p000.rai
        public void setProperty(View view, float t) {
            view.setTranslationZ(get(t));
        }
    }

    public static rai makeSpline(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C11975b();
        }
        switch (str) {
            case "rotationX":
                return new C11980g();
            case "rotationY":
                return new C11981h();
            case "translationX":
                return new C11984k();
            case "translationY":
                return new C11985l();
            case "translationZ":
                return new C11986m();
            case "progress":
                return new C11978e();
            case "scaleX":
                return new C11982i();
            case "scaleY":
                return new C11983j();
            case "waveVariesBy":
                return new C11974a();
            case "rotation":
                return new C11979f();
            case "elevation":
                return new C11976c();
            case "transitionPathRotate":
                return new C11977d();
            case "alpha":
                return new C11974a();
            case "waveOffset":
                return new C11974a();
            default:
                return null;
        }
    }

    public abstract void setProperty(View view, float t);
}
