package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
public final class yu1<E> extends sue<yu1<E>> {

    /* JADX INFO: renamed from: e */
    @gib
    public final kf1<E> f102978e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReferenceArray f102979f;

    public yu1(long j, @gib yu1<E> yu1Var, @gib kf1<E> kf1Var, int i) {
        super(j, yu1Var, i);
        this.f102978e = kf1Var;
        this.f102979f = new AtomicReferenceArray(lf1.f57431b * 2);
    }

    private final /* synthetic */ AtomicReferenceArray getData() {
        return this.f102979f;
    }

    private final void setElementLazy(int i, Object obj) {
        getData().set(i * 2, obj);
    }

    public final boolean casState$kotlinx_coroutines_core(int i, @gib Object obj, @gib Object obj2) {
        return bag.m3024a(getData(), (i * 2) + 1, obj, obj2);
    }

    public final void cleanElement$kotlinx_coroutines_core(int i) {
        setElementLazy(i, null);
    }

    @gib
    public final Object getAndSetState$kotlinx_coroutines_core(int i, @gib Object obj) {
        return getData().getAndSet((i * 2) + 1, obj);
    }

    @yfb
    public final kf1<E> getChannel() {
        kf1<E> kf1Var = this.f102978e;
        md8.checkNotNull(kf1Var);
        return kf1Var;
    }

    public final E getElement$kotlinx_coroutines_core(int i) {
        return (E) getData().get(i * 2);
    }

    @Override // p000.sue
    public int getNumberOfSlots() {
        return lf1.f57431b;
    }

    @gib
    public final Object getState$kotlinx_coroutines_core(int i) {
        return getData().get((i * 2) + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        cleanElement$kotlinx_coroutines_core(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = getChannel().f53834b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        p000.z4c.callUndeliveredElement(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // p000.sue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCancellation(int r4, @p000.gib java.lang.Throwable r5, @p000.yfb p000.e13 r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = p000.lf1.f57431b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.getElement$kotlinx_coroutines_core(r4)
        Le:
            java.lang.Object r1 = r3.getState$kotlinx_coroutines_core(r4)
            boolean r2 = r1 instanceof p000.wgi
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof p000.xgi
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            qhg r2 = p000.lf1.access$getINTERRUPTED_SEND$p()
            if (r1 == r2) goto L63
            qhg r2 = p000.lf1.access$getINTERRUPTED_RCV$p()
            if (r1 != r2) goto L28
            goto L63
        L28:
            qhg r2 = p000.lf1.access$getRESUMING_BY_EB$p()
            if (r1 == r2) goto Le
            qhg r2 = p000.lf1.access$getRESUMING_BY_RCV$p()
            if (r1 != r2) goto L35
            goto Le
        L35:
            qhg r4 = p000.lf1.access$getDONE_RCV$p()
            if (r1 == r4) goto L62
            qhg r4 = p000.lf1.f57435f
            if (r1 != r4) goto L40
            goto L62
        L40:
            qhg r4 = p000.lf1.getCHANNEL_CLOSED()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.cleanElement$kotlinx_coroutines_core(r4)
            if (r0 == 0) goto L73
            kf1 r4 = r3.getChannel()
            qy6<E, bth> r4 = r4.f53834b
            if (r4 == 0) goto L73
            p000.z4c.callUndeliveredElement(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            qhg r2 = p000.lf1.access$getINTERRUPTED_SEND$p()
            goto L7f
        L7b:
            qhg r2 = p000.lf1.access$getINTERRUPTED_RCV$p()
        L7f:
            boolean r1 = r3.casState$kotlinx_coroutines_core(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.cleanElement$kotlinx_coroutines_core(r4)
            r1 = r0 ^ 1
            r3.onCancelledRequest(r4, r1)
            if (r0 == 0) goto L9a
            kf1 r4 = r3.getChannel()
            qy6<E, bth> r4 = r4.f53834b
            if (r4 == 0) goto L9a
            p000.z4c.callUndeliveredElement(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yu1.onCancellation(int, java.lang.Throwable, e13):void");
    }

    public final void onCancelledRequest(int i, boolean z) {
        if (z) {
            getChannel().waitExpandBufferCompletion$kotlinx_coroutines_core((this.f82931c * ((long) lf1.f57431b)) + ((long) i));
        }
        onSlotCleaned();
    }

    public final E retrieveElement$kotlinx_coroutines_core(int i) {
        E element$kotlinx_coroutines_core = getElement$kotlinx_coroutines_core(i);
        cleanElement$kotlinx_coroutines_core(i);
        return element$kotlinx_coroutines_core;
    }

    public final void setState$kotlinx_coroutines_core(int i, @gib Object obj) {
        getData().set((i * 2) + 1, obj);
    }

    public final void storeElement$kotlinx_coroutines_core(int i, E e) {
        setElementLazy(i, e);
    }
}
