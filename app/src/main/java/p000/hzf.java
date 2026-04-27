package p000;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import p000.xt4;

/* JADX INFO: loaded from: classes3.dex */
public final class hzf extends xt4<hzf> {

    /* JADX INFO: renamed from: J */
    public static final float f45305J = Float.MAX_VALUE;

    /* JADX INFO: renamed from: G */
    public jzf f45306G;

    /* JADX INFO: renamed from: H */
    public float f45307H;

    /* JADX INFO: renamed from: I */
    public boolean f45308I;

    public hzf(k56 k56Var) {
        super(k56Var);
        this.f45306G = null;
        this.f45307H = Float.MAX_VALUE;
        this.f45308I = false;
    }

    private void sanityCheck() {
        jzf jzfVar = this.f45306G;
        if (jzfVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = jzfVar.getFinalPosition();
        if (finalPosition > this.f99214g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.f99215h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: a */
    public float mo12675a(float f, float f2) {
        return this.f45306G.getAcceleration(f, f2);
    }

    public void animateToFinalPosition(float f) {
        if (isRunning()) {
            this.f45307H = f;
            return;
        }
        if (this.f45306G == null) {
            this.f45306G = new jzf(f);
        }
        this.f45306G.setFinalPosition(f);
        start();
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: c */
    public boolean mo12676c(float f, float f2) {
        return this.f45306G.isAtEquilibrium(f, f2);
    }

    public boolean canSkipToEnd() {
        return this.f45306G.f52296b > 0.0d;
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: e */
    public void mo12677e(float f) {
    }

    @Override // p000.xt4
    /* JADX INFO: renamed from: f */
    public boolean mo12678f(long j) {
        if (this.f45308I) {
            float f = this.f45307H;
            if (f != Float.MAX_VALUE) {
                this.f45306G.setFinalPosition(f);
                this.f45307H = Float.MAX_VALUE;
            }
            this.f99209b = this.f45306G.getFinalPosition();
            this.f99208a = 0.0f;
            this.f45308I = false;
            return true;
        }
        if (this.f45307H != Float.MAX_VALUE) {
            this.f45306G.getFinalPosition();
            long j2 = j / 2;
            xt4.C15289p c15289pM14391b = this.f45306G.m14391b(this.f99209b, this.f99208a, j2);
            this.f45306G.setFinalPosition(this.f45307H);
            this.f45307H = Float.MAX_VALUE;
            xt4.C15289p c15289pM14391b2 = this.f45306G.m14391b(c15289pM14391b.f99222a, c15289pM14391b.f99223b, j2);
            this.f99209b = c15289pM14391b2.f99222a;
            this.f99208a = c15289pM14391b2.f99223b;
        } else {
            xt4.C15289p c15289pM14391b3 = this.f45306G.m14391b(this.f99209b, this.f99208a, j);
            this.f99209b = c15289pM14391b3.f99222a;
            this.f99208a = c15289pM14391b3.f99223b;
        }
        float fMax = Math.max(this.f99209b, this.f99215h);
        this.f99209b = fMax;
        float fMin = Math.min(fMax, this.f99214g);
        this.f99209b = fMin;
        if (!mo12676c(fMin, this.f99208a)) {
            return false;
        }
        this.f99209b = this.f45306G.getFinalPosition();
        this.f99208a = 0.0f;
        return true;
    }

    public jzf getSpring() {
        return this.f45306G;
    }

    public hzf setSpring(jzf jzfVar) {
        this.f45306G = jzfVar;
        return this;
    }

    public void skipToEnd() {
        if (!canSkipToEnd()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f99213f) {
            this.f45308I = true;
        }
    }

    @Override // p000.xt4
    public void start() {
        sanityCheck();
        this.f45306G.m14390a(m25444b());
        super.start();
    }

    public <K> hzf(K k, x46<K> x46Var) {
        super(k, x46Var);
        this.f45306G = null;
        this.f45307H = Float.MAX_VALUE;
        this.f45308I = false;
    }

    public <K> hzf(K k, x46<K> x46Var, float f) {
        super(k, x46Var);
        this.f45306G = null;
        this.f45307H = Float.MAX_VALUE;
        this.f45308I = false;
        this.f45306G = new jzf(f);
    }
}
