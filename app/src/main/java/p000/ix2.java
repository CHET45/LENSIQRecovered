package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ix2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Set<d2c> f48738a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    @gib
    public volatile Context f48739b;

    public final void addOnContextAvailableListener(@yfb d2c d2cVar) {
        md8.checkNotNullParameter(d2cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.f48739b;
        if (context != null) {
            d2cVar.onContextAvailable(context);
        }
        this.f48738a.add(d2cVar);
    }

    public final void clearAvailableContext() {
        this.f48739b = null;
    }

    public final void dispatchOnContextAvailable(@yfb Context context) {
        md8.checkNotNullParameter(context, "context");
        this.f48739b = context;
        Iterator<d2c> it = this.f48738a.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    @gib
    public final Context peekAvailableContext() {
        return this.f48739b;
    }

    public final void removeOnContextAvailableListener(@yfb d2c d2cVar) {
        md8.checkNotNullParameter(d2cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f48738a.remove(d2cVar);
    }
}
