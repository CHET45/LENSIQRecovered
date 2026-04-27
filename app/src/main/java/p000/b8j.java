package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.InterfaceC13109tn;

/* JADX INFO: loaded from: classes5.dex */
public final class b8j implements n4j {

    /* JADX INFO: renamed from: a */
    public final Set f13001a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13109tn.b f13002b;

    /* JADX INFO: renamed from: c */
    public final AppMeasurementSdk f13003c;

    /* JADX INFO: renamed from: d */
    public final x7j f13004d;

    public b8j(AppMeasurementSdk appMeasurementSdk, InterfaceC13109tn.b bVar) {
        this.f13002b = bVar;
        this.f13003c = appMeasurementSdk;
        x7j x7jVar = new x7j(this);
        this.f13004d = x7jVar;
        appMeasurementSdk.registerOnMeasurementEventListener(x7jVar);
        this.f13001a = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13109tn.b m3000a() {
        return this.f13002b;
    }

    @Override // p000.n4j
    public final InterfaceC13109tn.b zza() {
        return this.f13002b;
    }

    @Override // p000.n4j
    public final void zzb(Set set) {
        Set set2 = this.f13001a;
        set2.clear();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i = m7j.f60174g;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (iCodePointAt2 == 95 || Character.isLetterOrDigit(iCodePointAt2)) {
                            iCharCount += Character.charCount(iCodePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int iCodePointAt3 = str.codePointAt(0);
                        if (Character.isLetter(iCodePointAt3)) {
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt3);
                            while (true) {
                                if (iCharCount2 >= length2) {
                                    String strZzb = zzjm.zzb(str);
                                    if (strZzb != null) {
                                        str = strZzb;
                                    }
                                    Preconditions.checkNotNull(str);
                                    hashSet.add(str);
                                } else {
                                    int iCodePointAt4 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt4 == 95 || Character.isLetterOrDigit(iCodePointAt4)) {
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // p000.n4j
    public final void zzc() {
        this.f13001a.clear();
    }
}
