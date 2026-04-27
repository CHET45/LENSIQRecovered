package p000;

import android.content.Context;
import android.os.Bundle;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69934a})
public interface m5d {
    void onDisconnectChannel(@efb Context context);

    boolean onNotifyMessageChannelReady(@hib Bundle bundle);

    boolean onPostMessage(@efb String str, @hib Bundle bundle);
}
