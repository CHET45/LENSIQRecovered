package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ize extends cze {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ize$a */
    public static final class C7689a<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<Iterator<T>> f49141a;

        /* JADX WARN: Multi-variable type inference failed */
        public C7689a(ny6<? extends Iterator<? extends T>> ny6Var) {
            this.f49141a = ny6Var;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return this.f49141a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ize$b */
    @dwf({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,22:1\n30#2:23\n*E\n"})
    public static final class C7690b<T> implements vye<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f49142a;

        public C7690b(Iterator it) {
            this.f49142a = it;
        }

        @Override // p000.vye
        public Iterator<T> iterator() {
            return this.f49142a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: ize$c */
    @ck3(m4009c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m4010f = "Sequences.kt", m4011i = {0, 0}, m4012l = {350}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "index"}, m4015s = {"L$0", "I$0"})
    public static final class C7691c<R> extends t7e implements gz6<xye<? super R>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f49143a;

        /* JADX INFO: renamed from: b */
        public int f49144b;

        /* JADX INFO: renamed from: c */
        public int f49145c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f49146d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vye<T> f49147e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gz6<Integer, T, C> f49148f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ qy6<C, Iterator<R>> f49149m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7691c(vye<? extends T> vyeVar, gz6<? super Integer, ? super T, ? extends C> gz6Var, qy6<? super C, ? extends Iterator<? extends R>> qy6Var, zy2<? super C7691c> zy2Var) {
            super(2, zy2Var);
            this.f49147e = vyeVar;
            this.f49148f = gz6Var;
            this.f49149m = qy6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C7691c c7691c = new C7691c(this.f49147e, this.f49148f, this.f49149m, zy2Var);
            c7691c.f49146d = obj;
            return c7691c;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super R> xyeVar, zy2<? super bth> zy2Var) {
            return ((C7691c) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            xye xyeVar;
            int i;
            Iterator it;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i2 = this.f49145c;
            if (i2 == 0) {
                y7e.throwOnFailure(obj);
                xyeVar = (xye) this.f49146d;
                i = 0;
                it = this.f49147e.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.f49144b;
                it = (Iterator) this.f49143a;
                xyeVar = (xye) this.f49146d;
                y7e.throwOnFailure(obj);
                i = i3;
            }
            while (it.hasNext()) {
                Object next = it.next();
                gz6<Integer, T, C> gz6Var = this.f49148f;
                int i4 = i + 1;
                if (i < 0) {
                    l82.throwIndexOverflow();
                }
                Iterator<R> itInvoke = this.f49149m.invoke((C) gz6Var.invoke(wc1.boxInt(i), (T) next));
                this.f49146d = xyeVar;
                this.f49143a = it;
                this.f49144b = i4;
                this.f49145c = 1;
                if (xyeVar.yieldAll(itInvoke, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i4;
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ize$d */
    @ck3(m4009c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m4010f = "Sequences.kt", m4011i = {}, m4012l = {69, 71}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
    public static final class C7692d<T> extends t7e implements gz6<xye<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public int f49150a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f49151b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vye<T> f49152c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ny6<vye<T>> f49153d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7692d(vye<? extends T> vyeVar, ny6<? extends vye<? extends T>> ny6Var, zy2<? super C7692d> zy2Var) {
            super(2, zy2Var);
            this.f49152c = vyeVar;
            this.f49153d = ny6Var;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C7692d c7692d = new C7692d(this.f49152c, this.f49153d, zy2Var);
            c7692d.f49151b = obj;
            return c7692d;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super T> xyeVar, zy2<? super bth> zy2Var) {
            return ((C7692d) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f49150a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xye xyeVar = (xye) this.f49151b;
                Iterator<? extends T> it = this.f49152c.iterator();
                if (it.hasNext()) {
                    this.f49150a = 1;
                    if (xyeVar.yieldAll(it, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    vye<T> vyeVarInvoke = this.f49153d.invoke();
                    this.f49150a = 2;
                    if (xyeVar.yieldAll(vyeVarInvoke, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7e.throwOnFailure(obj);
            }
            return bth.f14751a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ize$e */
    @ck3(m4009c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m4010f = "Sequences.kt", m4011i = {0, 0}, m4012l = {145}, m4013m = "invokeSuspend", m4014n = {"$this$sequence", "buffer"}, m4015s = {"L$0", "L$1"})
    public static final class C7693e<T> extends t7e implements gz6<xye<? super T>, zy2<? super bth>, Object> {

        /* JADX INFO: renamed from: a */
        public Object f49154a;

        /* JADX INFO: renamed from: b */
        public int f49155b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f49156c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ vye<T> f49157d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ tod f49158e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7693e(vye<? extends T> vyeVar, tod todVar, zy2<? super C7693e> zy2Var) {
            super(2, zy2Var);
            this.f49157d = vyeVar;
            this.f49158e = todVar;
        }

        @Override // p000.tq0
        public final zy2<bth> create(Object obj, zy2<?> zy2Var) {
            C7693e c7693e = new C7693e(this.f49157d, this.f49158e, zy2Var);
            c7693e.f49156c = obj;
            return c7693e;
        }

        @Override // p000.gz6
        public final Object invoke(xye<? super T> xyeVar, zy2<? super bth> zy2Var) {
            return ((C7693e) create(xyeVar, zy2Var)).invokeSuspend(bth.f14751a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.tq0
        public final Object invokeSuspend(Object obj) {
            List mutableList;
            xye xyeVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f49155b;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                xye xyeVar2 = (xye) this.f49156c;
                mutableList = vze.toMutableList(this.f49157d);
                xyeVar = xyeVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableList = (List) this.f49154a;
                xye xyeVar3 = (xye) this.f49156c;
                y7e.throwOnFailure(obj);
                xyeVar = xyeVar3;
            }
            while (!mutableList.isEmpty()) {
                int iNextInt = this.f49158e.nextInt(mutableList.size());
                Object objRemoveLast = q82.removeLast(mutableList);
                if (iNextInt < mutableList.size()) {
                    objRemoveLast = mutableList.set(iNextInt, objRemoveLast);
                }
                this.f49156c = xyeVar;
                this.f49154a = mutableList;
                this.f49155b = 1;
                if (xyeVar.yield(objRemoveLast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return bth.f14751a;
        }
    }

    @t28
    private static final <T> vye<T> Sequence(ny6<? extends Iterator<? extends T>> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "iterator");
        return new C7689a(ny6Var);
    }

    @yfb
    public static <T> vye<T> asSequence(@yfb Iterator<? extends T> it) {
        md8.checkNotNullParameter(it, "<this>");
        return constrainOnce(new C7690b(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yfb
    public static <T> vye<T> constrainOnce(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return vyeVar instanceof bu2 ? vyeVar : new bu2(vyeVar);
    }

    @yfb
    public static <T> vye<T> emptySequence() {
        return t05.f83297a;
    }

    @yfb
    public static final <T, C, R> vye<R> flatMapIndexed(@yfb vye<? extends T> vyeVar, @yfb gz6<? super Integer, ? super T, ? extends C> gz6Var, @yfb qy6<? super C, ? extends Iterator<? extends R>> qy6Var) {
        md8.checkNotNullParameter(vyeVar, "source");
        md8.checkNotNullParameter(gz6Var, "transform");
        md8.checkNotNullParameter(qy6Var, "iterator");
        return bze.sequence(new C7691c(vyeVar, gz6Var, qy6Var, null));
    }

    @yfb
    public static final <T> vye<T> flatten(@yfb vye<? extends vye<? extends T>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return flatten$SequencesKt__SequencesKt(vyeVar, new qy6() { // from class: fze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ize.flatten$lambda$1$SequencesKt__SequencesKt((vye) obj);
            }
        });
    }

    private static final <T, R> vye<R> flatten$SequencesKt__SequencesKt(vye<? extends T> vyeVar, qy6<? super T, ? extends Iterator<? extends R>> qy6Var) {
        return vyeVar instanceof neh ? ((neh) vyeVar).flatten$kotlin_stdlib(qy6Var) : new m36(vyeVar, new qy6() { // from class: hze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ize.flatten$lambda$3$SequencesKt__SequencesKt(obj);
            }
        }, qy6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator flatten$lambda$1$SequencesKt__SequencesKt(vye vyeVar) {
        md8.checkNotNullParameter(vyeVar, "it");
        return vyeVar.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator flatten$lambda$2$SequencesKt__SequencesKt(Iterable iterable) {
        md8.checkNotNullParameter(iterable, "it");
        return iterable.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object flatten$lambda$3$SequencesKt__SequencesKt(Object obj) {
        return obj;
    }

    @yfb
    @xn8(name = "flattenSequenceOfIterable")
    public static final <T> vye<T> flattenSequenceOfIterable(@yfb vye<? extends Iterable<? extends T>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return flatten$SequencesKt__SequencesKt(vyeVar, new qy6() { // from class: gze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ize.flatten$lambda$2$SequencesKt__SequencesKt((Iterable) obj);
            }
        });
    }

    @yfb
    public static <T> vye<T> generateSequence(@yfb final ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "nextFunction");
        return constrainOnce(new x27(ny6Var, new qy6() { // from class: eze
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ize.generateSequence$lambda$4$SequencesKt__SequencesKt(ny6Var, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateSequence$lambda$4$SequencesKt__SequencesKt(ny6 ny6Var, Object obj) {
        md8.checkNotNullParameter(obj, "it");
        return ny6Var.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object generateSequence$lambda$5$SequencesKt__SequencesKt(Object obj) {
        return obj;
    }

    @jjf(version = "1.3")
    @yfb
    public static final <T> vye<T> ifEmpty(@yfb vye<? extends T> vyeVar, @yfb ny6<? extends vye<? extends T>> ny6Var) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        return bze.sequence(new C7692d(vyeVar, ny6Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @jjf(version = "1.3")
    @t28
    private static final <T> vye<T> orEmpty(vye<? extends T> vyeVar) {
        return vyeVar == 0 ? emptySequence() : vyeVar;
    }

    @yfb
    public static <T> vye<T> sequenceOf(@yfb T... tArr) {
        md8.checkNotNullParameter(tArr, "elements");
        return e80.asSequence(tArr);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T> vye<T> shuffled(@yfb vye<? extends T> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        return shuffled(vyeVar, tod.f85517a);
    }

    @yfb
    public static final <T, R> scc<List<T>, List<R>> unzip(@yfb vye<? extends scc<? extends T, ? extends R>> vyeVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (scc<? extends T, ? extends R> sccVar : vyeVar) {
            arrayList.add(sccVar.getFirst());
            arrayList2.add(sccVar.getSecond());
        }
        return vkh.m24050to(arrayList, arrayList2);
    }

    @ip9
    @yfb
    public static <T> vye<T> generateSequence(@gib final T t, @yfb qy6<? super T, ? extends T> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "nextFunction");
        return t == null ? t05.f83297a : new x27(new ny6() { // from class: dze
            @Override // p000.ny6
            public final Object invoke() {
                return ize.generateSequence$lambda$5$SequencesKt__SequencesKt(t);
            }
        }, qy6Var);
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T> vye<T> shuffled(@yfb vye<? extends T> vyeVar, @yfb tod todVar) {
        md8.checkNotNullParameter(vyeVar, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        return bze.sequence(new C7693e(vyeVar, todVar, null));
    }

    @yfb
    public static <T> vye<T> generateSequence(@yfb ny6<? extends T> ny6Var, @yfb qy6<? super T, ? extends T> qy6Var) {
        md8.checkNotNullParameter(ny6Var, "seedFunction");
        md8.checkNotNullParameter(qy6Var, "nextFunction");
        return new x27(ny6Var, qy6Var);
    }
}
