package p000;

import androidx.compose.p002ui.layout.InterfaceC0773z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@ah5
public final class xz8 implements InterfaceC0773z {

    /* JADX INFO: renamed from: a */
    @yfb
    public final tz8 f99777a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Map<Object, Integer> f99778b = new LinkedHashMap();

    public xz8(@yfb tz8 tz8Var) {
        this.f99777a = tz8Var;
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0773z
    public boolean areCompatible(@gib Object obj, @gib Object obj2) {
        return md8.areEqual(this.f99777a.getContentType(obj), this.f99777a.getContentType(obj2));
    }

    @Override // androidx.compose.p002ui.layout.InterfaceC0773z
    public void getSlotsToRetain(@yfb InterfaceC0773z.a aVar) {
        this.f99778b.clear();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object contentType = this.f99777a.getContentType(it.next());
            Integer num = this.f99778b.get(contentType);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f99778b.put(contentType, Integer.valueOf(iIntValue + 1));
            }
        }
    }
}
