package p000;

import java.util.HashMap;
import java.util.Map;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class qua {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Map<String, Integer> f75807a = new HashMap();

    @p7e({p7e.EnumC10826a.f69936c})
    public boolean approveCall(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "name");
        Integer num = this.f75807a.get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z = (iIntValue & i) != 0;
        this.f75807a.put(str, Integer.valueOf(i | iIntValue));
        return !z;
    }
}
