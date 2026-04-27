package p000;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C1137f0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.a77;
import p000.tc9;
import p000.yc9;

/* JADX INFO: loaded from: classes3.dex */
public class zc9 extends yc9 {

    /* JADX INFO: renamed from: c */
    public static final String f104772c = "LoaderManager";

    /* JADX INFO: renamed from: d */
    public static boolean f104773d;

    /* JADX INFO: renamed from: a */
    @efb
    public final g59 f104774a;

    /* JADX INFO: renamed from: b */
    @efb
    public final C16088c f104775b;

    /* JADX INFO: renamed from: zc9$a */
    public static class C16086a<D> extends o5b<D> implements tc9.InterfaceC12983c<D> {

        /* JADX INFO: renamed from: m */
        public final int f104776m;

        /* JADX INFO: renamed from: n */
        @hib
        public final Bundle f104777n;

        /* JADX INFO: renamed from: o */
        @efb
        public final tc9<D> f104778o;

        /* JADX INFO: renamed from: p */
        public g59 f104779p;

        /* JADX INFO: renamed from: q */
        public C16087b<D> f104780q;

        /* JADX INFO: renamed from: r */
        public tc9<D> f104781r;

        public C16086a(int i, @hib Bundle bundle, @efb tc9<D> tc9Var, @hib tc9<D> tc9Var2) {
            this.f104776m = i;
            this.f104777n = bundle;
            this.f104778o = tc9Var;
            this.f104781r = tc9Var2;
            tc9Var.registerListener(i, this);
        }

