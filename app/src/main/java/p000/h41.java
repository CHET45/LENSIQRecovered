package p000;

import android.graphics.Bitmap;
import java.util.HashMap;
import p000.p6d;

/* JADX INFO: loaded from: classes3.dex */
public final class h41 {

    /* JADX INFO: renamed from: a */
    public final gqa f42291a;

    /* JADX INFO: renamed from: b */
    public final e41 f42292b;

    /* JADX INFO: renamed from: c */
    public final bl3 f42293c;

    /* JADX INFO: renamed from: d */
    public g41 f42294d;

    public h41(gqa gqaVar, e41 e41Var, bl3 bl3Var) {
        this.f42291a = gqaVar;
        this.f42292b = e41Var;
        this.f42293c = bl3Var;
    }

    private static int getSizeInBytes(p6d p6dVar) {
        return v0i.getBitmapByteSize(p6dVar.m19283d(), p6dVar.m19281b(), p6dVar.m19280a());
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public o6d m12133a(p6d... p6dVarArr) {
        long maxSize = (this.f42291a.getMaxSize() - this.f42291a.getCurrentSize()) + this.f42292b.getMaxSize();
        int iM19282c = 0;
        for (p6d p6dVar : p6dVarArr) {
            iM19282c += p6dVar.m19282c();
        }
        float f = maxSize / iM19282c;
        HashMap map = new HashMap();
        for (p6d p6dVar2 : p6dVarArr) {
            map.put(p6dVar2, Integer.valueOf(Math.round(p6dVar2.m19282c() * f) / getSizeInBytes(p6dVar2)));
        }
        return new o6d(map);
    }

    public void preFill(p6d.C10808a... c10808aArr) {
        g41 g41Var = this.f42294d;
        if (g41Var != null) {
            g41Var.cancel();
        }
        p6d[] p6dVarArr = new p6d[c10808aArr.length];
        for (int i = 0; i < c10808aArr.length; i++) {
            p6d.C10808a c10808a = c10808aArr[i];
            if (c10808a.m19285b() == null) {
                c10808a.setConfig(this.f42293c == bl3.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            p6dVarArr[i] = c10808a.m19284a();
        }
        g41 g41Var2 = new g41(this.f42292b, this.f42291a, m12133a(p6dVarArr));
        this.f42294d = g41Var2;
        v0i.postOnUiThread(g41Var2);
    }
}
