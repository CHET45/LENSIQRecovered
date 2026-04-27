package p000;

/* JADX INFO: loaded from: classes3.dex */
public class g9f implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f39062a;

    /* JADX INFO: renamed from: b */
    public final EnumC6176a f39063b;

    /* JADX INFO: renamed from: c */
    public final C15326xw f39064c;

    /* JADX INFO: renamed from: d */
    public final C15326xw f39065d;

    /* JADX INFO: renamed from: e */
    public final C15326xw f39066e;

    /* JADX INFO: renamed from: f */
    public final boolean f39067f;

    /* JADX INFO: renamed from: g9f$a */
    public enum EnumC6176a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static EnumC6176a forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public g9f(String str, EnumC6176a enumC6176a, C15326xw c15326xw, C15326xw c15326xw2, C15326xw c15326xw3, boolean z) {
        this.f39062a = str;
        this.f39063b = enumC6176a;
        this.f39064c = c15326xw;
        this.f39065d = c15326xw2;
        this.f39066e = c15326xw3;
        this.f39067f = z;
    }

    public C15326xw getEnd() {
        return this.f39065d;
    }

    public String getName() {
        return this.f39062a;
    }

    public C15326xw getOffset() {
        return this.f39066e;
    }

    public C15326xw getStart() {
        return this.f39064c;
    }

    public EnumC6176a getType() {
        return this.f39063b;
    }

    public boolean isHidden() {
        return this.f39067f;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new yih(pr0Var, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.f39064c + ", end: " + this.f39065d + ", offset: " + this.f39066e + "}";
    }
}
