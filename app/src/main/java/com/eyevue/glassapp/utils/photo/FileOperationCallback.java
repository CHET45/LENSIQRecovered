package com.eyevue.glassapp.utils.photo;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface FileOperationCallback {
    void onOperationComplete(int successCount, int totalCount, List<String> messages);

    default void showMessages(String tag, List<String> messages) {
        for (String str : messages) {
        }
    }
}
