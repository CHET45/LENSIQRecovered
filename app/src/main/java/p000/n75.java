package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class n75 {
    private n75() {
        throw new IllegalStateException("No instances!");
    }

    @bfb
    public static RuntimeException propagate(@bfb Throwable th) {
        throw j75.wrapOrThrow(th);
    }

    public static void throwIfFatal(@bfb Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
