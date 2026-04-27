package p000;

import p000.w98;

/* JADX INFO: loaded from: classes4.dex */
public enum bib implements w98.InterfaceC14497d {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: d */
    public static final int f13802d = 0;

    /* JADX INFO: renamed from: e */
    public static final w98.InterfaceC14498e<bib> f13803e = new w98.InterfaceC14498e<bib>() { // from class: bib.a
        @Override // p000.w98.InterfaceC14498e
        public bib findValueByNumber(int number) {
            return bib.forNumber(number);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f13805a;

    /* JADX INFO: renamed from: bib$b */
    public static final class C1914b implements w98.InterfaceC14499f {

        /* JADX INFO: renamed from: a */
        public static final w98.InterfaceC14499f f13806a = new C1914b();

        private C1914b() {
        }

        @Override // p000.w98.InterfaceC14499f
        public boolean isInRange(int number) {
            return bib.forNumber(number) != null;
        }
    }

    bib(int value) {
        this.f13805a = value;
    }

    public static bib forNumber(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static w98.InterfaceC14498e<bib> internalGetValueMap() {
        return f13803e;
    }

    public static w98.InterfaceC14499f internalGetVerifier() {
        return C1914b.f13806a;
    }

    @Override // p000.w98.InterfaceC14497d
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f13805a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static bib valueOf(int value) {
        return forNumber(value);
    }
}
