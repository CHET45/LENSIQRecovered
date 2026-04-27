package com.eyevue.glassapp.utils;

/* JADX INFO: loaded from: classes4.dex */
public class SizeConverter {

    /* JADX INFO: renamed from: GB */
    private static final long f18335GB = 1073741824;

    /* JADX INFO: renamed from: KB */
    private static final long f18336KB = 1024;

    /* JADX INFO: renamed from: MB */
    private static final long f18337MB = 1048576;

    public static String formatKb(long kb) {
        long j = 1024 * kb;
        return j >= f18335GB ? String.format("%.1f GB", Double.valueOf(j / 1.073741824E9d)) : j >= 1048576 ? String.format("%.1f MB", Double.valueOf(j / 1048576.0d)) : String.format("%d KB", Long.valueOf(kb));
    }
}
