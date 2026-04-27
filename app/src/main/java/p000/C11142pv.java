package p000;

/* JADX INFO: renamed from: pv */
/* JADX INFO: loaded from: classes.dex */
public final class C11142pv {

    /* JADX INFO: renamed from: a */
    public static final boolean f72191a = false;

    @yfb
    public static final zxc createPlatformTextStyle(@gib qxc qxcVar, @gib mxc mxcVar) {
        return new zxc(qxcVar, mxcVar);
    }

    @yfb
    public static final mxc lerp(@yfb mxc mxcVar, @yfb mxc mxcVar2, float f) {
        return mxcVar.getIncludeFontPadding() == mxcVar2.getIncludeFontPadding() ? mxcVar : new mxc(((gz4) twf.lerpDiscrete(gz4.m29879boximpl(mxcVar.m31090getEmojiSupportMatch_3YsG6Y()), gz4.m29879boximpl(mxcVar2.m31090getEmojiSupportMatch_3YsG6Y()), f)).m29885unboximpl(), ((Boolean) twf.lerpDiscrete(Boolean.valueOf(mxcVar.getIncludeFontPadding()), Boolean.valueOf(mxcVar2.getIncludeFontPadding()), f)).booleanValue(), (jt3) null);
    }

    @yfb
    public static final qxc lerp(@yfb qxc qxcVar, @yfb qxc qxcVar2, float f) {
        return qxcVar;
    }
}
