package p000;

import p000.w98;

/* JADX INFO: loaded from: classes5.dex */
public enum zt1 implements w98.InterfaceC14497d {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: C */
    public static final int f106037C = 1;

    /* JADX INFO: renamed from: F */
    public static final int f106038F = 2;

    /* JADX INFO: renamed from: H */
    public static final int f106039H = 3;

    /* JADX INFO: renamed from: L */
    public static final w98.InterfaceC14498e<zt1> f106040L = new w98.InterfaceC14498e<zt1>() { // from class: zt1.a
        @Override // p000.w98.InterfaceC14498e
        public zt1 findValueByNumber(int i) {
            return zt1.forNumber(i);
        }
    };

    /* JADX INFO: renamed from: m */
    public static final int f106047m = 0;

    /* JADX INFO: renamed from: a */
    public final int f106048a;

    /* JADX INFO: renamed from: zt1$b */
    public static final class C16250b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f106049a = new C16250b();

        private C16250b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int i) {
            return zt1.forNumber(i) != null;
        }
    }

    zt1(int i) {
        this.f106048a = i;
    }

    public static zt1 forNumber(int i) {
        if (i == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDED;
        }
        if (i == 2) {
            return REMOVED;
        }
        if (i != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static w98.InterfaceC14498e<zt1> internalGetValueMap() {
        return f106040L;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C16250b.f106049a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f106048a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static zt1 valueOf(int i) {
        return forNumber(i);
    }
}
