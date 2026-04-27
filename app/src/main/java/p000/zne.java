package p000;

import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class zne implements une {

    /* JADX INFO: renamed from: a */
    public final hee f105558a;

    /* JADX INFO: renamed from: b */
    public final lb8 f105559b;

    /* JADX INFO: renamed from: c */
    public final rne f105560c;

    /* JADX INFO: renamed from: d */
    public final C15808yu f105561d;

    @b28
    public zne(hee heeVar, lb8 lb8Var, rne rneVar, C15808yu c15808yu) {
        this.f105558a = heeVar;
        this.f105559b = lb8Var;
        this.f105560c = rneVar;
        this.f105561d = c15808yu;
    }

    private static boolean areFiltersSpecified(ScanFilter[] scanFilterArr) {
        boolean zIsAllFieldsEmpty = true;
        for (ScanFilter scanFilter : scanFilterArr) {
            zIsAllFieldsEmpty &= scanFilter.isAllFieldsEmpty();
        }
        return !zIsAllFieldsEmpty;
    }

    @Override // p000.une
    @c5e(21)
    public tne build(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        boolean zAreFiltersSpecified = areFiltersSpecified(scanFilterArr);
        boolean z = scanSettings.getCallbackType() != 1;
        pwb<ife, ife> pwbVarIdentityTransformer = vwb.identityTransformer();
        if (z && !zAreFiltersSpecified) {
            kfe.m14722d("ScanSettings.callbackType != CALLBACK_TYPE_ALL_MATCHES but no (or only empty) filters are specified. Falling back to callbackType emulation.", new Object[0]);
            pwbVarIdentityTransformer = this.f105560c.m21443a(scanSettings.getCallbackType());
            scanSettings = scanSettings.copyWithCallbackType(1);
        }
        return new tne(new dne(this.f105558a, this.f105559b, this.f105561d, scanSettings, new z05(new ane[0]), scanFilterArr), pwbVarIdentityTransformer);
    }
}
