package com.eyevue.glassapp.utils.glide;

import p000.v35;
import p000.x35;
import p000.yfb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class CornerType {
    private static final /* synthetic */ v35 $ENTRIES;
    private static final /* synthetic */ CornerType[] $VALUES;
    public static final CornerType ALL = new CornerType("ALL", 0);
    public static final CornerType TOP_LEFT = new CornerType("TOP_LEFT", 1);
    public static final CornerType TOP_RIGHT = new CornerType("TOP_RIGHT", 2);
    public static final CornerType BOTTOM_LEFT = new CornerType("BOTTOM_LEFT", 3);
    public static final CornerType BOTTOM_RIGHT = new CornerType("BOTTOM_RIGHT", 4);
    public static final CornerType TOP = new CornerType("TOP", 5);
    public static final CornerType BOTTOM = new CornerType("BOTTOM", 6);
    public static final CornerType LEFT = new CornerType("LEFT", 7);
    public static final CornerType RIGHT = new CornerType("RIGHT", 8);
    public static final CornerType NONE = new CornerType("NONE", 9);

    private static final /* synthetic */ CornerType[] $values() {
        return new CornerType[]{ALL, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, TOP, BOTTOM, LEFT, RIGHT, NONE};
    }

    static {
        CornerType[] cornerTypeArr$values = $values();
        $VALUES = cornerTypeArr$values;
        $ENTRIES = x35.enumEntries(cornerTypeArr$values);
    }

    private CornerType(String str, int i) {
    }

    @yfb
    public static v35<CornerType> getEntries() {
        return $ENTRIES;
    }

    public static CornerType valueOf(String str) {
        return (CornerType) Enum.valueOf(CornerType.class, str);
    }

    public static CornerType[] values() {
        return (CornerType[]) $VALUES.clone();
    }
}
