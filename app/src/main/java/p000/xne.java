package p000;

import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class xne implements une {

    /* JADX INFO: renamed from: a */
    public final hee f98636a;

    /* JADX INFO: renamed from: b */
    public final lb8 f98637b;

    /* JADX INFO: renamed from: c */
    public final rne f98638c;

    /* JADX INFO: renamed from: d */
    public final C15808yu f98639d;

    @b28
    public xne(hee heeVar, lb8 lb8Var, rne rneVar, C15808yu c15808yu) {
        this.f98636a = heeVar;
        this.f98637b = lb8Var;
        this.f98638c = rneVar;
        this.f98639d = c15808yu;
    }

    @Override // p000.une
    @c5e(21)
    public tne build(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        return new tne(new dne(this.f98636a, this.f98637b, this.f98639d, scanSettings, new z05(scanFilterArr), null), this.f98638c.m21443a(scanSettings.getCallbackType()));
    }
}
