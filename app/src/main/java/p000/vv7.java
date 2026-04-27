package p000;

/* JADX INFO: loaded from: classes7.dex */
public class vv7 {

    /* JADX INFO: renamed from: a */
    public final C14273a f92367a;

    /* JADX INFO: renamed from: b */
    public final C14273a f92368b;

    /* JADX INFO: renamed from: vv7$a */
    public static class C14273a {

        /* JADX INFO: renamed from: a */
        public final float f92369a;

        /* JADX INFO: renamed from: b */
        public final String f92370b;

        public C14273a(float f, @hib String str) {
            this.f92369a = f;
            this.f92370b = str;
        }

        public String toString() {
            return "Dimension{value=" + this.f92369a + ", unit='" + this.f92370b + "'}";
        }
    }

    public vv7(@hib C14273a c14273a, @hib C14273a c14273a2) {
        this.f92367a = c14273a;
        this.f92368b = c14273a2;
    }

    public String toString() {
        return "ImageSize{width=" + this.f92367a + ", height=" + this.f92368b + '}';
    }
}
