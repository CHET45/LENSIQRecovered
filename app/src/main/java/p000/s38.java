package p000;

import androidx.work.C1507b;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s38 {

    /* JADX INFO: renamed from: a */
    public static final String f80518a = cj9.tagWithPrefix("InputMerger");

    @p7e({p7e.EnumC10826a.f69935b})
    public static s38 fromClassName(String className) {
        try {
            return (s38) Class.forName(className).newInstance();
        } catch (Exception e) {
            cj9.get().error(f80518a, "Trouble instantiating + " + className, e);
            return null;
        }
    }

    @efb
    public abstract C1507b merge(@efb List<C1507b> inputs);
}
