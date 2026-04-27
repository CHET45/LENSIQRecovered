package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public interface zbc {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C16081a f104721a = C16081a.f104722a;

    /* JADX INFO: renamed from: zbc$a */
    public static final class C16081a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ C16081a f104722a = new C16081a();

        private C16081a() {
        }

        @yfb
        public final zbc atMost(int i) {
            if (i >= 0) {
                return new bcc(i);
            }
            throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + i + a18.f100c).toString());
        }
    }

    int calculateTargetPage(int i, int i2, float f, int i3, int i4);
}
