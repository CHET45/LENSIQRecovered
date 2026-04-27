package p000;

/* JADX INFO: loaded from: classes5.dex */
@vj5
public @interface jhd {

    /* JADX INFO: renamed from: jhd$a */
    public enum EnumC7903a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC7903a intEncoding() default EnumC7903a.DEFAULT;

    int tag();
}
