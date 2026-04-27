package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class qqg {

    /* JADX INFO: renamed from: c */
    public static final int f75142c = 0;

    /* JADX INFO: renamed from: a */
    public final int f75146a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11588a f75141b = new C11588a(null);

    /* JADX INFO: renamed from: d */
    @yfb
    public static final qqg f75143d = new qqg(0);

    /* JADX INFO: renamed from: e */
    @yfb
    public static final qqg f75144e = new qqg(1);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final qqg f75145f = new qqg(2);

    /* JADX INFO: renamed from: qqg$a */
    @dwf({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n256#2,3:112\n33#2,4:115\n259#2,2:119\n38#2:121\n261#2:122\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:115,4\n57#1:119,2\n57#1:121\n57#1:122\n*E\n"})
    public static final class C11588a {
        public /* synthetic */ C11588a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @f0g
        public static /* synthetic */ void getNone$annotations() {
        }

        @f0g
        public static /* synthetic */ void getUnderline$annotations() {
        }

        @yfb
        public final qqg combine(@yfb List<qqg> list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | list.get(i).getMask());
            }
            return new qqg(numValueOf.intValue());
        }

        @yfb
        public final qqg getLineThrough() {
            return qqg.f75145f;
        }

        @yfb
        public final qqg getNone() {
            return qqg.f75143d;
        }

        @yfb
        public final qqg getUnderline() {
            return qqg.f75144e;
        }

        private C11588a() {
        }
    }

    public qqg(int i) {
        this.f75146a = i;
    }

    public final boolean contains(@yfb qqg qqgVar) {
        int i = this.f75146a;
        return (qqgVar.f75146a | i) == i;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqg) && this.f75146a == ((qqg) obj).f75146a;
    }

    public final int getMask() {
        return this.f75146a;
    }

    public int hashCode() {
        return this.f75146a;
    }

    @yfb
    public final qqg plus(@yfb qqg qqgVar) {
        return new qqg(qqgVar.f75146a | this.f75146a);
    }

    @yfb
    public String toString() {
        if (this.f75146a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f75146a & f75144e.f75146a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f75146a & f75145f.f75146a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + u99.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + C4584d2.f28243l;
    }
}
