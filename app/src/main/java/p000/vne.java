package p000;

import com.polidea.rxandroidble3.scan.ScanFilter;
import com.polidea.rxandroidble3.scan.ScanSettings;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class vne implements une {

    /* JADX INFO: renamed from: a */
    public final hee f91802a;

    /* JADX INFO: renamed from: b */
    public final lb8 f91803b;

    /* JADX INFO: renamed from: c */
    public final rne f91804c;

    /* JADX INFO: renamed from: vne$a */
    public class C14178a implements pwb<ife, ife> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pwb f91805a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ pwb f91806b;

        public C14178a(pwb pwbVar, pwb pwbVar2) {
            this.f91805a = pwbVar;
            this.f91806b = pwbVar2;
        }

        @Override // p000.pwb
        /* JADX INFO: renamed from: apply */
        public wub<ife> apply2(vkb<ife> vkbVar) {
            return vkbVar.compose(this.f91805a).compose(this.f91806b);
        }
    }

    @b28
    public vne(hee heeVar, lb8 lb8Var, rne rneVar) {
        this.f91802a = heeVar;
        this.f91803b = lb8Var;
        this.f91804c = rneVar;
    }

    @Override // p000.une
    public tne build(ScanSettings scanSettings, ScanFilter... scanFilterArr) {
        return new tne(new cne(this.f91802a, this.f91803b, new z05(scanFilterArr)), new C14178a(this.f91804c.m21444b(scanSettings.getScanMode()), this.f91804c.m21443a(scanSettings.getCallbackType())));
    }
}
