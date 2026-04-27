package p000;

import androidx.lifecycle.C1171x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonElementBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n29#1,3:232\n52#1,3:235\n29#1,3:238\n52#1,3:241\n1557#2:244\n1628#2,3:245\n1557#2:248\n1628#2,3:249\n1557#2:252\n1628#2,3:253\n*S KotlinDebug\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n82#1:232,3\n90#1:235,3\n189#1:238,3\n197#1:241,3\n207#1:244\n207#1:245,3\n217#1:248\n217#1:249,3\n227#1:252\n227#1:253,3\n*E\n"})
public final class tk8 {
    public static final boolean add(@yfb dk8 dk8Var, @gib Boolean bool) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        return dk8Var.add(uk8.JsonPrimitive(bool));
    }

    @ph5
    @xn8(name = "addAllBooleans")
    public static final boolean addAllBooleans(@yfb dk8 dk8Var, @yfb Collection<Boolean> collection) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        md8.checkNotNullParameter(collection, C1171x.f7958g);
        Collection<Boolean> collection2 = collection;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(uk8.JsonPrimitive((Boolean) it.next()));
        }
        return dk8Var.addAll(arrayList);
    }

    @ph5
    @xn8(name = "addAllNumbers")
    public static final boolean addAllNumbers(@yfb dk8 dk8Var, @yfb Collection<? extends Number> collection) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        md8.checkNotNullParameter(collection, C1171x.f7958g);
        Collection<? extends Number> collection2 = collection;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(uk8.JsonPrimitive((Number) it.next()));
        }
        return dk8Var.addAll(arrayList);
    }

    @ph5
    @xn8(name = "addAllStrings")
    public static final boolean addAllStrings(@yfb dk8 dk8Var, @yfb Collection<String> collection) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        md8.checkNotNullParameter(collection, C1171x.f7958g);
        Collection<String> collection2 = collection;
        ArrayList arrayList = new ArrayList(m82.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(uk8.JsonPrimitive((String) it.next()));
        }
        return dk8Var.addAll(arrayList);
    }

    public static final boolean addJsonArray(@yfb dk8 dk8Var, @yfb qy6<? super dk8, bth> qy6Var) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        dk8 dk8Var2 = new dk8();
        qy6Var.invoke(dk8Var2);
        return dk8Var.add(dk8Var2.build());
    }

    public static final boolean addJsonObject(@yfb dk8 dk8Var, @yfb qy6<? super bm8, bth> qy6Var) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        bm8 bm8Var = new bm8();
        qy6Var.invoke(bm8Var);
        return dk8Var.add(bm8Var.build());
    }

    @yfb
    public static final ck8 buildJsonArray(@yfb qy6<? super dk8, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        dk8 dk8Var = new dk8();
        qy6Var.invoke(dk8Var);
        return dk8Var.build();
    }

    @yfb
    public static final am8 buildJsonObject(@yfb qy6<? super bm8, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        bm8 bm8Var = new bm8();
        qy6Var.invoke(bm8Var);
        return bm8Var.build();
    }

    @gib
    public static final sk8 put(@yfb bm8 bm8Var, @yfb String str, @gib Boolean bool) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        return bm8Var.put(str, uk8.JsonPrimitive(bool));
    }

    @gib
    public static final sk8 putJsonArray(@yfb bm8 bm8Var, @yfb String str, @yfb qy6<? super dk8, bth> qy6Var) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        dk8 dk8Var = new dk8();
        qy6Var.invoke(dk8Var);
        return bm8Var.put(str, dk8Var.build());
    }

    @gib
    public static final sk8 putJsonObject(@yfb bm8 bm8Var, @yfb String str, @yfb qy6<? super bm8, bth> qy6Var) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(qy6Var, "builderAction");
        bm8 bm8Var2 = new bm8();
        qy6Var.invoke(bm8Var2);
        return bm8Var.put(str, bm8Var2.build());
    }

    public static final boolean add(@yfb dk8 dk8Var, @gib Number number) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        return dk8Var.add(uk8.JsonPrimitive(number));
    }

    @gib
    public static final sk8 put(@yfb bm8 bm8Var, @yfb String str, @gib Number number) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        return bm8Var.put(str, uk8.JsonPrimitive(number));
    }

    public static final boolean add(@yfb dk8 dk8Var, @gib String str) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        return dk8Var.add(uk8.JsonPrimitive(str));
    }

    @gib
    public static final sk8 put(@yfb bm8 bm8Var, @yfb String str, @gib String str2) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        return bm8Var.put(str, uk8.JsonPrimitive(str2));
    }

    @ph5
    public static final boolean add(@yfb dk8 dk8Var, @gib Void r1) {
        md8.checkNotNullParameter(dk8Var, "<this>");
        return dk8Var.add(xl8.INSTANCE);
    }

    @gib
    @ph5
    public static final sk8 put(@yfb bm8 bm8Var, @yfb String str, @gib Void r2) {
        md8.checkNotNullParameter(bm8Var, "<this>");
        md8.checkNotNullParameter(str, "key");
        return bm8Var.put(str, xl8.INSTANCE);
    }
}
