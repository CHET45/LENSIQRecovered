package p000;

import android.widget.Checkable;
import p000.mw9;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public interface mw9<T extends mw9<T>> extends Checkable {

    /* JADX INFO: renamed from: mw9$a */
    public interface InterfaceC9572a<C> {
        void onCheckedChanged(C c, boolean z);
    }

    @kr7
    int getId();

    void setInternalOnCheckedChangeListener(@hib InterfaceC9572a<T> interfaceC9572a);
}
