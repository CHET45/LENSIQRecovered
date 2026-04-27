package p000;

/* JADX INFO: loaded from: classes7.dex */
@x0f(with = im8.class)
public abstract class fm8 extends sk8 {

    @yfb
    public static final C5888a Companion = new C5888a(null);

    /* JADX INFO: renamed from: fm8$a */
    public static final class C5888a {
        private C5888a() {
        }

        @yfb
        public final lp8<fm8> serializer() {
            return im8.f47436a;
        }

        public /* synthetic */ C5888a(jt3 jt3Var) {
            this();
        }
    }

    public /* synthetic */ fm8(jt3 jt3Var) {
        this();
    }

    @yfb
    public abstract String getContent();

    public abstract boolean isString();

    @yfb
    public String toString() {
        return getContent();
    }

    private fm8() {
        super(null);
    }
}
