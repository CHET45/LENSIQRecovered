package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.iu0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class iu0<T, U extends iu0<T, U>> implements mf4 {

    /* JADX INFO: renamed from: C */
    public int f48264C;

    /* JADX INFO: renamed from: F */
    public CharSequence f48265F;

    /* JADX INFO: renamed from: H */
    public boolean f48266H;

    /* JADX INFO: renamed from: d */
    public long f48270d;

    /* JADX INFO: renamed from: e */
    public Thread f48271e;

    /* JADX INFO: renamed from: f */
    public boolean f48272f;

    /* JADX INFO: renamed from: m */
    public int f48273m;

    /* JADX INFO: renamed from: b */
    public final List<T> f48268b = new egi();

    /* JADX INFO: renamed from: c */
    public final List<Throwable> f48269c = new egi();

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f48267a = new CountDownLatch(1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: iu0$b */
    public static abstract class EnumC7616b implements Runnable {

        /* JADX INFO: renamed from: a */
        public static final EnumC7616b f48274a;

        /* JADX INFO: renamed from: b */
        public static final EnumC7616b f48275b;

        /* JADX INFO: renamed from: c */
        public static final EnumC7616b f48276c;

        /* JADX INFO: renamed from: d */
        public static final EnumC7616b f48277d;

        /* JADX INFO: renamed from: e */
        public static final EnumC7616b f48278e;

        /* JADX INFO: renamed from: f */
        public static final EnumC7616b f48279f;

        /* JADX INFO: renamed from: m */
        public static final /* synthetic */ EnumC7616b[] f48280m;

        /* JADX INFO: renamed from: iu0$b$a */
        public enum a extends EnumC7616b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: iu0$b$b */
        public enum b extends EnumC7616b {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        }

        /* JADX INFO: renamed from: iu0$b$c */
        public enum c extends EnumC7616b {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
                EnumC7616b.m13419a(1);
            }
        }

        /* JADX INFO: renamed from: iu0$b$d */
        public enum d extends EnumC7616b {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
                EnumC7616b.m13419a(10);
            }
        }

        /* JADX INFO: renamed from: iu0$b$e */
        public enum e extends EnumC7616b {
            public e(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
                EnumC7616b.m13419a(100);
            }
        }

        /* JADX INFO: renamed from: iu0$b$f */
        public enum f extends EnumC7616b {
            public f(String str, int i) {
                super(str, i);
            }

            @Override // p000.iu0.EnumC7616b, java.lang.Runnable
            public void run() {
                EnumC7616b.m13419a(1000);
            }
        }

        static {
            a aVar = new a("SPIN", 0);
            f48274a = aVar;
            b bVar = new b("YIELD", 1);
            f48275b = bVar;
            c cVar = new c("SLEEP_1MS", 2);
            f48276c = cVar;
            d dVar = new d("SLEEP_10MS", 3);
            f48277d = dVar;
            e eVar = new e("SLEEP_100MS", 4);
            f48278e = eVar;
            f fVar = new f("SLEEP_1000MS", 5);
            f48279f = fVar;
            f48280m = new EnumC7616b[]{aVar, bVar, cVar, dVar, eVar, fVar};
        }

        private EnumC7616b(String str, int i) {
        }

        /* JADX INFO: renamed from: a */
        public static void m13419a(int i) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }

        public static EnumC7616b valueOf(String str) {
            return (EnumC7616b) Enum.valueOf(EnumC7616b.class, str);
        }

        public static EnumC7616b[] values() {
            return (EnumC7616b[]) f48280m.clone();
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String valueAndClass(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + c0b.f15434d;
    }

    /* JADX INFO: renamed from: a */
    public final AssertionError m13418a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.f48267a.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.f48268b.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.f48269c.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.f48270d);
        if (this.f48266H) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.f48265F;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f48269c.isEmpty()) {
            if (this.f48269c.size() == 1) {
                assertionError.initCause(this.f48269c.get(0));
            } else {
                assertionError.initCause(new pm2(this.f48269c));
            }
        }
        return assertionError;
    }

    public final U assertComplete() {
        long j = this.f48270d;
        if (j == 0) {
            throw m13418a("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw m13418a("Multiple completions: " + j);
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertError(Throwable th) {
        return (U) assertError(q07.equalsWith(th));
    }

    public final U assertErrorMessage(String str) {
        int size = this.f48269c.size();
        if (size == 0) {
            throw m13418a("No errors");
        }
        if (size != 1) {
            throw m13418a("Multiple errors");
        }
        String message = this.f48269c.get(0).getMessage();
        if (xjb.equals(str, message)) {
            return this;
        }
        throw m13418a("Error message differs; exptected: " + str + " but was: " + message);
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U assertNever(T t) {
        int size = this.f48268b.size();
        for (int i = 0; i < size; i++) {
            if (xjb.equals(this.f48268b.get(i), t)) {
                throw m13418a("Value at position " + i + " is equal to " + valueAndClass(t) + "; Expected them to be different");
            }
        }
        return this;
    }

    public final U assertNoErrors() {
        if (this.f48269c.size() == 0) {
            return this;
        }
        throw m13418a("Error(s) present: " + this.f48269c);
    }

    public final U assertNoTimeout() {
        if (this.f48266H) {
            throw m13418a("Timeout?!");
        }
        return this;
    }

    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    public final U assertNotComplete() {
        long j = this.f48270d;
        if (j == 1) {
            throw m13418a("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw m13418a("Multiple completions: " + j);
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
        if (this.f48267a.getCount() != 0) {
            return this;
        }
        throw m13418a("Subscriber terminated!");
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
        if (this.f48267a.getCount() != 0) {
            throw m13418a("Subscriber still running!");
        }
        long j = this.f48270d;
        if (j > 1) {
            throw m13418a("Terminated with multiple completions: " + j);
        }
        int size = this.f48269c.size();
        if (size > 1) {
            throw m13418a("Terminated with multiple errors: " + size);
        }
        if (j == 0 || size == 0) {
            return this;
        }
        throw m13418a("Terminated with multiple completions and errors: " + j);
    }

    public final U assertTimeout() {
        if (this.f48266H) {
            return this;
        }
        throw m13418a("No timeout?!");
    }

    public final U assertValue(T t) {
        if (this.f48268b.size() != 1) {
            throw m13418a("expected: " + valueAndClass(t) + " but was: " + this.f48268b);
        }
        T t2 = this.f48268b.get(0);
        if (xjb.equals(t, t2)) {
            return this;
        }
        throw m13418a("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueAt(int i, T t) {
        int size = this.f48268b.size();
        if (size == 0) {
            throw m13418a("No values");
        }
        if (i >= size) {
            throw m13418a("Invalid index: " + i);
        }
        T t2 = this.f48268b.get(i);
        if (xjb.equals(t, t2)) {
            return this;
        }
        throw m13418a("expected: " + valueAndClass(t) + " but was: " + valueAndClass(t2));
    }

    public final U assertValueCount(int i) {
        int size = this.f48268b.size();
        if (size == i) {
            return this;
        }
        throw m13418a("Value counts differ; expected: " + i + " but was: " + size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        throw m13418a("Fewer values received than expected (" + r1 + p000.c0b.f15434d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        throw m13418a("More values received than expected (" + r1 + p000.c0b.f15434d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U assertValueSequence(java.lang.Iterable<? extends T> r6) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.f48268b
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L57
            if (r2 != 0) goto L18
            goto L57
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = p000.xjb.equals(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Values at position "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " differ; expected: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r2)
            r6.append(r0)
            java.lang.String r0 = " but was: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.m13418a(r6)
            throw r6
        L57:
            java.lang.String r6 = ")"
            if (r3 != 0) goto L77
            if (r2 != 0) goto L5e
            return r5
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Fewer values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.m13418a(r6)
            throw r6
        L77:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "More values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.m13418a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.iu0.assertValueSequence(java.lang.Iterable):iu0");
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t : this.f48268b) {
            if (!collection.contains(t)) {
                throw m13418a("Value not in the expected collection: " + valueAndClass(t));
            }
        }
        return this;
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValues(T... tArr) {
        int size = this.f48268b.size();
        if (size != tArr.length) {
            throw m13418a("Value count differs; expected: " + tArr.length + C2473f.f17566z + Arrays.toString(tArr) + " but was: " + size + C2473f.f17566z + this.f48268b);
        }
        for (int i = 0; i < size; i++) {
            T t = this.f48268b.get(i);
            T t2 = tArr[i];
            if (!xjb.equals(t2, t)) {
                throw m13418a("Values at position " + i + " differ; expected: " + valueAndClass(t2) + " but was: " + valueAndClass(t));
            }
        }
        return this;
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U await() throws InterruptedException {
        if (this.f48267a.getCount() == 0) {
            return this;
        }
        this.f48267a.await();
        return this;
    }

    public final U awaitCount(int i) {
        return (U) awaitCount(i, EnumC7616b.f48277d, 5000L);
    }

    public final U awaitDone(long j, TimeUnit timeUnit) {
        try {
            if (!this.f48267a.await(j, timeUnit)) {
                this.f48266H = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw j75.wrapOrThrow(e);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U clearTimeout() {
        this.f48266H = false;
        return this;
    }

    public final long completions() {
        return this.f48270d;
    }

    public final int errorCount() {
        return this.f48269c.size();
    }

    public final List<Throwable> errors() {
        return this.f48269c;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j = 0; j < this.f48270d; j++) {
            arrayList2.add(kgb.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean isTerminated() {
        return this.f48267a.getCount() == 0;
    }

    public final boolean isTimeout() {
        return this.f48266H;
    }

    public final Thread lastThread() {
        return this.f48271e;
    }

    public final int valueCount() {
        return this.f48268b.size();
    }

    public final List<T> values() {
        return this.f48268b;
    }

    public final U withTag(CharSequence charSequence) {
        this.f48265F = charSequence;
        return this;
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return (U) assertError(q07.isInstanceOf(cls));
    }

    public final U awaitCount(int i, Runnable runnable) {
        return (U) awaitCount(i, runnable, 5000L);
    }

    public final U assertError(m8d<Throwable> m8dVar) {
        int size = this.f48269c.size();
        if (size != 0) {
            Iterator<Throwable> it = this.f48269c.iterator();
            while (it.hasNext()) {
                try {
                    if (m8dVar.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw m13418a("Error present but other errors as well");
                    }
                } catch (Exception e) {
                    throw j75.wrapOrThrow(e);
                }
            }
            throw m13418a("Error not present");
        }
        throw m13418a("No errors");
    }

    public final boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z = this.f48267a.getCount() == 0 || this.f48267a.await(j, timeUnit);
        this.f48266H = !z;
        return z;
    }

    public final U awaitCount(int i, Runnable runnable, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis >= j) {
                this.f48266H = true;
                break;
            }
            if (this.f48267a.getCount() == 0 || this.f48268b.size() >= i) {
                break;
            }
            runnable.run();
        }
        return this;
    }

    public final boolean awaitTerminalEvent(long j, TimeUnit timeUnit) {
        try {
            return await(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertFailure(m8d<Throwable> m8dVar, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(m8dVar).assertNotComplete();
    }

    public final U assertNever(m8d<? super T> m8dVar) {
        int size = this.f48268b.size();
        for (int i = 0; i < size; i++) {
            try {
                if (m8dVar.test(this.f48268b.get(i))) {
                    throw m13418a("Value at position " + i + " matches predicate " + m8dVar.toString() + ", which was not expected.");
                }
            } catch (Exception e) {
                throw j75.wrapOrThrow(e);
            }
        }
        return this;
    }

    public final U assertValue(m8d<T> m8dVar) {
        assertValueAt(0, (m8d) m8dVar);
        if (this.f48268b.size() <= 1) {
            return this;
        }
        throw m13418a("Value present but other values as well");
    }

    public final U assertValueAt(int i, m8d<T> m8dVar) {
        if (this.f48268b.size() != 0) {
            if (i < this.f48268b.size()) {
                try {
                    if (m8dVar.test(this.f48268b.get(i))) {
                        return this;
                    }
                    throw m13418a("Value not present");
                } catch (Exception e) {
                    throw j75.wrapOrThrow(e);
                }
            }
            throw m13418a("Invalid index: " + i);
        }
        throw m13418a("No values");
    }
}
