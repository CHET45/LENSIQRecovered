package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000.pp2;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
public abstract class pp2<N extends pp2<N>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71572a = AtomicReferenceFieldUpdater.newUpdater(pp2.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f71573b = AtomicReferenceFieldUpdater.newUpdater(pp2.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public pp2(@gib N n) {
        this._prev$volatile = n;
    }

    private final N getAliveSegmentLeft() {
        N n = (N) getPrev();
        while (n != null && n.isRemoved()) {
            n = (N) f71573b.get(n);
        }
        return n;
    }

    private final N getAliveSegmentRight() {
        pp2 next;
        N n = (N) getNext();
        md8.checkNotNull(n);
        while (n.isRemoved() && (next = n.getNext()) != null) {
            n = (N) next;
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return f71572a.get(this);
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, qy6<Object, ? extends Object> qy6Var) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!C0051a4.m134a(atomicReferenceFieldUpdater, obj, obj2, qy6Var.invoke(obj2)));
    }

    public final void cleanPrev() {
        f71573b.set(this, null);
    }

    @gib
    public final N getNext() {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed == op2.f68243b) {
            return null;
        }
        return (N) nextOrClosed;
    }

    @gib
    public final N getPrev() {
        return (N) f71573b.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        return C0051a4.m134a(f71572a, this, null, op2.f68243b);
    }

    @gib
    public final N nextOrIfClosed(@yfb ny6 ny6Var) {
        Object nextOrClosed = getNextOrClosed();
        if (nextOrClosed != op2.f68243b) {
            return (N) nextOrClosed;
        }
        ny6Var.invoke();
        throw new us8();
    }

    public final void remove() {
        Object obj;
        if (isTail()) {
            return;
        }
        while (true) {
            pp2 aliveSegmentLeft = getAliveSegmentLeft();
            pp2 aliveSegmentRight = getAliveSegmentRight();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71573b;
            do {
                obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
            } while (!C0051a4.m134a(atomicReferenceFieldUpdater, aliveSegmentRight, obj, ((pp2) obj) == null ? null : aliveSegmentLeft));
            if (aliveSegmentLeft != null) {
                f71572a.set(aliveSegmentLeft, aliveSegmentRight);
            }
            if (!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) {
                if (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved()) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(@yfb N n) {
        return C0051a4.m134a(f71572a, this, null, n);
    }
}
