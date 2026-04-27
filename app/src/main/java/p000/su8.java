package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class su8 implements eyd {

    /* JADX INFO: renamed from: d */
    public static final int f82900d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final gz6<x13, zy2<? super bth>, Object> f82901a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final x13 f82902b;

    /* JADX INFO: renamed from: c */
    @gib
    public jj8 f82903c;

    /* JADX WARN: Multi-variable type inference failed */
    public su8(@yfb e13 e13Var, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        this.f82901a = gz6Var;
        this.f82902b = y13.CoroutineScope(e13Var);
    }

    @Override // p000.eyd
    public void onAbandoned() {
        jj8 jj8Var = this.f82903c;
        if (jj8Var != null) {
            jj8Var.cancel((CancellationException) new p39());
        }
        this.f82903c = null;
    }

    @Override // p000.eyd
    public void onForgotten() {
        jj8 jj8Var = this.f82903c;
        if (jj8Var != null) {
            jj8Var.cancel((CancellationException) new p39());
        }
        this.f82903c = null;
    }

    @Override // p000.eyd
    public void onRemembered() {
        jj8 jj8Var = this.f82903c;
        if (jj8Var != null) {
            qj8.cancel$default(jj8Var, "Old job was still running!", null, 2, null);
        }
        this.f82903c = fg1.launch$default(this.f82902b, null, null, this.f82901a, 3, null);
    }
}
