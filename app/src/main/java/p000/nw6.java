package p000;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import p000.nw6;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nw6<T extends nw6<T>> implements InterfaceC7667iz {
    /* JADX INFO: renamed from: a */
    public abstract int mo18167a();

    /* JADX INFO: renamed from: b */
    public boolean m18168b(List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (isShadowedBy(it.next())) {
                return true;
            }
        }
        return false;
    }

    public abstract Class<?> getDeclaringClass();

    public abstract String getName();

    public abstract Class<?> getType();

    public boolean isPublic() {
        return Modifier.isPublic(mo18167a());
    }

    public abstract boolean isShadowedBy(T t);

    public boolean isStatic() {
        return Modifier.isStatic(mo18167a());
    }
}
