package p000;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class yn4 {

    /* JADX INFO: renamed from: a */
    public final DragAndDropPermissions f102331a;

    /* JADX INFO: renamed from: yn4$a */
    @c5e(24)
    public static class C15736a {
        private C15736a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m26223a(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static DragAndDropPermissions m26224b(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private yn4(DragAndDropPermissions dragAndDropPermissions) {
        this.f102331a = dragAndDropPermissions;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public static yn4 request(@efb Activity activity, @efb DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsM26224b = C15736a.m26224b(activity, dragEvent);
        if (dragAndDropPermissionsM26224b != null) {
            return new yn4(dragAndDropPermissionsM26224b);
        }
        return null;
    }

    public void release() {
        C15736a.m26223a(this.f102331a);
    }
}
