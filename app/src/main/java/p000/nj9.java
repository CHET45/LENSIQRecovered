package p000;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes6.dex */
public class nj9 implements hj9 {

    /* JADX INFO: renamed from: a */
    public hj9 f64758a;

    /* JADX INFO: renamed from: b */
    public boolean f64759b = true;

    public nj9(hj9 hj9Var) {
        this.f64758a = hj9Var;
    }

    public hj9 getLogger() {
        return this.f64758a;
    }

    public boolean isEnable() {
        return this.f64759b;
    }

    @Override // p000.hj9
    public void log(Level level, String str) {
        if (this.f64759b) {
            this.f64758a.log(level, str);
        }
    }

    public void setEnable(boolean z) {
        this.f64759b = z;
    }

    public void setLogger(hj9 hj9Var) {
        this.f64758a = hj9Var;
    }

    @Override // p000.hj9
    public void log(Level level, String str, Throwable th) {
        if (this.f64759b) {
            this.f64758a.log(level, str, th);
        }
    }
}
