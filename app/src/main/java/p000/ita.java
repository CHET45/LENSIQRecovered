package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@qpf
public class ita implements un0 {

    /* JADX INFO: renamed from: d */
    public static final String f48211d = "BackendRegistry";

    /* JADX INFO: renamed from: e */
    public static final String f48212e = "backend:";

    /* JADX INFO: renamed from: a */
    public final C7596a f48213a;

    /* JADX INFO: renamed from: b */
    public final i63 f48214b;

    /* JADX INFO: renamed from: c */
    public final Map<String, bhh> f48215c;

    /* JADX INFO: renamed from: ita$a */
    public static class C7596a {

        /* JADX INFO: renamed from: a */
        public final Context f48216a;

        /* JADX INFO: renamed from: b */
        public Map<String, String> f48217b = null;

        public C7596a(Context context) {
            this.f48216a = context;
        }

        private Map<String, String> discover(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                Log.w(ita.f48211d, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : metadata.keySet()) {
                Object obj = metadata.get(str);
                if ((obj instanceof String) && str.startsWith(ita.f48212e)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> getBackendProviders() {
            if (this.f48217b == null) {
                this.f48217b = discover(this.f48216a);
            }
            return this.f48217b;
        }

        private static Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(ita.f48211d, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(ita.f48211d, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(ita.f48211d, "Application info not found.");
                return null;
            }
        }

        @hib
        /* JADX INFO: renamed from: a */
        public rn0 m13398a(String str) {
            String str2 = getBackendProviders().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (rn0) Class.forName(str2).asSubclass(rn0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                Log.w(ita.f48211d, String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w(ita.f48211d, String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w(ita.f48211d, String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w(ita.f48211d, String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w(ita.f48211d, String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    @a28
    public ita(Context context, i63 i63Var) {
        this(new C7596a(context), i63Var);
    }

    @Override // p000.un0
    @hib
    public synchronized bhh get(String str) {
        if (this.f48215c.containsKey(str)) {
            return this.f48215c.get(str);
        }
        rn0 rn0VarM13398a = this.f48213a.m13398a(str);
        if (rn0VarM13398a == null) {
            return null;
        }
        bhh bhhVarCreate = rn0VarM13398a.create(this.f48214b.m12820a(str));
        this.f48215c.put(str, bhhVarCreate);
        return bhhVarCreate;
    }

    public ita(C7596a c7596a, i63 i63Var) {
        this.f48215c = new HashMap();
        this.f48213a = c7596a;
        this.f48214b = i63Var;
    }
}
