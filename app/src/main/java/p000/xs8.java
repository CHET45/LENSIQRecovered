package p000;

/* JADX INFO: loaded from: classes7.dex */
public class xs8 extends Error {
    public xs8() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public xs8(@gib String str) {
        super(str);
    }

    public xs8(@gib String str, @gib Throwable th) {
        super(str, th);
    }

    public xs8(@gib Throwable th) {
        super(th);
    }
}
