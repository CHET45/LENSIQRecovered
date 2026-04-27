package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gy2 implements x13 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e13 f41782a;

    public gy2(@yfb e13 e13Var) {
        this.f41782a = e13Var;
    }

    @Override // p000.x13
    @yfb
    public e13 getCoroutineContext() {
        return this.f41782a;
    }

    @yfb
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
