package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class krf {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: krf$a */
    @ck3(m4009c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m4010f = "SlidingWindow.kt", m4011i = {0, 0, 0, 2, 2, 3, 3}, m4012l = {34, 40, 49, 55, 58}, m4013m = "invokeSuspend", m4014n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m4015s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class C8508a<T> extends t7e implements gz6<xye<? super List<? extends T>>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ Iterator<T> f55172C;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ boolean f55173F;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ boolean f55174H;

        /* JADX INFO: renamed from: a */
        public Object f55175a;

        /* JADX INFO: renamed from: b */
        public Object f55176b;

        /* JADX INFO: renamed from: c */
        public int f55177c;

        /* JADX INFO: renamed from: d */
        public int f55178d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f55179e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f55180f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ int f55181m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8508a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, zy2<? super C8508a> zy2Var) {
            super(2, zy2Var);
            this.f55180f = i;
            this.f55181m = i2;
            this.f55172C = it;
            this.f55173F = z;
            this.f55174H = z2;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C8508a c8508a = new C8508a(this.f55180f, this.f55181m, this.f55172C, this.f55173F, this.f55174H, zy2Var);
            c8508a.f55179e = obj;
            return c8508a;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super List<? extends T>> xyeVar, zy2<? super bth> zy2Var) {
            return ((C8508a) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0117 -> B:59:0x011a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0145 -> B:72:0x0148). Please report as a decompilation issue!!! */
        @Override // p000.tq0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 358
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.krf.C8508a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: krf$b */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,22:1\n19#2:23\n*E\n"})
    public static final class C8509b<T> implements vye<List<? extends T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vye f55182a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f55183b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f55184c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f55185d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f55186e;

        public C8509b(vye vyeVar, int i, int i2, boolean z, boolean z2) {
            this.f55182a = vyeVar;
            this.f55183b = i;
            this.f55184c = i2;
            this.f55185d = z;
            this.f55186e = z2;
        }

        @Override // p000.vye
        public Iterator<List<? extends T>> iterator() {
            return krf.windowedIterator(this.f55182a.iterator(), this.f55183b, this.f55184c, this.f55185d, this.f55186e);
        }
    }

    public static final void checkWindowSizeStep(int i, int i2) {
        String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @yfb
    public static final <T> Iterator<List<T>> windowedIterator(@yfb Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        md8.checkNotNullParameter(it, "iterator");
        return !it.hasNext() ? g05.f38105a : bze.iterator(new C8508a(i, i2, it, z2, z, null));
    }

    @yfb
    public static final <T> vye<List<T>> windowedSequence(@yfb vye<? extends T> vyeVar, int i, int i2, boolean z, boolean z2) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        checkWindowSizeStep(i, i2);
        return new C8509b(vyeVar, i, i2, z, z2);
    }
}
