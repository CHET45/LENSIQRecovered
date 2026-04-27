package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.sle;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,171:1\n1#2:172\n361#3,7:173\n215#4,2:180\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n131#1:173,7\n146#1:180,2\n*E\n"})
public final class tle implements sle {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<Object, Boolean> f85273a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<String, List<Object>> f85274b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Map<String, List<ny6<Object>>> f85275c;

    /* JADX INFO: renamed from: tle$a */
    public static final class C13097a implements sle.InterfaceC12651a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f85277b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ny6<Object> f85278c;

        public C13097a(String str, ny6<? extends Object> ny6Var) {
            this.f85277b = str;
            this.f85278c = ny6Var;
        }

        @Override // p000.sle.InterfaceC12651a
        public void unregister() {
            List list = (List) tle.this.f85275c.remove(this.f85277b);
            if (list != null) {
                list.remove(this.f85278c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            tle.this.f85275c.put(this.f85277b, list);
        }
    }

    public tle(@gib Map<String, ? extends List<? extends Object>> map, @yfb qy6<Object, Boolean> qy6Var) {
        Map<String, List<Object>> mutableMap;
        this.f85273a = qy6Var;
        this.f85274b = (map == null || (mutableMap = xt9.toMutableMap(map)) == null) ? new LinkedHashMap<>() : mutableMap;
        this.f85275c = new LinkedHashMap();
    }

    @Override // p000.sle
    public boolean canBeSaved(@yfb Object obj) {
        return this.f85273a.invoke(obj).booleanValue();
    }

    @Override // p000.sle
    @gib
    public Object consumeRestored(@yfb String str) {
        List<Object> listRemove = this.f85274b.remove(str);
        if (listRemove == null || listRemove.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.f85274b.put(str, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    @Override // p000.sle
    @yfb
    public Map<String, List<Object>> performSave() {
        Map<String, List<Object>> mutableMap = xt9.toMutableMap(this.f85274b);
        for (Map.Entry<String, List<ny6<Object>>> entry : this.f85275c.entrySet()) {
            String key = entry.getKey();
            List<ny6<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!canBeSaved(objInvoke)) {
                        throw new IllegalStateException(gyd.generateCannotBeSavedErrorMessage(objInvoke).toString());
                    }
                    mutableMap.put(key, l82.arrayListOf(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = value.get(i).invoke();
                    if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                        throw new IllegalStateException(gyd.generateCannotBeSavedErrorMessage(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mutableMap.put(key, arrayList);
            }
        }
        return mutableMap;
    }

    @Override // p000.sle
    @yfb
    public sle.InterfaceC12651a registerProvider(@yfb String str, @yfb ny6<? extends Object> ny6Var) {
        if (ule.fastIsBlank(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map<String, List<ny6<Object>>> map = this.f85275c;
        List<ny6<Object>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(ny6Var);
        return new C13097a(str, ny6Var);
    }
}
