package p000;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface zj2 {

    /* JADX INFO: renamed from: a */
    public static final zj2 f105224a = new zj2() { // from class: yj2
        @Override // p000.zj2
        public final List processRegistrar(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List<ej2<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
