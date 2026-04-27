package p000;

/* JADX INFO: loaded from: classes3.dex */
public class t27 implements nsa {

    /* JADX INFO: renamed from: a */
    public static final t27 f83496a = new t27();

    private t27() {
    }

    public static t27 getInstance() {
        return f83496a;
    }

    @Override // p000.nsa
    public boolean isSupported(Class<?> messageType) {
        return u27.class.isAssignableFrom(messageType);
    }

    @Override // p000.nsa
    public lsa messageInfoFor(Class<?> messageType) {
        if (!u27.class.isAssignableFrom(messageType)) {
            throw new IllegalArgumentException("Unsupported message type: " + messageType.getName());
        }
        try {
            return (lsa) u27.m23037x(messageType.asSubclass(u27.class)).m23049i();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + messageType.getName(), e);
        }
    }
}
