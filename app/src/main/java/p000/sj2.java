package p000;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class sj2<T> {

    /* JADX INFO: renamed from: c */
    public static final String f81948c = "ComponentDiscovery";

    /* JADX INFO: renamed from: d */
    public static final String f81949d = "com.google.firebase.components.ComponentRegistrar";

    /* JADX INFO: renamed from: e */
    public static final String f81950e = "com.google.firebase.components:";

    /* JADX INFO: renamed from: a */
    public final T f81951a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC12612c<T> f81952b;

    /* JADX INFO: renamed from: sj2$b */
    public static class C12611b implements InterfaceC12612c<Context> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends Service> f81953a;

        private Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(sj2.f81948c, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f81953a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(sj2.f81948c, this.f81953a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(sj2.f81948c, "Application info not found.");
                return null;
            }
        }

        private C12611b(Class<? extends Service> cls) {
            this.f81953a = cls;
        }

        @Override // p000.sj2.InterfaceC12612c
        public List<String> retrieve(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                Log.w(sj2.f81948c, "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : metadata.keySet()) {
                if (sj2.f81949d.equals(metadata.get(str)) && str.startsWith(sj2.f81950e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: sj2$c */
    @fdi
    public interface InterfaceC12612c<T> {
        List<String> retrieve(T t);
    }

    @fdi
    public sj2(T t, InterfaceC12612c<T> interfaceC12612c) {
        this.f81951a = t;
        this.f81952b = interfaceC12612c;
    }

    public static sj2<Context> forContext(Context context, Class<? extends Service> cls) {
        return new sj2<>(context, new C12611b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public static ComponentRegistrar instantiate(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new de8(String.format("Class %s is not an instance of %s", str, f81949d));
        } catch (ClassNotFoundException unused) {
            Log.w(f81948c, String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new de8(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new de8(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new de8(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new de8(String.format("Could not instantiate %s", str), e4);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f81952b.retrieve(this.f81951a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    arrayList.add(componentRegistrarInstantiate);
                }
            } catch (de8 e) {
                Log.w(f81948c, "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public List<eid<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f81952b.retrieve(this.f81951a)) {
            arrayList.add(new eid() { // from class: rj2
                @Override // p000.eid
                public final Object get() {
                    return sj2.instantiate(str);
                }
            });
        }
        return arrayList;
    }
}
