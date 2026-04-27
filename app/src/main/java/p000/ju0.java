package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p000.ju0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ju0<T, U extends ju0<T, U>> {

    /* JADX INFO: renamed from: C */
    public boolean f51820C;

    /* JADX INFO: renamed from: d */
    public long f51824d;

    /* JADX INFO: renamed from: e */
    public Thread f51825e;

    /* JADX INFO: renamed from: f */
    public boolean f51826f;

    /* JADX INFO: renamed from: m */
    public CharSequence f51827m;

    /* JADX INFO: renamed from: b */
    public final List<T> f51822b = new dgi();

    /* JADX INFO: renamed from: c */
    public final List<Throwable> f51823c = new dgi();

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f51821a = new CountDownLatch(1);

    @cfb
    public static String valueAndClass(@dib Object o) {
        if (o == null) {
            return "null";
        }
        return o + " (class: " + o.getClass().getSimpleName() + c0b.f15434d;
    }

    @cfb
    /* JADX INFO: renamed from: a */
    public abstract U mo8645a();

    @cfb
    public final U assertComplete() {
        long j = this.f51824d;
        if (j == 0) {
            throw m14306b("Not completed");
        }
        if (j <= 1) {
            return this;
        }
        throw m14306b("Multiple completions: " + j);
    }

    @cfb
    public final U assertEmpty() {
        return (U) mo8645a().assertNoValues().assertNoErrors().assertNotComplete();
    }

    @cfb
    public final U assertError(@cfb Throwable th) {
        return (U) assertError(r07.equalsWith(th), true);
    }

    @SafeVarargs
    @cfb
    public final U assertFailure(@cfb Class<? extends Throwable> cls, @cfb T... tArr) {
        return (U) mo8645a().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    @cfb
    public final U assertNoErrors() {
        if (this.f51823c.size() == 0) {
            return this;
        }
        throw m14306b("Error(s) present: " + this.f51823c);
    }

    @cfb
    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    @cfb
    public final U assertNotComplete() {
        long j = this.f51824d;
        if (j == 1) {
            throw m14306b("Completed!");
        }
        if (j <= 1) {
            return this;
        }
        throw m14306b("Multiple completions: " + j);
    }

    @SafeVarargs
    @cfb
    public final U assertResult(@cfb T... tArr) {
        return (U) mo8645a().assertValues(tArr).assertNoErrors().assertComplete();
    }

    @cfb
    public final U assertValue(@cfb T value) {
        if (this.f51822b.size() != 1) {
            throw m14306b("\nexpected: " + valueAndClass(value) + "\ngot: " + this.f51822b);
        }
        T t = this.f51822b.get(0);
        if (Objects.equals(value, t)) {
            return this;
        }
        throw m14306b("\nexpected: " + valueAndClass(value) + "\ngot: " + valueAndClass(t));
    }

    @cfb
    public final U assertValueAt(int index, @cfb T value) {
        int size = this.f51822b.size();
        if (size == 0) {
            throw m14306b("No values");
        }
        if (index < 0 || index >= size) {
            throw m14306b("Index " + index + " is out of range [0, " + size + c0b.f15434d);
        }
        T t = this.f51822b.get(index);
        if (Objects.equals(value, t)) {
            return this;
        }
        throw m14306b("\nexpected: " + valueAndClass(value) + "\ngot: " + valueAndClass(t) + "; Value at position " + index + " differ");
    }

    @cfb
    public final U assertValueCount(int count) {
        int size = this.f51822b.size();
        if (size == count) {
            return this;
        }
        throw m14306b("\nexpected: " + count + "\ngot: " + size + "; Value counts differ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r2 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        throw m14306b("Fewer values received than expected (" + r1 + p000.c0b.f15434d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        throw m14306b("More values received than expected (" + r1 + p000.c0b.f15434d);
     */
    @p000.cfb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U assertValueSequence(@p000.cfb java.lang.Iterable<? extends T> r6) {
        /*
            r5 = this;
            java.util.List<T> r0 = r5.f51822b
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r6 = r6.iterator()
            r1 = 0
        Lb:
            boolean r2 = r6.hasNext()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5c
            if (r2 != 0) goto L18
            goto L5c
        L18:
            java.lang.Object r2 = r6.next()
            java.lang.Object r3 = r0.next()
            boolean r4 = java.util.Objects.equals(r2, r3)
            if (r4 == 0) goto L29
            int r1 = r1 + 1
            goto Lb
        L29:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "\nexpected: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r2)
            r6.append(r0)
            java.lang.String r0 = "\ngot: "
            r6.append(r0)
            java.lang.String r0 = valueAndClass(r3)
            r6.append(r0)
            java.lang.String r0 = "; Value at position "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = " differ"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.AssertionError r6 = r5.m14306b(r6)
            throw r6
        L5c:
            java.lang.String r6 = ")"
            if (r3 != 0) goto L7c
            if (r2 != 0) goto L63
            return r5
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Fewer values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.m14306b(r6)
            throw r6
        L7c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "More values received than expected ("
            r0.append(r2)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.AssertionError r6 = r5.m14306b(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ju0.assertValueSequence(java.lang.Iterable):ju0");
    }

    @SafeVarargs
    @cfb
    public final U assertValues(@cfb T... values) {
        int size = this.f51822b.size();
        if (size != values.length) {
            throw m14306b("\nexpected: " + values.length + C2473f.f17566z + Arrays.toString(values) + "\ngot: " + size + C2473f.f17566z + this.f51822b + "; Value count differs");
        }
        for (int i = 0; i < size; i++) {
            T t = this.f51822b.get(i);
            T t2 = values[i];
            if (!Objects.equals(t2, t)) {
                throw m14306b("\nexpected: " + valueAndClass(t2) + "\ngot: " + valueAndClass(t) + "; Value at position " + i + " differ");
            }
        }
        return this;
    }

    @SafeVarargs
    @cfb
    public final U assertValuesOnly(@cfb T... tArr) {
        return (U) mo8645a().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    @cfb
    public final U await() throws InterruptedException {
        if (this.f51821a.getCount() == 0) {
            return this;
        }
        this.f51821a.await();
        return this;
    }

    @cfb
    public final U awaitCount(int atLeast) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - jCurrentTimeMillis < 5000) {
                if (this.f51821a.getCount() == 0 || this.f51822b.size() >= atLeast) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                this.f51820C = true;
                break;
            }
        }
        return this;
    }

    @cfb
    public final U awaitDone(long time, @cfb TimeUnit unit) {
        try {
            if (!this.f51821a.await(time, unit)) {
                this.f51820C = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw k75.wrapOrThrow(e);
        }
    }

    @cfb
    /* JADX INFO: renamed from: b */
    public final AssertionError m14306b(@cfb String message) {
        StringBuilder sb = new StringBuilder(message.length() + 64);
        sb.append(message);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.f51821a.getCount());
        sb.append(", ");
        sb.append("values = ");
        sb.append(this.f51822b.size());
        sb.append(", ");
        sb.append("errors = ");
        sb.append(this.f51823c.size());
        sb.append(", ");
        sb.append("completions = ");
        sb.append(this.f51824d);
        if (this.f51820C) {
            sb.append(", timeout!");
        }
        if (isDisposed()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.f51827m;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f51823c.isEmpty()) {
            if (this.f51823c.size() == 1) {
                assertionError.initCause(this.f51823c.get(0));
            } else {
                assertionError.initCause(new qm2(this.f51823c));
            }
        }
        return assertionError;
    }

    public abstract void dispose();

    public abstract boolean isDisposed();

    @cfb
    public final List<T> values() {
        return this.f51822b;
    }

    @cfb
    public final U withTag(@dib CharSequence tag) {
        this.f51827m = tag;
        return this;
    }

    @cfb
    public final U assertError(@cfb Class<? extends Throwable> cls) {
        return (U) assertError(r07.isInstanceOf(cls), true);
    }

    @cfb
    public final U assertError(@cfb n8d<Throwable> n8dVar) {
        return (U) assertError(n8dVar, false);
    }

    public final boolean await(long time, @cfb TimeUnit unit) throws InterruptedException {
        boolean z = this.f51821a.getCount() == 0 || this.f51821a.await(time, unit);
        this.f51820C = !z;
        return z;
    }

    @cfb
    private U assertError(@cfb n8d<Throwable> errorPredicate, boolean exact) {
        int size = this.f51823c.size();
        if (size != 0) {
            Iterator<Throwable> it = this.f51823c.iterator();
            while (it.hasNext()) {
                try {
                    if (errorPredicate.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        if (exact) {
                            throw m14306b("Error present but other errors as well");
                        }
                        throw m14306b("One error passed the predicate but other errors are present as well");
                    }
                } catch (Throwable th) {
                    throw k75.wrapOrThrow(th);
                }
            }
            if (exact) {
                throw m14306b("Error not present");
            }
            throw m14306b("No error(s) passed the predicate");
        }
        throw m14306b("No errors");
    }

    @cfb
    public final U assertValue(@cfb n8d<T> valuePredicate) {
        assertValueAt(0, (n8d) valuePredicate);
        if (this.f51822b.size() <= 1) {
            return this;
        }
        throw m14306b("The first value passed the predicate but this consumer received more than one value");
    }

    @cfb
    public final U assertValueAt(int index, @cfb n8d<T> valuePredicate) {
        int size = this.f51822b.size();
        if (size == 0) {
            throw m14306b("No values");
        }
        if (index >= 0 && index < size) {
            T t = this.f51822b.get(index);
            try {
                if (valuePredicate.test(t)) {
                    return this;
                }
                throw m14306b("Value " + valueAndClass(t) + " at position " + index + " did not pass the predicate");
            } catch (Throwable th) {
                throw k75.wrapOrThrow(th);
            }
        }
        throw m14306b("Index " + index + " is out of range [0, " + size + c0b.f15434d);
    }
}
