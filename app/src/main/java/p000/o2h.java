package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "TimingKt")
public final class o2h {
    public static final long measureNanoTime(@yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        long jNanoTime = System.nanoTime();
        ny6Var.invoke();
        return System.nanoTime() - jNanoTime;
    }

    public static final long measureTimeMillis(@yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ny6Var.invoke();
        return System.currentTimeMillis() - jCurrentTimeMillis;
    }
}
