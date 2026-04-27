package p000;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.zle;

/* JADX INFO: loaded from: classes3.dex */
public final class qud implements InterfaceC1154n {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C11704a f75825b = new C11704a(null);

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f75826c = "classes_to_restore";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f75827d = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: a */
    @yfb
    public final bme f75828a;

    /* JADX INFO: renamed from: qud$a */
    public static final class C11704a {
        public /* synthetic */ C11704a(jt3 jt3Var) {
            this();
        }

        private C11704a() {
        }
    }

    /* JADX INFO: renamed from: qud$b */
    public static final class C11705b implements zle.InterfaceC16181c {

        /* JADX INFO: renamed from: a */
        @yfb
        public final Set<String> f75829a;

        public C11705b(@yfb zle zleVar) {
            md8.checkNotNullParameter(zleVar, "registry");
            this.f75829a = new LinkedHashSet();
            zleVar.registerSavedStateProvider(qud.f75827d, this);
        }

        public final void add(@yfb String str) {
            md8.checkNotNullParameter(str, "className");
            this.f75829a.add(str);
        }

        @Override // p000.zle.InterfaceC16181c
        @yfb
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(qud.f75826c, new ArrayList<>(this.f75829a));
            return bundle;
        }
    }

    public qud(@yfb bme bmeVar) {
        md8.checkNotNullParameter(bmeVar, "owner");
        this.f75828a = bmeVar;
    }

    private final void reflectiveNew(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, qud.class.getClassLoader()).asSubclass(zle.InterfaceC16179a.class);
            md8.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    md8.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((zle.InterfaceC16179a) objNewInstance).onRecreated(this.f75828a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1154n
    public void onStateChanged(@yfb g59 g59Var, @yfb AbstractC1143j.a aVar) {
        md8.checkNotNullParameter(g59Var, "source");
        md8.checkNotNullParameter(aVar, "event");
        if (aVar != AbstractC1143j.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        g59Var.getLifecycle().removeObserver(this);
        Bundle bundleConsumeRestoredStateForKey = this.f75828a.getSavedStateRegistry().consumeRestoredStateForKey(f75827d);
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleConsumeRestoredStateForKey.getStringArrayList(f75826c);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }
}
