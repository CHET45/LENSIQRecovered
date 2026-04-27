package p000;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1143j;
import androidx.lifecycle.InterfaceC1154n;
import java.util.Map;
import p000.qud;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
@igg({"RestrictedApi"})
public final class zle {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C16180b f105428g = new C16180b(null);

    /* JADX INFO: renamed from: h */
    @yfb
    @Deprecated
    public static final String f105429h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: b */
    public boolean f105431b;

    /* JADX INFO: renamed from: c */
    @gib
    public Bundle f105432c;

    /* JADX INFO: renamed from: d */
    public boolean f105433d;

    /* JADX INFO: renamed from: e */
    @gib
    public qud.C11705b f105434e;

    /* JADX INFO: renamed from: a */
    @yfb
    public final rke<String, InterfaceC16181c> f105430a = new rke<>();

    /* JADX INFO: renamed from: f */
    public boolean f105435f = true;

    /* JADX INFO: renamed from: zle$a */
    public interface InterfaceC16179a {
        void onRecreated(@yfb bme bmeVar);
    }

    /* JADX INFO: renamed from: zle$b */
    public static final class C16180b {
        public /* synthetic */ C16180b(jt3 jt3Var) {
            this();
        }

        private C16180b() {
        }
    }

    /* JADX INFO: renamed from: zle$c */
    public interface InterfaceC16181c {
        @yfb
        Bundle saveState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void performAttach$lambda$4(zle zleVar, g59 g59Var, AbstractC1143j.a aVar) {
        md8.checkNotNullParameter(zleVar, "this$0");
        md8.checkNotNullParameter(g59Var, "<anonymous parameter 0>");
        md8.checkNotNullParameter(aVar, "event");
        if (aVar == AbstractC1143j.a.ON_START) {
            zleVar.f105435f = true;
        } else if (aVar == AbstractC1143j.a.ON_STOP) {
            zleVar.f105435f = false;
        }
    }

    @gib
    @ir9
    public final Bundle consumeRestoredStateForKey(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        if (!this.f105433d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f105432c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f105432c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f105432c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f105432c = null;
        }
        return bundle2;
    }

    @gib
    public final InterfaceC16181c getSavedStateProvider(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        for (Map.Entry<String, InterfaceC16181c> entry : this.f105430a) {
            md8.checkNotNullExpressionValue(entry, "components");
            String key = entry.getKey();
            InterfaceC16181c value = entry.getValue();
            if (md8.areEqual(key, str)) {
                return value;
            }
        }
        return null;
    }

    public final boolean isAllowingSavingState$savedstate_release() {
        return this.f105435f;
    }

    @ir9
    public final boolean isRestored() {
        return this.f105433d;
    }

    @ir9
    public final void performAttach$savedstate_release(@yfb AbstractC1143j abstractC1143j) {
        md8.checkNotNullParameter(abstractC1143j, "lifecycle");
        if (this.f105431b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC1143j.addObserver(new InterfaceC1154n() { // from class: yle
            @Override // androidx.lifecycle.InterfaceC1154n
            public final void onStateChanged(g59 g59Var, AbstractC1143j.a aVar) {
                zle.performAttach$lambda$4(this.f102028a, g59Var, aVar);
            }
        });
        this.f105431b = true;
    }

    @ir9
    public final void performRestore$savedstate_release(@gib Bundle bundle) {
        if (!this.f105431b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f105433d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f105432c = bundle != null ? bundle.getBundle(f105429h) : null;
        this.f105433d = true;
    }

    @ir9
    public final void performSave(@yfb Bundle bundle) {
        md8.checkNotNullParameter(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f105432c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        rke<String, InterfaceC16181c>.C12136d c12136dIteratorWithAdditions = this.f105430a.iteratorWithAdditions();
        md8.checkNotNullExpressionValue(c12136dIteratorWithAdditions, "this.components.iteratorWithAdditions()");
        while (c12136dIteratorWithAdditions.hasNext()) {
            Map.Entry next = c12136dIteratorWithAdditions.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC16181c) next.getValue()).saveState());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle(f105429h, bundle2);
    }

    @ir9
    public final void registerSavedStateProvider(@yfb String str, @yfb InterfaceC16181c interfaceC16181c) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(interfaceC16181c, "provider");
        if (this.f105430a.putIfAbsent(str, interfaceC16181c) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @ir9
    public final void runOnNextRecreation(@yfb Class<? extends InterfaceC16179a> cls) {
        md8.checkNotNullParameter(cls, "clazz");
        if (!this.f105435f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        qud.C11705b c11705b = this.f105434e;
        if (c11705b == null) {
            c11705b = new qud.C11705b(this);
        }
        this.f105434e = c11705b;
        try {
            cls.getDeclaredConstructor(null);
            qud.C11705b c11705b2 = this.f105434e;
            if (c11705b2 != null) {
                String name = cls.getName();
                md8.checkNotNullExpressionValue(name, "clazz.name");
                c11705b2.add(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void setAllowingSavingState$savedstate_release(boolean z) {
        this.f105435f = z;
    }

    @ir9
    public final void unregisterSavedStateProvider(@yfb String str) {
        md8.checkNotNullParameter(str, "key");
        this.f105430a.remove(str);
    }
}
