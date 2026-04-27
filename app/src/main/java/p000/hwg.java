package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class hwg {

    /* JADX INFO: renamed from: j */
    public static final int f45168j = 0;

    /* JADX INFO: renamed from: a */
    public final int f45170a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f45171b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f45172c;

    /* JADX INFO: renamed from: d */
    public final long f45173d;

    /* JADX INFO: renamed from: e */
    public final long f45174e;

    /* JADX INFO: renamed from: f */
    public final long f45175f;

    /* JADX INFO: renamed from: g */
    public final boolean f45176g;

    /* JADX INFO: renamed from: h */
    @yfb
    public final crg f45177h;

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C7072b f45167i = new C7072b(null);

    /* JADX INFO: renamed from: k */
    @yfb
    public static final dme<hwg, Object> f45169k = new C7071a();

    /* JADX INFO: renamed from: hwg$a */
    public static final class C7071a implements dme<hwg, Object> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.dme
        @yfb
        public hwg restore(@yfb Object obj) {
            md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            md8.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            md8.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            md8.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj4;
            Object obj5 = list.get(3);
            md8.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            md8.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = kvg.TextRange(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            md8.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            md8.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange2 = kvg.TextRange(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            md8.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new hwg(iIntValue, str, str2, jTextRange, jTextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // p000.dme
        @yfb
        public Object save(@yfb fme fmeVar, @yfb hwg hwgVar) {
            return l82.listOf(Integer.valueOf(hwgVar.getIndex()), hwgVar.getPreText(), hwgVar.getPostText(), Integer.valueOf(jvg.m30593getStartimpl(hwgVar.m30143getPreSelectiond9O1mEE())), Integer.valueOf(jvg.m30588getEndimpl(hwgVar.m30143getPreSelectiond9O1mEE())), Integer.valueOf(jvg.m30593getStartimpl(hwgVar.m30142getPostSelectiond9O1mEE())), Integer.valueOf(jvg.m30588getEndimpl(hwgVar.m30142getPostSelectiond9O1mEE())), Long.valueOf(hwgVar.getTimeInMillis()));
        }
    }

    /* JADX INFO: renamed from: hwg$b */
    public static final class C7072b {
        public /* synthetic */ C7072b(jt3 jt3Var) {
            this();
        }

        @yfb
        public final dme<hwg, Object> getSaver() {
            return hwg.f45169k;
        }

        private C7072b() {
        }
    }

    public /* synthetic */ hwg(int i, String str, String str2, long j, long j2, long j3, boolean z, jt3 jt3Var) {
        this(i, str, str2, j, j2, j3, z);
    }

    public final boolean getCanMerge() {
        return this.f45176g;
    }

    @yfb
    public final vqg getDeletionType() {
        if (this.f45177h == crg.Delete && jvg.m30587getCollapsedimpl(this.f45174e)) {
            return jvg.m30587getCollapsedimpl(this.f45173d) ? jvg.m30593getStartimpl(this.f45173d) > jvg.m30593getStartimpl(this.f45174e) ? vqg.Start : vqg.End : (jvg.m30593getStartimpl(this.f45173d) == jvg.m30593getStartimpl(this.f45174e) && jvg.m30593getStartimpl(this.f45173d) == this.f45170a) ? vqg.Inner : vqg.NotByUser;
        }
        return vqg.NotByUser;
    }

    public final int getIndex() {
        return this.f45170a;
    }

    /* JADX INFO: renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m30142getPostSelectiond9O1mEE() {
        return this.f45174e;
    }

    @yfb
    public final String getPostText() {
        return this.f45172c;
    }

    /* JADX INFO: renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m30143getPreSelectiond9O1mEE() {
        return this.f45173d;
    }

    @yfb
    public final String getPreText() {
        return this.f45171b;
    }

    @yfb
    public final crg getTextEditType() {
        return this.f45177h;
    }

    public final long getTimeInMillis() {
        return this.f45175f;
    }

    private hwg(int i, String str, String str2, long j, long j2, long j3, boolean z) {
        this.f45170a = i;
        this.f45171b = str;
        this.f45172c = str2;
        this.f45173d = j;
        this.f45174e = j2;
        this.f45175f = j3;
        this.f45176g = z;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.f45177h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? crg.Replace : crg.Delete : crg.Insert;
    }

    public /* synthetic */ hwg(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2, jt3 jt3Var) {
        this(i, str, str2, j, j2, (i2 & 32) != 0 ? ksh.timeNowMillis() : j3, (i2 & 64) != 0 ? true : z, null);
    }
}