        @Override // androidx.lifecycle.AbstractC1158q
        /* JADX INFO: renamed from: d */
        public void mo317d() {
            if (zc9.f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f104778o.startLoading();
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f104776m);
            printWriter.print(" mArgs=");
            printWriter.println(this.f104777n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f104778o);
            this.f104778o.dump(str + a77.C0077a.f542d, fileDescriptor, printWriter, strArr);
            if (this.f104780q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f104780q);
                this.f104780q.dump(str + a77.C0077a.f542d, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m26656g().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        @Override // androidx.lifecycle.AbstractC1158q
        /* JADX INFO: renamed from: e */
        public void mo318e() {
            if (zc9.f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f104778o.stopLoading();
        }

        @ir9
        /* JADX INFO: renamed from: f */
        public tc9<D> m26655f(boolean z) {
            if (zc9.f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f104778o.cancelLoad();
            this.f104778o.abandon();
            C16087b<D> c16087b = this.f104780q;
            if (c16087b != null) {
                removeObserver(c16087b);
                if (z) {
                    c16087b.m26661b();
                }
            }
            this.f104778o.unregisterListener(this);
            if ((c16087b == null || c16087b.m26660a()) && !z) {
                return this.f104778o;
            }
            this.f104778o.reset();
            return this.f104781r;
        }

        @efb
        /* JADX INFO: renamed from: g */
        public tc9<D> m26656g() {
            return this.f104778o;
        }

        /* JADX INFO: renamed from: h */
        public boolean m26657h() {
            C16087b<D> c16087b;
            return (!hasActiveObservers() || (c16087b = this.f104780q) == null || c16087b.m26660a()) ? false : true;
        }

        /* JADX INFO: renamed from: i */
        public void m26658i() {
            g59 g59Var = this.f104779p;
            C16087b<D> c16087b = this.f104780q;
            if (g59Var == null || c16087b == null) {
                return;
            }
            super.removeObserver(c16087b);
            observe(g59Var, c16087b);
        }

        @efb
        @ir9
        /* JADX INFO: renamed from: j */
        public tc9<D> m26659j(@efb g59 g59Var, @efb yc9.InterfaceC15617a<D> interfaceC15617a) {
            C16087b<D> c16087b = new C16087b<>(this.f104778o, interfaceC15617a);
            observe(g59Var, c16087b);
            C16087b<D> c16087b2 = this.f104780q;
            if (c16087b2 != null) {
                removeObserver(c16087b2);
            }
            this.f104779p = g59Var;
            this.f104780q = c16087b;
            return this.f104778o;
        }

        @Override // p000.tc9.InterfaceC12983c
        public void onLoadComplete(@efb tc9<D> tc9Var, @hib D d) {
            if (zc9.f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(d);
                return;
            }
            if (zc9.f104773d) {
                Log.w(zc9.f104772c, "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1158q
        public void removeObserver(@efb qxb<? super D> qxbVar) {
            super.removeObserver(qxbVar);
            this.f104779p = null;
            this.f104780q = null;
        }

        @Override // p000.o5b, androidx.lifecycle.AbstractC1158q
        public void setValue(D d) {
            super.setValue(d);
            tc9<D> tc9Var = this.f104781r;
            if (tc9Var != null) {
                tc9Var.reset();
                this.f104781r = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f104776m);
            sb.append(" : ");
            nk3.buildShortClassTag(this.f104778o, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: zc9$b */
    public static class C16087b<D> implements qxb<D> {

        /* JADX INFO: renamed from: a */
        @efb
        public final tc9<D> f104782a;

        /* JADX INFO: renamed from: b */
        @efb
        public final yc9.InterfaceC15617a<D> f104783b;

        /* JADX INFO: renamed from: c */
        public boolean f104784c = false;

        public C16087b(@efb tc9<D> tc9Var, @efb yc9.InterfaceC15617a<D> interfaceC15617a) {
            this.f104782a = tc9Var;
            this.f104783b = interfaceC15617a;
        }

        /* JADX INFO: renamed from: a */
        public boolean m26660a() {
            return this.f104784c;
        }

        @ir9
        /* JADX INFO: renamed from: b */
        public void m26661b() {
            if (this.f104784c) {
                if (zc9.f104773d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f104782a);
                }
                this.f104783b.onLoaderReset(this.f104782a);
            }
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f104784c);
        }

        @Override // p000.qxb
        public void onChanged(@hib D d) {
            if (zc9.f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f104782a);
                sb.append(": ");
                sb.append(this.f104782a.dataToString(d));
            }
            this.f104783b.onLoadFinished(this.f104782a, d);
            this.f104784c = true;
        }

        public String toString() {
            return this.f104783b.toString();
        }
    }

    /* JADX INFO: renamed from: zc9$c */
    public static class C16088c extends cai {

        /* JADX INFO: renamed from: c */
        public static final C1137f0.c f104785c = new a();

        /* JADX INFO: renamed from: a */
        public mxf<C16086a> f104786a = new mxf<>();

        /* JADX INFO: renamed from: b */
        public boolean f104787b = false;

        /* JADX INFO: renamed from: zc9$c$a */
        public static class a implements C1137f0.c {
            @Override // androidx.lifecycle.C1137f0.c
            @efb
            public <T extends cai> T create(@efb Class<T> cls) {
                return new C16088c();
            }
        }

        @efb
        /* JADX INFO: renamed from: b */
        public static C16088c m26662b(mai maiVar) {
            return (C16088c) new C1137f0(maiVar, f104785c).get(C16088c.class);
        }

        /* JADX INFO: renamed from: a */
        public void m26663a() {
            this.f104787b = false;
        }

        /* JADX INFO: renamed from: c */
        public <D> C16086a<D> m26664c(int i) {
            return this.f104786a.get(i);
        }

        /* JADX INFO: renamed from: d */
        public boolean m26665d() {
            int size = this.f104786a.size();
            for (int i = 0; i < size; i++) {
                if (this.f104786a.valueAt(i).m26657h()) {
                    return true;
                }
            }
            return false;
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f104786a.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + pl8.f71328a;
                for (int i = 0; i < this.f104786a.size(); i++) {
                    C16086a c16086aValueAt = this.f104786a.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f104786a.keyAt(i));
                    printWriter.print(": ");
                    printWriter.println(c16086aValueAt.toString());
                    c16086aValueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m26666e() {
            return this.f104787b;
        }

        /* JADX INFO: renamed from: f */
        public void m26667f() {
            int size = this.f104786a.size();
            for (int i = 0; i < size; i++) {
                this.f104786a.valueAt(i).m26658i();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m26668g(int i, @efb C16086a c16086a) {
            this.f104786a.put(i, c16086a);
        }

        /* JADX INFO: renamed from: h */
        public void m26669h(int i) {
            this.f104786a.remove(i);
        }

        /* JADX INFO: renamed from: i */
        public void m26670i() {
            this.f104787b = true;
        }

        @Override // p000.cai
        public void onCleared() {
            super.onCleared();
            int size = this.f104786a.size();
            for (int i = 0; i < size; i++) {
                this.f104786a.valueAt(i).m26655f(true);
            }
            this.f104786a.clear();
        }
    }

    public zc9(@efb g59 g59Var, @efb mai maiVar) {
        this.f104774a = g59Var;
        this.f104775b = C16088c.m26662b(maiVar);
    }

    @efb
    @ir9
    private <D> tc9<D> createAndInstallLoader(int i, @hib Bundle bundle, @efb yc9.InterfaceC15617a<D> interfaceC15617a, @hib tc9<D> tc9Var) {
        try {
            this.f104775b.m26670i();
            tc9<D> tc9VarOnCreateLoader = interfaceC15617a.onCreateLoader(i, bundle);
            if (tc9VarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (tc9VarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(tc9VarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + tc9VarOnCreateLoader);
            }
            C16086a c16086a = new C16086a(i, bundle, tc9VarOnCreateLoader, tc9Var);
            if (f104773d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Created new loader ");
                sb.append(c16086a);
            }
            this.f104775b.m26668g(i, c16086a);
            this.f104775b.m26663a();
            return c16086a.m26659j(this.f104774a, interfaceC15617a);
        } catch (Throwable th) {
            this.f104775b.m26663a();
            throw th;
        }
    }

    @Override // p000.yc9
    @ir9
    public void destroyLoader(int i) {
        if (this.f104775b.m26666e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f104773d) {
            StringBuilder sb = new StringBuilder();
            sb.append("destroyLoader in ");
            sb.append(this);
            sb.append(" of ");
            sb.append(i);
        }
        C16086a c16086aM26664c = this.f104775b.m26664c(i);
        if (c16086aM26664c != null) {
            c16086aM26664c.m26655f(true);
            this.f104775b.m26669h(i);
        }
    }

    @Override // p000.yc9
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f104775b.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p000.yc9
    @hib
    public <D> tc9<D> getLoader(int i) {
        if (this.f104775b.m26666e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C16086a<D> c16086aM26664c = this.f104775b.m26664c(i);
        if (c16086aM26664c != null) {
            return c16086aM26664c.m26656g();
        }
        return null;
    }

    @Override // p000.yc9
    public boolean hasRunningLoaders() {
        return this.f104775b.m26665d();
    }

    @Override // p000.yc9
    @efb
    @ir9
    public <D> tc9<D> initLoader(int i, @hib Bundle bundle, @efb yc9.InterfaceC15617a<D> interfaceC15617a) {
        if (this.f104775b.m26666e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C16086a<D> c16086aM26664c = this.f104775b.m26664c(i);
        if (f104773d) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (c16086aM26664c == null) {
            return createAndInstallLoader(i, bundle, interfaceC15617a, null);
        }
        if (f104773d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  Re-using existing loader ");
            sb2.append(c16086aM26664c);
        }
        return c16086aM26664c.m26659j(this.f104774a, interfaceC15617a);
    }

    @Override // p000.yc9
    public void markForRedelivery() {
        this.f104775b.m26667f();
    }

    @Override // p000.yc9
    @efb
    @ir9
    public <D> tc9<D> restartLoader(int i, @hib Bundle bundle, @efb yc9.InterfaceC15617a<D> interfaceC15617a) {
        if (this.f104775b.m26666e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f104773d) {
            StringBuilder sb = new StringBuilder();
            sb.append("restartLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        C16086a<D> c16086aM26664c = this.f104775b.m26664c(i);
        return createAndInstallLoader(i, bundle, interfaceC15617a, c16086aM26664c != null ? c16086aM26664c.m26655f(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        nk3.buildShortClassTag(this.f104774a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
