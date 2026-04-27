package p000;

import p000.hrg;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1208#2:197\n1187#2,2:198\n1208#2:200\n1187#2,2:201\n460#3,7:203\n728#3,2:210\n467#3,4:212\n523#3:216\n728#3,2:217\n523#3:219\n523#3:221\n476#3,11:222\n728#3,2:233\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n34#1:197\n34#1:198,2\n35#1:200\n35#1:201,2\n38#1:203,7\n39#1:210,2\n38#1:212,4\n81#1:216\n110#1:217,2\n132#1:219\n135#1:221\n139#1:222,11\n186#1:233,2\n*E\n"})
@e0g(parameters = 0)
public final class yt1 implements hrg.InterfaceC6984a {

    /* JADX INFO: renamed from: c */
    public static final int f102928c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public f7b<C15802a> f102929a;

    /* JADX INFO: renamed from: b */
    @yfb
    public f7b<C15802a> f102930b;

    /* JADX INFO: renamed from: yt1$a */
    public static final class C15802a {

        /* JADX INFO: renamed from: a */
        public int f102931a;

        /* JADX INFO: renamed from: b */
        public int f102932b;

        /* JADX INFO: renamed from: c */
        public int f102933c;

        /* JADX INFO: renamed from: d */
        public int f102934d;

        public C15802a(int i, int i2, int i3, int i4) {
            this.f102931a = i;
            this.f102932b = i2;
            this.f102933c = i3;
            this.f102934d = i4;
        }

        public static /* synthetic */ C15802a copy$default(C15802a c15802a, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = c15802a.f102931a;
            }
            if ((i5 & 2) != 0) {
                i2 = c15802a.f102932b;
            }
            if ((i5 & 4) != 0) {
                i3 = c15802a.f102933c;
            }
            if ((i5 & 8) != 0) {
                i4 = c15802a.f102934d;
            }
            return c15802a.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.f102931a;
        }

        public final int component2() {
            return this.f102932b;
        }

        public final int component3() {
            return this.f102933c;
        }

        public final int component4() {
            return this.f102934d;
        }

