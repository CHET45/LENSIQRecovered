package p000;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: tn */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC13109tn {

    /* JADX INFO: renamed from: tn$a */
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void registerEventNames(@efb Set<String> set);

        @KeepForSdk
        void unregister();

        @KeepForSdk
        void unregisterEventNames();
    }

    /* JADX INFO: renamed from: tn$b */
    @KeepForSdk
    public interface b {
        @KeepForSdk
        void onMessageTriggered(int i, @hib Bundle bundle);
    }

    /* JADX INFO: renamed from: tn$c */
    @KeepForSdk
    public static class c {

        /* JADX INFO: renamed from: a */
        @efb
        @KeepForSdk
        public String f85338a;

        /* JADX INFO: renamed from: b */
        @efb
        @KeepForSdk
        public String f85339b;

        /* JADX INFO: renamed from: c */
        @hib
        @KeepForSdk
        public Object f85340c;

        /* JADX INFO: renamed from: d */
        @hib
        @KeepForSdk
        public String f85341d;

        /* JADX INFO: renamed from: e */
        @KeepForSdk
        public long f85342e;

        /* JADX INFO: renamed from: f */
        @hib
        @KeepForSdk
        public String f85343f;

        /* JADX INFO: renamed from: g */
        @hib
        @KeepForSdk
        public Bundle f85344g;

        /* JADX INFO: renamed from: h */
        @hib
        @KeepForSdk
        public String f85345h;

        /* JADX INFO: renamed from: i */
        @hib
        @KeepForSdk
        public Bundle f85346i;

        /* JADX INFO: renamed from: j */
        @KeepForSdk
        public long f85347j;

        /* JADX INFO: renamed from: k */
        @hib
        @KeepForSdk
        public String f85348k;

        /* JADX INFO: renamed from: l */
        @hib
        @KeepForSdk
        public Bundle f85349l;

        /* JADX INFO: renamed from: m */
        @KeepForSdk
        public long f85350m;

        /* JADX INFO: renamed from: n */
        @KeepForSdk
        public boolean f85351n;

        /* JADX INFO: renamed from: o */
        @KeepForSdk
        public long f85352o;
    }

    @KeepForSdk
    void clearConditionalUserProperty(@efb @zpf(max = 24, min = 1) String str, @hib String str2, @hib Bundle bundle);

    @efb
    @xqi
    @KeepForSdk
    List<c> getConditionalUserProperties(@efb String str, @hib @zpf(max = 23, min = 1) String str2);

    @xqi
    @KeepForSdk
    int getMaxUserProperties(@efb @zpf(min = 1) String str);

    @efb
    @xqi
    @KeepForSdk
    Map<String, Object> getUserProperties(boolean z);

    @KeepForSdk
    void logEvent(@efb String str, @efb String str2, @hib Bundle bundle);

    @b34
    @hib
    @KeepForSdk
    a registerAnalyticsConnectorListener(@efb String str, @efb b bVar);

    @KeepForSdk
    void setConditionalUserProperty(@efb c cVar);

    @KeepForSdk
    void setUserProperty(@efb String str, @efb String str2, @efb Object obj);
}
