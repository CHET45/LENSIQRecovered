package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class llh<T> {
    /* JADX INFO: renamed from: a */
    public final Type m16227a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        v7d.checkArgument(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