        @yfb
        public final C15802a copy(int i, int i2, int i3, int i4) {
            return new C15802a(i, i2, i3, i4);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15802a)) {
                return false;
            }
            C15802a c15802a = (C15802a) obj;
            return this.f102931a == c15802a.f102931a && this.f102932b == c15802a.f102932b && this.f102933c == c15802a.f102933c && this.f102934d == c15802a.f102934d;
        }

        public final int getOriginalEnd() {
            return this.f102934d;
        }

        public final int getOriginalStart() {
            return this.f102933c;
        }

        public final int getPreEnd() {
            return this.f102932b;
        }

        public final int getPreStart() {
            return this.f102931a;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f102931a) * 31) + Integer.hashCode(this.f102932b)) * 31) + Integer.hashCode(this.f102933c)) * 31) + Integer.hashCode(this.f102934d);
        }

        public final void setOriginalEnd(int i) {
            this.f102934d = i;
        }

        public final void setOriginalStart(int i) {
            this.f102933c = i;
        }

        public final void setPreEnd(int i) {
            this.f102932b = i;
        }

        public final void setPreStart(int i) {
            this.f102931a = i;
        }

        @yfb
        public String toString() {
            return "Change(preStart=" + this.f102931a + ", preEnd=" + this.f102932b + ", originalStart=" + this.f102933c + ", originalEnd=" + this.f102934d + ')';
        }
    }

    public yt1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void appendNewChange(C15802a c15802a, int i, int i2, int i3) {
        int preEnd;
        if (this.f102930b.isEmpty()) {
            preEnd = 0;
        } else {
            C15802a c15802aLast = this.f102930b.last();
            preEnd = c15802aLast.getPreEnd() - c15802aLast.getOriginalEnd();
        }
        if (c15802a == null) {
            int i4 = i - preEnd;
            c15802a = new C15802a(i, i2 + i3, i4, (i2 - i) + i4);
        } else {
            if (c15802a.getPreStart() > i) {
                c15802a.setPreStart(i);
                c15802a.setOriginalStart(i);
            }
            if (i2 > c15802a.getPreEnd()) {
                int preEnd2 = c15802a.getPreEnd() - c15802a.getOriginalEnd();
                c15802a.setPreEnd(i2);
                c15802a.setOriginalEnd(i2 - preEnd2);
            }
            c15802a.setPreEnd(c15802a.getPreEnd() + i3);
        }
        this.f102930b.add(c15802a);
    }

    public final void clearChanges() {
        this.f102929a.clear();
    }

    @Override // p000.hrg.InterfaceC6984a
    public int getChangeCount() {
        return this.f102929a.getSize();
    }

    @Override // p000.hrg.InterfaceC6984a
    /* JADX INFO: renamed from: getOriginalRange--jx7JFs */
    public long mo30107getOriginalRangejx7JFs(int i) {
        C15802a c15802a = this.f102929a.getContent()[i];
        return kvg.TextRange(c15802a.getOriginalStart(), c15802a.getOriginalEnd());
    }

    @Override // p000.hrg.InterfaceC6984a
    /* JADX INFO: renamed from: getRange--jx7JFs */
    public long mo30108getRangejx7JFs(int i) {
        C15802a c15802a = this.f102929a.getContent()[i];
        return kvg.TextRange(c15802a.getPreStart(), c15802a.getPreEnd());
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList(changes=[");
        f7b<C15802a> f7bVar = this.f102929a;
        int size = f7bVar.getSize();
        if (size > 0) {
            C15802a[] content = f7bVar.getContent();
            int i = 0;
            do {
                C15802a c15802a = content[i];
                sb.append('(' + c15802a.getOriginalStart() + C4584d2.f28238g + c15802a.getOriginalEnd() + ")->(" + c15802a.getPreStart() + C4584d2.f28238g + c15802a.getPreEnd() + ')');
                if (i < getChangeCount() - 1) {
                    sb.append(", ");
                }
                i++;
            } while (i < size);
        }
        sb.append("])");
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void trackChange(int i, int i2, int i3) {
        int preEnd;
        if (i == i2 && i3 == 0) {
            return;
        }
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i4 = i3 - (iMax - iMin);
        C15802a c15802a = null;
        boolean z = false;
        for (int i5 = 0; i5 < this.f102929a.getSize(); i5++) {
            C15802a c15802a2 = this.f102929a.getContent()[i5];
            int preStart = c15802a2.getPreStart();
            if ((iMin > preStart || preStart > iMax) && (iMin > (preEnd = c15802a2.getPreEnd()) || preEnd > iMax)) {
                if (c15802a2.getPreStart() > iMax && !z) {
                    appendNewChange(c15802a, iMin, iMax, i4);
                    z = true;
                }
                if (z) {
                    c15802a2.setPreStart(c15802a2.getPreStart() + i4);
                    c15802a2.setPreEnd(c15802a2.getPreEnd() + i4);
                }
                this.f102930b.add(c15802a2);
            } else if (c15802a == null) {
                c15802a = c15802a2;
            } else {
                c15802a.setPreEnd(c15802a2.getPreEnd());
                c15802a.setOriginalEnd(c15802a2.getOriginalEnd());
            }
        }
        if (!z) {
            appendNewChange(c15802a, iMin, iMax, i4);
        }
        f7b<C15802a> f7bVar = this.f102929a;
        this.f102929a = this.f102930b;
        this.f102930b = f7bVar;
        f7bVar.clear();
    }

    public yt1(@gib yt1 yt1Var) {
        f7b<C15802a> f7bVar;
        int size;
        int i = 0;
        this.f102929a = new f7b<>(new C15802a[16], 0);
        this.f102930b = new f7b<>(new C15802a[16], 0);
        if (yt1Var == null || (f7bVar = yt1Var.f102929a) == null || (size = f7bVar.getSize()) <= 0) {
            return;
        }
        C15802a[] content = f7bVar.getContent();
        do {
            C15802a c15802a = content[i];
            this.f102929a.add(new C15802a(c15802a.getPreStart(), c15802a.getPreEnd(), c15802a.getOriginalStart(), c15802a.getOriginalEnd()));
            i++;
        } while (i < size);
    }

    public /* synthetic */ yt1(yt1 yt1Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? null : yt1Var);
    }
}
