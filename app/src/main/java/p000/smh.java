package p000;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@px4
public abstract class smh {

    /* JADX INFO: renamed from: a */
    public final Set<Type> f82269a = t6f.newHashSet();

    /* JADX INFO: renamed from: a */
    public void mo13200a(Class<?> t) {
    }

    /* JADX INFO: renamed from: b */
    public void mo13201b(GenericArrayType t) {
    }

    /* JADX INFO: renamed from: c */
    public void mo13202c(ParameterizedType t) {
    }

    /* JADX INFO: renamed from: d */
    public void mo13203d(TypeVariable<?> t) {
    }

    /* JADX INFO: renamed from: e */
    public void mo13204e(WildcardType t) {
    }

    public final void visit(Type... types) {
        for (Type type : types) {
            if (type != null && this.f82269a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo13203d((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo13204e((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo13202c((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo13200a((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        mo13201b((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f82269a.remove(type);
                    throw th;
                }
            }
        }
    }
}
