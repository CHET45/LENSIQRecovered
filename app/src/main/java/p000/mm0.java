package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ug5
@e0g(parameters = 0)
public final class mm0 {

    /* JADX INFO: renamed from: b */
    public static final int f61454b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<Integer, lm0> f61455a = new LinkedHashMap();

    @yfb
    public final Map<Integer, lm0> getChildren() {
        return this.f61455a;
    }

    @gib
    public final bth performAutofill(int i, @yfb String str) {
        qy6<String, bth> onFill;
        lm0 lm0Var = this.f61455a.get(Integer.valueOf(i));
        if (lm0Var == null || (onFill = lm0Var.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return bth.f14751a;
    }

    public final void plusAssign(@yfb lm0 lm0Var) {
        this.f61455a.put(Integer.valueOf(lm0Var.getId()), lm0Var);
    }
}
