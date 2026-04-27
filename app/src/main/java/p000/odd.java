package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class odd {

    /* JADX INFO: renamed from: a */
    public final List<mdd> f67354a;

    /* JADX INFO: renamed from: b */
    public final Map<String, mdd> f67355b;

    /* JADX INFO: renamed from: odd$b */
    public static class C10331b {

        /* JADX INFO: renamed from: a */
        public static final odd f67356a = new odd();

        private C10331b() {
        }
    }

    public static odd getManager() {
        return C10331b.f67356a;
    }

    public Object createFrom(Intent intent) {
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra(cf8.f16415d);
        Bundle bundleExtra = intent.getBundleExtra(cf8.f16416e);
        if (stringExtra != null && stringExtra.length() != 0 && bundleExtra != null) {
            if (!this.f67355b.containsKey(stringExtra)) {
                try {
                    this.f67355b.put(stringExtra, (mdd) Class.forName(stringExtra).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mdd mddVar = this.f67355b.get(stringExtra);
            if (mddVar == null) {
                return null;
            }
            try {
                return mddVar.createFromBundle(bundleExtra);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public boolean writeTo(Intent intent, Object obj) {
        boolean z = false;
        if (intent == null || obj == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bf8 bf8Var = (bf8) obj.getClass().getAnnotation(bf8.class);
        if (bf8Var != null) {
            Class<? extends mdd> clsProcessor = bf8Var.processor();
            String name = clsProcessor.getName();
            if (!this.f67355b.containsKey(name)) {
                try {
                    this.f67355b.put(name, clsProcessor.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mdd mddVar = this.f67355b.get(name);
            if (mddVar != null) {
                try {
                    if (mddVar.writeToBundle(bundle, obj)) {
                        intent.putExtra(cf8.f16415d, mddVar.getClass().getName());
                        intent.putExtra(cf8.f16416e, bundle);
                        z = true;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (z) {
                return true;
            }
        }
        for (mdd mddVar2 : this.f67354a) {
            try {
                if (mddVar2.writeToBundle(bundle, obj)) {
                    intent.putExtra(cf8.f16415d, mddVar2.getClass().getName());
                    intent.putExtra(cf8.f16416e, bundle);
                    return true;
                }
                continue;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return z;
    }

    private odd() {
        LinkedList<mdd> linkedList = new LinkedList(Arrays.asList(new f8g(), new c78(), new xa1(), new ek4(), new w46(), new rl9(), new a1f(), new vgc()));
        this.f67354a = linkedList;
        this.f67355b = new HashMap();
        for (mdd mddVar : linkedList) {
            this.f67355b.put(mddVar.getClass().getName(), mddVar);
        }
    }
}
