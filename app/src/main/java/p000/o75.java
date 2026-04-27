package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class o75 {
    private o75() {
        throw new IllegalStateException("No instances!");
    }

    @cfb
    public static RuntimeException propagate(@cfb Throwable t) {
        throw k75.wrapOrThrow(t);
    }

    public static void throwIfFatal(@cfb Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw ((VirtualMachineError) t);
        }
        if (t instanceof ThreadDeath) {
            throw ((ThreadDeath) t);
        }
        if (t instanceof LinkageError) {
            throw ((LinkageError) t);
        }
    }
}
