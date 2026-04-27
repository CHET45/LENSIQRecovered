package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@la8
@dwf({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public class lh9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f57619a = AtomicReferenceFieldUpdater.newUpdater(lh9.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f57620b = AtomicReferenceFieldUpdater.newUpdater(lh9.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f57621c = AtomicReferenceFieldUpdater.newUpdater(lh9.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (p000.C0051a4.m134a(p000.lh9.f57619a, r3, r2, ((p000.hzd) r4).f45304a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p000.lh9 correctPrev() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r0 = r0.get(r7)
            lh9 r0 = (p000.lh9) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_next$volatile$FU()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_prev$volatile$FU()
            boolean r0 = p000.C0051a4.m134a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof p000.hzd
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_next$volatile$FU()
            hzd r4 = (p000.hzd) r4
            lh9 r4 = r4.f45304a
            boolean r2 = p000.C0051a4.m134a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_prev$volatile$FU()
            java.lang.Object r2 = r4.get(r2)
            lh9 r2 = (p000.lh9) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            p000.md8.checkNotNull(r4, r3)
            r3 = r4
            lh9 r3 = (p000.lh9) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh9.correctPrev():lh9");
    }

    private final lh9 findPrevNonRemoved(lh9 lh9Var) {
        while (lh9Var.isRemoved()) {
            lh9Var = (lh9) f57620b.get(lh9Var);
        }
        return lh9Var;
    }

    private final void finishAdd(lh9 lh9Var) {
        lh9 lh9Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f57620b;
        do {
            lh9Var2 = (lh9) atomicReferenceFieldUpdater.get(lh9Var);
            if (getNext() != lh9Var) {
                return;
            }
        } while (!C0051a4.m134a(f57620b, lh9Var, lh9Var2, this));
        if (isRemoved()) {
            lh9Var.correctPrev();
        }
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ Object get_removedRef$volatile() {
        return this._removedRef$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, bth> qy6Var) {
        while (true) {
            qy6Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final hzd removed() {
        hzd hzdVar = (hzd) f57621c.get(this);
        if (hzdVar != null) {
            return hzdVar;
        }
        hzd hzdVar2 = new hzd(this);
        f57621c.set(this, hzdVar2);
        return hzdVar2;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void set_removedRef$volatile(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final boolean addLast(@yfb lh9 lh9Var, int i) {
        lh9 prevNode;
        do {
            prevNode = getPrevNode();
            if (prevNode instanceof n89) {
                return (((n89) prevNode).f63491d & i) == 0 && prevNode.addLast(lh9Var, i);
            }
        } while (!prevNode.addNext(lh9Var, this));
        return true;
    }

    @yjd
    public final boolean addNext(@yfb lh9 lh9Var, @yfb lh9 lh9Var2) {
        f57620b.set(lh9Var, this);
        f57619a.set(lh9Var, lh9Var2);
        if (!C0051a4.m134a(f57619a, this, lh9Var2, lh9Var)) {
            return false;
        }
        lh9Var.finishAdd(lh9Var2);
        return true;
    }

    public final boolean addOneIfEmpty(@yfb lh9 lh9Var) {
        f57620b.set(lh9Var, this);
        f57619a.set(lh9Var, this);
        while (getNext() == this) {
            if (C0051a4.m134a(f57619a, this, this, lh9Var)) {
                lh9Var.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void close(int i) {
        addLast(new n89(i), i);
    }

    @yfb
    public final Object getNext() {
        return f57619a.get(this);
    }

    @yfb
    public final lh9 getNextNode() {
        lh9 lh9Var;
        Object next = getNext();
        hzd hzdVar = next instanceof hzd ? (hzd) next : null;
        if (hzdVar != null && (lh9Var = hzdVar.f45304a) != null) {
            return lh9Var;
        }
        md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (lh9) next;
    }

    @yfb
    public final lh9 getPrevNode() {
        lh9 lh9VarCorrectPrev = correctPrev();
        return lh9VarCorrectPrev == null ? findPrevNonRemoved((lh9) f57620b.get(this)) : lh9VarCorrectPrev;
    }

    public boolean isRemoved() {
        return getNext() instanceof hzd;
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo30525remove() {
        return removeOrNext() == null;
    }

    @gib
    @yjd
    public final lh9 removeOrNext() {
        Object next;
        lh9 lh9Var;
        do {
            next = getNext();
            if (next instanceof hzd) {
                return ((hzd) next).f45304a;
            }
            if (next == this) {
                return (lh9) next;
            }
            md8.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            lh9Var = (lh9) next;
        } while (!C0051a4.m134a(f57619a, this, next, lh9Var.removed()));
        lh9Var.correctPrev();
        return null;
    }

    @yfb
    public String toString() {
        return new mgd(this) { // from class: lh9.a
            @Override // p000.mgd, p000.ip8
            public Object get() {
                return kk3.getClassSimpleName(this.receiver);
            }
        } + '@' + kk3.getHexAddress(this);
    }

    public final void validateNode$kotlinx_coroutines_core(@yfb lh9 lh9Var, @yfb lh9 lh9Var2) {
    }
}
