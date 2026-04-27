package p000;

import java.util.concurrent.CancellationException;
import p000.qv2;
import p000.v7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1208#2:139\n1187#2,2:140\n53#3:142\n523#3:143\n523#3:144\n492#3,11:145\n53#3:156\n523#3:157\n48#3:158\n664#3,2:159\n523#3:161\n13579#4,2:162\n1#5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:139\n43#1:140,2\n72#1:142\n73#1:143\n91#1:144\n107#1:145,11\n111#1:156\n112#1:157\n121#1:158\n132#1:159,2\n132#1:161\n132#1:162,2\n*E\n"})
@e0g(parameters = 0)
public final class ld1 {

    /* JADX INFO: renamed from: b */
    public static final int f57224b = f7b.f35631d;

    /* JADX INFO: renamed from: a */
    @yfb
    public final f7b<qv2.C11708a> f57225a = new f7b<>(new qv2.C11708a[16], 0);

    /* JADX INFO: renamed from: ld1$a */
    public static final class C8774a extends tt8 implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qv2.C11708a f57227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8774a(qv2.C11708a c11708a) {
            super(1);
            this.f57227b = c11708a;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@gib Throwable th) {
            ld1.this.f57225a.remove(this.f57227b);
        }
    }

    public final void cancelAndRemoveAll(@gib Throwable th) {
        f7b<qv2.C11708a> f7bVar = this.f57225a;
        int size = f7bVar.getSize();
        dq1[] dq1VarArr = new dq1[size];
        for (int i = 0; i < size; i++) {
            dq1VarArr[i] = f7bVar.getContent()[i].getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            dq1VarArr[i2].cancel(th);
        }
        if (!this.f57225a.isEmpty()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean enqueue(@yfb qv2.C11708a c11708a) {
        rud rudVarInvoke = c11708a.getCurrentBounds().invoke();
        if (rudVarInvoke == null) {
            dq1<bth> continuation = c11708a.getContinuation();
            v7e.C13927a c13927a = v7e.f90266b;
            continuation.resumeWith(v7e.m32723constructorimpl(bth.f14751a));
            return false;
        }
        c11708a.getContinuation().invokeOnCancellation(new C8774a(c11708a));
        f78 f78Var = new f78(0, this.f57225a.getSize() - 1);
        int first = f78Var.getFirst();
        int last = f78Var.getLast();
        if (first <= last) {
            while (true) {
                rud rudVarInvoke2 = this.f57225a.getContent()[last].getCurrentBounds().invoke();
                if (rudVarInvoke2 != null) {
                    rud rudVarIntersect = rudVarInvoke.intersect(rudVarInvoke2);
                    if (md8.areEqual(rudVarIntersect, rudVarInvoke)) {
                        this.f57225a.add(last + 1, c11708a);
                        return true;
                    }
                    if (!md8.areEqual(rudVarIntersect, rudVarInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.f57225a.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.f57225a.getContent()[last].getContinuation().cancel(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.f57225a.add(0, c11708a);
        return true;
    }

    public final void forEachFromSmallest(@yfb qy6<? super rud, bth> qy6Var) {
        f7b f7bVar = this.f57225a;
        int size = f7bVar.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = f7bVar.getContent();
            do {
                qy6Var.invoke(((qv2.C11708a) content[i]).getCurrentBounds().invoke());
                i--;
            } while (i >= 0);
        }
    }

    public final int getSize() {
        return this.f57225a.getSize();
    }

    public final boolean isEmpty() {
        return this.f57225a.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        f78 f78Var = new f78(0, this.f57225a.getSize() - 1);
        int first = f78Var.getFirst();
        int last = f78Var.getLast();
        if (first <= last) {
            while (true) {
                dq1<bth> continuation = this.f57225a.getContent()[first].getContinuation();
                bth bthVar = bth.f14751a;
                v7e.C13927a c13927a = v7e.f90266b;
                continuation.resumeWith(v7e.m32723constructorimpl(bthVar));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.f57225a.clear();
    }

    public final void resumeAndRemoveWhile(@yfb qy6<? super rud, Boolean> qy6Var) {
        while (this.f57225a.isNotEmpty() && qy6Var.invoke(((qv2.C11708a) this.f57225a.last()).getCurrentBounds().invoke()).booleanValue()) {
            dq1<bth> continuation = ((qv2.C11708a) this.f57225a.removeAt(this.f57225a.getSize() - 1)).getContinuation();
            bth bthVar = bth.f14751a;
            v7e.C13927a c13927a = v7e.f90266b;
            continuation.resumeWith(v7e.m32723constructorimpl(bthVar));
        }
    }
}
