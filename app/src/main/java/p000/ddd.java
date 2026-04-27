package p000;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "ProcessKt")
public final class ddd {
    @t28
    private static final Void exitProcess(int i) {
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
