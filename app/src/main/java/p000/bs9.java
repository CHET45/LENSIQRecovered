package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "MapAccessorsKt")
public final class bs9 {
    @t28
    private static final <V, V1 extends V> V1 getValue(Map<? super String, ? extends V> map, Object obj, hp8<?> hp8Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        return (V1) vt9.getOrImplicitDefaultNullable(map, hp8Var.getName());
    }

    @t28
    @xn8(name = "getVar")
    private static final <V, V1 extends V> V1 getVar(Map<? super String, ? extends V> map, Object obj, hp8<?> hp8Var) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        return (V1) vt9.getOrImplicitDefaultNullable(map, hp8Var.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @t28
    private static final <V> void setValue(Map<? super String, ? super V> map, Object obj, hp8<?> hp8Var, V v) {
        md8.checkNotNullParameter(map, "<this>");
        md8.checkNotNullParameter(hp8Var, "property");
        map.put(hp8Var.getName(), v);
    }
}
