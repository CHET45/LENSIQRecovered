package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
@vn8
public final class kq8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final KeyEvent f55051a;

    private /* synthetic */ kq8(KeyEvent keyEvent) {
        this.f55051a = keyEvent;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kq8 m30735boximpl(KeyEvent keyEvent) {
        return new kq8(keyEvent);
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static KeyEvent m30736constructorimpl(@yfb KeyEvent keyEvent) {
        return keyEvent;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30737equalsimpl(KeyEvent keyEvent, Object obj) {
        return (obj instanceof kq8) && md8.areEqual(keyEvent, ((kq8) obj).m30741unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30738equalsimpl0(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return md8.areEqual(keyEvent, keyEvent2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30739hashCodeimpl(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30740toStringimpl(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m30737equalsimpl(this.f55051a, obj);
    }

    @yfb
    public final KeyEvent getNativeKeyEvent() {
        return this.f55051a;
    }

    public int hashCode() {
        return m30739hashCodeimpl(this.f55051a);
    }

    public String toString() {
        return m30740toStringimpl(this.f55051a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ KeyEvent m30741unboximpl() {
        return this.f55051a;
    }
}
