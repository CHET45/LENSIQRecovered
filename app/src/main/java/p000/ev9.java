package p000;

/* JADX INFO: loaded from: classes3.dex */
public class ev9 {

    /* JADX INFO: renamed from: a */
    public final EnumC5478a f34137a;

    /* JADX INFO: renamed from: b */
    public final C6011fx f34138b;

    /* JADX INFO: renamed from: c */
    public final C16264zw f34139c;

    /* JADX INFO: renamed from: d */
    public final boolean f34140d;

    /* JADX INFO: renamed from: ev9$a */
    public enum EnumC5478a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public ev9(EnumC5478a enumC5478a, C6011fx c6011fx, C16264zw c16264zw, boolean z) {
        this.f34137a = enumC5478a;
        this.f34138b = c6011fx;
        this.f34139c = c16264zw;
        this.f34140d = z;
    }

    public EnumC5478a getMaskMode() {
        return this.f34137a;
    }

    public C6011fx getMaskPath() {
        return this.f34138b;
    }

    public C16264zw getOpacity() {
        return this.f34139c;
    }

    public boolean isInverted() {
        return this.f34140d;
    }
}
