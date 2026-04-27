package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jt9 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jt9$a */
    @dwf({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
    public static final class C8065a<T> extends tt8 implements gz6<fme, T, List<? extends Object>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gz6<fme, T, Map<String, Object>> f51769a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8065a(gz6<? super fme, ? super T, ? extends Map<String, ? extends Object>> gz6Var) {
            super(2);
            this.f51769a = gz6Var;
        }

        @Override // p000.gz6
        @yfb
        public final List<Object> invoke(@yfb fme fmeVar, T t) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : this.f51769a.invoke(fmeVar, t).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: jt9$b */
    @dwf({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    public static final class C8066b<T> extends tt8 implements qy6<List<? extends Object>, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<Map<String, ? extends Object>, T> f51770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C8066b(qy6<? super Map<String, ? extends Object>, ? extends T> qy6Var) {
            super(1);
            this.f51770a = qy6Var;
        }

        @Override // p000.qy6
        @gib
        public final T invoke(@yfb List<? extends Object> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list.size() % 2 != 0) {
                throw new IllegalStateException("non-zero remainder");
            }
            for (int i = 0; i < list.size(); i += 2) {
                Object obj = list.get(i);
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i + 1));
            }
            return this.f51770a.invoke(linkedHashMap);
        }
    }

    @yfb
    public static final <T> dme<T, Object> mapSaver(@yfb gz6<? super fme, ? super T, ? extends Map<String, ? extends Object>> gz6Var, @yfb qy6<? super Map<String, ? extends Object>, ? extends T> qy6Var) {
        return q99.listSaver(new C8065a(gz6Var), new C8066b(qy6Var));
    }
}
