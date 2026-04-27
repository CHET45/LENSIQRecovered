package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n27#2:747\n27#2:750\n27#2:769\n27#2:773\n27#2:782\n27#2:793\n27#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n326#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13346#7:755\n13347#7:758\n13346#7:777\n13347#7:780\n13346#7:799\n13347#7:802\n351#8,9:760\n360#8,2:771\n351#8,9:784\n360#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
public class r9f<T> extends AbstractC8190k4<t9f> implements v6b<T>, kq1<T>, a17<T> {

    /* JADX INFO: renamed from: C */
    @gib
    public Object[] f77462C;

    /* JADX INFO: renamed from: F */
    public long f77463F;

    /* JADX INFO: renamed from: H */
    public long f77464H;

    /* JADX INFO: renamed from: L */
    public int f77465L;

    /* JADX INFO: renamed from: M */
    public int f77466M;

    /* JADX INFO: renamed from: e */
    public final int f77467e;

    /* JADX INFO: renamed from: f */
    public final int f77468f;

    /* JADX INFO: renamed from: m */
    @yfb
    public final gf1 f77469m;

    /* JADX INFO: renamed from: r9f$a */
    public static final class C11949a implements yf4 {

        /* JADX INFO: renamed from: a */
        @un8
        @yfb
        public final r9f<?> f77470a;

        /* JADX INFO: renamed from: b */
        @un8
        public long f77471b;

        /* JADX INFO: renamed from: c */
        @gib
        @un8
        public final Object f77472c;

        /* JADX INFO: renamed from: d */
        @un8
        @yfb
        public final zy2<bth> f77473d;

        /* JADX WARN: Multi-variable type inference failed */
        public C11949a(@yfb r9f<?> r9fVar, long j, @gib Object obj, @yfb zy2<? super bth> zy2Var) {
            this.f77470a = r9fVar;
            this.f77471b = j;
            this.f77472c = obj;
            this.f77473d = zy2Var;
        }

        @Override // p000.yf4
        public void dispose() {
            this.f77470a.cancelEmitter(this);
        }
    }

    /* JADX INFO: renamed from: r9f$b */
    public /* synthetic */ class C11950b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f77474a;

