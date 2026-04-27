package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n+ 2 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 3 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,136:1\n36#2,2:137\n36#2,2:140\n36#2,2:143\n36#2,2:146\n23#3:139\n23#3:142\n23#3:145\n23#3:148\n*S KotlinDebug\n*F\n+ 1 ViewModelImpl.kt\nandroidx/lifecycle/viewmodel/internal/ViewModelImpl\n*L\n83#1:137,2\n106#1:140,2\n120#1:143,2\n126#1:146,2\n83#1:139\n106#1:142\n120#1:145\n126#1:148\n*E\n"})
public final class eai {

    /* JADX INFO: renamed from: a */
    @yfb
    public final big f32429a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<String, AutoCloseable> f32430b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Set<AutoCloseable> f32431c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f32432d;

    public eai() {
        this.f32429a = new big();
        this.f32430b = new LinkedHashMap();
        this.f32431c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeWithRuntimeException(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void addCloseable(@yfb String str, @yfb AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(autoCloseable, "closeable");
        if (this.f32432d) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.f32429a) {
            autoCloseable2 = (AutoCloseable) this.f32430b.put(str, autoCloseable);
        }
        closeWithRuntimeException(autoCloseable2);
    }

    @ir9
    public final void clear() {
        if (this.f32432d) {
            return;
        }
        this.f32432d = true;
        synchronized (this.f32429a) {
            try {
                Iterator it = this.f32430b.values().iterator();
                while (it.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it.next());
                }
                Iterator it2 = this.f32431c.iterator();
                while (it2.hasNext()) {
                    closeWithRuntimeException((AutoCloseable) it2.next());
                }
                this.f32431c.clear();
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @gib
    public final <T extends AutoCloseable> T getCloseable(@yfb String str) {
        T t;
        md8.checkNotNullParameter(str, "key");
        synchronized (this.f32429a) {
            t = (T) this.f32430b.get(str);
        }
        return t;
    }

    public eai(@yfb x13 x13Var) {
        md8.checkNotNullParameter(x13Var, "viewModelScope");
        this.f32429a = new big();
        this.f32430b = new LinkedHashMap();
        this.f32431c = new LinkedHashSet();
        addCloseable(t52.f83725a, t52.asCloseable(x13Var));
    }

    public final void addCloseable(@yfb AutoCloseable autoCloseable) {
        md8.checkNotNullParameter(autoCloseable, "closeable");
        if (this.f32432d) {
            closeWithRuntimeException(autoCloseable);
            return;
        }
        synchronized (this.f32429a) {
            this.f32431c.add(autoCloseable);
            bth bthVar = bth.f14751a;
        }
    }

    public eai(@yfb AutoCloseable... autoCloseableArr) {
        md8.checkNotNullParameter(autoCloseableArr, "closeables");
        this.f32429a = new big();
        this.f32430b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f32431c = linkedHashSet;
        q82.addAll(linkedHashSet, autoCloseableArr);
    }

    public eai(@yfb x13 x13Var, @yfb AutoCloseable... autoCloseableArr) {
        md8.checkNotNullParameter(x13Var, "viewModelScope");
        md8.checkNotNullParameter(autoCloseableArr, "closeables");
        this.f32429a = new big();
        this.f32430b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f32431c = linkedHashSet;
        addCloseable(t52.f83725a, t52.asCloseable(x13Var));
        q82.addAll(linkedHashSet, autoCloseableArr);
    }
}
