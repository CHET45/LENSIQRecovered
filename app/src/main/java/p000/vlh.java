package p000;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class vlh<T> extends llh<T> {

    /* JADX INFO: renamed from: a */
    public final TypeVariable<?> f91628a;

    public vlh() {
        Type typeM16227a = m16227a();
        v7d.checkArgument(typeM16227a instanceof TypeVariable, "%s should be a type variable.", typeM16227a);
        this.f91628a = (TypeVariable) typeM16227a;
    }

    public final boolean equals(@wx1 Object o) {
        if (o instanceof vlh) {
            return this.f91628a.equals(((vlh) o).f91628a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f91628a.hashCode();
    }

    public String toString() {
        return this.f91628a.toString();
    }
}
