package p000;

/* JADX INFO: loaded from: classes4.dex */
public class s27 implements msa {

    /* JADX INFO: renamed from: a */
    public static final s27 f80430a = new s27();

    private s27() {
    }

    public static s27 getInstance() {
        return f80430a;
    }

    @Override // p000.msa
    public boolean isSupported(Class<?> messageType) {
        return v27.class.isAssignableFrom(messageType);
    }

    @Override // p000.msa
    public ksa messageInfoFor(Class<?> messageType) {
        if (!v27.class.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (ksa) v27.m23723y(messageType.asSubclass(v27.class)).m23734j();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + messageType.getName(), e);
        }
    }
}
