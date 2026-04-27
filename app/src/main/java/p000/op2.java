package p000;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,265:1\n42#1,8:280\n103#2,7:266\n103#2,7:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n70#1:280,8\n23#1:266,7\n81#1:273,7\n*E\n"})
public final class op2 {

    /* JADX INFO: renamed from: a */
    public static final int f68242a = 16;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final qhg f68243b = new qhg("CLOSED");

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, qy6<? super Integer, Boolean> qy6Var) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!qy6Var.invoke(Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i, int i2, qy6<? super Integer, Boolean> qy6Var) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!qy6Var.invoke(Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    @yfb
    public static final <N extends pp2<N>> N close(@yfb N n) {
        while (true) {
            Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == f68243b) {
                return n;
            }
            pp2 pp2Var = (pp2) nextOrClosed;
            if (pp2Var != null) {
                n = (N) pp2Var;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }

    public static final /* synthetic */ <S extends sue<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j, S s, gz6<? super Long, ? super S, ? extends S> gz6Var) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(s, j, gz6Var);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceFieldUpdater.get(obj);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (C0051a4.m134a(atomicReferenceFieldUpdater, obj, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    public static final /* synthetic */ <S extends sue<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, long j, S s, gz6<? super Long, ? super S, ? extends S> gz6Var) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(s, j, gz6Var);
            if (!ave.m27899isClosedimpl(objFindSegmentInternal)) {
                sue sueVarM27897getSegmentimpl = ave.m27897getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    sue sueVar = (sue) atomicReferenceArray.get(i);
                    if (sueVar.f82931c >= sueVarM27897getSegmentimpl.f82931c) {
                        break loop0;
                    }
                    if (!sueVarM27897getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (bag.m3024a(atomicReferenceArray, i, sueVar, sueVarM27897getSegmentimpl)) {
                        if (sueVar.decPointers$kotlinx_coroutines_core()) {
                            sueVar.remove();
                        }
                    } else if (sueVarM27897getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        sueVarM27897getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    @yfb
    public static final <S extends sue<S>> Object findSegmentInternal(@yfb S s, long j, @yfb gz6<? super Long, ? super S, ? extends S> gz6Var) {
        while (true) {
            if (s.f82931c >= j && !s.isRemoved()) {
                return ave.m27894constructorimpl(s);
            }
            Object nextOrClosed = s.getNextOrClosed();
            if (nextOrClosed == f68243b) {
                return ave.m27894constructorimpl(f68243b);
            }
            S sInvoke = (S) ((pp2) nextOrClosed);
            if (sInvoke == null) {
                sInvoke = gz6Var.invoke(Long.valueOf(s.f82931c + 1), s);
                if (s.trySetNext(sInvoke)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = (Object) sInvoke;
        }
    }

    public static final /* synthetic */ <S extends sue<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s) {
        while (true) {
            sue sueVar = (sue) atomicReferenceFieldUpdater.get(obj);
            if (sueVar.f82931c >= s.f82931c) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (C0051a4.m134a(atomicReferenceFieldUpdater, obj, sueVar, s)) {
                if (sueVar.decPointers$kotlinx_coroutines_core()) {
                    sueVar.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }

    public static final /* synthetic */ <S extends sue<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            sue sueVar = (sue) atomicReferenceArray.get(i);
            if (sueVar.f82931c >= s.f82931c) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (bag.m3024a(atomicReferenceArray, i, sueVar, s)) {
                if (sueVar.decPointers$kotlinx_coroutines_core()) {
                    sueVar.remove();
                }
                return true;
            }
            if (s.decPointers$kotlinx_coroutines_core()) {
                s.remove();
            }
        }
    }
}
