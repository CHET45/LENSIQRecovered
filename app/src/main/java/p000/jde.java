package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class jde {
    @jjf(version = "1.3")
    public static final void runSuspend(@yfb qy6<? super zy2<? super bth>, ? extends Object> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "block");
        ide ideVar = new ide();
        ez2.startCoroutine(qy6Var, ideVar);
        ideVar.await();
    }
}
