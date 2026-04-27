package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1208#2:127\n1187#2,2:128\n460#3,11:130\n460#3,11:142\n1#4:141\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo\n*L\n51#1:127\n51#1:128,2\n87#1:130,11\n102#1:142,11\n*E\n"})
@e0g(parameters = 0)
public final class lz8 {

    /* JADX INFO: renamed from: b */
    public static final int f59330b = f7b.f35631d;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<C9042a> f59331a = new f7b<>(new C9042a[16], 0);

    /* JADX INFO: renamed from: lz8$a */
    @dwf({"SMAP\nLazyLayoutBeyondBoundsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsInfo.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    @e0g(parameters = 1)
    public static final class C9042a {

        /* JADX INFO: renamed from: c */
        public static final int f59332c = 0;

        /* JADX INFO: renamed from: a */
        public final int f59333a;

        /* JADX INFO: renamed from: b */
        public final int f59334b;

        public C9042a(int i, int i2) {
            this.f59333a = i;
            this.f59334b = i2;
            if (i < 0) {
                throw new IllegalArgumentException("negative start index");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("end index greater than start");
            }
        }

        public static /* synthetic */ C9042a copy$default(C9042a c9042a, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = c9042a.f59333a;
            }
            if ((i3 & 2) != 0) {
                i2 = c9042a.f59334b;
            }
            return c9042a.copy(i, i2);
        }

        public final int component1() {
            return this.f59333a;
        }

        public final int component2() {
            return this.f59334b;
        }

        @yfb
        public final C9042a copy(int i, int i2) {
            return new C9042a(i, i2);
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9042a)) {
                return false;
            }
            C9042a c9042a = (C9042a) obj;
            return this.f59333a == c9042a.f59333a && this.f59334b == c9042a.f59334b;
        }

        public final int getEnd() {
            return this.f59334b;
        }

        public final int getStart() {
            return this.f59333a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f59333a) * 31) + Integer.hashCode(this.f59334b);
        }

        @yfb
        public String toString() {
            return "Interval(start=" + this.f59333a + ", end=" + this.f59334b + ')';
        }
    }

    @yfb
    public final C9042a addInterval(int i, int i2) {
        C9042a c9042a = new C9042a(i, i2);
        this.f59331a.add(c9042a);
        return c9042a;
    }

    public final int getEnd() {
        int end = this.f59331a.first().getEnd();
        f7b<C9042a> f7bVar = this.f59331a;
        int size = f7bVar.getSize();
        if (size > 0) {
            C9042a[] content = f7bVar.getContent();
            int i = 0;
            do {
                C9042a c9042a = content[i];
                if (c9042a.getEnd() > end) {
                    end = c9042a.getEnd();
                }
                i++;
            } while (i < size);
        }
        return end;
    }

    public final int getStart() {
        int start = this.f59331a.first().getStart();
        f7b<C9042a> f7bVar = this.f59331a;
        int size = f7bVar.getSize();
        if (size > 0) {
            C9042a[] content = f7bVar.getContent();
            int i = 0;
            do {
                C9042a c9042a = content[i];
                if (c9042a.getStart() < start) {
                    start = c9042a.getStart();
                }
                i++;
            } while (i < size);
        }
        if (start >= 0) {
            return start;
        }
        throw new IllegalArgumentException("negative minIndex");
    }

    public final boolean hasIntervals() {
        return this.f59331a.isNotEmpty();
    }

    public final void removeInterval(@yfb C9042a c9042a) {
        this.f59331a.remove(c9042a);
    }
}
