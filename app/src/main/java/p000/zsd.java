package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1646:1\n361#2,7:1647\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1637#1:1647,7\n*E\n"})
public final class zsd {

    /* JADX INFO: renamed from: a */
    public static final int f105998a = 1000;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final Object f105999b = new Object();

    /* JADX INFO: renamed from: c */
    @yfb
    public static final Object f106000c = new Object();

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: zsd$a */
    @ck3(m4009c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", m4010f = "Recomposer.kt", m4011i = {0}, m4012l = {76, 78}, m4013m = "invokeSuspend", m4014n = {"recomposer"}, m4015s = {"L$0"})
    public static final class C16244a<R> extends ugg implements gz6<x13, zy2<? super R>, Object> {

        /* JADX INFO: renamed from: a */
        public int f106001a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f106002b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ kz6<x13, wsd, zy2<? super R>, Object> f106003c;

        /* JADX INFO: renamed from: zsd$a$a */
        @ck3(m4009c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", m4010f = "Recomposer.kt", m4011i = {}, m4012l = {75}, m4013m = "invokeSuspend", m4014n = {}, m4015s = {})
        public static final class a extends ugg implements gz6<x13, zy2<? super bth>, Object> {

            /* JADX INFO: renamed from: a */
            public int f106004a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ wsd f106005b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wsd wsdVar, zy2<? super a> zy2Var) {
                super(2, zy2Var);
                this.f106005b = wsdVar;
            }

            @Override // p000.tq0
            @yfb
            public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
                return new a(this.f106005b, zy2Var);
            }

            @Override // p000.gz6
            @gib
            public final Object invoke(@yfb x13 x13Var, @gib zy2<? super bth> zy2Var) {
                return ((a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
            }

            @Override // p000.tq0
            @gib
            public final Object invokeSuspend(@yfb Object obj) {
                Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
                int i = this.f106004a;
                if (i == 0) {
                    y7e.throwOnFailure(obj);
                    wsd wsdVar = this.f106005b;
                    this.f106004a = 1;
                    if (wsdVar.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y7e.throwOnFailure(obj);
                }
                return bth.f14751a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16244a(kz6<? super x13, ? super wsd, ? super zy2<? super R>, ? extends Object> kz6Var, zy2<? super C16244a> zy2Var) {
            super(2, zy2Var);
            this.f106003c = kz6Var;
        }

        @Override // p000.tq0
        @yfb
        public final zy2<bth> create(@gib Object obj, @yfb zy2<?> zy2Var) {
            C16244a c16244a = new C16244a(this.f106003c, zy2Var);
            c16244a.f106002b = obj;
            return c16244a;
        }

        @Override // p000.gz6
        @gib
        public final Object invoke(@yfb x13 x13Var, @gib zy2<? super R> zy2Var) {
            return ((C16244a) create(x13Var, zy2Var)).invokeSuspend(bth.f14751a);
        }

        @Override // p000.tq0
        @gib
        public final Object invokeSuspend(@yfb Object obj) {
            wsd wsdVar;
            Object coroutine_suspended = pd8.getCOROUTINE_SUSPENDED();
            int i = this.f106001a;
            if (i == 0) {
                y7e.throwOnFailure(obj);
                x13 x13Var = (x13) this.f106002b;
                wsdVar = new wsd(x13Var.getCoroutineContext());
                fg1.launch$default(x13Var, null, null, new a(wsdVar, null), 3, null);
                kz6<x13, wsd, zy2<? super R>, Object> kz6Var = this.f106003c;
                this.f106002b = wsdVar;
                this.f106001a = 1;
                obj = kz6Var.invoke(x13Var, wsdVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f106002b;
                    y7e.throwOnFailure(obj);
                    return obj2;
                }
                wsdVar = (wsd) this.f106002b;
                y7e.throwOnFailure(obj);
            }
            wsdVar.close();
            this.f106002b = obj;
            this.f106001a = 2;
            return wsdVar.join(this) == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    public static final <K, V> boolean addMultiValue(@yfb Map<K, List<V>> map, K k, V v) {
        List<V> arrayList = map.get(k);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k, arrayList);
        }
        return arrayList.add(v);
    }

    @gib
    public static final <K, V> V removeLastMultiValue(@yfb Map<K, List<V>> map, K k) {
        List<V> list = map.get(k);
        if (list == null) {
            return null;
        }
        V v = (V) q82.removeFirst(list);
        if (!list.isEmpty()) {
            return v;
        }
        map.remove(k);
        return v;
    }

    @gib
    public static final <R> Object withRunningRecomposer(@yfb kz6<? super x13, ? super wsd, ? super zy2<? super R>, ? extends Object> kz6Var, @yfb zy2<? super R> zy2Var) {
        return y13.coroutineScope(new C16244a(kz6Var, null), zy2Var);
    }
}
