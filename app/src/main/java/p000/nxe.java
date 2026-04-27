package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1747#2,3:200\n*S KotlinDebug\n*F\n+ 1 SemanticsConfiguration.kt\nandroidx/compose/ui/semantics/SemanticsConfiguration\n*L\n78#1:200,3\n*E\n"})
@e0g(parameters = 0)
public final class nxe implements eye, Iterable<Map.Entry<? extends dye<?>, ? extends Object>>, uo8 {

    /* JADX INFO: renamed from: d */
    public static final int f65976d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<dye<?>, Object> f65977a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public boolean f65978b;

    /* JADX INFO: renamed from: c */
    public boolean f65979c;

    public final void collapsePeer$ui_release(@yfb nxe nxeVar) {
        if (nxeVar.f65978b) {
            this.f65978b = true;
        }
        if (nxeVar.f65979c) {
            this.f65979c = true;
        }
        for (Map.Entry<dye<?>, Object> entry : nxeVar.f65977a.entrySet()) {
            dye<?> key = entry.getKey();
            Object value = entry.getValue();
            if (!this.f65977a.containsKey(key)) {
                this.f65977a.put(key, value);
            } else if (value instanceof C4623d6) {
                Object obj = this.f65977a.get(key);
                md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C4623d6 c4623d6 = (C4623d6) obj;
                Map<dye<?>, Object> map = this.f65977a;
                String label = c4623d6.getLabel();
                if (label == null) {
                    label = ((C4623d6) value).getLabel();
                }
                uy6 action = c4623d6.getAction();
                if (action == null) {
                    action = ((C4623d6) value).getAction();
                }
                map.put(key, new C4623d6(label, action));
            }
        }
    }

    public final <T> boolean contains(@yfb dye<T> dyeVar) {
        return this.f65977a.containsKey(dyeVar);
    }

    public final boolean containsImportantForAccessibility$ui_release() {
        Set<dye<?>> setKeySet = this.f65977a.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((dye) it.next()).isImportantForAccessibility$ui_release()) {
                return true;
            }
        }
        return false;
    }

    @yfb
    public final nxe copy() {
        nxe nxeVar = new nxe();
        nxeVar.f65978b = this.f65978b;
        nxeVar.f65979c = this.f65979c;
        nxeVar.f65977a.putAll(this.f65977a);
        return nxeVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxe)) {
            return false;
        }
        nxe nxeVar = (nxe) obj;
        return md8.areEqual(this.f65977a, nxeVar.f65977a) && this.f65978b == nxeVar.f65978b && this.f65979c == nxeVar.f65979c;
    }

    public final <T> T get(@yfb dye<T> dyeVar) {
        T t = (T) this.f65977a.get(dyeVar);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + dyeVar + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(@yfb dye<T> dyeVar, @yfb ny6<? extends T> ny6Var) {
        T t = (T) this.f65977a.get(dyeVar);
        return t == null ? ny6Var.invoke() : t;
    }

    @gib
    public final <T> T getOrElseNullable(@yfb dye<T> dyeVar, @yfb ny6<? extends T> ny6Var) {
        T t = (T) this.f65977a.get(dyeVar);
        return t == null ? ny6Var.invoke() : t;
    }

    public int hashCode() {
        return (((this.f65977a.hashCode() * 31) + Boolean.hashCode(this.f65978b)) * 31) + Boolean.hashCode(this.f65979c);
    }

    public final boolean isClearingSemantics() {
        return this.f65979c;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.f65978b;
    }

    @Override // java.lang.Iterable
    @yfb
    public Iterator<Map.Entry<? extends dye<?>, ? extends Object>> iterator() {
        return this.f65977a.entrySet().iterator();
    }

    public final void mergeChild$ui_release(@yfb nxe nxeVar) {
        for (Map.Entry<dye<?>, Object> entry : nxeVar.f65977a.entrySet()) {
            dye<?> key = entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f65977a.get(key);
            md8.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objMerge = key.merge(obj, value);
            if (objMerge != null) {
                this.f65977a.put(key, objMerge);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.eye
    public <T> void set(@yfb dye<T> dyeVar, T t) {
        if (!(t instanceof C4623d6) || !contains(dyeVar)) {
            this.f65977a.put(dyeVar, t);
            return;
        }
        Object obj = this.f65977a.get(dyeVar);
        md8.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C4623d6 c4623d6 = (C4623d6) obj;
        Map<dye<?>, Object> map = this.f65977a;
        C4623d6 c4623d62 = (C4623d6) t;
        String label = c4623d62.getLabel();
        if (label == null) {
            label = c4623d6.getLabel();
        }
        uy6 action = c4623d62.getAction();
        if (action == null) {
            action = c4623d6.getAction();
        }
        map.put(dyeVar, new C4623d6(label, action));
    }

    public final void setClearingSemantics(boolean z) {
        this.f65979c = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.f65978b = z;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f65978b) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f65979c) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry<dye<?>, Object> entry : this.f65977a.entrySet()) {
            dye<?> key = entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(key.getName());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return en8.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
