package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class v54 implements vye<f78> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final CharSequence f89995a;

    /* JADX INFO: renamed from: b */
    public final int f89996b;

    /* JADX INFO: renamed from: c */
    public final int f89997c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final gz6<CharSequence, Integer, scc<Integer, Integer>> f89998d;

    /* JADX INFO: renamed from: v54$a */
    public static final class C13871a implements Iterator<f78>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f89999a = -1;

        /* JADX INFO: renamed from: b */
        public int f90000b;

        /* JADX INFO: renamed from: c */
        public int f90001c;

        /* JADX INFO: renamed from: d */
        public f78 f90002d;

        /* JADX INFO: renamed from: e */
        public int f90003e;

        public C13871a() {
            int iCoerceIn = kpd.coerceIn(v54.this.f89996b, 0, v54.this.f89995a.length());
            this.f90000b = iCoerceIn;
            this.f90001c = iCoerceIn;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void calcNext() {
            /*
                r6 = this;
                int r0 = r6.f90001c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f89999a = r1
                r0 = 0
                r6.f90002d = r0
                goto L9e
            Lc:
                v54 r0 = p000.v54.this
                int r0 = p000.v54.access$getLimit$p(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f90003e
                int r0 = r0 + r3
                r6.f90003e = r0
                v54 r4 = p000.v54.this
                int r4 = p000.v54.access$getLimit$p(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f90001c
                v54 r4 = p000.v54.this
                java.lang.CharSequence r4 = p000.v54.access$getInput$p(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                f78 r0 = new f78
                int r1 = r6.f90000b
                v54 r4 = p000.v54.this
                java.lang.CharSequence r4 = p000.v54.access$getInput$p(r4)
                int r4 = p000.m9g.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f90002d = r0
                r6.f90001c = r2
                goto L9c
            L47:
                v54 r0 = p000.v54.this
                gz6 r0 = p000.v54.access$getGetNextMatch$p(r0)
                v54 r4 = p000.v54.this
                java.lang.CharSequence r4 = p000.v54.access$getInput$p(r4)
                int r5 = r6.f90001c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                scc r0 = (p000.scc) r0
                if (r0 != 0) goto L77
                f78 r0 = new f78
                int r1 = r6.f90000b
                v54 r4 = p000.v54.this
                java.lang.CharSequence r4 = p000.v54.access$getInput$p(r4)
                int r4 = p000.m9g.getLastIndex(r4)
                r0.<init>(r1, r4)
                r6.f90002d = r0
                r6.f90001c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f90000b
                f78 r4 = p000.kpd.until(r4, r2)
                r6.f90002d = r4
                int r2 = r2 + r0
                r6.f90000b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f90001c = r2
            L9c:
                r6.f89999a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.v54.C13871a.calcNext():void");
        }

        public final int getCounter() {
            return this.f90003e;
        }

        public final int getCurrentStartIndex() {
            return this.f90000b;
        }

        public final f78 getNextItem() {
            return this.f90002d;
        }

        public final int getNextSearchIndex() {
            return this.f90001c;
        }

        public final int getNextState() {
            return this.f89999a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f89999a == -1) {
                calcNext();
            }
            return this.f89999a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i) {
            this.f90003e = i;
        }

        public final void setCurrentStartIndex(int i) {
            this.f90000b = i;
        }

        public final void setNextItem(f78 f78Var) {
            this.f90002d = f78Var;
        }

        public final void setNextSearchIndex(int i) {
            this.f90001c = i;
        }

        public final void setNextState(int i) {
            this.f89999a = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public f78 next() {
            if (this.f89999a == -1) {
                calcNext();
            }
            if (this.f89999a == 0) {
                throw new NoSuchElementException();
            }
            f78 f78Var = this.f90002d;
            md8.checkNotNull(f78Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f90002d = null;
            this.f89999a = -1;
            return f78Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v54(@yfb CharSequence charSequence, int i, int i2, @yfb gz6<? super CharSequence, ? super Integer, scc<Integer, Integer>> gz6Var) {
        md8.checkNotNullParameter(charSequence, "input");
        md8.checkNotNullParameter(gz6Var, "getNextMatch");
        this.f89995a = charSequence;
        this.f89996b = i;
        this.f89997c = i2;
        this.f89998d = gz6Var;
    }

    @Override // p000.vye
    @yfb
    public Iterator<f78> iterator() {
        return new C13871a();
    }
}