        static {
            int[] iArr = new int[gf1.values().length];
            try {
                iArr[gf1.f39657a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gf1.f39659c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gf1.f39658b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77474a = iArr;
        }
    }

    /* JADX INFO: renamed from: r9f$c */
    @ck3(m4009c = "kotlinx.coroutines.flow.SharedFlowImpl", m4010f = "SharedFlow.kt", m4011i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m4012l = {387, 394, 397}, m4013m = "collect$suspendImpl", m4014n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, m4015s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C11951c<T> extends cz2 {

        /* JADX INFO: renamed from: a */
        public Object f77475a;

        /* JADX INFO: renamed from: b */
        public Object f77476b;

        /* JADX INFO: renamed from: c */
        public Object f77477c;

        /* JADX INFO: renamed from: d */
        public Object f77478d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f77479e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ r9f<T> f77480f;

        /* JADX INFO: renamed from: m */
        public int f77481m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11951c(r9f<T> r9fVar, zy2<? super C11951c> zy2Var) {
            super(zy2Var);
            this.f77480f = r9fVar;
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            this.f77479e = obj;
            this.f77481m |= Integer.MIN_VALUE;
            return r9f.m21094f(this.f77480f, null, this);
        }
    }

    public r9f(int i, int i2, @yfb gf1 gf1Var) {
        this.f77467e = i;
        this.f77468f = i2;
        this.f77469m = gf1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(t9f t9fVar, zy2<? super bth> zy2Var) {
        bth bthVar;
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(t9fVar) < 0) {
                    t9fVar.f84056b = fq1Var;
                } else {
                    v7e.C13927a c13927a = v7e.f90266b;
                    fq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
                }
                bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bthVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(C11949a c11949a) {
        synchronized (this) {
            if (c11949a.f77471b < getHead()) {
                return;
            }
            Object[] objArr = this.f77462C;
            md8.checkNotNull(objArr);
            if (s9f.getBufferAt(objArr, c11949a.f77471b) != c11949a) {
                return;
            }
            s9f.setBufferAt(objArr, c11949a.f77471b, s9f.f81015a);
            cleanupTailLocked();
            bth bthVar = bth.f14751a;
        }
    }

    private final void cleanupTailLocked() {
        if (this.f77468f != 0 || this.f77466M > 1) {
            Object[] objArr = this.f77462C;
            md8.checkNotNull(objArr);
            while (this.f77466M > 0 && s9f.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == s9f.f81015a) {
                this.f77466M--;
                s9f.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long j) {
        AbstractC9123m4[] abstractC9123m4Arr;
        if (this.f52550b != 0 && (abstractC9123m4Arr = this.f52549a) != null) {
            for (AbstractC9123m4 abstractC9123m4 : abstractC9123m4Arr) {
                if (abstractC9123m4 != null) {
                    t9f t9fVar = (t9f) abstractC9123m4;
                    long j2 = t9fVar.f84055a;
                    if (j2 >= 0 && j2 < j) {
                        t9fVar.f84055a = j;
                    }
                }
            }
        }
        this.f77464H = j;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.f77462C;
        md8.checkNotNull(objArr);
        s9f.setBufferAt(objArr, getHead(), null);
        this.f77465L--;
        long head = getHead() + 1;
        if (this.f77463F < head) {
            this.f77463F = head;
        }
        if (this.f77464H < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t, zy2<? super bth> zy2Var) {
        zy2<bth>[] zy2VarArrFindSlotsToResumeLocked;
        C11949a c11949a;
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        zy2<bth>[] zy2VarArrFindSlotsToResumeLocked2 = C8604l4.f56132a;
        synchronized (this) {
            try {
                if (tryEmitLocked(t)) {
                    v7e.C13927a c13927a = v7e.f90266b;
                    fq1Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
                    zy2VarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(zy2VarArrFindSlotsToResumeLocked2);
                    c11949a = null;
                } else {
                    C11949a c11949a2 = new C11949a(this, ((long) getTotalSize()) + getHead(), t, fq1Var);
                    enqueueLocked(c11949a2);
                    this.f77466M++;
                    if (this.f77468f == 0) {
                        zy2VarArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(zy2VarArrFindSlotsToResumeLocked2);
                    }
                    zy2VarArrFindSlotsToResumeLocked = zy2VarArrFindSlotsToResumeLocked2;
                    c11949a = c11949a2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c11949a != null) {
            hq1.disposeOnCancellation(fq1Var, c11949a);
        }
        for (zy2<bth> zy2Var2 : zy2VarArrFindSlotsToResumeLocked) {
            if (zy2Var2 != null) {
                v7e.C13927a c13927a2 = v7e.f90266b;
                zy2Var2.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result == pd8.getCOROUTINE_SUSPENDED() ? result : bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.f77462C;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        s9f.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object m21094f(p000.r9f<T> r8, p000.t66<? super T> r9, p000.zy2<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r9f.m21094f(r9f, t66, zy2):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [zy2<bth>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final zy2<bth>[] findSlotsToResumeLocked(zy2<bth>[] zy2VarArr) {
        AbstractC9123m4[] abstractC9123m4Arr;
        t9f t9fVar;
        zy2<? super bth> zy2Var;
        int length = zy2VarArr.length;
        if (this.f52550b != 0 && (abstractC9123m4Arr = this.f52549a) != null) {
            int length2 = abstractC9123m4Arr.length;
            int i = 0;
            zy2VarArr = zy2VarArr;
            while (i < length2) {
                AbstractC9123m4 abstractC9123m4 = abstractC9123m4Arr[i];
                if (abstractC9123m4 != null && (zy2Var = (t9fVar = (t9f) abstractC9123m4).f84056b) != null && tryPeekLocked(t9fVar) >= 0) {
                    int length3 = zy2VarArr.length;
                    zy2VarArr = zy2VarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) zy2VarArr, Math.max(2, zy2VarArr.length * 2));
                        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        zy2VarArr = objArrCopyOf;
                    }
                    ((zy2[]) zy2VarArr)[length] = zy2Var;
                    t9fVar.f84056b = null;
                    length++;
                }
                i++;
                zy2VarArr = zy2VarArr;
            }
        }
        return (zy2[]) zy2VarArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.f77465L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.f77464H, this.f77463F);
    }

    private final Object getPeekedValueLockedAt(long j) {
        Object[] objArr = this.f77462C;
        md8.checkNotNull(objArr);
        Object bufferAt = s9f.getBufferAt(objArr, j);
        return bufferAt instanceof C11949a ? ((C11949a) bufferAt).f77472c : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.f77465L) + ((long) this.f77466M);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.f77465L)) - this.f77463F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.f77465L + this.f77466M;
    }

    private final Object[] growBuffer(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f77462C = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long head = getHead();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + head;
            s9f.setBufferAt(objArr2, j, s9f.getBufferAt(objArr, j));
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ <T> Object m21095i(r9f<T> r9fVar, T t, zy2<? super bth> zy2Var) {
        Object objEmitSuspend;
        return (!r9fVar.tryEmit(t) && (objEmitSuspend = r9fVar.emitSuspend(t, zy2Var)) == pd8.getCOROUTINE_SUSPENDED()) ? objEmitSuspend : bth.f14751a;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m21096k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t) {
        if (m14489d() == 0) {
            return tryEmitNoCollectorsLocked(t);
        }
        if (this.f77465L >= this.f77468f && this.f77464H <= this.f77463F) {
            int i = C11950b.f77474a[this.f77469m.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new ceb();
            }
        }
        enqueueLocked(t);
        int i2 = this.f77465L + 1;
        this.f77465L = i2;
        if (i2 > this.f77468f) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.f77467e) {
            updateBufferLocked(this.f77463F + 1, this.f77464H, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t) {
        if (this.f77467e == 0) {
            return true;
        }
        enqueueLocked(t);
        int i = this.f77465L + 1;
        this.f77465L = i;
        if (i > this.f77467e) {
            dropOldestLocked();
        }
        this.f77464H = getHead() + ((long) this.f77465L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(t9f t9fVar) {
        long j = t9fVar.f84055a;
        if (j < getBufferEndIndex()) {
            return j;
        }
        if (this.f77468f <= 0 && j <= getHead() && this.f77466M != 0) {
            return j;
        }
        return -1L;
    }

    private final Object tryTakeValue(t9f t9fVar) {
        Object obj;
        zy2<bth>[] zy2VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = C8604l4.f56132a;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(t9fVar);
                if (jTryPeekLocked < 0) {
                    obj = s9f.f81015a;
                } else {
                    long j = t9fVar.f84055a;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    t9fVar.f84055a = jTryPeekLocked + 1;
                    zy2VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (zy2<bth> zy2Var : zy2VarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (zy2Var != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.f77462C;
            md8.checkNotNull(objArr);
            s9f.setBufferAt(objArr, head, null);
        }
        this.f77463F = j;
        this.f77464H = j2;
        this.f77465L = (int) (j3 - jMin);
        this.f77466M = (int) (j4 - j3);
    }

    @Override // p000.q9f, p000.y56
    @gib
    public Object collect(@yfb t66<? super T> t66Var, @yfb zy2<?> zy2Var) {
        return m21094f(this, t66Var, zy2Var);
    }

    @Override // p000.v6b, p000.t66
    @gib
    public Object emit(T t, @yfb zy2<? super bth> zy2Var) {
        return m21095i(this, t, zy2Var);
    }

    @Override // p000.a17
    @yfb
    public y56<T> fuse(@yfb e13 e13Var, int i, @yfb gf1 gf1Var) {
        return s9f.fuseSharedFlow(this, e13Var, i, gf1Var);
    }

    @Override // p000.AbstractC8190k4
    @yfb
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public t9f createSlot() {
        return new t9f();
    }

    @Override // p000.q9f
    @yfb
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return l82.emptyList();
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.f77462C;
            md8.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(s9f.getBufferAt(objArr, this.f77463F + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // p000.AbstractC8190k4
    @yfb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t9f[] createSlotArray(int i) {
        return new t9f[i];
    }

    /* JADX INFO: renamed from: j */
    public final T m21099j() {
        Object[] objArr = this.f77462C;
        md8.checkNotNull(objArr);
        return (T) s9f.getBufferAt(objArr, (this.f77463F + ((long) getReplaySize())) - 1);
    }

    @Override // p000.v6b
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.f77464H, getBufferEndIndex(), getQueueEndIndex());
            bth bthVar = bth.f14751a;
        }
    }

    @Override // p000.v6b
    public boolean tryEmit(T t) {
        int i;
        boolean z;
        zy2<bth>[] zy2VarArrFindSlotsToResumeLocked = C8604l4.f56132a;
        synchronized (this) {
            if (tryEmitLocked(t)) {
                zy2VarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(zy2VarArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (zy2<bth> zy2Var : zy2VarArrFindSlotsToResumeLocked) {
            if (zy2Var != null) {
                v7e.C13927a c13927a = v7e.f90266b;
                zy2Var.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            }
        }
        return z;
    }

    @yfb
    public final zy2<bth>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        long j4;
        AbstractC9123m4[] abstractC9123m4Arr;
        if (j > this.f77464H) {
            return C8604l4.f56132a;
        }
        long head = getHead();
        long j5 = ((long) this.f77465L) + head;
        if (this.f77468f == 0 && this.f77466M > 0) {
            j5++;
        }
        if (this.f52550b != 0 && (abstractC9123m4Arr = this.f52549a) != null) {
            for (AbstractC9123m4 abstractC9123m4 : abstractC9123m4Arr) {
                if (abstractC9123m4 != null) {
                    long j6 = ((t9f) abstractC9123m4).f84055a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f77464H) {
            return C8604l4.f56132a;
        }
        long bufferEndIndex = getBufferEndIndex();
        int iMin = m14489d() > 0 ? Math.min(this.f77466M, this.f77468f - ((int) (bufferEndIndex - j5))) : this.f77466M;
        zy2<bth>[] zy2VarArr = C8604l4.f56132a;
        long j7 = ((long) this.f77466M) + bufferEndIndex;
        if (iMin > 0) {
            zy2VarArr = new zy2[iMin];
            Object[] objArr = this.f77462C;
            md8.checkNotNull(objArr);
            long j8 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                Object bufferAt = s9f.getBufferAt(objArr, bufferEndIndex);
                j2 = j5;
                qhg qhgVar = s9f.f81015a;
                if (bufferAt != qhgVar) {
                    md8.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C11949a c11949a = (C11949a) bufferAt;
                    int i2 = i + 1;
                    j3 = j7;
                    zy2VarArr[i] = c11949a.f77473d;
                    s9f.setBufferAt(objArr, bufferEndIndex, qhgVar);
                    s9f.setBufferAt(objArr, j8, c11949a.f77472c);
                    j4 = 1;
                    j8++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j3 = j7;
                    j4 = 1;
                }
                bufferEndIndex += j4;
                j5 = j2;
                j7 = j3;
            }
            bufferEndIndex = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (bufferEndIndex - head);
        long j9 = m14489d() == 0 ? bufferEndIndex : j2;
        long jMax = Math.max(this.f77463F, bufferEndIndex - ((long) Math.min(this.f77467e, i3)));
        if (this.f77468f == 0 && jMax < j3) {
            Object[] objArr2 = this.f77462C;
            md8.checkNotNull(objArr2);
            if (md8.areEqual(s9f.getBufferAt(objArr2, jMax), s9f.f81015a)) {
                bufferEndIndex++;
                jMax++;
            }
        }
        updateBufferLocked(jMax, j9, bufferEndIndex, j3);
        cleanupTailLocked();
        return !(zy2VarArr.length == 0) ? findSlotsToResumeLocked(zy2VarArr) : zy2VarArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.f77463F;
        if (j < this.f77464H) {
            this.f77464H = j;
        }
        return j;
    }
}
