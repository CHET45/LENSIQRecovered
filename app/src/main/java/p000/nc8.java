package p000;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class nc8 extends IOException {

    /* JADX INFO: renamed from: a */
    public static final nc8 f63949a = new C9778a();

    /* JADX INFO: renamed from: nc8$a */
    public static class C9778a extends nc8 {
        public C9778a() {
            super(null);
        }

        @Override // java.lang.Throwable
        public void printStackTrace() {
            throw new IllegalAccessError("Stack is ignored for signal");
        }
    }

    public /* synthetic */ nc8(C9778a c9778a) {
        this();
    }

    private nc8() {
        super("Interrupted");
    }
}
