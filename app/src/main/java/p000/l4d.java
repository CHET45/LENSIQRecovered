package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.customview.poolingcontainer.C0996R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@xn8(name = "PoolingContainer")
public final class l4d {

    /* JADX INFO: renamed from: a */
    public static final int f56142a = C0996R.id.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b */
    public static final int f56143b = C0996R.id.is_pooling_container_tag;

    @igg({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@yfb View view, @yfb m4d m4dVar) {
        md8.checkNotNullParameter(view, "<this>");
        md8.checkNotNullParameter(m4dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getPoolingContainerListenerHolder(view).addListener(m4dVar);
    }

    public static final void callPoolingContainerOnRelease(@yfb View view) {
        md8.checkNotNullParameter(view, "<this>");
        Iterator<View> it = r9i.getAllViews(view).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    public static final void callPoolingContainerOnReleaseForChildren(@yfb ViewGroup viewGroup) {
        md8.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = d9i.getChildren(viewGroup).iterator();
        while (it.hasNext()) {
            getPoolingContainerListenerHolder(it.next()).onRelease();
        }
    }

    private static final n4d getPoolingContainerListenerHolder(View view) {
        int i = f56142a;
        n4d n4dVar = (n4d) view.getTag(i);
        if (n4dVar != null) {
            return n4dVar;
        }
        n4d n4dVar2 = new n4d();
        view.setTag(i, n4dVar2);
        return n4dVar2;
    }

    public static final boolean isPoolingContainer(@yfb View view) {
        md8.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f56143b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean isWithinPoolingContainer(@yfb View view) {
        md8.checkNotNullParameter(view, "<this>");
        for (Object obj : r9i.getAncestors(view)) {
            if ((obj instanceof View) && isPoolingContainer((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @igg({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@yfb View view, @yfb m4d m4dVar) {
        md8.checkNotNullParameter(view, "<this>");
        md8.checkNotNullParameter(m4dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        getPoolingContainerListenerHolder(view).removeListener(m4dVar);
    }

    public static final void setPoolingContainer(@yfb View view, boolean z) {
        md8.checkNotNullParameter(view, "<this>");
        view.setTag(f56143b, Boolean.valueOf(z));
    }
}
