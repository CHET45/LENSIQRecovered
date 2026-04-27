package p000;

import android.app.Application;
import androidx.lifecycle.C1171x;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class cme {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final List<Class<?>> f16969a = l82.listOf((Object[]) new Class[]{Application.class, C1171x.class});

    /* JADX INFO: renamed from: b */
    @yfb
    public static final List<Class<?>> f16970b = k82.listOf(C1171x.class);

    @gib
    public static final <T> Constructor<T> findMatchingConstructor(@yfb Class<T> cls, @yfb List<? extends Class<?>> list) {
        md8.checkNotNullParameter(cls, "modelClass");
        md8.checkNotNullParameter(list, "signature");
        Object[] constructors = cls.getConstructors();
        md8.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            md8.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List list2 = e80.toList(parameterTypes);
            if (md8.areEqual(list, list2)) {
                md8.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends cai> T newInstance(@yfb Class<T> cls, @yfb Constructor<T> constructor, @yfb Object... objArr) {
        md8.checkNotNullParameter(cls, "modelClass");
        md8.checkNotNullParameter(constructor, "constructor");
        md8.checkNotNullParameter(objArr, v23.f89724e);
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
