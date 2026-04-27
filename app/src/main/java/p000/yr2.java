package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class yr2 implements jo5<ow1> {

    /* JADX INFO: renamed from: yr2$a */
    public static final class C15775a {

        /* JADX INFO: renamed from: a */
        public static final yr2 f102736a = new yr2();

        private C15775a() {
        }
    }

    public static yr2 create() {
        return C15775a.f102736a;
    }

    public static ow1 provideCharacteristicPropertiesParser() {
        return (ow1) s7d.checkNotNullFromProvides(ur2.m23515n());
    }

    @Override // p000.hid
    public ow1 get() {
        return provideCharacteristicPropertiesParser();
    }
}
