package p000;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p000.nyg;

/* JADX INFO: loaded from: classes7.dex */
@la8
@dwf({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n27#2:160\n27#2:162\n27#2:164\n27#2:166\n27#2:168\n27#2:170\n27#2:172\n16#3:161\n16#3:163\n16#3:165\n16#3:167\n16#3:169\n16#3:171\n16#3:173\n1#4:174\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160\n41#1:162\n43#1:164\n51#1:166\n60#1:168\n63#1:170\n72#1:172\n33#1:161\n41#1:163\n43#1:165\n51#1:167\n60#1:169\n63#1:171\n72#1:173\n*E\n"})
public class myg<T extends nyg & Comparable<? super T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f62823b = AtomicIntegerFieldUpdater.newUpdater(myg.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    @gib
    public T[] f62824a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.f62824a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new nyg[4];
            this.f62824a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, getSize() * 2);
        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        T[] tArr3 = (T[]) ((nyg[]) objArrCopyOf);
        this.f62824a = tArr3;
        return tArr3;
    }

    private final void setSize(int i) {
        f62823b.set(this, i);
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void siftDownFrom(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            T extends nyg & java.lang.Comparable<? super T>[] r2 = r5.f62824a
            p000.md8.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            p000.md8.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            p000.md8.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            p000.md8.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            p000.md8.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.swap(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.myg.siftDownFrom(int):void");
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.f62824a;
            md8.checkNotNull(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            md8.checkNotNull(t);
            T t2 = tArr[i];
            md8.checkNotNull(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void swap(int i, int i2) {
        T[] tArr = this.f62824a;
        md8.checkNotNull(tArr);
        T t = tArr[i2];
        md8.checkNotNull(t);
        T t2 = tArr[i];
        md8.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    @yjd
    public final void addImpl(@yfb T t) {
        t.setHeap(this);
        nyg[] nygVarArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        nygVarArrRealloc[size] = t;
        t.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(@yfb T t) {
        synchronized (this) {
            addImpl(t);
            bth bthVar = bth.f14751a;
        }
    }

    public final boolean addLastIf(@yfb T t, @yfb qy6<? super T, Boolean> qy6Var) {
        boolean z;
        synchronized (this) {
            try {
                if (qy6Var.invoke(firstImpl()).booleanValue()) {
                    addImpl(t);
                    z = true;
                } else {
                    z = false;
                }
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return z;
    }

    @gib
    public final T find(@yfb qy6<? super T, Boolean> qy6Var) {
        T t;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    t = null;
                    if (i >= size) {
                        break;
                    }
                    T[] tArr = this.f62824a;
                    if (tArr != null) {
                        t = (Object) tArr[i];
                    }
                    md8.checkNotNull(t);
                    if (qy6Var.invoke(t).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    @gib
    @yjd
    public final T firstImpl() {
        T[] tArr = this.f62824a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return f62823b.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    @gib
    public final T peek() {
        T t;
        synchronized (this) {
            t = (T) firstImpl();
        }
        return t;
    }

    public final boolean remove(@yfb T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    @p000.yfb
    @p000.yjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T removeAtImpl(int r6) {
        /*
            r5 = this;
            T extends nyg & java.lang.Comparable<? super T>[] r0 = r5.f62824a
            p000.md8.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.setSize(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L3d
            int r1 = r5.getSize()
            r5.swap(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            p000.md8.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            p000.md8.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.swap(r6, r1)
            r5.siftUpFrom(r1)
            goto L3d
        L3a:
            r5.siftDownFrom(r6)
        L3d:
            int r6 = r5.getSize()
            r6 = r0[r6]
            p000.md8.checkNotNull(r6)
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.myg.removeAtImpl(int):nyg");
    }

    @gib
    public final T removeFirstIf(@yfb qy6<? super T, Boolean> qy6Var) {
        synchronized (this) {
            try {
                nyg nygVarFirstImpl = firstImpl();
                T t = null;
                if (nygVarFirstImpl == null) {
                    o28.finallyStart(2);
                    o28.finallyEnd(2);
                    return null;
                }
                if (qy6Var.invoke(nygVarFirstImpl).booleanValue()) {
                    t = (T) removeAtImpl(0);
                }
                o28.finallyStart(1);
                o28.finallyEnd(1);
                return t;
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
    }

    @gib
    public final T removeFirstOrNull() {
        T t;
        synchronized (this) {
            t = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t;
    }
}
