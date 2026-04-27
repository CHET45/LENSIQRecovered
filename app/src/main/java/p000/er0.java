package p000;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.vwa;

/* JADX INFO: loaded from: classes3.dex */
public abstract class er0<Model> implements vwa<Model, InputStream> {

    /* JADX INFO: renamed from: a */
    public final vwa<k77, InputStream> f33874a;

    /* JADX INFO: renamed from: b */
    @hib
    public final uwa<Model, k77> f33875b;

    public er0(vwa<k77, InputStream> vwaVar) {
        this(vwaVar, null);
    }

    private static List<eq8> getAlternateKeys(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new k77(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m10196a(Model model, int i, int i2, i7c i7cVar) {
        return Collections.emptyList();
    }

    @hib
    /* JADX INFO: renamed from: b */
    public ii7 m10197b(Model model, int i, int i2, i7c i7cVar) {
        return ii7.f47094b;
    }

    @Override // p000.vwa
    @hib
    public vwa.C14279a<InputStream> buildLoadData(@efb Model model, int i, int i2, @efb i7c i7cVar) {
        uwa<Model, k77> uwaVar = this.f33875b;
        k77 k77Var = uwaVar != null ? uwaVar.get(model, i, i2) : null;
        if (k77Var == null) {
            String strM10198c = m10198c(model, i, i2, i7cVar);
            if (TextUtils.isEmpty(strM10198c)) {
                return null;
            }
            k77 k77Var2 = new k77(strM10198c, m10197b(model, i, i2, i7cVar));
            uwa<Model, k77> uwaVar2 = this.f33875b;
            if (uwaVar2 != null) {
                uwaVar2.put(model, i, i2, k77Var2);
            }
            k77Var = k77Var2;
        }
        List<String> listM10196a = m10196a(model, i, i2, i7cVar);
        vwa.C14279a<InputStream> c14279aBuildLoadData = this.f33874a.buildLoadData(k77Var, i, i2, i7cVar);
        return (c14279aBuildLoadData == null || listM10196a.isEmpty()) ? c14279aBuildLoadData : new vwa.C14279a<>(c14279aBuildLoadData.f92420a, getAlternateKeys(listM10196a), c14279aBuildLoadData.f92422c);
    }

    /* JADX INFO: renamed from: c */
    public abstract String m10198c(Model model, int i, int i2, i7c i7cVar);

    public er0(vwa<k77, InputStream> vwaVar, @hib uwa<Model, k77> uwaVar) {
        this.f33874a = vwaVar;
        this.f33875b = uwaVar;
    }
}
