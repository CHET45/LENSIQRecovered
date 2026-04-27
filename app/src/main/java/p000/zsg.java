package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class zsg {

    /* JADX INFO: renamed from: e */
    public static final int f106011e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f106013a;

    /* JADX INFO: renamed from: b */
    public final long f106014b;

    /* JADX INFO: renamed from: c */
    @gib
    public final jvg f106015c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C16247c f106010d = new C16247c(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final dme<zsg, Object> f106012f = eme.Saver(C16245a.f106016a, C16246b.f106017a);

    /* JADX INFO: renamed from: zsg$a */
    public static final class C16245a extends tt8 implements gz6<fme, zsg, Object> {

        /* JADX INFO: renamed from: a */
        public static final C16245a f106016a = new C16245a();

        public C16245a() {
            super(2);
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb fme fmeVar, @yfb zsg zsgVar) {
            return l82.arrayListOf(gme.save(zsgVar.getAnnotatedString(), gme.getAnnotatedStringSaver(), fmeVar), gme.save(jvg.m30581boximpl(zsgVar.m33527getSelectiond9O1mEE()), gme.getSaver(jvg.f52112b), fmeVar));
        }
    }

    /* JADX INFO: renamed from: zsg$b */
    @dwf({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n62#2,2:203\n62#2,2:206\n1#3:205\n1#3:208\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:203,2\n169#1:206,2\n168#1:205\n169#1:208\n*E\n"})
    public static final class C16246b extends tt8 implements qy6<Object, zsg> {

        /* JADX INFO: renamed from: a */
        public static final C16246b f106017a = new C16246b();

        public C16246b() {
            super(1);
        }

        @Override // p000.qy6
        @gib
        public final zsg invoke(@yfb Object obj) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            dme<C9041lz, Object> annotatedStringSaver = gme.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            jvg jvgVarRestore = null;
            C9041lz c9041lzRestore = ((!md8.areEqual(obj2, bool) || (annotatedStringSaver instanceof hfb)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            md8.checkNotNull(c9041lzRestore);
            Object obj3 = list.get(1);
            dme<jvg, Object> saver = gme.getSaver(jvg.f52112b);
            if ((!md8.areEqual(obj3, bool) || (saver instanceof hfb)) && obj3 != null) {
                jvgVarRestore = saver.restore(obj3);
            }
            md8.checkNotNull(jvgVarRestore);
            return new zsg(c9041lzRestore, jvgVarRestore.m30597unboximpl(), (jvg) null, 4, (jt3) null);
        }
    }

    /* JADX INFO: renamed from: zsg$c */
    public static final class C16247c {
        public /* synthetic */ C16247c(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<zsg, Object> getSaver() {
            return zsg.f106012f;
        }

        private C16247c() {
        }
    }

    public /* synthetic */ zsg(C9041lz c9041lz, long j, jvg jvgVar, jt3 jt3Var) {
        this(c9041lz, j, jvgVar);
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ zsg m33523copy3r_uNRQ$default(zsg zsgVar, C9041lz c9041lz, long j, jvg jvgVar, int i, Object obj) {
        if ((i & 1) != 0) {
            c9041lz = zsgVar.f106013a;
        }
        if ((i & 2) != 0) {
            j = zsgVar.f106014b;
        }
        if ((i & 4) != 0) {
            jvgVar = zsgVar.f106015c;
        }
        return zsgVar.m33525copy3r_uNRQ(c9041lz, j, jvgVar);
    }

    @yfb
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final zsg m33525copy3r_uNRQ(@yfb C9041lz c9041lz, long j, @gib jvg jvgVar) {
        return new zsg(c9041lz, j, jvgVar, (jt3) null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsg)) {
            return false;
        }
        zsg zsgVar = (zsg) obj;
        return jvg.m30586equalsimpl0(this.f106014b, zsgVar.f106014b) && md8.areEqual(this.f106015c, zsgVar.f106015c) && md8.areEqual(this.f106013a, zsgVar.f106013a);
    }

    @yfb
    public final C9041lz getAnnotatedString() {
        return this.f106013a;
    }

    @gib
    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final jvg m33526getCompositionMzsxiRA() {
        return this.f106015c;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m33527getSelectiond9O1mEE() {
        return this.f106014b;
    }

    @yfb
    public final String getText() {
        return this.f106013a.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.f106013a.hashCode() * 31) + jvg.m30594hashCodeimpl(this.f106014b)) * 31;
        jvg jvgVar = this.f106015c;
        return iHashCode + (jvgVar != null ? jvg.m30594hashCodeimpl(jvgVar.m30597unboximpl()) : 0);
    }

    @yfb
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f106013a) + "', selection=" + ((Object) jvg.m30596toStringimpl(this.f106014b)) + ", composition=" + this.f106015c + ')';
    }

    public /* synthetic */ zsg(String str, long j, jvg jvgVar, jt3 jt3Var) {
        this(str, j, jvgVar);
    }

    @yfb
    /* JADX INFO: renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final zsg m33524copy3r_uNRQ(@yfb String str, long j, @gib jvg jvgVar) {
        return new zsg(new C9041lz(str, null, null, 6, null), j, jvgVar, (jt3) null);
    }

    private zsg(C9041lz c9041lz, long j, jvg jvgVar) {
        this.f106013a = c9041lz;
        this.f106014b = kvg.m30778coerceIn8ffj60Q(j, 0, getText().length());
        this.f106015c = jvgVar != null ? jvg.m30581boximpl(kvg.m30778coerceIn8ffj60Q(jvgVar.m30597unboximpl(), 0, getText().length())) : null;
    }

    /* JADX INFO: renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ zsg m33522copy3r_uNRQ$default(zsg zsgVar, String str, long j, jvg jvgVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = zsgVar.f106014b;
        }
        if ((i & 4) != 0) {
            jvgVar = zsgVar.f106015c;
        }
        return zsgVar.m33524copy3r_uNRQ(str, j, jvgVar);
    }

    public /* synthetic */ zsg(C9041lz c9041lz, long j, jvg jvgVar, int i, jt3 jt3Var) {
        this(c9041lz, (i & 2) != 0 ? jvg.f52112b.m30598getZerod9O1mEE() : j, (i & 4) != 0 ? null : jvgVar, (jt3) null);
    }

    public /* synthetic */ zsg(String str, long j, jvg jvgVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? jvg.f52112b.m30598getZerod9O1mEE() : j, (i & 4) != 0 ? null : jvgVar, (jt3) null);
    }

    private zsg(String str, long j, jvg jvgVar) {
        this(new C9041lz(str, null, null, 6, null), j, jvgVar, (jt3) null);
    }
}
